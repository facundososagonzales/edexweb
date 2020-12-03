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

import publicadores.ControladorConsultaEdicionCurso2Publish;
import publicadores.ControladorConsultaEdicionCurso2PublishService;
import publicadores.ControladorConsultaEdicionCurso2PublishServiceLocator;

//import interfaces.Fabrica;
//import interfaces.IControladorConsultaEdicionCurso;


/**
 * Servlet implementation class ConsultaEdicionCurso2
 */
@WebServlet("/ConsultaEdicionCurso2")
public class ConsultaEdicionCurso2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaEdicionCurso2() {
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
		// TODO Auto-generated method stub
		RequestDispatcher rd;
		
		String Curso= request.getParameter("ListCurso");
		String CatInsLabel=request.getParameter("CatInsLabel");
		System.out.println(CatInsLabel);
		String nomCatIns=request.getParameter("nomCatIns");
		
		
		HttpSession sesion = request.getSession();
		
		
	
			try {
				if (CatInsLabel.equals("Instituto"))
					
				{
					
					String[] edicion;
				ingresarInstituto(nomCatIns);
				ingresarCurso(Curso);
				edicion=listarEdicion();
				
				 if (edicion.length==0)
				 	{
					request.setAttribute("mensaje", "No existen ediciones disponibles");
					rd= request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
					}
					
					else {	
							request.setAttribute("listaEdicion", edicion);
							rd= request.getRequestDispatcher("consultaEdicionCurso3.jsp");
							rd.forward(request, response);
					}
			}
		if (CatInsLabel.equals("Categoría")) 
			{

				String[] edicion;
				ingresarCategoria(nomCatIns);
				ingresarCursoPorCat(Curso);
				edicion=listarEdicionporCat();
				
				if (edicion.length==0)
			 	{
				request.setAttribute("mensaje", "No existen ediciones disponibles");
				rd= request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			 	}
				else 
					{
					request.setAttribute("listaEdicion", edicion);
					rd= request.getRequestDispatcher("consultaEdicionCurso3.jsp");
					rd.forward(request, response);
					}
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}
	

			
	
		
		
	
	public void ingresarCategoria(String nomCategoria) throws Exception {
		ControladorConsultaEdicionCurso2PublishService cecp1 = new ControladorConsultaEdicionCurso2PublishServiceLocator();
		ControladorConsultaEdicionCurso2Publish port= cecp1.getControladorConsultaEdicionCurso2PublishPort();
		port.ingresarCategoria(nomCategoria);
	}
	public void ingresarInstituto(String nomInstituto) throws Exception {
		ControladorConsultaEdicionCurso2PublishService cecp1 = new ControladorConsultaEdicionCurso2PublishServiceLocator();
		ControladorConsultaEdicionCurso2Publish port= cecp1.getControladorConsultaEdicionCurso2PublishPort();
		port.ingresarInstituto(nomInstituto);
	}
	
	public void ingresarCurso(String nomCurso) throws Exception {
		ControladorConsultaEdicionCurso2PublishService cecp1 = new ControladorConsultaEdicionCurso2PublishServiceLocator();
		ControladorConsultaEdicionCurso2Publish port= cecp1.getControladorConsultaEdicionCurso2PublishPort();
		port.ingresarCurso(nomCurso);
	}
	
	public void ingresarCursoPorCat(String nomCurso) throws Exception {
		ControladorConsultaEdicionCurso2PublishService cecp1 = new ControladorConsultaEdicionCurso2PublishServiceLocator();
		ControladorConsultaEdicionCurso2Publish port= cecp1.getControladorConsultaEdicionCurso2PublishPort();
		port.ingresarCursoPorCat(nomCurso);
	}
	
	public String[] listarEdicion() throws Exception {
		ControladorConsultaEdicionCurso2PublishService cecp1 = new ControladorConsultaEdicionCurso2PublishServiceLocator();
		ControladorConsultaEdicionCurso2Publish port= cecp1.getControladorConsultaEdicionCurso2PublishPort();
		return port.listarEdicion();
	}
	
	public String[] listarEdicionporCat() throws Exception {
		ControladorConsultaEdicionCurso2PublishService cecp1 = new ControladorConsultaEdicionCurso2PublishServiceLocator();
		ControladorConsultaEdicionCurso2Publish port= cecp1.getControladorConsultaEdicionCurso2PublishPort();
		return port.listarEdicionCat();
	}
	
	
}
	
