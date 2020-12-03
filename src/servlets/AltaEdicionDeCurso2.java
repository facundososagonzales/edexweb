package servlets;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import publicadores.ControladorAltaEdicionCurso;
import publicadores.ControladorAltaEdicionCursoService;
import publicadores.ControladorAltaEdicionCursoServiceLocator;
import publicadores.DtEdicionDetalle;

/**
 * Servlet implementation class AltaEdicionDeCurso2
 */
@WebServlet("/AltaEdicionDeCurso2")
public class AltaEdicionDeCurso2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaEdicionDeCurso2() {
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
		String Instituto = request.getParameter("Instituto");
		String cupos = request.getParameter("cupos");
		String name =  request.getParameter("name");
		String fechaInicio = request.getParameter("fechaInicio");
		String fechaFin = request.getParameter("fechaFin");	
		String curso = request.getParameter("curso");
		RequestDispatcher rd;
		//Fabrica fabrica = Fabrica.getInstancia();
		//IControladorAltaEdicionCurso icaec = fabrica.getIControladorAltaEdicionCurso();
		
		String docentes[];
		docentes = request.getParameterValues("docentes");
		//List<String> docentes1 = new ArrayList<>(); 
		//docentes1 = Arrays.asList(docentes);
		
		try {
	    	Date fechaPub = new Date();
	    	DtEdicionDetalle dted = null;
	    	ingresarInstituto(Instituto);
	    	ingresarCurso(curso);
	    	ingresarDocentes(docentes);
	    	System.out.println(docentes + "docente");
			String fechaInDia = fechaInicio.substring(8); int FIdia = Integer.parseInt(fechaInDia);
			String fechaInMes = fechaInicio.substring(5,7); int FImes = Integer.parseInt(fechaInMes);
			String fechaInAnio = fechaInicio.substring(0,4);  int FIanio= Integer.parseInt(fechaInAnio);
			String fechaFDia = fechaFin.substring(8); int FFdia = Integer.parseInt(fechaFDia);
			String fechaFMes = fechaFin.substring(5,7); int FFmes = Integer.parseInt(fechaFMes);
			String fechaFAnio = fechaFin.substring(0,4);  int FFanio= Integer.parseInt(fechaFAnio);
			int Cupos;
			System.out.println(cupos + "cuposss");
			if(cupos==null) {
				Cupos=0;
			}else {
				Cupos = Integer.parseInt(cupos);
				System.out.println(Cupos + "cupo");
			}
	    	Date fechaInicio1 = new GregorianCalendar(FIanio, (FImes-1), FIdia).getTime();
	    	Date fechaFin1 = new GregorianCalendar(FFanio, (FFmes-1), FFdia).getTime();
	    	//dted = new publicadores.DtEdicionDetalle(name,fechaInicio1,fechaFin1,Cupos,fechaPub);
	    	dted = new publicadores.DtEdicionDetalle();
	    	Calendar cFI1 = new GregorianCalendar();
	    	Calendar cFF1 = new GregorianCalendar();
	    	Calendar cFP1 = new GregorianCalendar();
	    	cFI1.setTime(fechaInicio1);
	    	cFF1.setTime(fechaFin1);
	    	cFP1.setTime(fechaPub);
	    	dted.setFechaI(cFI1);
	    	dted.setFechaF(cFF1);
	    	dted.setFechaPub(cFP1);
	    	dted.setNombre(name);
	    	dted.setCupos(Cupos);
	    	
	    	if(ingresarEdicionCurso(dted)) {
	    		if(darAltaEdicionCurso()) {
	    			request.setAttribute("mensaje","La edicion "+name+" fue ingresado con exito");
	    		}else {
	    			request.setAttribute("mensaje","La edicion "+name+" no tiene docentes asignados");
	    		}
	    	}else {
    			request.setAttribute("mensaje","La edicion "+name+" ya existe en el sistema");
	    	}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
		
	}
	
	public void ingresarInstituto(String instituto) throws Exception {
		ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
		ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
		port.ingresarInstituto(instituto);
	}
	
	public void ingresarCurso(String curso) throws Exception {
		ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
		ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
		port.ingresarCurso(curso);
	}
	
	public void ingresarDocentes(String[] docentes) throws Exception {
		ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
		ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
		port.ingresarDocentes(docentes);
	}
	
	public boolean ingresarEdicionCurso(DtEdicionDetalle edicion) throws Exception {
		ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
		ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
		return port.ingresarEdicionCurso(edicion);
	}
	
	public boolean darAltaEdicionCurso() throws Exception {
		ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
		ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
		return port.darAltaEdicionCurso();
	}

}
