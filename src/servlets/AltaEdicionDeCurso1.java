package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AltaEdicionDeCurso1
 */
@WebServlet("/AltaEdicionDeCurso1")
public class AltaEdicionDeCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaEdicionDeCurso1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Instituto = request.getParameter("Instituto");
		String cupos = request.getParameter("cupos");
		String name =  request.getParameter("name");
		String fechaInicio = request.getParameter("fechaInicio");
		String fechaFin = request.getParameter("fechaFin");
		String curso = request.getParameter("Cursos"); 
		RequestDispatcher rd;
		
		request.setAttribute("Instituto", Instituto);
		request.setAttribute("curso", curso);
		request.setAttribute("name", name);
		request.setAttribute("cupos", cupos);
		request.setAttribute("fechaInicio", fechaInicio);
		request.setAttribute("fechaFin", fechaFin);
		
		rd= request.getRequestDispatcher("altaEdicionDeCurso2.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
