package publicadores;

public class ControladorSeleccionarEstEdiCursoPublishProxy implements publicadores.ControladorSeleccionarEstEdiCursoPublish {
  private String _endpoint = null;
  private publicadores.ControladorSeleccionarEstEdiCursoPublish controladorSeleccionarEstEdiCursoPublish = null;
  
  public ControladorSeleccionarEstEdiCursoPublishProxy() {
    _initControladorSeleccionarEstEdiCursoPublishProxy();
  }
  
  public ControladorSeleccionarEstEdiCursoPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorSeleccionarEstEdiCursoPublishProxy();
  }
  
  private void _initControladorSeleccionarEstEdiCursoPublishProxy() {
    try {
      controladorSeleccionarEstEdiCursoPublish = (new publicadores.ControladorSeleccionarEstEdiCursoPublishServiceLocator()).getControladorSeleccionarEstEdiCursoPublishPort();
      if (controladorSeleccionarEstEdiCursoPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCursoPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorSeleccionarEstEdiCursoPublish != null)
      ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorSeleccionarEstEdiCursoPublish getControladorSeleccionarEstEdiCursoPublish() {
    if (controladorSeleccionarEstEdiCursoPublish == null)
      _initControladorSeleccionarEstEdiCursoPublishProxy();
    return controladorSeleccionarEstEdiCursoPublish;
  }
  
  public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCursoPublish == null)
      _initControladorSeleccionarEstEdiCursoPublishProxy();
    return controladorSeleccionarEstEdiCursoPublish.listarInstitutos();
  }
  
  public java.lang.String[] listarCursos() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCursoPublish == null)
      _initControladorSeleccionarEstEdiCursoPublishProxy();
    return controladorSeleccionarEstEdiCursoPublish.listarCursos();
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCursoPublish == null)
      _initControladorSeleccionarEstEdiCursoPublishProxy();
    controladorSeleccionarEstEdiCursoPublish.ingresarInstituto(arg0);
  }
  
  
}