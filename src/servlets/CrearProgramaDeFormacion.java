package servlets;

import java.io.IOException;


import java.util.Calendar;
import java.util.GregorianCalendar;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import publicadores.ControladorCrearProgFormacion;
import publicadores.ControladorCrearProgFormacionService;
import publicadores.ControladorCrearProgFormacionServiceLocator;
//import publicadores.DtProgFormacion;




/**
 * Servlet implementation class CrearProgramaDeFormacion
 */
@WebServlet("/CrearProgramaDeFormacion")
public class CrearProgramaDeFormacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProgramaDeFormacion() {
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
		
		String prog = request.getParameter("Programa");System.out.print("A1T");
		String descripcion = request.getParameter("Descripcion");System.out.print("A1T");
		
		String fechaNacDia = request.getParameter("FechaFin").substring(8); int FNdia = Integer.parseInt(fechaNacDia);
		String fechaNacMes = request.getParameter("FechaFin").substring(5,7); int FNmes = Integer.parseInt(fechaNacMes);
		String fechaNacAnio = request.getParameter("FechaFin").substring(0,4);  int FNanio= Integer.parseInt(fechaNacAnio);
    	java.util.Date fechaNacimiento = new GregorianCalendar(FNanio, (FNmes-1), FNdia).getTime();
		
    	Calendar fechaF = Calendar.getInstance();
    	fechaF.setTime(fechaNacimiento);
    	
    	
    	String fechaNacDia1 = request.getParameter("FechaInicio").substring(8); int FNdia1 = Integer.parseInt(fechaNacDia1);
		String fechaNacMes1 = request.getParameter("FechaInicio").substring(5,7); int FNmes1 = Integer.parseInt(fechaNacMes1);
		String fechaNacAnio1 = request.getParameter("FechaInicio").substring(0,4);  int FNanio1= Integer.parseInt(fechaNacAnio1);
    	java.util.Date fechaNacimiento1 = new GregorianCalendar(FNanio1, (FNmes1-1), FNdia1).getTime();
		
    	Calendar fechai = Calendar.getInstance();
    	fechai.setTime(fechaNacimiento1);
    	
		

		try {
			
			
			if (ingresarNombreProgFor(prog)) {
				request.setAttribute("mensaje","El programa de formacion: "+prog+" ingresado ya existe en el sistema");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
				
		
			Calendar fechaAlta = Calendar.getInstance();
			
			publicadores.DtProgFormacion dprog = new publicadores.DtProgFormacion();
			dprog.setDescripcion(descripcion);
			dprog.setFechaF(fechaF);
			dprog.setFechaAlta(fechaAlta);
			dprog.setFechaI(fechai);
				
			ingresarDatos(dprog);
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		request.setAttribute("mensaje","El programa de formacion: "+prog+" fue ingresado con exito");
		rd = request.getRequestDispatcher("/notificacion.jsp");
		rd.forward(request, response);
		}
	

	public boolean ingresarNombreProgFor(String nombreProg) throws Exception {
		ControladorCrearProgFormacionService cps = new ControladorCrearProgFormacionServiceLocator();
		ControladorCrearProgFormacion port = cps.getControladorCrearProgFormacionPort();
		return port.ingresarNombreProgFor(nombreProg);	
		}
	
	public void ingresarDatos(publicadores.DtProgFormacion nombreProg) throws Exception {
		ControladorCrearProgFormacionService cps = new ControladorCrearProgFormacionServiceLocator();
		ControladorCrearProgFormacion port = cps.getControladorCrearProgFormacionPort();
		port.ingresarDatos(nombreProg);	
		}
		
	}


