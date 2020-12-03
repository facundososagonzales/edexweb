/**
 * ControladorAltaUsuarioPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorAltaUsuarioPublish extends java.rmi.Remote {
    public boolean ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public void verificarPassword(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean ingresarUser(publicadores.DtUsuario arg0) throws java.rmi.RemoteException;
    public void altaUsuario() throws java.rmi.RemoteException;
    public void ingresarPassword(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean ingresarUserDoc(publicadores.DtDocente arg0) throws java.rmi.RemoteException;
    public boolean ingresarUserEst(publicadores.DtEstudiante arg0) throws java.rmi.RemoteException;
}
