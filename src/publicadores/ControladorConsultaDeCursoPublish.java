/**
 * ControladorConsultaDeCursoPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaDeCursoPublish extends java.rmi.Remote {
    public publicadores.DtInfoProgCurso seleccionarCurso(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtCursoBase[] ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtEdicionDetalle seleccionarEdicion(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtProgCurso seleccionarPrograma(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtCursoBase[] ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtInfoProgCurso seleccionarCursoEnCat(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtEdicionDetalle seleccionarEdicionCat(java.lang.String arg0) throws java.rmi.RemoteException;
    public void ingresarDt(publicadores.DtEdicionBasico arg0) throws java.rmi.RemoteException;
}
