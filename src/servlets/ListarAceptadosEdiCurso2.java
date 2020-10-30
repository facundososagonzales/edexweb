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
import excepciones.ExisteNomEdicionException;
import interfaces.Fabrica;
import interfaces.IControladorListarAceptadosEdiCurso;;


/**
 * Servlet implementation class ListarAceptadosEdiCurso2
 */
@WebServlet("/ListarAceptadosEdiCurso2")
public class ListarAceptadosEdiCurso2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAceptadosEdiCurso2() {
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
		List<String> inscriptos = new ArrayList<>();
		
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorListarAceptadosEdiCurso icseec = fabrica.getIControladorListarAceptadosEdiCurso();
		HttpSession sesion = request.getSession();
	
		
		try {		
			icseec.ingresarEdicion(edicion);
			dtEdicion= icseec.seleccionarEdicion(edicion);
			inscriptos=icseec.listarEstudiantesInscriptos();
			
			
	
			request.setAttribute("DatosEdicionSeleccionada", dtEdicion);
			rd= request.getRequestDispatcher("listarAceptadosEdiCurso3.jsp");
			request.setAttribute("EstudiantesInscriptos", inscriptos);
			rd= request.getRequestDispatcher("listarAceptadosEdiCurso3.jsp");
			
			rd.forward(request, response);
			} catch (ExisteNomEdicionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
