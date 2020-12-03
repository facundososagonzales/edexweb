/**
 * ControladorListaCursoProgramaPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorListaCursoProgramaPublish extends java.rmi.Remote {
    public publicadores.DtWebCurso[] listarCursos() throws java.rmi.RemoteException;
    public publicadores.DtWebProgF[] listarProgramas() throws java.rmi.RemoteException;
    public void ingresarDtExtra(publicadores.DtExtra arg0) throws java.rmi.RemoteException;
}
