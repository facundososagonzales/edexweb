/**
 * ControladorAltaEdicionCurso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorAltaEdicionCurso extends java.rmi.Remote {
    public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException;
    public void limpiarDatos() throws java.rmi.RemoteException;
    public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarCursos() throws java.rmi.RemoteException;
    public java.lang.String[] listarDocentes() throws java.rmi.RemoteException;
    public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException;
    public void ingresarDocentes(java.lang.String[] arg0) throws java.rmi.RemoteException;
    public boolean darAltaEdicionCurso() throws java.rmi.RemoteException;
    public boolean ingresarEdicionCurso(publicadores.DtEdicionDetalle arg0) throws java.rmi.RemoteException;
}
