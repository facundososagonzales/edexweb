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

//import interfaces.Fabrica;
//import interfaces.IControladorConsultaEdicionCurso;
import publicadores.ControladorConsultaEdicionCurso1Publish;
import publicadores.ControladorConsultaEdicionCurso1PublishService;
import publicadores.ControladorConsultaEdicionCurso1PublishServiceLocator;



/**
 * Servlet implementation class ConsultaEdicionCurso1
 */
@WebServlet("/ConsultaEdicionCurso1")
public class ConsultaEdicionCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaEdicionCurso1() {
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
		
		String ListCatIns= request.getParameter("ListCatIns");
		String CatInsLabel=request.getParameter("CatInsLabel");
		
		//Fabrica fabrica = Fabrica.getInstancia();
		//IControladorConsultaEdicionCurso iccec = fabrica.getIControladorConsultaEdicionCurso();
		HttpSession sesion = request.getSession();
		
		
	
			try {
				
				if (CatInsLabel.equals("Instituto"))
					
				{
					
					String[] curso = null;
					ingresarInstituto(ListCatIns);
					curso=listarCurso();
					
					
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
							rd= request.getRequestDispatcher("consultaEdicionCurso2.jsp");
							rd.forward(request, response);
						}
				}
				
				if (CatInsLabel.equals("Categoría"))
				{
					
					String[] curso1 = null;
				ingresarCategoria(ListCatIns);
				curso1=listarCursoPorCategoria();
				
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
				 rd= request.getRequestDispatcher("consultaEdicionCurso2.jsp");
				 rd.forward(request, response);
			 }
			
		}
	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
			
	
		
		
	}
	
	public String[] listarCurso() throws Exception {
		ControladorConsultaEdicionCurso1PublishService cecp1 = new ControladorConsultaEdicionCurso1PublishServiceLocator();
		ControladorConsultaEdicionCurso1Publish port= cecp1.getControladorConsultaEdicionCurso1PublishPort();
		return port.listarCurso();
	}
	
	public String[] listarCursoPorCategoria() throws Exception {
		ControladorConsultaEdicionCurso1PublishService cecp1 = new ControladorConsultaEdicionCurso1PublishServiceLocator();
		ControladorConsultaEdicionCurso1Publish port= cecp1.getControladorConsultaEdicionCurso1PublishPort();
		return port.listarCursoPorCategoria();
	}
	
	public void ingresarInstituto(String nomCategoria) throws Exception {
		ControladorConsultaEdicionCurso1PublishService cecp1 = new ControladorConsultaEdicionCurso1PublishServiceLocator();
		ControladorConsultaEdicionCurso1Publish port= cecp1.getControladorConsultaEdicionCurso1PublishPort();
		port.ingresarInstituto(nomCategoria);
	}
	
	public void ingresarCategoria(String nomCategoria) throws Exception {
		ControladorConsultaEdicionCurso1PublishService cecp1 = new ControladorConsultaEdicionCurso1PublishServiceLocator();
		ControladorConsultaEdicionCurso1Publish port= cecp1.getControladorConsultaEdicionCurso1PublishPort();
		port.ingresarCategoria(nomCategoria);
	}
}
	
