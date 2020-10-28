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
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorConsultaEdicionCurso iccec = fabrica.getIControladorConsultaEdicionCurso();
		HttpSession sesion = request.getSession();
		
		
	if (CatInsLabel.equals("Instituto"))
			
		{
			
			List<String> edicion = new ArrayList<>();
			iccec.ingresarInstituto(nomCatIns);
			iccec.ingresarCurso(Curso);
			edicion=iccec.listarEdicion();
			
			 if (edicion.isEmpty())
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

			List<String> edicion = new ArrayList<>();
			iccec.ingresarCategoria(nomCatIns);
			iccec.ingresarCursoporCat(Curso);
			edicion=iccec.listarEdicionCat();
			
			if (edicion.isEmpty())
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
	
	}
	
}