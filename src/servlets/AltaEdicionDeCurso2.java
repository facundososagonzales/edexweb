package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datatypes.DtEdicionDetalle;
import excepciones.EdicionRepetidaException;
import excepciones.SinDocenteAsignadoException;
import interfaces.Fabrica;
import interfaces.IControladorAltaEdicionCurso;

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
		RequestDispatcher rd= request.getRequestDispatcher("consultaEdicionCurso1.jsp");
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorAltaEdicionCurso icaec = fabrica.getIControladorAltaEdicionCurso();
		
		String docentes[];
		docentes = request.getParameterValues("docentes");
		List<String> docentes1 = new ArrayList<>(); 
		docentes1 = Arrays.asList(docentes);
		
		try {
	    	Date fechaPub = new Date();
	    	DtEdicionDetalle dted = null;
	    	icaec.ingresarInstituto(Instituto);
	    	icaec.ingresarCurso(curso);
	    	icaec.ingresarDocentes(docentes1);
	    	System.out.println(docentes1 + "docente");
			String fechaInDia = fechaInicio.substring(8); int FIdia = Integer.parseInt(fechaInDia);
			String fechaInMes = fechaInicio.substring(5,7); int FImes = Integer.parseInt(fechaInMes);
			String fechaInAnio = fechaInicio.substring(0,4);  int FIanio= Integer.parseInt(fechaInAnio);
			String fechaFDia = fechaFin.substring(8); int FFdia = Integer.parseInt(fechaFDia);
			String fechaFMes = fechaFin.substring(5,7); int FFmes = Integer.parseInt(fechaFMes);
			String fechaFAnio = fechaFin.substring(0,4);  int FFanio= Integer.parseInt(fechaFAnio);
			int Cupos;
			System.out.println(cupos + "cuposss");
			if(cupos.equals("0")) {
				Cupos=0;
			}else {
				Cupos = Integer.parseInt(cupos);
				System.out.println(Cupos + "cupo");
			}
	    	Date fechaInicio1 = new GregorianCalendar(FIanio, (FImes-1), FIdia).getTime();
	    	Date fechaFin1 = new GregorianCalendar(FFanio, (FFmes-1), FFdia).getTime();
	    	dted = new DtEdicionDetalle(name,fechaInicio1,fechaFin1,Cupos,fechaPub);

	    	icaec.ingresarEdicionCurso(dted);
	    	icaec.darAltaEdicionCurso();
			
			
		}catch(EdicionRepetidaException ere) {
            throw new ServletException(ere.getMessage());
		}catch(SinDocenteAsignadoException sdae) {
            throw new ServletException(sdae.getMessage());
		}
		request.setAttribute("mensaje","La edicion "+name+" fue ingresado con exito");
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
		
	}

}
