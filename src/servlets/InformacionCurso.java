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
 * Servlet implementation class InformacionCurso
 */
@WebServlet("/InformacionCurso")
public class InformacionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformacionCurso() {
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
		// Solo para Instituto
		RequestDispatcher rd;
		
		String nomCurso = request.getParameter("NomCur");
		String nomInstituto = request.getParameter("NomInstituto");
		ArrayList<publicadores.DtCursoBase> cursos = null;
		System.out.println(nomCurso+"\n\n");
		System.out.println(nomInstituto+"\n\n");
		try {
			cursos = ingresarInstituto(nomInstituto);
			System.out.println("PRIMER TRYYY");
		}catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			request.setAttribute("mensaje","Instituto no existe/ No se encontraron Cursos asociados al Instituto");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
		
		System.out.println("\n\n *********************** \n\n");
		DtInfoProgCurso dt=null;
		try {
			dt = seleccionarCurso(nomCurso);
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
		} catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			request.setAttribute("mensaje","El Curso de nombre"+nomCurso+" no Existe");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
		request.setAttribute("Curso", dt);
		//request.setAttribute("mostrar", "curso");
		
		
		
		request.setAttribute("Dato", nomInstituto);
		request.setAttribute("NomCurso", nomCurso);
		rd = request.getRequestDispatcher("/datosCurso.jsp");
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
	
	public publicadores.DtInfoProgCurso seleccionarCurso(String nomCurso) throws ServiceException, RemoteException{
		ControladorConsultaDeCursoPublishService cps = new ControladorConsultaDeCursoPublishServiceLocator();
		ControladorConsultaDeCursoPublish port = cps.getControladorConsultaDeCursoPublishPort();
		publicadores.DtInfoProgCurso ret = null;
		ret = port.seleccionarCurso(nomCurso);
		if(ret.equals(null)) {
			throw new RemoteException();
		}
		
		return ret;
	}

}
