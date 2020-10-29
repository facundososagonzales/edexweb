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

import datatypes.DtEstudiante;
import interfaces.Fabrica;
import interfaces.IControladorSeleccionarEstEdiCurso;


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
		
		String Curso= request.getParameter("ListCurso");
		String nomIns=request.getParameter("nomIns");
		String edicion=request.getParameter("edicion");
		System.out.println(nomIns+" inst");
		System.out.println(Curso+" edicion");
		System.out.println(edicion+" curso");
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorSeleccionarEstEdiCurso icseec = fabrica.getIControladorSeleccionarEstEdiCurso();
		HttpSession sesion = request.getSession();
		
		icseec.ingresarInstituto(nomIns);
		icseec.ingresarCurso(Curso);
		icseec.ingresarEdicion(edicion);
		ArrayList<DtEstudiante> dtEst = new ArrayList<>();
		dtEst = icseec.listarEstudiantesInscriptos();
		List<String> estudiantes = new ArrayList<>();
		estudiantes = icseec.listarEstudiantes();
		request.setAttribute("DatosEstudiantes", dtEst);
		request.setAttribute("estudiantes", estudiantes);
		rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso4.jsp");
		
	}

}
