/**
 * ControladorDejarDeSeguir.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorDejarDeSeguir extends java.rmi.Remote {
    public boolean ingresarUser(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarSeguidos(java.lang.String arg0) throws java.rmi.RemoteException;
    public void dejarDeSeguir(java.lang.String arg0) throws java.rmi.RemoteException;
}
