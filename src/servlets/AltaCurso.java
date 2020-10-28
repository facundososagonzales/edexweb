package servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datatypes.DtCursoDetalle;
import datatypes.DtDocente;
import excepciones.CursoNoExiste;
import excepciones.CursoRepetido;
import excepciones.ExisteCategoriaException;
import excepciones.InstitutoNoCargadoException;
import excepciones.PasswordRepetidaException;
import excepciones.PreviaYaExiste;
import excepciones.UsuarioRepetidoException;
import interfaces.Fabrica;
import interfaces.IControladorAltaCurso;
import logica.Curso;

/**
 * Servlet implementation class AltaCurso
 */
@WebServlet("/AltaCurso")
public class AltaCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaCurso() {
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
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorAltaCurso icac = fabrica.getIControladorAltaCurso();
		
		String instituto = request.getParameter("Instituto");System.out.print("A1T");
		String curso = request.getParameter("Curso");System.out.print("A1T");
		String descripcion = request.getParameter("Descripcion");System.out.print("A1T");
		String duracion = request.getParameter("Duracion");System.out.print("A1T");
		Time cantHoras = (Time) request.getAttribute("CantHoras");System.out.print("A1T");
		int cantCreditos = Integer.parseInt(request.getParameter("CantCreditos"));System.out.print("A1T");
		String URL = request.getParameter("URL");System.out.print("A1T");
		Date fechaAlta = (Date) request.getAttribute("FechaAlta");System.out.print("A1T");
		
		String previas[];
		previas = request.getParameterValues("lista_previas[]");
		String categorias[];
		categorias = request.getParameterValues("lista_categorias[]");
		
	
		try {
			System.out.print("AAAAAA");
			icac.ingresarCurso(curso); System.out.print("BBBBBBBBBBBBBbbb");
			icac.ingresarInstituto(instituto);
			System.out.print("CCCCCCCC");

			
			List<String> previass = new ArrayList<>(); 
			previass = Arrays.asList(previas);
		
			for (String p: previass) {
				if (!(p.equals("Ninguna"))) {			
					System.out.print(p);
					icac.AgregarPrevias(p);
				}
			}
			
			List<String> categoriass = new ArrayList<>(); 
			categoriass = Arrays.asList(categorias);
		
			for (String c: categoriass) {
				if (!c.equals("Ninguna")) {
					System.out.print(c);
				icac.agregarCategoria(c);
				}
			}
			
			
			DtCursoDetalle dcursos = new DtCursoDetalle (curso,descripcion,duracion,cantHoras,cantCreditos,fechaAlta,URL);
			icac.ingresarDatos(dcursos);
			
	
		}catch(CursoRepetido pre) {
			request.setAttribute("mensaje","El curso: "+curso+" ingresadoya existe en el sistema");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		} catch (InstitutoNoCargadoException e) {
			request.setAttribute("mensaje","El instituto: "+instituto+ "no existe en el sistema");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		} catch (PreviaYaExiste ef) {
			request.setAttribute("mensaje","La previa ya existe para el curso");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		} catch (ExisteCategoriaException es) {
			request.setAttribute("mensaje","La categoria ya fue ingresada");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}	
		
		request.setAttribute("mensaje","Curso: "+curso+" ingresado con exito");
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
		}
		
	}


