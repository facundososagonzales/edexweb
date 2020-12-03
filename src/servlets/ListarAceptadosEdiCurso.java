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

import publicadores.ControladorListarAceptadosEdiCurso;
import publicadores.ControladorListarAceptadosEdiCursoService;
import publicadores.ControladorListarAceptadosEdiCursoServiceLocator;

/**
 * Servlet implementation class ListarAceptadosEdiCurso
 */
@WebServlet("/ListarAceptadosEdiCurso")
public class ListarAceptadosEdiCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAceptadosEdiCurso() {
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
		request.setAttribute("instituto", ListIns);
		rd= request.getRequestDispatcher("ListarAceptadosEdiCurso1.jsp");
		
			
		String[] curso;
		
		try {
			
		ingresarInstituto(ListIns);
	
		curso=listarCursos();
		request.setAttribute("listaCursos", curso);
		rd= request.getRequestDispatcher("listarAceptadosEdiCurso1.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		rd.forward(request, response);
	}
	
	public void ingresarInstituto (String curso) throws Exception {
		ControladorListarAceptadosEdiCursoService cps = new ControladorListarAceptadosEdiCursoServiceLocator();
		ControladorListarAceptadosEdiCurso port = cps.getControladorListarAceptadosEdiCursoPort();
		port.ingresarInstituto(curso);	
	}
	
	public String[] listarCursos() throws Exception {
		ControladorListarAceptadosEdiCursoService cps = new ControladorListarAceptadosEdiCursoServiceLocator();
		ControladorListarAceptadosEdiCurso port = cps.getControladorListarAceptadosEdiCursoPort();
		return port.listarCursos();	
	}

}
