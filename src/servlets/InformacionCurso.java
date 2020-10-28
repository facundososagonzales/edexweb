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
import excepciones.ExisteCursoException;
import excepciones.ExisteInstitutoException;
import excepciones.ListaDeCursosVaciaException;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeCurso;

/**
 * Servlet implementation class InformacionCurso
 */
@WebServlet("/InformacionCurso")
public class InformacionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformacionCurso() {
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
		// Solo para Instituto
		RequestDispatcher rd;
		Fabrica fab = Fabrica.getInstancia();
		IControladorConsultaDeCurso icon = fab.getIControladorConsultaDeCurso();
		String nomCurso = request.getParameter("NomCur");
		String nomInstituto = request.getParameter("NomInstituto");
		
		try {
			ArrayList<DtCursoBase> cursos = icon.ingresarInstituto(nomInstituto);
		}catch(ExisteInstitutoException e) {
			throw new ServletException(e.getMessage());
		}catch(ListaDeCursosVaciaException e1) {
			throw new ServletException(e1.getMessage());
		}
		
		try {
			DtInfoProgCurso dt = icon.seleccionarCurso(nomCurso);
			request.setAttribute("Curso", dt);
			//request.setAttribute("mostrar", "curso");
			
		}catch(ExisteCursoException e) {
			throw new ServletException(e.getMessage());
			
		}
		
		request.setAttribute("Dato", nomInstituto);
		request.setAttribute("NomCurso", nomCurso);
		rd = request.getRequestDispatcher("/datosCurso.jsp");
		rd.forward(request, response);
	
	}

}
