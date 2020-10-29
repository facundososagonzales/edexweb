package servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import interfaces.Fabrica;
import interfaces.IControladorSeleccionarEstEdiCurso;


/**
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso4
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso4")
public class SeleccionarEstudiantesEdicionCurso4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso4() {
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
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorSeleccionarEstEdiCurso icseec = fabrica.getIControladorSeleccionarEstEdiCurso();
		HttpSession sesion = request.getSession();
		String logNick = (String)sesion.getAttribute("usuarioLogueado");
		String estudiante = request.getParameter("ListEst");
		String estado = request.getParameter("ListEstado");
		
		if(estudiante.equals("Aceptado")) {
			icseec.ingresarEstudiante(logNick);
		}
		
		if(estado.equals("Rechazado")) {
			icseec.seleccionarEstadoEstudiante(estado);
		}
	}

}
