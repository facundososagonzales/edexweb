package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datatypes.DtDocente;
import datatypes.DtEstudiante;
import datatypes.DtUsuario;
import excepciones.InstitutoNoCargadoException;
import excepciones.PasswordRepetidaException;
import excepciones.UsuarioRepetidoException;
import interfaces.Fabrica;
import interfaces.IControladorAltaUsuario;

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
		DtUsuario usuarioing = null;
		System.out.printf(request.getParameter("FechaNacimiento"));
		String fechaNacDia = request.getParameter("FechaNacimiento").substring(8); int FNdia = Integer.parseInt(fechaNacDia);
		String fechaNacMes = request.getParameter("FechaNacimiento").substring(5,7); int FNmes = Integer.parseInt(fechaNacMes);
		String fechaNacAnio = request.getParameter("FechaNacimiento").substring(0,4);  int FNanio= Integer.parseInt(fechaNacAnio);
    	Date fechaNacimiento = new GregorianCalendar(FNanio, (FNmes-1), FNdia).getTime();
		
		Fabrica fab = Fabrica.getInstancia();
		IControladorAltaUsuario icau = fab.getIControladorAltaUsuario();
		
		try {
			if(rol.equals("Docente")) {
				String instituto = request.getParameter("Instituto");
				usuarioing = new DtDocente (nick,nombre,apellido,correo,fechaNacimiento);
				icau.ingresarInstituto(instituto);
			}else {
				usuarioing = new DtEstudiante(nick,nombre,apellido,correo,fechaNacimiento);
			}
			icau.ingresarPassword(contrasena);
			icau.verificarPassword(contrasena2);
			icau.ingresarUser(usuarioing);
			icau.altaUsuario();
			
		}catch(UsuarioRepetidoException ex){
            throw new ServletException(ex.getMessage());
		}catch(InstitutoNoCargadoException iner) {
			throw new ServletException(iner.getMessage());
		}catch(PasswordRepetidaException pre) {
			throw new ServletException(pre.getMessage());
		}
		request.setAttribute("Mensaje","Usuario: "+nombre+" ingresado con exito");
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
				
	}

}
