package publicadores;

public class ControladorListarAceptadosEdiCurso2Proxy implements publicadores.ControladorListarAceptadosEdiCurso2 {
  private String _endpoint = null;
  private publicadores.ControladorListarAceptadosEdiCurso2 controladorListarAceptadosEdiCurso2 = null;
  
  public ControladorListarAceptadosEdiCurso2Proxy() {
    _initControladorListarAceptadosEdiCurso2Proxy();
  }
  
  public ControladorListarAceptadosEdiCurso2Proxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorListarAceptadosEdiCurso2Proxy();
  }
  
  private void _initControladorListarAceptadosEdiCurso2Proxy() {
    try {
      controladorListarAceptadosEdiCurso2 = (new publicadores.ControladorListarAceptadosEdiCurso2ServiceLocator()).getControladorListarAceptadosEdiCurso2Port();
      if (controladorListarAceptadosEdiCurso2 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso2)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorListarAceptadosEdiCurso2 != null)
      ((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorListarAceptadosEdiCurso2 getControladorListarAceptadosEdiCurso2() {
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    return controladorListarAceptadosEdiCurso2;
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    controladorListarAceptadosEdiCurso2.ingresarInstituto(arg0);
  }
  
  public java.lang.String[] listarEdicion() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    return controladorListarAceptadosEdiCurso2.listarEdicion();
  }
  
  public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    return controladorListarAceptadosEdiCurso2.listarInstitutos();
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    controladorListarAceptadosEdiCurso2.ingresarEdicion(arg0);
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    controladorListarAceptadosEdiCurso2.ingresarCurso(arg0);
  }
  
  public java.lang.String[] listarCursos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    return controladorListarAceptadosEdiCurso2.listarCursos();
  }
  
  public java.lang.String[] listarEstudiantesInscriptos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    return controladorListarAceptadosEdiCurso2.listarEstudiantesInscriptos();
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso2 == null)
      _initControladorListarAceptadosEdiCurso2Proxy();
    return controladorListarAceptadosEdiCurso2.seleccionarEdicion(arg0);
  }
  
  
}