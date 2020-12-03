package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import publicadores.ControladorIniciarSesion;
import publicadores.ControladorIniciarSesionService;
import publicadores.ControladorIniciarSesionServiceLocator;

/**
 * Servlet implementation class IniciarSesion
 */
@WebServlet("/IniciarSesion")
public class IniciarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarSesion() {
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
		String nick= request.getParameter("nick");
		String pwd= request.getParameter("pwd");
	
		//Fabrica fabrica = Fabrica.getInstancia();
		//IControladorInicioDeSesion icis = fabrica.getIControladorIniciodeSesion();
		
		
		try {
			boolean logueadook = ingresarUsuario(nick, pwd);
		
			String tipo = tipoUsuario(nick);
		
			
			if(tipo.equals("Docente"))
				tipo="docente";
			else if(tipo.equals("Estudiante"))
				tipo="estudiante";
			
			if (logueadook==true) {
				HttpSession sesion = request.getSession();
				sesion.setAttribute("tipoUsuarioLogueado", tipo);// si es docente o estudiante, que va a poder ver y dsp sesion.getattribute para llamarlo)*/
				sesion.setAttribute("usuarioLogueado", nick);// en el servlet que cierre la sesion poner en null estos atributos.
				//request.setAttribute("Mensaje", "Se ha logueado correctamente el usuario" + nick);
				rd= request.getRequestDispatcher("/index.jsp");
				rd.forward(request, response); 
				}
			else {
					
					request.setAttribute("mensaje", "Credenciales incorrectas");
					rd= request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
			}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	
	public boolean ingresarUsuario(String usuario, String pwd) throws Exception {
		ControladorIniciarSesionService cis = new ControladorIniciarSesionServiceLocator();
		ControladorIniciarSesion port= cis.getControladorIniciarSesionPort();
		return port.ingresarUsuario(usuario, pwd);
		
	
	
		
		
		
		
	}
	public String tipoUsuario(String nick) throws Exception {
		ControladorIniciarSesionService cis = new ControladorIniciarSesionServiceLocator();
		ControladorIniciarSesion port= cis.getControladorIniciarSesionPort();
	return port.tipoUsuario(nick);
	
		
	
}	
}	