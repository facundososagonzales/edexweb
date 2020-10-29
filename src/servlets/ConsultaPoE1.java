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
import datatypes.DtEdicionDetalle;
import datatypes.DtInfoProgCurso;
import datatypes.DtProgCurso;
import excepciones.ExisteCategoriaException;
import excepciones.ExisteCursoException;
import excepciones.ExisteInstitutoException;
import excepciones.ExisteNomEdicionException;
import excepciones.ExisteProgramaException;
import excepciones.ListaDeCursosVaciaException;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeCurso;

/**
 * Servlet implementation class ConsultaPoE1
 */
@WebServlet("/ConsultaPoE1")
public class ConsultaPoE1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaPoE1() {
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
		Fabrica fab = Fabrica.getInstancia();
		IControladorConsultaDeCurso icon = fab.getIControladorConsultaDeCurso();
		String nomCurso = request.getParameter("NomCurso");
		String nomCategoria = request.getParameter("NomCategoria");
		String datoF = request.getParameter("DatoF");
		
		try {
			ArrayList<DtCursoBase> cursos = icon.ingresarCategoria(nomCategoria);
							
		}catch(ExisteCategoriaException e) {
			throw new ServletException(e.getMessage());
		
		}catch(ListaDeCursosVaciaException e1) {
			throw new ServletException(e1.getMessage());
		}
		
		try {
			DtInfoProgCurso dt = icon.seleccionarCursoEnCat(nomCurso);
		}catch(ExisteCursoException e) {
			throw new ServletException(e.getMessage());	
		}
		
	
		if (request.getParameter("boton").equals("edicion")){
			try {
				DtEdicionDetalle dt = icon.seleccionarEdicionCat(datoF);
				String infoEd = "EDICION: \n"+dt.toString();
				request.setAttribute("mensaje","Informacion de Edicion: \n"+infoEd+" ");
				
			}catch(ExisteNomEdicionException e) {
				throw new ServletException(e.getMessage());
			}
			
		}else 
		if (request.getParameter("boton").equals("progFormacion")) {
			try {
				DtProgCurso dt = icon.seleccionarPrograma(datoF);
				String infoProg = "PROGRAMA DE FORMACION: \n"+dt.toString();
				request.setAttribute("mensaje","Informacion de Programa de Formacion: \n"+infoProg+" ");
			
			}catch(ExisteProgramaException e) {
				throw new ServletException(e.getMessage());
			
			}
		}
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
		
	}

}
