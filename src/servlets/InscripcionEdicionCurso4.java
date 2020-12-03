package servlets;

import java.io.IOException;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import publicadores.ControladorInsEdicionCursoPublish;
import publicadores.ControladorInsEdicionCursoPublishService;
import publicadores.ControladorInsEdicionCursoPublishServiceLocator;

/**
 * Servlet implementation class InscripcionEdicionCurso4
 */
@WebServlet("/InscripcionEdicionCurso4")
public class InscripcionEdicionCurso4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscripcionEdicionCurso4() {
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
		
		HttpSession session = request.getSession();
		String logNick = (String)session.getAttribute("usuarioLogueado");
		String edicion = (String)request.getParameter("edi");
		System.out.println(logNick);
		System.out.println(edicion);
		
		
			try {
				if (request.getParameter("boton").equals("inscribir")) {
					System.out.println(logNick);
					System.out.println(edicion);
					inscripcionEstudianteW(logNick, edicion);
					request.setAttribute("mensaje", "Se ha inscripto correctamente el estudiante");
					rd= request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
					
				}else if (request.getParameter("boton").equals("cancelar")){
					rd=request.getRequestDispatcher("/index.jsp");
					rd.forward(request, response);
				}
				
				//rd = request.getRequestDispatcher("/InsEdiCursoMensaje.jsp");
				
				
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void inscripcionEstudianteW(String nick, String edicion) throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		port.inscripcionEstudianteW(nick, edicion);
	}
	

	
}
