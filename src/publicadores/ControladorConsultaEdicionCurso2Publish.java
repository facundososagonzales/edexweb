/**
 * ControladorConsultaEdicionCurso2Publish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaEdicionCurso2Publish extends java.rmi.Remote {
    public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarEdicion() throws java.rmi.RemoteException;
    public java.lang.String[] listarEdicionCat() throws java.rmi.RemoteException;
    public void ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarCursoPorCat(java.lang.String arg0) throws java.rmi.RemoteException;
}
