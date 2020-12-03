package publicadores;

public class ControladorAltaEdicionCursoProxy implements publicadores.ControladorAltaEdicionCurso {
  private String _endpoint = null;
  private publicadores.ControladorAltaEdicionCurso controladorAltaEdicionCurso = null;
  
  public ControladorAltaEdicionCursoProxy() {
    _initControladorAltaEdicionCursoProxy();
  }
  
  public ControladorAltaEdicionCursoProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorAltaEdicionCursoProxy();
  }
  
  private void _initControladorAltaEdicionCursoProxy() {
    try {
      controladorAltaEdicionCurso = (new publicadores.ControladorAltaEdicionCursoServiceLocator()).getControladorAltaEdicionCursoPort();
      if (controladorAltaEdicionCurso != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorAltaEdicionCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorAltaEdicionCurso)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorAltaEdicionCurso != null)
      ((javax.xml.rpc.Stub)controladorAltaEdicionCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorAltaEdicionCurso getControladorAltaEdicionCurso() {
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    return controladorAltaEdicionCurso;
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    controladorAltaEdicionCurso.ingresarCurso(arg0);
  }
  
  public void limpiarDatos() throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    controladorAltaEdicionCurso.limpiarDatos();
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    controladorAltaEdicionCurso.ingresarInstituto(arg0);
  }
  
  public java.lang.String[] listarCursos() throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    return controladorAltaEdicionCurso.listarCursos();
  }
  
  public java.lang.String[] listarDocentes() throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    return controladorAltaEdicionCurso.listarDocentes();
  }
  
  public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    return controladorAltaEdicionCurso.listarInstitutos();
  }
  
  public void ingresarDocentes(java.lang.String[] arg0) throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    controladorAltaEdicionCurso.ingresarDocentes(arg0);
  }
  
  public boolean darAltaEdicionCurso() throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    return controladorAltaEdicionCurso.darAltaEdicionCurso();
  }
  
  public boolean ingresarEdicionCurso(publicadores.DtEdicionDetalle arg0) throws java.rmi.RemoteException{
    if (controladorAltaEdicionCurso == null)
      _initControladorAltaEdicionCursoProxy();
    return controladorAltaEdicionCurso.ingresarEdicionCurso(arg0);
  }
  
  
}