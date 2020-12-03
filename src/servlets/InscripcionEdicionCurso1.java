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
		
		
		HttpSession sesion = request.getSession();
		
		
		
		
		
			try {
				if (CatInsLabel.equals("Instituto"))
					
				{
					
					String[] curso=null;
				ingresarInstituto(ListCatIns);
				curso=listarCursos();
				

				 if (curso.length==0)
				 	{
					request.setAttribute("mensaje", "No existen cursos disponibles");
					rd= request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
					}
					else {
						request.setAttribute("listaCursos", curso);
						request.setAttribute("label curso o instituto", CatInsLabel);
						request.setAttribute("nombre instituto o categoria", ListCatIns);
						rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");
						rd.forward(request, response);
					}
				
			}
			
			if (CatInsLabel.equals("Categoría"))
			{
				
				String[] curso1=null;
				ingresarCategoria(ListCatIns);
				curso1=listarCursosCategoria();
				
				 if (curso1.length==0)
					{
				 
				   
					request.setAttribute("mensaje", "No existen cursos disponibles");
					rd= request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
					}
			 else 
			 	{
				 
				 request.setAttribute("listaCursos", curso1);
				 request.setAttribute("label curso o instituto", CatInsLabel);
			     request.setAttribute("nombre instituto o categoria", ListCatIns);
				 rd= request.getRequestDispatcher("InscripcionEdicionCurso2.jsp");
				 rd.forward(request, response);
			 }
				
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
	
	public String[] listarCursos() throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		return port.listarCursos();
	}
	
	public void ingresarCategoria(String ListCatIns) throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		port.ingresarCategoria(ListCatIns);
	}
	
	public String[] listarCursosCategoria() throws Exception {
		ControladorInsEdicionCursoPublishService ciecp = new ControladorInsEdicionCursoPublishServiceLocator();
		ControladorInsEdicionCursoPublish port= ciecp.getControladorInsEdicionCursoPublishPort();
		return port.listarCursosCategoria();
	}
}
