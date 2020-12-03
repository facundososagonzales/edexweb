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

import publicadores.DtEdicionDetalle;


import publicadores.ControladorSeleccionarEstEdiCurso2Publish;
import publicadores.ControladorSeleccionarEstEdiCurso2PublishService;
import publicadores.ControladorSeleccionarEstEdiCurso2PublishServiceLocator;


/**
 * Servlet implementation class SeleccionarEstudiantesEdicionCurso2
 */
@WebServlet("/SeleccionarEstudiantesEdicionCurso2")
public class SeleccionarEstudiantesEdicionCurso2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeleccionarEstudiantesEdicionCurso2() {
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
		String nomIns= request.getParameter("nomIns");
		request.setAttribute("instituto", nomIns);
		String curso= request.getParameter("curso");
		request.setAttribute("curso", curso);
		
	
		publicadores.DtEdicionDetalle dtEdicion= null;
		dtEdicion=new publicadores.DtEdicionDetalle();
		

		HttpSession sesion = request.getSession();
	
		
			try {
				ingresarEdicion(edicion);
				dtEdicion=seleccionarEdicion();
				
				String datosEdicion ="Datos de la Edicion:";
				
				DateFormat date1 = new SimpleDateFormat("dd MMMM yyyy");
				String strDate = date1.format(dtEdicion.getFechaI().getTime());
				String strDate1 = date1.format(dtEdicion.getFechaF().getTime());
				String strDate2 = date1.format(dtEdicion.getFechaPub().getTime());
				datosEdicion = datosEdicion + "\n" + "Nombre:"+dtEdicion.getNombre()+"\n"+"Fecha Inicio:"+strDate+/*strDate+*/
						"\n"+"Fecha Final:"+strDate1+"\n"+"Cupos:"+dtEdicion.getCupos()+"\n"+"Fecha Pub:"+strDate2;
				
				
				request.setAttribute("DatosEdicionSeleccionada",datosEdicion);
				rd= request.getRequestDispatcher("SeleccionarEstudiantesEdicionCurso3.jsp");
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	
	
	
	public void ingresarEdicion(String nomEdi) throws Exception {
		ControladorSeleccionarEstEdiCurso2PublishService cecp2 = new ControladorSeleccionarEstEdiCurso2PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso2Publish port= cecp2.getControladorSeleccionarEstEdiCurso2PublishPort();
		port.ingresarEdicion(nomEdi);
		}
	
	public publicadores.DtEdicionDetalle seleccionarEdicion() throws Exception {
		ControladorSeleccionarEstEdiCurso2PublishService cecp2 = new ControladorSeleccionarEstEdiCurso2PublishServiceLocator();
		ControladorSeleccionarEstEdiCurso2Publish port= cecp2.getControladorSeleccionarEstEdiCurso2PublishPort();
		return port.seleccionarEdicion();
		}


}
