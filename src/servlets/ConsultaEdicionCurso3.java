package servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import interfaces.IControladorConsultaEdicionCurso;
//import datatypes.DtEdicionDetalle;
//import interfaces.Fabrica;
//import interfaces.IControladorConsultaEdicionCurso;
import publicadores.DtEdicionDetalle;
import publicadores.ControladorConsultaEdicionCurso3Publish;
import publicadores.ControladorConsultaEdicionCurso3PublishService;
import publicadores.ControladorConsultaEdicionCurso3PublishServiceLocator;


/**
 * Servlet implementation class ConsultaEdicionCurso1
 */
@WebServlet("/ConsultaEdicionCurso3")
public class ConsultaEdicionCurso3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaEdicionCurso3() {
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
		
		String edicion= request.getParameter("ListEdicion");
		
		
		//Fabrica fabrica = Fabrica.getInstancia();
		//IControladorConsultaEdicionCurso iccec = fabrica.getIControladorConsultaEdicionCurso();
		HttpSession sesion = request.getSession();
		publicadores.DtEdicionDetalle dtEdicion= null;
		dtEdicion=new publicadores.DtEdicionDetalle();
		String[] listDocente;
		
			try {
				
				
				ingresarEdicion(edicion);
				listDocente = listarDocentes();
				dtEdicion= seleccionarEdicion();
				
				String datosEdicion ="Datos de la Edicion:";
				
				DateFormat date1 = new SimpleDateFormat("dd MMMM yyyy");
				String strDate = date1.format(dtEdicion.getFechaI().getTime());
				String strDate1 = date1.format(dtEdicion.getFechaF().getTime());
				String strDate2 = date1.format(dtEdicion.getFechaPub().getTime());
				datosEdicion = datosEdicion + "\n" + "Nombre:"+dtEdicion.getNombre()+"\n"+"Fecha Inicio:"+strDate+/*strDate+*/
						"\n"+"Fecha Final:"+strDate1+"\n"+"Cupos:"+dtEdicion.getCupos()+"\n"+"Fecha Pub:"+strDate2+"\n"+"Docentes: "+ "\n";
				for (String s: listDocente){ 
					datosEdicion=datosEdicion+s+"\n";
				}
		
				request.setAttribute("DatosEdicionSeleccionada", datosEdicion);
				rd= request.getRequestDispatcher("consultaEdicionCurso4.jsp");
				//request.setAttribute("DocentesEdicionSeleccionada", listDocente);
				//rd= request.getRequestDispatcher("consultaEdicionCurso4.jsp");
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	
		
	}
	
	public void ingresarEdicion(String nomEdicion) throws Exception {
		ControladorConsultaEdicionCurso3PublishService cecp3 = new ControladorConsultaEdicionCurso3PublishServiceLocator();
		ControladorConsultaEdicionCurso3Publish port= cecp3.getControladorConsultaEdicionCurso3PublishPort();
		port.ingresarEdicion(nomEdicion);
	}
	
	public publicadores.DtEdicionDetalle seleccionarEdicion() throws Exception {
		ControladorConsultaEdicionCurso3PublishService cecp3 = new ControladorConsultaEdicionCurso3PublishServiceLocator();
		ControladorConsultaEdicionCurso3Publish port= cecp3.getControladorConsultaEdicionCurso3PublishPort();
		return port.seleccionarEdicion();
	}
	public String[] listarDocentes() throws Exception {
		ControladorConsultaEdicionCurso3PublishService cecp3 = new ControladorConsultaEdicionCurso3PublishServiceLocator();
		ControladorConsultaEdicionCurso3Publish port= cecp3.getControladorConsultaEdicionCurso3PublishPort();
		return port.listarDocentes();
	}

}