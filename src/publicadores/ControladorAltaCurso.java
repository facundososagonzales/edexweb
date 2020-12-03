/**
 * ControladorAltaCurso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorAltaCurso extends java.rmi.Remote {
    public boolean agregarPrevias2(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarDatos(publicadores.DtCursoDetalle arg0) throws java.rmi.RemoteException;
    public void limpiarDatos() throws java.rmi.RemoteException;
    public java.lang.String[] getPrevias() throws java.rmi.RemoteException;
    public java.lang.String[] listarCursos() throws java.rmi.RemoteException;
    public boolean ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarCategorias() throws java.rmi.RemoteException;
    public boolean agregarCategoria(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean agregarPrevias(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] getCategorias() throws java.rmi.RemoteException;
}
