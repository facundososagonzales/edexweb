/**
 * ControladorListarAceptadosEdiCurso2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorListarAceptadosEdiCurso2 extends java.rmi.Remote {
    public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarEdicion() throws java.rmi.RemoteException;
    public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException;
    public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarCursos() throws java.rmi.RemoteException;
    public java.lang.String[] listarEstudiantesInscriptos() throws java.rmi.RemoteException;
    public publicadores.DtEdicionDetalle seleccionarEdicion(java.lang.String arg0) throws java.rmi.RemoteException;
}
