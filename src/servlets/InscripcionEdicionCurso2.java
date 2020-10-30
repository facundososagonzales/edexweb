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
 * Servlet implementation class InscripcionEdicionCurso2
 */
@WebServlet("/InscripcionEdicionCurso2")
public class InscripcionEdicionCurso2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscripcionEdicionCurso2() {
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
		String CatInsLabel=request.getParameter("CatInsLabel");
		String nomCatIns=request.getParameter("nomCatIns");
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorInsEdicionCurso iciec = fabrica.getIControladorInsEdicionCurso();
		HttpSession sesion = request.getSession();
		
		
	if (CatInsLabel.equals("Instituto"))
			
		{
			
			List<String> edicion = new ArrayList<>();
			iciec.ingresarInstituto(nomCatIns);
			iciec.ingresarCursoInstituto(Curso);
			edicion=iciec.listarEdicion();
			request.setAttribute("listaEdicion", edicion);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso3.jsp");
			rd.forward(request, response);
		
		}
	if (CatInsLabel.equals("Categoría")) 
		{

			List<String> edicion = new ArrayList<>();
			iciec.ingresarCategoria(nomCatIns);
			iciec.ingresarCursoporCat(Curso);
			edicion=iciec.listarEdicionCat();
			request.setAttribute("listaEdicion", edicion);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso3.jsp");
			rd.forward(request, response);
		}
	
	}

}
