package servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import publicadores.ControladorListarAceptadosEdiCurso;
import publicadores.ControladorListarAceptadosEdiCurso1;
import publicadores.ControladorListarAceptadosEdiCurso1Service;
import publicadores.ControladorListarAceptadosEdiCurso1ServiceLocator;
import publicadores.ControladorListarAceptadosEdiCursoService;
import publicadores.ControladorListarAceptadosEdiCursoServiceLocator;


/**
 * Servlet implementation class ListarAceptadosEdiCurso1
 */
@WebServlet("/ListarAceptadosEdiCurso1")
public class ListarAceptadosEdiCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAceptadosEdiCurso1() {
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
		
		String curso= request.getParameter("ListCurso");
		String nomIns= request.getParameter("nomIns");
		
		
		HttpSession sesion = request.getSession();
		
		String[] edicion;
		
		try {
			
		ingresarInstituto(nomIns);
		ingresarCurso(curso);
		edicion=listarEdicion();
		request.setAttribute("Curso", curso);
		request.setAttribute("instituto", nomIns);
		request.setAttribute("listaEdicion", edicion);
		rd= request.getRequestDispatcher("listarAceptadosEdiCurso2.jsp");
		rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void ingresarInstituto (String curso) throws Exception {
		ControladorListarAceptadosEdiCurso1Service cps = new ControladorListarAceptadosEdiCurso1ServiceLocator();
		ControladorListarAceptadosEdiCurso1 port = cps.getControladorListarAceptadosEdiCurso1Port();
		port.ingresarInstituto(curso);	
	}

	public void ingresarCurso (String curso) throws Exception {
		ControladorListarAceptadosEdiCursoService cps = new ControladorListarAceptadosEdiCursoServiceLocator();
		ControladorListarAceptadosEdiCurso port = cps.getControladorListarAceptadosEdiCursoPort();
		port.ingresarCurso(curso);	
	}
	
	public String[] listarEdicion() throws Exception {
		ControladorListarAceptadosEdiCursoService cps = new ControladorListarAceptadosEdiCursoServiceLocator();
		ControladorListarAceptadosEdiCurso port = cps.getControladorListarAceptadosEdiCursoPort();
		return port.listarEdicion();	
	}
}
