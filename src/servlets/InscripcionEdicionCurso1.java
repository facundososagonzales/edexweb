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
import interfaces.IControladorInsEdicionCurso;

/**
 * Servlet implementation class InscripcionEdicionCurso1
 */
@WebServlet("/InscripcionEdicionCurso1")
public class InscripcionEdicionCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscripcionEdicionCurso1() {
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
		
		String ListCatIns= request.getParameter("ListCatIns");
		String CatInsLabel=request.getParameter("CatInsLabel");
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorInsEdicionCurso iciec = fabrica.getIControladorInsEdicionCurso();
		HttpSession sesion = request.getSession();
		
		if (CatInsLabel.equals("Instituto"))
			
		{
			
			List<String> curso = new ArrayList<>();
			iciec.ingresarInstituto(ListCatIns);
			curso=iciec.listarCursos();
			request.setAttribute("listaCursos", curso);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");
			
			request.setAttribute("label curso o instituto", CatInsLabel);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");

			
			request.setAttribute("nombre instituto o categoria", ListCatIns);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");
			rd.forward(request, response);
			
		}
		
		if (CatInsLabel.equals("Categoría"))
		{
			
			List<String> curso = new ArrayList<>();
			iciec.ingresarCategoria(ListCatIns);
			curso=iciec.listarCursosCategoria();
			request.setAttribute("listaCursos", curso);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");
			
			request.setAttribute("label curso o instituto", CatInsLabel);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");
			
			request.setAttribute("nombre instituto o categoria", ListCatIns);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");
			rd.forward(request, response);
			
		}
	}

}
