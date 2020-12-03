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

import publicadores.ControladorAltaEdicionCurso;
import publicadores.ControladorAltaEdicionCursoService;
import publicadores.ControladorAltaEdicionCursoServiceLocator;

/**
 * Servlet implementation class AltaEdicionDeCurso
 */
@WebServlet("/AltaEdicionDeCurso")
public class AltaEdicionDeCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaEdicionDeCurso() {
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
		
		String instituto = request.getParameter("Instituto");
		String cupos = request.getParameter("Cupos");
		String name =  request.getParameter("inputName");
		String FechaInicio = request.getParameter("FechaInicio");
		String FechaFin = request.getParameter("FechaFin");
		//Fabrica fabrica = Fabrica.getInstancia();
		//IControladorAltaEdicionCurso icaec = fabrica.getIControladorAltaEdicionCurso();
		RequestDispatcher rd;
		
		try {
			ingresarInstituto(instituto);
			String[] cursos = listarCursos();
			request.setAttribute("cursos", cursos);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("Instituto", instituto);
		request.setAttribute("name", name);
		request.setAttribute("cupos", cupos);
		request.setAttribute("fechaInicio", FechaInicio);
		request.setAttribute("fechaFin", FechaFin);
		
		rd= request.getRequestDispatcher("altaEdicionDeCurso1.jsp");
		rd.forward(request, response);
	}
	
	public void ingresarInstituto(String instituto) throws Exception {
		ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
		ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
		port.ingresarInstituto(instituto);;
	}
	
	public String[] listarCursos() throws Exception {
		ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
		ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
		return port.listarCursos();
	}

}
