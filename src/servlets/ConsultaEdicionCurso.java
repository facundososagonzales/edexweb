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
 * Servlet implementation class ConsultaEdicionCurso
 */
@WebServlet("/ConsultaEdicionCurso")
public class ConsultaEdicionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaEdicionCurso() {
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
		
		String catIns= request.getParameter("catIns");
		request.setAttribute("categoria o instituto", catIns);
		rd= request.getRequestDispatcher("consultaEdicionCurso1.jsp");
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorConsultaEdicionCurso iccec = fabrica.getIControladorConsultaEdicionCurso();
		HttpSession sesion = request.getSession();
		
		if (catIns.equals("Instituto"))
			
		{
			
			List<String> instituto = new ArrayList<>();
			instituto=iccec.listarInstituto();
			
			if (instituto==null)
			{
				request.setAttribute("mensaje", "No existen institutos disponibles");
				rd= request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			else 
			{
			request.setAttribute("lista", instituto);
			rd= request.getRequestDispatcher("consultaEdicionCurso1.jsp");
			rd.forward(request, response);
		}
		}
		
		if (catIns.equals("Categoría"))
		{
			
			List<String> categoria = new ArrayList<>();
			categoria=iccec.listarCategoria();
			
			if (categoria==null)
			{
				request.setAttribute("mensaje", "No existen categorías disponibles");
				rd= request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
			else 
			{
			request.setAttribute("lista", categoria);
			rd= request.getRequestDispatcher("consultaEdicionCurso1.jsp");
			rd.forward(request, response);
			}
		}
		
		
	}

}