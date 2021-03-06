package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import datatypes.DtUsuario;

//import datatypes.DtUsuario;
//import interfaces.Fabrica;
//import interfaces.IControladorModificarDatosUsuario;

import publicadores.ControladorModificarDatosUsuarioPublish;
import publicadores.ControladorModificarDatosUsuarioPublishService;
import publicadores.ControladorModificarDatosUsuarioPublishServiceLocator;

/**
 * Servlet implementation class ModificarDatosUsuario
 */
@WebServlet("/ModificarDatosUsuario")
public class ModificarDatosUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarDatosUsuario() {
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

		RequestDispatcher rd;
		//Fabrica fabrica = Fabrica.getInstancia();
		//IControladorModificarDatosUsuario icmdu = fabrica.getIControladorM();
		String nick= request.getParameter("nick");
		String nombre= request.getParameter("nombre");
		String apellido= request.getParameter("apellido");
		publicadores.DtUsuario dtUsuario= null;
		dtUsuario=new publicadores.DtUsuario();
		
		publicadores.DtUsuario dtU= null;
		dtU=new publicadores.DtUsuario();
		
		dtU.setApellido(apellido);
		dtU.setNombre(nombre);
		
		
		
		try {
			dtUsuario =elegirUsuario(nick);
			modificar(dtU);
			request.setAttribute("mensaje", "Modificaci?n realizada exitosamente");
			rd= request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	/*	HttpSession sesion = request.getSession();
		
		String nick= (String)sesion.getAttribute("usuarioLogueado");
		
		System.out.println("nick");
		DtUsuario usu = icmdu.elegirUsuario(nick);
		//DtUsuario usu = icmdu.datosUsuario(nick);
		String nick1 = usu.getNick();
		String correo= usu.getCorreo();
		String nombre = usu.getNombre();
		String apellido = usu.getApellido();
		Date fechanac = usu.getFechaNac();

		request.setAttribute("nick", nick1);
		request.setAttribute("correo", correo);
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellido", apellido);
		request.setAttribute("fechanac", fechanac);
		
		rd= request.getRequestDispatcher("modificarDatosUsuario.jsp");
		rd.forward(request, response);
	*/
	}
	
	public publicadores.DtUsuario elegirUsuario(String nick) throws Exception {
		ControladorModificarDatosUsuarioPublishService mdup = new ControladorModificarDatosUsuarioPublishServiceLocator();
		ControladorModificarDatosUsuarioPublish port= mdup.getControladorModificarDatosUsuarioPublishPort();
		return port.elegirUsuario(nick);
	}
	
	public void modificar(publicadores.DtUsuario usuario) throws Exception {
		ControladorModificarDatosUsuarioPublishService mdup = new ControladorModificarDatosUsuarioPublishServiceLocator();
		ControladorModificarDatosUsuarioPublish port= mdup.getControladorModificarDatosUsuarioPublishPort();
		port.modificar(usuario);
	}

}


