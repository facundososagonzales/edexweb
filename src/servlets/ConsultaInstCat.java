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

/**
 * Servlet implementation class ConsultaInstCat
 */
@WebServlet("/ConsultaInstCat")
public class ConsultaInstCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaInstCat() {
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
		String dato = request.getParameter("Dato");		
		RequestDispatcher rd;
		
		if (request.getParameter("boton").equals("instituto")){
			
				ArrayList<DtCursoBase> cursos = null;
				try {
					cursos = ingresarInstituto(dato);
				} catch (RemoteException | ServiceException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					request.setAttribute("mensaje","Instituto no existe/ No se encontraron Cursos asociados al Instituto");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
				}
				request.setAttribute("cursos", cursos);
				request.setAttribute("mostrar", "instituto");
			
			
		}else if (request.getParameter("boton").equals("categoria")) {
			
				ArrayList<DtCursoBase> cursos=null;
				try {
					cursos = ingresarCategoria(dato);
				} catch (RemoteException | ServiceException e) {
					// TODO Auto-generated catch block
					request.setAttribute("mensaje","Categoria no existe/ No se encontraron Cursos asociados a la Categoria");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
					//e.printStackTrace();
				}
				request.setAttribute("cursos", cursos);
				request.setAttribute("mostrar", "categoria");
			
			}
		request.setAttribute("Dato", dato);
		rd = request.getRequestDispatcher("/cursosDelSistema.jsp");
		rd.forward(request, response);
			
		
	}
	
	public ArrayList<publicadores.DtCursoBase> ingresarInstituto(String dato) throws ServiceException, RemoteException{
		
		ControladorConsultaDeCursoPublishService cps = new ControladorConsultaDeCursoPublishServiceLocator();
		ControladorConsultaDeCursoPublish port = cps.getControladorConsultaDeCursoPublishPort();
		publicadores.DtCursoBase[] cursosAux = port.ingresarInstituto(dato);
		
		ArrayList<publicadores.DtCursoBase> ret = new ArrayList<>();
		for (int i = 0; i < cursosAux.length; ++i) {
			ret.add(cursosAux[i]);
		}
		
		if(ret.isEmpty()) {
			throw new RemoteException();
		}
		
		return ret;
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

}
