package servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import publicadores.ControladorSeleccionarEstEdiCurso4Publish;
import publicadores.ControladorSeleccionarEstEdiCurso4PublishService;
import publicadores.ControladorSeleccionarEstEdiCurso4PublishServiceLocator;


/**
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso4
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso4")
public class SeleccionarEstudiantesEdicionCurso4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso4() {
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
		System.out.println("servlet");
		String curso= request.getParameter("curso");
		System.out.println(curso);
		String nomIns=request.getParameter("nomIns");
		System.out.println(nomIns);
		String edicion=request.getParameter("edicion");
		System.out.println(edicion);
		HttpSession sesion = request.getSession();
		String estudiante = request.getParameter("ListEst");
		System.out.println(estudiante);
		String estado = request.getParameter("ListEstado");
		System.out.println(estado);
		
		try {
			ingresarInstituto(nomIns);
			System.out.println(nomIns);
			ingresarCurso(curso);
			System.out.println(curso);
			ingresarEdicion(edicion);
			System.out.println(edicion);
			ingresarEstudiante(estudiante);
			System.out.println(estudiante);
			
			
			seleccionarEstadoEstudiante(estado);
			System.out.println(estado);
		
		request.setAttribute("mensaje", "Estado de inscripcion actualizado");
		rd= request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ingresarEdicion(String nomEdi) throws Exception {
		ControladorSeleccionarEstEdiCurso4PublishService cecp2 = new ControladorSeleccionarEstEdiCurso4PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso4Publish port= cecp2.getControladorSeleccionarEstEdiCurso4PublishPort();
		port.ingresarEdicion(nomEdi);
		}
	
	public void ingresarEstudiante(String nomEdi) throws Exception {
		ControladorSeleccionarEstEdiCurso4PublishService cecp2 = new ControladorSeleccionarEstEdiCurso4PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso4Publish port= cecp2.getControladorSeleccionarEstEdiCurso4PublishPort();
		port.ingresarEstudiante(nomEdi);
		}
	
	public void ingresarInstituto(String nombreI) throws Exception {
		ControladorSeleccionarEstEdiCurso4PublishService cecp2 = new ControladorSeleccionarEstEdiCurso4PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso4Publish port= cecp2.getControladorSeleccionarEstEdiCurso4PublishPort();
		port.ingresarInstituto(nombreI);
		}

	public void ingresarCurso(String codCur)  throws Exception {
		ControladorSeleccionarEstEdiCurso4PublishService cecp2 = new ControladorSeleccionarEstEdiCurso4PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso4Publish port= cecp2.getControladorSeleccionarEstEdiCurso4PublishPort();
		port.ingresarCurso(codCur);
		}
	
	public String[] listarEstudiantes()  throws Exception {
		ControladorSeleccionarEstEdiCurso4PublishService cecp2 = new ControladorSeleccionarEstEdiCurso4PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso4Publish port= cecp2.getControladorSeleccionarEstEdiCurso4PublishPort();
		return port.listarEstudiantes();
		}
	
	public publicadores.DtEstudiante[] listarEstudiantesInscriptos()  throws Exception {
		ControladorSeleccionarEstEdiCurso4PublishService cecp2 = new ControladorSeleccionarEstEdiCurso4PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso4Publish port= cecp2.getControladorSeleccionarEstEdiCurso4PublishPort();
		return port.listarEstudiantesInscriptos();
		}
	
	public void seleccionarEstadoEstudiante(String estado)  throws Exception {
		ControladorSeleccionarEstEdiCurso4PublishService cecp2 = new ControladorSeleccionarEstEdiCurso4PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso4Publish port= cecp2.getControladorSeleccionarEstEdiCurso4PublishPort();
		 port.seleccionarEstadoEstudiante(estado);
		}
}



