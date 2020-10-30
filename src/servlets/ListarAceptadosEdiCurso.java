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
import interfaces.IControladorListarAceptadosEdiCurso;

/**
 * Servlet implementation class ListarAceptadosEdiCurso
 */
@WebServlet("/ListarAceptadosEdiCurso")
public class ListarAceptadosEdiCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAceptadosEdiCurso() {
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
		String ListIns= request.getParameter("ListIns");
		request.setAttribute("instituto", ListIns);
		rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso1.jsp");
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorListarAceptadosEdiCurso icseec = fabrica.getIControladorListarAceptadosEdiCurso();
		HttpSession sesion = request.getSession();
			
		List<String> curso = new ArrayList<>();
		icseec.ingresarInstituto(ListIns);
		curso=icseec.listarCursos();
		request.setAttribute("listaCursos", curso);
		rd= request.getRequestDispatcher("listarAceptadosEdiCurso1.jsp");
		

		rd.forward(request, response);
	}
	

}
