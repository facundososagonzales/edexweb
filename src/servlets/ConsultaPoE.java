package servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

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
import publicadores.DtEdicionDetalle;
import publicadores.DtProgCurso;

/**
 * Servlet implementation class ConsultaPoE
 */
@WebServlet("/ConsultaPoE")
public class ConsultaPoE extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaPoE() {
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
		RequestDispatcher rd;
		
		String nomCurso = request.getParameter("NomCurso");
		String nomInstituto = request.getParameter("NomInstituto");
		String datoF = request.getParameter("DatoF");
		
		ArrayList<publicadores.DtCursoBase> cursos = null;
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
		
		
		if (request.getParameter("boton").equals("edicion")){
			DtEdicionDetalle dte = null;
			try {
				dte = seleccionarEdicion(datoF);
				if(dte.equals(null)) {
					request.setAttribute("mensaje","La edicion de nombre"+datoF+" no Existe");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
				}
				
				String nome = dte.getNombre();
				Date fechai = dte.getFechaI().getTime();
				Date fechaf = dte.getFechaF().getTime();
				Date fechaPub = dte.getFechaPub().getTime();
				int cupo = dte.getCupos();		
				String fechaI = fechai.toString();
				String fechaF = fechaf.toString();
				String fechaP = fechaPub.toString();
				request.setAttribute("mensaje","Informacion de Edicion: \nNombre: "+nome+"\nCupos: "+cupo+"\nFecha Inicio: "+fechaI+"\nFecha Fin: "+fechaF+"\nFecha de Publicacion: "+fechaP);				
			
				
			}catch (RemoteException | ServiceException e) {
				request.setAttribute("mensaje","La edicion de nombre"+datoF+" no Existe");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			
		}else if (request.getParameter("boton").equals("progFormacion")) {
			DtProgCurso dtp = null;
			
			try {
				 dtp = seleccionarPrograma(datoF);
				 
				 if(dtp.equals(null)) {
						request.setAttribute("mensaje","La edicion de nombre"+datoF+" no Existe");
						rd = request.getRequestDispatcher("/notificacion.jsp");
						rd.forward(request, response);
					}

				String nomprog = dtp.getNombre();
				String descrip = dtp.getDescripcion();
				Date fechaI = dtp.getFechaI().getTime();
				Date fechaF = dtp.getFechaF().getTime();
				String fi = fechaI.toString();
				String ff = fechaF.toString();
				request.setAttribute("mensaje","Informacion de Programa de Formacion: \nNombre: "+nomprog+" \nDescripcion: "+descrip+"\nFecha de Inicio: "+fi+" \nFecha de Fin: " +ff);
			 
			
			}catch(RemoteException | ServiceException e) {
				request.setAttribute("mensaje","El programa de nombre"+datoF+" no Existe");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
		}
		rd = request.getRequestDispatcher("/notificacion.jsp");
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
	
	public publicadores.DtEdicionDetalle seleccionarEdicion(String nom) throws ServiceException, RemoteException{
		ControladorConsultaDeCursoPublishService cps = new ControladorConsultaDeCursoPublishServiceLocator();
		ControladorConsultaDeCursoPublish port = cps.getControladorConsultaDeCursoPublishPort();
		publicadores.DtEdicionDetalle ret = null;
		ret = port.seleccionarEdicion(nom);
		if(ret.equals(null)) {
			throw new RemoteException();
		}
		
		return ret;
	}
	
	public publicadores.DtProgCurso seleccionarPrograma(String dato)throws ServiceException, RemoteException{
		ControladorConsultaDeCursoPublishService cps = new ControladorConsultaDeCursoPublishServiceLocator();
		ControladorConsultaDeCursoPublish port = cps.getControladorConsultaDeCursoPublishPort();
		publicadores.DtProgCurso ret = null;
		ret = port.seleccionarPrograma(dato);
		if(ret.equals(null)) {
			throw new RemoteException();
		}
		
		return ret;
	}

	
}
