package servlets;

import java.io.IOException;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorAltaUsuarioPublish;
import publicadores.ControladorAltaUsuarioPublishService;
import publicadores.ControladorAltaUsuarioPublishServiceLocator;


/**
 * Servlet implementation class AltaUsuario
 */
@WebServlet("/AltaUsuario")
public class AltaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaUsuario() {
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
		// doGet(request, response);
		RequestDispatcher rd;
		String nick = request.getParameter("Nick");
		String correo = request.getParameter("Correo");
		String nombre = request.getParameter("Nombre");
		String apellido = request.getParameter("Apellido");
		String contrasena= request.getParameter("Contrasena");
		String contrasena2= request.getParameter("ContrasenaR");
		String rol = request.getParameter("Rol");

		String fechaNacDia = request.getParameter("FechaNacimiento").substring(8); int FNdia = Integer.parseInt(fechaNacDia);
		String fechaNacMes = request.getParameter("FechaNacimiento").substring(5,7); int FNmes = Integer.parseInt(fechaNacMes);
		String fechaNacAnio = request.getParameter("FechaNacimiento").substring(0,4);  int FNanio= Integer.parseInt(fechaNacAnio);
		Date fechaNacimiento = new GregorianCalendar(FNanio, (FNmes-1), FNdia).getTime();
		Calendar cf = new GregorianCalendar();
		cf.setTime(fechaNacimiento);

		
		
			if(rol.equals("Docente")) {
				String instituto = request.getParameter("Instituto");
				publicadores.DtDocente usuarioing = new publicadores.DtDocente();
				usuarioing.setNick(nick);
				usuarioing.setNombre(nombre);
				usuarioing.setApellido(apellido);
				usuarioing.setCorreo(correo);
				usuarioing.setFechaNac(cf);
				
				try {
					boolean bol = ingresarInstituto(instituto);
					if(bol==true) {
						request.setAttribute("mensaje","El instituto "+instituto+" no existe en el sistema");
						rd = request.getRequestDispatcher("/notificacion.jsp");
						rd.forward(request, response);
						throw new RemoteException();
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				try {

					boolean bool = ingresarUserDoc(usuarioing);
					if(bool==true) {
						request.setAttribute("mensaje","ERROR: el nick o correo ya existe en el sistema");
						rd = request.getRequestDispatcher("/notificacion.jsp");
						rd.forward(request, response);
						throw new RemoteException();
					}
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}else {
				publicadores.DtEstudiante usuarioing = new publicadores.DtEstudiante();
				usuarioing.setNick(nick);
				usuarioing.setNombre(nombre);
				usuarioing.setCorreo(correo);
				usuarioing.setApellido(apellido);
				usuarioing.setFechaNac(cf);
				
				
				
				try {
					boolean bool = ingresarUserEst(usuarioing);
					if(bool==true) {
						request.setAttribute("mensaje","ERROR: el nick o correo ya existe en el sistema");
						rd = request.getRequestDispatcher("/notificacion.jsp");
						rd.forward(request, response);
						throw new RemoteException();
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}

			}
			
			if(!(contrasena.equals(contrasena2))) {
				request.setAttribute("mensaje","ERROR: Las contrasenas no coinciden");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
				throw new RemoteException();
			}
			
			try {
				ingresarPassword(contrasena);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				verificarPassword(contrasena2);
			}catch(Exception e) {
				e.printStackTrace();
			}			
			
			try {
				altaUsuario();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		request.setAttribute("mensaje","Usuario: "+nombre+" ingresado con exito");
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
				
	}

	public boolean ingresarInstituto(String instituto) throws Exception {
		ControladorAltaUsuarioPublishService cps = new ControladorAltaUsuarioPublishServiceLocator();
		ControladorAltaUsuarioPublish port = cps.getControladorAltaUsuarioPublishPort();
		boolean bol = port.ingresarInstituto(instituto);
		
		return bol;
	}
	
	public void ingresarPassword(String pass) throws Exception {
		ControladorAltaUsuarioPublishService cps = new ControladorAltaUsuarioPublishServiceLocator();
		ControladorAltaUsuarioPublish port = cps.getControladorAltaUsuarioPublishPort();
		port.ingresarPassword(pass);
	}
	
	public void verificarPassword(String pass2) throws Exception {
		ControladorAltaUsuarioPublishService cps = new ControladorAltaUsuarioPublishServiceLocator();
		ControladorAltaUsuarioPublish port = cps.getControladorAltaUsuarioPublishPort();
		port.verificarPassword(pass2);
	}
	
	public boolean ingresarUser(publicadores.DtUsuario usuarioing) throws Exception{
		ControladorAltaUsuarioPublishService cps = new ControladorAltaUsuarioPublishServiceLocator();
		ControladorAltaUsuarioPublish port = cps.getControladorAltaUsuarioPublishPort();
		boolean ret = port.ingresarUser(usuarioing);
		return ret;
	}
	
	public boolean ingresarUserDoc(publicadores.DtDocente usuarioing) throws Exception{
		ControladorAltaUsuarioPublishService cps = new ControladorAltaUsuarioPublishServiceLocator();
		ControladorAltaUsuarioPublish port = cps.getControladorAltaUsuarioPublishPort();
		boolean ret = port.ingresarUserDoc(usuarioing);
		return ret;
	}
	
	public boolean ingresarUserEst(publicadores.DtEstudiante usuarioing) throws Exception{
		ControladorAltaUsuarioPublishService cps = new ControladorAltaUsuarioPublishServiceLocator();
		ControladorAltaUsuarioPublish port = cps.getControladorAltaUsuarioPublishPort();
		boolean ret = port.ingresarUserEst(usuarioing);
		return ret;
	}
	
	public void altaUsuario() throws Exception{
		ControladorAltaUsuarioPublishService cps = new ControladorAltaUsuarioPublishServiceLocator();
		ControladorAltaUsuarioPublish port = cps.getControladorAltaUsuarioPublishPort();
		port.altaUsuario();
	}
	

}
