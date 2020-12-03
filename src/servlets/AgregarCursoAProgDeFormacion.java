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

import publicadores.ControladorAgregarCursoAProgFormacion;
import publicadores.ControladorAgregarCursoAProgFormacionService;
import publicadores.ControladorAgregarCursoAProgFormacionServiceLocator;


/**
 * Servlet implementation class AgregarCursoAProgDeFormacion
 */
@WebServlet("/AgregarCursoAProgDeFormacion")
public class AgregarCursoAProgDeFormacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCursoAProgDeFormacion() {
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
		String ListProg= request.getParameter("ListProg");
		request.setAttribute("progForm", ListProg);
		rd= request.getRequestDispatcher("agregarCursoAProgDeFormacion1.jsp");
		
		HttpSession sesion = request.getSession();
			
	
		
		
		try {
			
		String[] cursos = seleccionarProgFormacion2(ListProg);
		
		request.setAttribute("listaCursos", cursos);
		
		rd= request.getRequestDispatcher("agregarCursoAProgDeFormacion1.jsp");
		
		rd.forward(request, response);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String[] seleccionarProgFormacion2(String ListProg) throws Exception {
		ControladorAgregarCursoAProgFormacionService cps = new ControladorAgregarCursoAProgFormacionServiceLocator();
		ControladorAgregarCursoAProgFormacion port = cps.getControladorAgregarCursoAProgFormacionPort();
		return port.seleccionarProgsFormacion2(ListProg);
		
	}
	

}
