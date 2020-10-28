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
import datatypes.DtInfoProgCurso;
import excepciones.ExisteCategoriaException;
import excepciones.ExisteCursoException;
import excepciones.ExisteInstitutoException;
import excepciones.ListaDeCursosVaciaException;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeCurso;

/**
 * Servlet implementation class InformacionCurso1
 */
@WebServlet("/InformacionCurso1")
public class InformacionCurso1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformacionCurso1() {
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
		
		// Solo para Categoria
				RequestDispatcher rd;
				Fabrica fab = Fabrica.getInstancia();
				IControladorConsultaDeCurso icon = fab.getIControladorConsultaDeCurso();
				String nomCurso = request.getParameter("NomCur");
				String NomCategoria = request.getParameter("NomCategoria");
				
				try {
					ArrayList<DtCursoBase> cursos = icon.ingresarCategoria(NomCategoria);
									
				}catch(ExisteCategoriaException e) {
					throw new ServletException(e.getMessage());
				
				}catch(ListaDeCursosVaciaException e1) {
					throw new ServletException(e1.getMessage());
				}
				
				try {
					DtInfoProgCurso dt = icon.seleccionarCursoEnCat(nomCurso);
					request.setAttribute("Curso", dt);
					//request.setAttribute("mostrar", "curso");
					
				}catch(ExisteCursoException e) {
					throw new ServletException(e.getMessage());
					
				}
				
				request.setAttribute("Dato", NomCategoria);
				request.setAttribute("NomCurso", nomCurso);
				rd = request.getRequestDispatcher("/datosCurso1.jsp");
				rd.forward(request, response);
			
		
		
	}

}
