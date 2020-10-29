package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso1
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso1")
public class SeleccionarEstudiantesEdicionCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso1() {
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
		
		String Curso= request.getParameter("ListCurso");
		String nomIns=request.getParameter("nomIns");
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorSeleccionarEstEdiCurso icseec = fabrica.getIControladorSeleccionarEstEdiCurso();
		HttpSession sesion = request.getSession();
		
		List<String> edicion = new ArrayList<>();
		icseec.ingresarInstituto(nomIns);
		icseec.ingresarCurso(Curso);
		edicion=icseec.listarEdicion();
		request.setAttribute("listaEdicion", edicion);
		rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso2.jsp");
		rd.forward(request, response);
	}

}