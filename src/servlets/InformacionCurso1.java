package servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorConsultaDeCursoPublish;
import publicadores.ControladorConsultaDeCursoPublishService;
import publicadores.ControladorConsultaDeCursoPublishServiceLocator;
import publicadores.DtCursoBase;
import publicadores.DtInfoProgCurso;
/**
 * Servlet implementation class InformacionCurso1
 */
@WebServlet("/InformacionCurso1")
public class InformacionCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformacionCurso1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Solo para Categoria
			RequestDispatcher rd;
			
			String nomCurso = request.getParameter("NomCur");
			String NomCategoria = request.getParameter("NomCategoria");
			ArrayList<publicadores.DtCursoBase> cursos = null;
			
			try {
				 cursos = ingresarCategoria(NomCategoria);
			} catch (RemoteException | ServiceException e) {
				// TODO Auto-generated catch block
				request.setAttribute("mensaje","Categoria no existe/ No se encontraron Cursos asociados a la Categoria");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			
			
			try {
				DtInfoProgCurso dt = seleccionarCursoEnCat(nomCurso);
				int i = 0;
				for(publicadores.DtCursoBase dta: cursos) {
					if(dta.getNombre().equals(nomCurso)) {
						i=1;
					}
				}
				
				if(i==0) {
					request.setAttribute("mensaje","El Curso de nombre"+nomCurso+" no Existe");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
				}
				
				request.setAttribute("Curso", dt);
				//request.setAttribute("mostrar", "curso");
				
			} catch (RemoteException | ServiceException e) {
				// TODO Auto-generated catch block
				request.setAttribute("mensaje","El Curso de nombre"+nomCurso+" no Existe");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			
			request.setAttribute("Dato", NomCategoria);
			request.setAttribute("NomCurso", nomCurso);
			rd = request.getRequestDispatcher("/datosCurso1.jsp");
			rd.forward(request, response);
				
	}
	
	public ArrayList<publicadores.DtCursoBase> ingresarCategoria(String dato) throws ServiceException, RemoteException{
		
		ControladorConsultaDeCursoPublishService cps = new ControladorConsultaDeCursoPublishServiceLocator();
		ControladorConsultaDeCursoPublish port = cps.getControladorConsultaDeCursoPublishPort();
		publicadores.DtCursoBase[] cursosAux = port.ingresarCategoria(dato);
		
		ArrayList<publicadores.DtCursoBase> ret = new ArrayList<>();
		for (int i = 0; i < cursosAux.length; ++i) {
			ret.add(cursosAux[i]);
		}
		
		if(ret.isEmpty()) {
			throw new RemoteException();
		}
		
		return ret;
	}
	
	public publicadores.DtInfoProgCurso seleccionarCursoEnCat(String nomCurso) throws ServiceException, RemoteException{
		ControladorConsultaDeCursoPublishService cps = new ControladorConsultaDeCursoPublishServiceLocator();
		ControladorConsultaDeCursoPublish port = cps.getControladorConsultaDeCursoPublishPort();
		publicadores.DtInfoProgCurso ret = port.seleccionarCursoEnCat(nomCurso);
		
		if(ret.equals(null)) {
			throw new RemoteException();
		}
		
		return ret;
	}

}
