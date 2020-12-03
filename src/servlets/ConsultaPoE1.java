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
 * Servlet implementation class ConsultaPoE1
 */
@WebServlet("/ConsultaPoE1")
public class ConsultaPoE1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaPoE1() {
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
		String nomCategoria = request.getParameter("NomCategoria");
		String datoF = request.getParameter("DatoF");
		
		ArrayList<publicadores.DtCursoBase> cursos = null;
		
		try {
			 cursos = ingresarCategoria(nomCategoria);
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
		
	
		if (request.getParameter("boton").equals("edicion")){
			DtEdicionDetalle dt = null;
			try {
				dt = seleccionarEdicionCat(datoF);
				if(dt.equals(null)) {
					request.setAttribute("mensaje","La edicion de nombre"+datoF+" no Existe");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
				}
				String nome = dt.getNombre();
				Date fechai = dt.getFechaI().getTime();
				Date fechaf = dt.getFechaF().getTime();
				Date fechaPub = dt.getFechaPub().getTime();
				int cupo = dt.getCupos();		
				String fechaI = fechai.toString();
				String fechaF = fechaf.toString();
				String fechaP = fechaPub.toString();
				String infoEd = "EDICION: \n"+dt.toString();
				request.setAttribute("mensaje","Informacion de Edicion: \nNombre: "+nome+"\nCupos: "+cupo+"\nFecha Inicio: "+fechaI+"\nFecha Fin: "+fechaF+"\nFecha de Publicacion: "+fechaP);
				
			}catch(RemoteException | ServiceException e) {
				request.setAttribute("mensaje","La edicion de nombre"+datoF+" no Existe");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			
		}else 
		if (request.getParameter("boton").equals("progFormacion")) {
			
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
				String infoProg = "PROGRAMA DE FORMACION: \n"+dtp.toString();
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


	public publicadores.DtEdicionDetalle seleccionarEdicionCat(String nom) throws ServiceException, RemoteException{
		ControladorConsultaDeCursoPublishService cps = new ControladorConsultaDeCursoPublishServiceLocator();
		ControladorConsultaDeCursoPublish port = cps.getControladorConsultaDeCursoPublishPort();
		publicadores.DtEdicionDetalle ret = null;
		ret = port.seleccionarEdicionCat(nom);
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
