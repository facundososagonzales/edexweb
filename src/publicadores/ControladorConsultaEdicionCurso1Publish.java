/**
 * ControladorConsultaEdicionCurso1Publish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaEdicionCurso1Publish extends java.rmi.Remote {
    public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarCurso() throws java.rmi.RemoteException;
    public java.lang.String[] listarCursoPorCategoria() throws java.rmi.RemoteException;
    public void ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException;
}
