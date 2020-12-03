package servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import publicadores.ControladorAltaCurso;
import publicadores.ControladorAltaCursoService;
import publicadores.ControladorAltaCursoServiceLocator;
import publicadores.DtCursoDetalle;
import publicadores.DtCursoBase;


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
	
		
		String instituto = request.getParameter("Instituto");System.out.print("A1T");
		String curso = request.getParameter("Curso");System.out.print("A1T22");
		String descripcion = request.getParameter("Descripcion");System.out.print("A1T33");
		String duracion = request.getParameter("Duracion");System.out.print("A1T44");
		publicadores.Time cantHoras = (publicadores.Time)request.getAttribute("CantHoras");System.out.print("A1T55");
		int cantCreditos = Integer.parseInt(request.getParameter("CantCreditos"));System.out.print("A1T66");
		String URL = request.getParameter("URL");System.out.print("A1T77");
		java.util.Calendar fechaAlta = (java.util.Calendar) request.getAttribute("FechaAlta"); System.out.print("A1T88");
		
		
		
		String fechaNacDia = request.getParameter("FechaAlta").substring(8); int FNdia = Integer.parseInt(fechaNacDia);
		String fechaNacMes = request.getParameter("FechaAlta").substring(5,7); int FNmes = Integer.parseInt(fechaNacMes);
		String fechaNacAnio = request.getParameter("FechaAlta").substring(0,4);  int FNanio= Integer.parseInt(fechaNacAnio);
    	Date fechaNacimiento = new GregorianCalendar(FNanio, (FNmes-1), FNdia).getTime();
		
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(fechaNacimiento);

  
		String previas[];
		previas = request.getParameterValues("lista_previas[]");
		String categorias[];
		categorias = request.getParameterValues("lista_categorias[]");
		
	
			try {
				
	
				if (ingresarCurso(curso)){
					request.setAttribute("mensaje","El curso: "+curso+" ingresado ya existe en el sistema");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
					//throw new RemoteException();
					
				} else if (ingresarInstituto(instituto)){
					request.setAttribute("mensaje","El instituto: "+instituto+" ingresado no existe en el sistema");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
					//throw new RemoteException();
				}
		

			
			List<String> previass = new ArrayList<>(); 
			previass = Arrays.asList(previas);
		
			for (String p: previass) {
				if (!(p.equals("Ninguna"))) {			
					System.out.println(p);
					AgregarPrevias(p);
				}
			}
			
			List<String> categoriass = new ArrayList<>(); 
			categoriass = Arrays.asList(categorias);
		
			for (String c: categoriass) {
				if (!c.equals("Ninguna")) {
					
				agregarCategoria(c);
				}
			}
			
		
			
			publicadores.DtCursoDetalle dcur = new publicadores.DtCursoDetalle();
			dcur.setCantHoras(cantHoras);
			dcur.setCreditos(cantCreditos);
			dcur.setDescripcion(descripcion);
			dcur.setDuracion(duracion);
			dcur.setFechaR(cal);
			dcur.setNombre(curso);
			dcur.setUrl(URL);
			
		
			ingresarDatos(dcur);
			
			request.setAttribute("mensaje","Curso: "+curso+" ingresado con exito");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
		}
		
	
	public boolean ingresarCurso (String curso) throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		return port.ingresarCurso(curso);
	}
	
	public boolean ingresarInstituto (String inst) throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		return port.ingresarInstituto(inst);
	}
	
	public boolean AgregarPrevias (String pre) throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		return port.agregarPrevias(pre);
	}
	
	
	public boolean agregarCategoria (String cat) throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		return port.agregarCategoria(cat);
	}
	
	
	public void ingresarDatos (publicadores.DtCursoDetalle dcursos) throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		port.ingresarDatos(dcursos);
		
	}
	
	public void getPrevias () throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		port.getPrevias();
		
	}
	
	public void getCategorias () throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		port.getCategorias();
		
	}
	
	public String[] listarCursos() throws Exception {
		ControladorAltaCursoService cps = new ControladorAltaCursoServiceLocator();
		ControladorAltaCurso port = cps.getControladorAltaCursoPort();
		return port.listarCursos();
		
	}
	
	}


