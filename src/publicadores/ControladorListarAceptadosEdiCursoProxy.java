package publicadores;

public class ControladorListarAceptadosEdiCursoProxy implements publicadores.ControladorListarAceptadosEdiCurso {
  private String _endpoint = null;
  private publicadores.ControladorListarAceptadosEdiCurso controladorListarAceptadosEdiCurso = null;
  
  public ControladorListarAceptadosEdiCursoProxy() {
    _initControladorListarAceptadosEdiCursoProxy();
  }
  
  public ControladorListarAceptadosEdiCursoProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorListarAceptadosEdiCursoProxy();
  }
  
  private void _initControladorListarAceptadosEdiCursoProxy() {
    try {
      controladorListarAceptadosEdiCurso = (new publicadores.ControladorListarAceptadosEdiCursoServiceLocator()).getControladorListarAceptadosEdiCursoPort();
      if (controladorListarAceptadosEdiCurso != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorListarAceptadosEdiCurso != null)
      ((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorListarAceptadosEdiCurso getControladorListarAceptadosEdiCurso() {
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    return controladorListarAceptadosEdiCurso;
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    controladorListarAceptadosEdiCurso.ingresarInstituto(arg0);
  }
  
  public java.lang.String[] listarEdicion() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    return controladorListarAceptadosEdiCurso.listarEdicion();
  }
  
  public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    return controladorListarAceptadosEdiCurso.listarInstitutos();
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    controladorListarAceptadosEdiCurso.ingresarEdicion(arg0);
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    controladorListarAceptadosEdiCurso.ingresarCurso(arg0);
  }
  
  public java.lang.String[] listarCursos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    return controladorListarAceptadosEdiCurso.listarCursos();
  }
  
  public java.lang.String[] listarEstudiantesInscriptos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    return controladorListarAceptadosEdiCurso.listarEstudiantesInscriptos();
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso == null)
      _initControladorListarAceptadosEdiCursoProxy();
    return controladorListarAceptadosEdiCurso.seleccionarEdicion(arg0);
  }
  
  
}