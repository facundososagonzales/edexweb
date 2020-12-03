/**
 * ControladorInsEdicionCursoPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorInsEdicionCursoPublish extends java.rmi.Remote {
    public java.lang.String[] listarCategorias() throws java.rmi.RemoteException;
    public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException;
    public java.lang.String[] listarCursos() throws java.rmi.RemoteException;
    public java.lang.String[] listarEdicion() throws java.rmi.RemoteException;
    public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtEdicionDetalle seleccionarEdicion() throws java.rmi.RemoteException;
    public boolean inscripcionEstudiante(java.lang.String arg0, java.util.Calendar arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public void ingresarCursoInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarEdicionCat() throws java.rmi.RemoteException;
    public java.lang.String[] listarEstudiantes() throws java.rmi.RemoteException;
    public java.lang.String[] listarCursosCategoria() throws java.rmi.RemoteException;
    public void inscripcionEstudianteW(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public void ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarCursoporCat(java.lang.String arg0) throws java.rmi.RemoteException;
}
