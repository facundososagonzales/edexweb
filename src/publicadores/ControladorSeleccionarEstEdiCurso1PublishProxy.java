package publicadores;

public class ControladorSeleccionarEstEdiCurso1PublishProxy implements publicadores.ControladorSeleccionarEstEdiCurso1Publish {
  private String _endpoint = null;
  private publicadores.ControladorSeleccionarEstEdiCurso1Publish controladorSeleccionarEstEdiCurso1Publish = null;
  
  public ControladorSeleccionarEstEdiCurso1PublishProxy() {
    _initControladorSeleccionarEstEdiCurso1PublishProxy();
  }
  
  public ControladorSeleccionarEstEdiCurso1PublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorSeleccionarEstEdiCurso1PublishProxy();
  }
  
  private void _initControladorSeleccionarEstEdiCurso1PublishProxy() {
    try {
      controladorSeleccionarEstEdiCurso1Publish = (new publicadores.ControladorSeleccionarEstEdiCurso1PublishServiceLocator()).getControladorSeleccionarEstEdiCurso1PublishPort();
      if (controladorSeleccionarEstEdiCurso1Publish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso1Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso1Publish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorSeleccionarEstEdiCurso1Publish != null)
      ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso1Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorSeleccionarEstEdiCurso1Publish getControladorSeleccionarEstEdiCurso1Publish() {
    if (controladorSeleccionarEstEdiCurso1Publish == null)
      _initControladorSeleccionarEstEdiCurso1PublishProxy();
    return controladorSeleccionarEstEdiCurso1Publish;
  }
  
  public java.lang.String[] listarEdicion() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso1Publish == null)
      _initControladorSeleccionarEstEdiCurso1PublishProxy();
    return controladorSeleccionarEstEdiCurso1Publish.listarEdicion();
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso1Publish == null)
      _initControladorSeleccionarEstEdiCurso1PublishProxy();
    controladorSeleccionarEstEdiCurso1Publish.ingresarCurso(arg0);
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso1Publish == null)
      _initControladorSeleccionarEstEdiCurso1PublishProxy();
    controladorSeleccionarEstEdiCurso1Publish.ingresarInstituto(arg0);
  }
  
  
}