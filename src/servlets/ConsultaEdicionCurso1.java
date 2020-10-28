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
import interfaces.IControladorConsultaEdicionCurso;


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
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorConsultaEdicionCurso iccec = fabrica.getIControladorConsultaEdicionCurso();
		HttpSession sesion = request.getSession();
		
		
		if (CatInsLabel.equals("Instituto"))
			
		{
			
			List<String> curso = null;
			iccec.ingresarInstituto(ListCatIns);
			curso=iccec.listarCurso();
			
			
			 if (curso.isEmpty())
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
			
			List<String> curso1 = null;
			iccec.ingresarCategoria(ListCatIns);
			curso1=iccec.listarCursoPorCategoria();
		
		
			 if (curso1.isEmpty())
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
	
	
		
		
	}
}
	
