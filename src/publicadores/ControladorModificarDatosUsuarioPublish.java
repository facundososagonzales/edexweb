/**
 * ControladorModificarDatosUsuarioPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorModificarDatosUsuarioPublish extends java.rmi.Remote {
    public publicadores.DtUsuario elegirUsuario(java.lang.String arg0) throws java.rmi.RemoteException;
    public void modificar(publicadores.DtUsuario arg0) throws java.rmi.RemoteException;
    public publicadores.DtUsuario datosUsuario(java.lang.String arg0) throws java.rmi.RemoteException;
}
