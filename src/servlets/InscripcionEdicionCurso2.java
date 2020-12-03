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


import publicadores.ControladorInsEdicionCursoPublish;
import publicadores.ControladorInsEdicionCursoPublishService;
import publicadores.ControladorInsEdicionCursoPublishServiceLocator;

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
	
		HttpSession sesion = request.getSession();
		
		
	
			try {
				if (CatInsLabel.equals("Instituto"))
					
				{
					
				String[] edicion=null;
				ingresarInstituto(nomCatIns);
				ingresarCursoInstituto(Curso);
				edicion=listarEdicion();
				request.setAttribute("listaEdicion", edicion);
				rd= request.getRequestDispatcher("InscripcionEdicionCurso3.jsp");
				rd.forward(request, response);
			
			}
		if (CatInsLabel.equals("Categoría")) 
			{

				String[] edicion=null;
				ingresarCategoria(nomCatIns);
				ingresarCursoporCat(Curso);
				edicion=listarEdicionCat();
				request.setAttribute("listaEdicion", edicion);
				rd= request.getRequestDispatcher("InscripcionEdicionCurso3.jsp");
				rd.forward(request, response);
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}

	
	public void ingresarInstituto(String ListCatIns) throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		port.ingresarInstituto(ListCatIns);
	}
	
	public void ingresarCategoria(String ListCatIns) throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		port.ingresarCategoria(ListCatIns);
	}
	
	public void ingresarCursoInstituto(String codCur) throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		port.ingresarCursoInstituto(codCur);
	}
	
	public void ingresarCursoporCat(String codCur) throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		port.ingresarCursoporCat(codCur);
	}
	
	public String[] listarEdicion() throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		return port.listarEdicion();
	}
	
	public String[] listarEdicionCat() throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		return port.listarEdicionCat();
	}
	
	
}
