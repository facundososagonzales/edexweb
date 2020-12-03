package servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import publicadores.DtWebCurso;
import publicadores.DtWebProgF;
import publicadores.ControladorListaCursoProgramaPublish;
import publicadores.ControladorListaCursoProgramaPublishService;
import publicadores.ControladorListaCursoProgramaPublishServiceLocator;

/**
 * Servlet implementation class BusquedaCursoProg
 */
@WebServlet("/BusquedaCursoProg")
public class BusquedaCursoProg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusquedaCursoProg() {
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
		/*Fabrica f = Fabrica.getInstancia();
		IControladorListaCursoPrograma icon = f.getIControladorListaCursoPrograma();*/
		
		ArrayList<publicadores.DtWebCurso> listaCursos=null;
		try {
			listaCursos = listarCursos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<publicadores.DtWebProgF> listaProgramas=null;
		try {
			listaProgramas = listarProgramas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<publicadores.DtWebCurso> listaCursosAux = new ArrayList<>();
		ArrayList<publicadores.DtWebProgF> listaProgramasAux = new ArrayList<>();
		
		String dato = request.getParameter("CuadroBusqueda");
		int i =0;
		int x = 0;
		int aux = 0;
		int aux1 = 0;
		String nombreC ="";
		String nombreP="";
		Date fechaC = null;
		Date fechaP=null;
		
		for(publicadores.DtWebCurso d: listaCursos) {
			if(d.getNombre().equals(dato)) {
				 i = 1;
				 nombreC = d.getNombre();
				 fechaC = d.getFechaPub().getTime();
				 System.out.println("\n\n"+fechaC);
				 /* DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				 try {
					fechaC = (Date)formatter.parse(d.getFechaPub().toString());
					
					DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
  					date = (Date)formatter.parse(date.toString());
  					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
		
		for(DtWebProgF dt: listaProgramas) {
			if(dt.getNombre().equals(dato)) {
				 x = 1;
				 nombreP = dt.getNombre();
				 fechaP = dt.getFechaPub().getTime();
				 /*DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				 
				 try {
					 fechaP = (Date)formatter.parse(dt.getFechaPub().toString());
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
			}
		}
		
		for(DtWebCurso d1: listaCursos) {
			String nom = d1.getNombre();
			if(nom.contains(dato)) {
				listaCursosAux.add(d1);
				aux =1;
			}
		}
		
		for(DtWebProgF dt1: listaProgramas) {
			String nom = dt1.getNombre();
			if(nom.contains(dato)) {
				listaProgramasAux.add(dt1);
				aux1 =1;
			}
		}
		
		
		
		
		if(i!=0 && x==0 ) {
			request.setAttribute("curso", nombreC);
			request.setAttribute("fechaPubC", fechaC);
			request.setAttribute("dato", dato);
			request.setAttribute("mostrar", "curso");
			rd = request.getRequestDispatcher("/resultadosBusqueda.jsp");
			rd.forward(request, response);
		}else if(i==0 && x!=0 ) {
			request.setAttribute("programa", nombreP);
			request.setAttribute("fechaPubP", fechaP);
			request.setAttribute("dato", dato);
			request.setAttribute("mostrar", "programa");
			rd = request.getRequestDispatcher("/resultadosBusqueda.jsp");
			rd.forward(request, response);
			
		}else if(i!=0 && x!=0 ) {
			request.setAttribute("curso", nombreC);
			request.setAttribute("fechaPubC", fechaC);
			request.setAttribute("programa", nombreP);
			request.setAttribute("fechaPubP", fechaP);
			request.setAttribute("dato", dato);
			request.setAttribute("mostrar", "cursoprograma");
			rd = request.getRequestDispatcher("/resultadosBusqueda.jsp");
			rd.forward(request, response);
			
		}else if(dato.equals("")){
			request.setAttribute("cursos", listaCursos);
			request.setAttribute("programas", listaProgramas);
			request.setAttribute("dato", dato);
			request.setAttribute("mostrar", "todos");
			rd = request.getRequestDispatcher("/resultadosBusqueda.jsp");
			rd.forward(request, response);
		}else if(i==0 && x==0 && aux!=0 || aux1!=0) {
			request.setAttribute("cursosSimilares", listaCursosAux);
			request.setAttribute("programasSimilares", listaProgramasAux);
			request.setAttribute("dato", dato);
			request.setAttribute("mostrar", "resultadosSimilares");
			rd = request.getRequestDispatcher("/resultadosBusqueda.jsp");
			rd.forward(request, response);
			
		}
		else {
			request.setAttribute("mensaje", "No se han encontrado Resultados");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}	
		
	}
	
	 public ArrayList<publicadores.DtWebCurso> listarCursos() throws Exception {
		ControladorListaCursoProgramaPublishService cps = new ControladorListaCursoProgramaPublishServiceLocator();
		ControladorListaCursoProgramaPublish port = cps.getControladorListaCursoProgramaPublishPort();
		publicadores.DtWebCurso[] cursos = port.listarCursos();
		ArrayList<publicadores.DtWebCurso> lstCursos = new ArrayList<>();
		for (int i = 0; i < cursos.length; ++i) {
			lstCursos.add(cursos[i]);
		}
		return lstCursos;
	}
	
	 public ArrayList<publicadores.DtWebProgF> listarProgramas() throws Exception {
			ControladorListaCursoProgramaPublishService cps = new ControladorListaCursoProgramaPublishServiceLocator();
			ControladorListaCursoProgramaPublish port = cps.getControladorListaCursoProgramaPublishPort();
			publicadores.DtWebProgF[] programas = port.listarProgramas();
			ArrayList<publicadores.DtWebProgF> lstProgramas = new ArrayList<>();
			for (int i = 0; i < programas.length; ++i) {
				lstProgramas.add(programas[i]);
			}
			return lstProgramas;
		}

}
