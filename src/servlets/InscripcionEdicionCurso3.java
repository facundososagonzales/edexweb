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

import datatypes.DtEdicionDetalle;
import interfaces.Fabrica;
import interfaces.IControladorInsEdicionCurso;

/**
 * Servlet implementation class InscripcionEdicionCurso3
 */
@WebServlet("/InscripcionEdicionCurso3")
public class InscripcionEdicionCurso3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscripcionEdicionCurso3() {
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
		DtEdicionDetalle dtEdicion;
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorInsEdicionCurso iciec = fabrica.getIControladorInsEdicionCurso();
		HttpSession sesion = request.getSession();
	
		
			iciec.ingresarEdicion(edicion);
			dtEdicion= iciec.SeleccionarEdicion();
			
			request.setAttribute("edicionSeleccionada", edicion);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso4.jsp");
	
			request.setAttribute("DatosEdicionSeleccionada", dtEdicion);
			rd= request.getRequestDispatcher("InscripcionEdicionCurso4.jsp");
			rd.forward(request, response);
	}

}
