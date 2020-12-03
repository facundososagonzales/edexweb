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


import publicadores.ControladorSeleccionarEstEdiCurso1Publish;
import publicadores.ControladorSeleccionarEstEdiCurso1PublishService;
import publicadores.ControladorSeleccionarEstEdiCurso1PublishServiceLocator;



/**
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso1
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso1")
public class SeleccionarEstudiantesEdicionCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso1() {
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
			rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso2.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ingresarInstituto(String nombreI) throws Exception {
		ControladorSeleccionarEstEdiCurso1PublishService cecp = new ControladorSeleccionarEstEdiCurso1PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso1Publish port= cecp.getControladorSeleccionarEstEdiCurso1PublishPort();
		port.ingresarInstituto(nombreI);
		}
	
	public void ingresarCurso(String codCur) throws Exception {
		ControladorSeleccionarEstEdiCurso1PublishService cecp = new ControladorSeleccionarEstEdiCurso1PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso1Publish port= cecp.getControladorSeleccionarEstEdiCurso1PublishPort();
		port.ingresarCurso(codCur);
		}
	
	public String[] listarEdicion() throws Exception {
		ControladorSeleccionarEstEdiCurso1PublishService cecp = new ControladorSeleccionarEstEdiCurso1PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso1Publish port= cecp.getControladorSeleccionarEstEdiCurso1PublishPort();
		return port.listarEdicion();
		}

}
