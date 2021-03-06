package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import publicadores.ControladorDejarDeSeguir;
import publicadores.ControladorDejarDeSeguirService;
import publicadores.ControladorDejarDeSeguirServiceLocator;

/**
 * Servlet implementation class DejarDeSeguirUsuario
 */
@WebServlet("/DejarDeSeguirUsuario")
public class DejarDeSeguirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DejarDeSeguirUsuario() {
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
		String nick = request.getParameter("seguidos");
		
		//Fabrica fabrica = Fabrica.getInstancia();
		//IControladorDejarDeSeguir icdds = fabrica.getIControladorDejarDeSeguir();
		HttpSession session = request.getSession();
		String logNick = (String)session.getAttribute("usuarioLogueado");
		try {
			boolean userLog = ingresarUser(nick);
			if(userLog) {
				dejarDeSeguir(logNick);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("mensaje","ha dejado de seguir a "+nick);
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
	}
	
	public boolean ingresarUser(String nick) throws Exception {
		ControladorDejarDeSeguirService sus = new ControladorDejarDeSeguirServiceLocator();
		ControladorDejarDeSeguir port = sus.getControladorDejarDeSeguirPort();
		return port.ingresarUser(nick);
	}
	
	public void dejarDeSeguir(String nickLogueado) throws Exception {
		ControladorDejarDeSeguirService sus = new ControladorDejarDeSeguirServiceLocator();
		ControladorDejarDeSeguir port = sus.getControladorDejarDeSeguirPort();
		port.dejarDeSeguir(nickLogueado);
	}
	
	

}
