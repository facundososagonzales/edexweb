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

import interfaces.Fabrica;
import interfaces.IControladorInsEdicionCurso;

/**
 * Servlet implementation class InscripcionEdicionCurso
 */
@WebServlet("/InscripcionEdicionCurso")
public class InscripcionEdicionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscripcionEdicionCurso() {
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
		
		String catIns= request.getParameter("catIns");
		request.setAttribute("categoria o instituto", catIns);
		rd= request.getRequestDispatcher("InscripcionEdicionCurso1.jsp");
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorInsEdicionCurso iciec = fabrica.getIControladorInsEdicionCurso();
		
		if (catIns.equals("Instituto"))
			
		{
			
			List<String> instituto = new ArrayList<>();
			instituto=iciec.listarInstitutos();
			request.setAttribute("lista", instituto);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso1.jsp");
			rd.forward(request, response);
		}
		
		if (catIns.equals("Categoría"))
		{
			
			List<String> categoria = new ArrayList<>();
			categoria=iciec.listarCategorias();
			request.setAttribute("lista", categoria);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso1.jsp");
			rd.forward(request, response);
		}
	}

}
