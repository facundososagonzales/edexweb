/**
 * ControladorConsultaEdicionCurso3Publish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaEdicionCurso3Publish extends java.rmi.Remote {
    public publicadores.DtEdicionDetalle seleccionarEdicion() throws java.rmi.RemoteException;
    public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarDocentes() throws java.rmi.RemoteException;
}
