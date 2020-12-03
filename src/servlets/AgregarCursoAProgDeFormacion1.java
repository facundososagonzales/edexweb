package servlets;

import java.io.IOException;

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
 * Servlet implementation class AgregarCursoAProgDeFormacion1
 */
@WebServlet("/AgregarCursoAProgDeFormacion1")
public class AgregarCursoAProgDeFormacion1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public  AgregarCursoAProgDeFormacion1() {
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
		String progForm= request.getParameter("progForm");
		HttpSession sesion = request.getSession();
		
		
		try {
			
		seleccionarCurso(curso);
		request.setAttribute("Curso", curso);
		request.setAttribute("ProgForm", progForm);
		confirmar();
	
		
		request.setAttribute("mensaje","Se agrego "+ curso +" a " + progForm + " con exito");
		rd = request.getRequestDispatcher("/notificacion.jsp");
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
	
	public String[] listarProgFormacion2() throws Exception {
		ControladorAgregarCursoAProgFormacionService cps = new ControladorAgregarCursoAProgFormacionServiceLocator();
		ControladorAgregarCursoAProgFormacion port = cps.getControladorAgregarCursoAProgFormacionPort();
		return port.listarProgsFormacion2();
		
	}
	public void seleccionarCurso(String ListProg) throws Exception {
		ControladorAgregarCursoAProgFormacionService cps = new ControladorAgregarCursoAProgFormacionServiceLocator();
		ControladorAgregarCursoAProgFormacion port = cps.getControladorAgregarCursoAProgFormacionPort();
		port.seleccionarCurso(ListProg);
		
	}
	
	public void confirmar() throws Exception {
		ControladorAgregarCursoAProgFormacionService cps = new ControladorAgregarCursoAProgFormacionServiceLocator();
		ControladorAgregarCursoAProgFormacion port = cps.getControladorAgregarCursoAProgFormacionPort();
		port.confirmar();
		
	}

}
