/**
 * ControladorSeleccionarEstEdiCurso4Publish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorSeleccionarEstEdiCurso4Publish extends java.rmi.Remote {
    public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public void seleccionarEstadoEstudiante(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtEstudiante[] listarEstudiantesInscriptos() throws java.rmi.RemoteException;
    public void ingresarEstudiante(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarEstudiantes() throws java.rmi.RemoteException;
}
