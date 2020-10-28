package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datatypes.DtCursoBase;
import excepciones.ExisteCategoriaException;
import excepciones.ExisteInstitutoException;
import excepciones.ListaDeCursosVaciaException;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeCurso;

/**
 * Servlet implementation class ConsultaInstCat
 */
@WebServlet("/ConsultaInstCat")
public class ConsultaInstCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaInstCat() {
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
		Fabrica fab = Fabrica.getInstancia();
		IControladorConsultaDeCurso icon = fab.getIControladorConsultaDeCurso();
		String dato = request.getParameter("Dato");		
		
		if (request.getParameter("boton").equals("instituto")){
			try {
				ArrayList<DtCursoBase> cursos = icon.ingresarInstituto(dato);
				request.setAttribute("cursos", cursos);
				request.setAttribute("mostrar", "instituto");
			}catch(ExisteInstitutoException e) {
				throw new ServletException(e.getMessage());
			}catch(ListaDeCursosVaciaException e1) {
				throw new ServletException(e1.getMessage());
			}
			
		}else if (request.getParameter("boton").equals("categoria")) {
			try {
				ArrayList<DtCursoBase> cursos = icon.ingresarCategoria(dato);
				request.setAttribute("cursos", cursos);
				request.setAttribute("mostrar", "categoria");
			
			}catch(ExisteCategoriaException e) {
				throw new ServletException(e.getMessage());
			
			}catch(ListaDeCursosVaciaException e1) {
				throw new ServletException(e1.getMessage());
			}
		}
		request.setAttribute("Dato", dato);
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/cursosDelSistema.jsp");
		rd.forward(request, response);
			
		
	}

}
