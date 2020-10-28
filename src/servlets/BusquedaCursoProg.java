package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datatypes.DtWebCurso;
import datatypes.DtWebProgF;
import interfaces.Fabrica;
import interfaces.IControladorListaCursoPrograma;

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
		Fabrica f = Fabrica.getInstancia();
		IControladorListaCursoPrograma icon = f.getIControladorListaCursoPrograma();
		ArrayList<DtWebCurso> listaCursos = icon.listarCursos();
		ArrayList<DtWebProgF> listaProgramas = icon.listarProgramas();
		ArrayList<DtWebCurso> listaCursosAux = new ArrayList<>();
		ArrayList<DtWebProgF> listaProgramasAux = new ArrayList<>();
		
		String dato = request.getParameter("CuadroBusqueda");
		int i =0;
		int x = 0;
		int aux = 0;
		int aux1 = 0;
		String nombreC ="";
		String nombreP="";
		Date fechaC = null;
		Date fechaP=null;
		
		for(DtWebCurso d: listaCursos) {
			if(d.getNombre().equals(dato)) {
				 i = 1;
				 nombreC = d.getNombre();
				 fechaC =d.getFechaPub();
			}
		}
		
		for(DtWebProgF dt: listaProgramas) {
			if(dt.getNombre().equals(dato)) {
				 x = 1;
				 nombreP = dt.getNombre();
				 fechaP =dt.getFechaPub();
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

}
