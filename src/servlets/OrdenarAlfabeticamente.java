/*package servlets;
import datatypes.DtExtra;


import publicadores.ControladorListaCursoProgramaPublish;
import publicadores.ControladorListaCursoProgramaPublishService;
import publicadores.ControladorListaCursoProgramaPublishServiceLocator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OrdenarAlfabeticamente")
public class OrdenarAlfabeticamente<T> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OrdenarAlfabeticamente() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		ArrayList<publicadores.DtWebCurso> cursos=null;
		try {
			cursos = listarCursos();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<publicadores.DtWebProgF> programas=null;
		try {
			programas = listarProgramas();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String dato = request.getParameter("mostrar");		
		String boton = request.getParameter("boton");
		ArrayList<publicadores.DtExtra> ordenados = new ArrayList<>();
		String todos = "todos";
		String orden1 = "ordenarAlfabeticamente";
		String orden2 = "ordenarFecha";
		String orden3= "ordenarCursos";
		String orden4= "ordenarProgramas";
		String similares = "resultadosSimilares";
		
		if(boton.equals(orden1)) {
			RequestDispatcher rd;	
			if(dato.equals(todos)) {
			
				for(publicadores.DtWebCurso c: cursos) {
				publicadores.DtExtra e = new publicadores.DtExtra(c.getNombre(),c.getFechaPub());
				ordenados.add(e);
			}
			
			for(publicadores.DtWebProgF p: programas) {
				publicadores.DtExtra e = new publicadores.DtExtra(p.getNombre(),p.getFechaPub());
				ordenados.add(e);
			}

			
			Collections.sort(ordenados, new Comparator<publicadores.DtExtra>() {
				   public int compare(publicadores.DtExtra obj1, publicadores.DtExtra obj2) {
				      return obj1.getNombre().compareToIgnoreCase(obj2.getNombre());
				   }
				});
	
			
			for(publicadores.DtExtra d: ordenados) {
				System.out.println(d.getNombre());
			}
			request.setAttribute("Mostrar","alfb");
			request.setAttribute("Lista",ordenados);
			rd = request.getRequestDispatcher("/ordenadosAlf.jsp");
			rd.forward(request, response);
			}else if(dato.equals(similares)) {
				String datoIng = request.getParameter("datoIngresado");
				ArrayList<publicadores.DtWebCurso> listaCursosAux = new ArrayList<>();
				ArrayList<publicadores.DtWebProgF> listaProgramasAux = new ArrayList<>();
				
					for(publicadores.DtWebCurso d1: cursos) {
						String nom = d1.getNombre();
						if(nom.contains(datoIng)) {
							listaCursosAux.add(d1);
						}
					}
					
					for(publicadores.DtWebProgF dt1: programas) {
						String nom = dt1.getNombre();
						if(nom.contains(datoIng)) {
							listaProgramasAux.add(dt1);
						}
					}
					
		
					for(publicadores.DtWebCurso c: listaCursosAux) {
						publicadores.DtExtra e = new publicadores.DtExtra(c.getNombre(),c.getFechaPub());
						ordenados.add(e);
					}
				
					for(publicadores.DtWebProgF p: listaProgramasAux) {
						publicadores.DtExtra e = new publicadores.DtExtra(p.getNombre(),p.getFechaPub());
						ordenados.add(e);
					}
				
					Collections.sort(ordenados, new Comparator<publicadores.DtExtra>() {
						   public int compare(publicadores.DtExtra obj1, publicadores.DtExtra obj2) {
						      return obj1.getNombre().compareToIgnoreCase(obj2.getNombre());
						   }
						});
					
					request.setAttribute("Mostrar","alfb");
					request.setAttribute("Lista",ordenados);
					rd = request.getRequestDispatcher("/ordenadosAlf.jsp");
					rd.forward(request, response);
	
				
				}

			}else if(boton.equals(orden2)) {
				
				RequestDispatcher rd1;	
				if(dato.equals(todos)) {
					
					for(publicadores.DtWebCurso c: cursos) {
						publicadores.DtExtra e = new publicadores.DtExtra(c.getNombre(),c.getFechaPub());
					ordenados.add(e);
				}
				
				for(publicadores.DtWebProgF p: programas) {
					publicadores.DtExtra e = new publicadores.DtExtra(p.getNombre(),p.getFechaPub());
					ordenados.add(e);
				}
		
				List<DtExtra> ordenados1 = new ArrayList<>();
				
				for(publicadores.DtExtra p: ordenados) {
					ordenados1.addAll((Collection<? extends DtExtra>) p);
				}
				
				//Collections.sort( ordenados1);
				Collections.sort(ordenados1, Comparator.comparing(DtExtra::getFechaPub));
				
				
				for(publicadores.DtExtra d: ordenados) {
					System.out.println(d.getFechaPub());
				}
		
				request.setAttribute("Mostrar","fecha");
				request.setAttribute("Lista",ordenados1);
				rd1 = request.getRequestDispatcher("/ordenadosAlf.jsp");
				rd1.forward(request, response);
				
				}else if(dato.equals(similares)) {
					String datoIng = request.getParameter("datoIngresado");
					ArrayList<publicadores.DtWebCurso> listaCursosAux = new ArrayList<>();
					ArrayList<publicadores.DtWebProgF> listaProgramasAux = new ArrayList<>();
					
					for(publicadores.DtWebCurso d1: cursos) {
						String nom = d1.getNombre();
						if(nom.contains(datoIng)) {
							listaCursosAux.add(d1);
						}
					}
					
					for(publicadores.DtWebProgF dt1: programas) {
						String nom = dt1.getNombre();
						if(nom.contains(datoIng)) {
							listaProgramasAux.add(dt1);
						}
					}
					
		
					for(publicadores.DtWebCurso c: listaCursosAux) {
						publicadores.DtExtra e = new publicadores.DtExtra(c.getNombre(),c.getFechaPub());
						ordenados.add(e);
					}
				
					for(publicadores.DtWebProgF p: listaProgramasAux) {
						publicadores.DtExtra e = new publicadores.DtExtra(p.getNombre(),p.getFechaPub());
						ordenados.add(e);
					}
				
				
					//Collections.sort((List<T>) ordenados);
					
					List<DtExtra> ordenados1 = new ArrayList<>();
					
					for(publicadores.DtExtra p: ordenados) {
						ordenados1.addAll((Collection<? extends DtExtra>) p);
					}
					
					Collections.sort( ordenados1);
					
					
					
					
					request.setAttribute("Mostrar","fecha");
					request.setAttribute("Lista",ordenados1);
					rd1 = request.getRequestDispatcher("/ordenadosAlf.jsp");
					rd1.forward(request, response);
	
				
				}			
			}else if(boton.equals(orden3)) {
				System.out.println("LLEGUE AL SERVLET ORDEN3");
				RequestDispatcher rd;	
				if(dato.equals(todos)) {
					System.out.println("LLEGUE AL SERVLET TODOS");
					for(publicadores.DtWebCurso c: cursos) {
						publicadores.DtExtra e = new publicadores.DtExtra(c.getNombre(),c.getFechaPub());
					ordenados.add(e);
				}
				
					for(publicadores.DtExtra c: ordenados) {
						System.out.println(c.getNombre());
					}
					
					
				request.setAttribute("Mostrar","cursos");
				request.setAttribute("Lista",ordenados);
				rd = request.getRequestDispatcher("/ordenadosAlf.jsp");
				rd.forward(request, response);
				
				}else if(dato.equals(similares)) {
					System.out.println("LLEGUE AL SERVLET SIMILARES");
					String datoIng = request.getParameter("datoIngresado");
					ArrayList<publicadores.DtWebCurso> listaCursosAux = new ArrayList<>();
					ArrayList<publicadores.DtWebProgF> listaProgramasAux = new ArrayList<>();
					
						for(publicadores.DtWebCurso d1: cursos) {
							String nom = d1.getNombre();
							if(nom.contains(datoIng)) {
								listaCursosAux.add(d1);
							}
						}
						
						
			
						for(publicadores.DtWebCurso c: listaCursosAux) {
							publicadores.DtExtra e = new publicadores.DtExtra(c.getNombre(),c.getFechaPub());
							ordenados.add(e);
						}
						
						for(publicadores.DtExtra c: ordenados) {
							System.out.println(c.getNombre());
						}
						
						request.setAttribute("Mostrar","cursos");
						request.setAttribute("Lista",ordenados);
						rd = request.getRequestDispatcher("/ordenadosAlf.jsp");
						rd.forward(request, response);
		
					
					}

				
			}else if(boton.equals(orden4)) {
				
				RequestDispatcher rd;	
				if(dato.equals(todos)) {
					
				for(publicadores.DtWebProgF p: programas) {
					publicadores.DtExtra e = new publicadores.DtExtra(p.getNombre(),p.getFechaPub());
					ordenados.add(e);
				}
		
				request.setAttribute("Mostrar","programas");
				request.setAttribute("Lista",ordenados);
				rd = request.getRequestDispatcher("/ordenadosAlf.jsp");
				rd.forward(request, response);
				}else if(dato.equals(similares)) {
					String datoIng = request.getParameter("datoIngresado");
					ArrayList<publicadores.DtWebCurso> listaCursosAux = new ArrayList<>();
					ArrayList<publicadores.DtWebProgF> listaProgramasAux = new ArrayList<>();
					
						
						for(publicadores.DtWebProgF dt1: programas) {
							String nom = dt1.getNombre();
							if(nom.contains(datoIng)) {
								listaProgramasAux.add(dt1);
							}
						}
						
			
					
						for(publicadores.DtWebProgF p: listaProgramasAux) {
							publicadores.DtExtra e = new publicadores.DtExtra(p.getNombre(),p.getFechaPub());
							ordenados.add(e);
						}
					
						
						request.setAttribute("Mostrar","programas");
						request.setAttribute("Lista",ordenados);
						rd = request.getRequestDispatcher("/ordenadosAlf.jsp");
							rd.forward(request, response);
			
						
					}

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

}*/
