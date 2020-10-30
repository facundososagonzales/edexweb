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
		String curso= request.getParameter("curso");
		String nomIns=request.getParameter("nomIns");
		String edicion=request.getParameter("edicion");
		HttpSession sesion = request.getSession();
		String estudiante = request.getParameter("ListEst");
		String estado = request.getParameter("ListEstado");
		icseec.ingresarInstituto(nomIns);
		icseec.ingresarCurso(curso);
		icseec.ingresarEdicion(edicion);
		
		icseec.ingresarEstudiante(estudiante);
		icseec.seleccionarEstadoEstudiante(estado);
		
		request.setAttribute("mensaje", "Estado de inscripcion actualizado");
		rd= request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
	}

}
