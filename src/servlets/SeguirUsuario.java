package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import excepciones.UsuarioNoExisteException;
import interfaces.Fabrica;
import interfaces.IControladorSeguirUsuario;

/**
 * Servlet implementation class SeguirUsuario
 */
@WebServlet("/SeguirUsuario")
public class SeguirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SeguirUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String nick = request.getParameter("nickUsuario");
		
		Fabrica fab = Fabrica.getInstancia();
		IControladorSeguirUsuario icsu = fab.getIControladorSeguirUsuario();
		try {
			icsu.ingresarUser(nick);
			HttpSession session = request.getSession();
			String logNick = (String)session.getAttribute("usuarioLogueado");
			
			icsu.seguirUsuario(logNick);
		}catch(UsuarioNoExisteException ex) {
            throw new ServletException(ex.getMessage());
		}
		
		request.setAttribute("Mensaje","Ahora esta siguiendo al usuario: "+nick);
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
	}

}
