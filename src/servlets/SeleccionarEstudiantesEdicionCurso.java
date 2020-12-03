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



import publicadores.ControladorSeleccionarEstEdiCursoPublish;
import publicadores.ControladorSeleccionarEstEdiCursoPublishService;
import publicadores.ControladorSeleccionarEstEdiCursoPublishServiceLocator;

/**
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso")
public class SeleccionarEstudiantesEdicionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso() {
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
		String ListIns= request.getParameter("ListIns");
		
		HttpSession sesion = request.getSession();
			
		
		try {
			String[] curso;
			ingresarInstituto(ListIns);
			
			curso=listarCursos();
			
			request.setAttribute("instituto", ListIns);
			rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso1.jsp");
			request.setAttribute("listaCursos", curso);
			rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso1.jsp");
			

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ingresarInstituto(String nombreI) throws Exception {
		ControladorSeleccionarEstEdiCursoPublishService cecp = new ControladorSeleccionarEstEdiCursoPublishServiceLocator();
		ControladorSeleccionarEstEdiCursoPublish port= cecp.getControladorSeleccionarEstEdiCursoPublishPort();
		port.ingresarInstituto(nombreI);
	}
	public String[] listarCursos() throws Exception {
		ControladorSeleccionarEstEdiCursoPublishService cecp = new ControladorSeleccionarEstEdiCursoPublishServiceLocator();
		ControladorSeleccionarEstEdiCursoPublish port= cecp.getControladorSeleccionarEstEdiCursoPublishPort();
		return port.listarCursos();
	}
	
}
