package servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datatypes.DtEdicionDetalle;
import interfaces.Fabrica;
import interfaces.IControladorSeleccionarEstEdiCurso;


/**
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso2
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso2")
public class SeleccionarEstudiantesEdicionCurso2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso2() {
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
		
		String edicion= request.getParameter("ListEdicion");
		request.setAttribute("edicion", edicion);
		String nomIns= request.getParameter("nomIns");
		request.setAttribute("instituto", nomIns);
		String curso= request.getParameter("curso");
		request.setAttribute("curso", curso);
		DtEdicionDetalle dtEdicion;
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorSeleccionarEstEdiCurso icseec = fabrica.getIControladorSeleccionarEstEdiCurso();
		HttpSession sesion = request.getSession();
	
		
			icseec.ingresarEdicion(edicion);
			dtEdicion= icseec.SeleccionarEdicion();
			
	
			request.setAttribute("DatosEdicionSeleccionada", dtEdicion);
			rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso3.jsp");
			rd.forward(request, response);
	}

}
