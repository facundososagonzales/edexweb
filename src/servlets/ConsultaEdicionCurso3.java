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
import interfaces.IControladorConsultaEdicionCurso;


/**
 * Servlet implementation class ConsultaEdicionCurso1
 */
@WebServlet("/ConsultaEdicionCurso3")
public class ConsultaEdicionCurso3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaEdicionCurso3() {
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
		// TODO Auto-generated method stub
		RequestDispatcher rd;
		
		String edicion= request.getParameter("ListEdicion");
		DtEdicionDetalle dtEdicion;
		List<String> listDocente = new ArrayList<>();
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorConsultaEdicionCurso iccec = fabrica.getIControladorConsultaEdicionCurso();
		HttpSession sesion = request.getSession();
	
		
			iccec.ingresarEdicion(edicion);
			dtEdicion= iccec.SeleccionarEdicion();
			listDocente = iccec.listarDocentes();
			
	
			request.setAttribute("DatosEdicionSeleccionada", dtEdicion);
			rd= request.getRequestDispatcher("consultaEdicionCurso4.jsp");
			request.setAttribute("DocentesEdicionSeleccionada", listDocente);
			rd= request.getRequestDispatcher("consultaEdicionCurso4.jsp");
			rd.forward(request, response);
		
	
		
	}

}