package servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import publicadores.ControladorListarAceptadosEdiCurso2;
import publicadores.ControladorListarAceptadosEdiCurso2Service;
import publicadores.ControladorListarAceptadosEdiCurso2ServiceLocator;



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
		System.out.println(edicion);
		String nomIns= request.getParameter("nomIns");
		request.setAttribute("instituto", nomIns);
		System.out.println(nomIns);
		String curso= request.getParameter("curso");
		request.setAttribute("curso", curso);
		System.out.println(curso);
		
		publicadores.DtEdicionDetalle dtEdicion = new publicadores.DtEdicionDetalle();
		
		
		String[] inscriptos;
		
		
		HttpSession sesion = request.getSession();
	
		
		try {		
			ingresarEdicion(edicion);
			dtEdicion= seleccionarEdicion(edicion);
			System.out.println(dtEdicion.getNombre());
			inscriptos=listarEstudiantesInscriptos();
			
			String datosEdicion ="Datos de la Edicion:";
			
			DateFormat date1 = new SimpleDateFormat("dd MMMM yyyy");
			String strDate = date1.format(dtEdicion.getFechaI().getTime());
			String strDate1 = date1.format(dtEdicion.getFechaF().getTime());
			String strDate2 = date1.format(dtEdicion.getFechaPub().getTime());
			datosEdicion = datosEdicion + "\n" + "Nombre:"+dtEdicion.getNombre()+"\n"+"Fecha Inicio:"+strDate+/*strDate+*/
					"\n"+"Fecha Final:"+strDate1+"\n"+"Cupos:"+dtEdicion.getCupos()+"\n"+"Fecha Pub:"+strDate2+"\n"+"Estudiantes inscriptos: "+ "\n";
			for (String s: inscriptos){ 
				datosEdicion=datosEdicion +s+"\n";
			}


			request.setAttribute("DatosEdicionSeleccionada", datosEdicion);
			rd= request.getRequestDispatcher("listarAceptadosEdiCurso3.jsp");

			rd.forward(request, response);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void ingresarEdicion (String curso) throws Exception {
		ControladorListarAceptadosEdiCurso2Service cps = new ControladorListarAceptadosEdiCurso2ServiceLocator();
		ControladorListarAceptadosEdiCurso2 port = cps.getControladorListarAceptadosEdiCurso2Port();
		port.ingresarInstituto(curso);	
	}
	
	public publicadores.DtEdicionDetalle seleccionarEdicion (String edicion) throws Exception {
		ControladorListarAceptadosEdiCurso2Service cps = new ControladorListarAceptadosEdiCurso2ServiceLocator();
		ControladorListarAceptadosEdiCurso2 port = cps.getControladorListarAceptadosEdiCurso2Port();
		return port.seleccionarEdicion(edicion);	
	}
	
	public String[] listarEstudiantesInscriptos() throws Exception {
		ControladorListarAceptadosEdiCurso2Service cps = new ControladorListarAceptadosEdiCurso2ServiceLocator();
		ControladorListarAceptadosEdiCurso2 port = cps.getControladorListarAceptadosEdiCurso2Port();
		return port.listarEstudiantesInscriptos();	
	}

}
