/**
 * ControladorSeleccionarEstEdiCursoPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorSeleccionarEstEdiCursoPublish extends java.rmi.Remote {
    public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException;
    public java.lang.String[] listarCursos() throws java.rmi.RemoteException;
    public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
}
