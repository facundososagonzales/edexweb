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

import publicadores.DtEstudiante;
import publicadores.Estado;
import publicadores.ControladorSeleccionarEstEdiCurso3Publish;
import publicadores.ControladorSeleccionarEstEdiCurso3PublishService;
import publicadores.ControladorSeleccionarEstEdiCurso3PublishServiceLocator;


/**
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso3
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso3")
public class SeleccionarEstudiantesEdicionCurso3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso3() {
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
		
		String curso= request.getParameter("curso");
		String nomIns=request.getParameter("nomIns");
		String edicion=request.getParameter("edicion");
		
		
		HttpSession sesion = request.getSession();
		
		
		
		
		try {
			ingresarInstituto(nomIns);
			ingresarCurso(curso);
			ingresarEdicion(edicion);
			publicadores.DtEstudiante[] dtEst= null;
			
			
			//ArrayList<DtEstudiante> dtEst = new ArrayList<>();
			

			
			
			dtEst = listarEstudiantesInscriptos();
			String[] estudiantes;
			estudiantes = listarEstudiantes();
			String mostrar ="";
			
			for(DtEstudiante d: dtEst) {
				mostrar =  mostrar +"Nombre:   "+d.getNick() + "   ---   " + "Estado:   "+d.getEstado()+"\n";
			}
			
			
			request.setAttribute("mostrar", mostrar);
			request.setAttribute("DatosEstudiantes", dtEst);
			request.setAttribute("estudiantes", estudiantes);
			request.setAttribute("nomIns", nomIns);
			request.setAttribute("curso", curso);
			request.setAttribute("edicion", edicion);
			rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso4.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void ingresarEdicion(String nomEdi) throws Exception {
		ControladorSeleccionarEstEdiCurso3PublishService cecp2 = new ControladorSeleccionarEstEdiCurso3PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso3Publish port= cecp2.getControladorSeleccionarEstEdiCurso3PublishPort();
		port.ingresarEdicion(nomEdi);
		}
	
	public void ingresarInstituto(String nombreI) throws Exception {
		ControladorSeleccionarEstEdiCurso3PublishService cecp2 = new ControladorSeleccionarEstEdiCurso3PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso3Publish port= cecp2.getControladorSeleccionarEstEdiCurso3PublishPort();
		port.ingresarInstituto(nombreI);
		}

	public void ingresarCurso(String codCur)  throws Exception {
		ControladorSeleccionarEstEdiCurso3PublishService cecp2 = new ControladorSeleccionarEstEdiCurso3PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso3Publish port= cecp2.getControladorSeleccionarEstEdiCurso3PublishPort();
		port.ingresarCurso(codCur);
		}
	
	public String[] listarEstudiantes()  throws Exception {
		ControladorSeleccionarEstEdiCurso3PublishService cecp2 = new ControladorSeleccionarEstEdiCurso3PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso3Publish port= cecp2.getControladorSeleccionarEstEdiCurso3PublishPort();
		return port.listarEstudiantes();
		}
	
	public publicadores.DtEstudiante[] listarEstudiantesInscriptos()  throws Exception {
		ControladorSeleccionarEstEdiCurso3PublishService cecp2 = new ControladorSeleccionarEstEdiCurso3PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso3Publish port= cecp2.getControladorSeleccionarEstEdiCurso3PublishPort();
		return port.listarEstudiantesInscriptos();
		}
}
