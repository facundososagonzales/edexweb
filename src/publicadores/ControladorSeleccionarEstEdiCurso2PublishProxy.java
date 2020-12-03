package publicadores;

public class ControladorSeleccionarEstEdiCurso2PublishProxy implements publicadores.ControladorSeleccionarEstEdiCurso2Publish {
  private String _endpoint = null;
  private publicadores.ControladorSeleccionarEstEdiCurso2Publish controladorSeleccionarEstEdiCurso2Publish = null;
  
  public ControladorSeleccionarEstEdiCurso2PublishProxy() {
    _initControladorSeleccionarEstEdiCurso2PublishProxy();
  }
  
  public ControladorSeleccionarEstEdiCurso2PublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorSeleccionarEstEdiCurso2PublishProxy();
  }
  
  private void _initControladorSeleccionarEstEdiCurso2PublishProxy() {
    try {
      controladorSeleccionarEstEdiCurso2Publish = (new publicadores.ControladorSeleccionarEstEdiCurso2PublishServiceLocator()).getControladorSeleccionarEstEdiCurso2PublishPort();
      if (controladorSeleccionarEstEdiCurso2Publish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso2Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso2Publish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorSeleccionarEstEdiCurso2Publish != null)
      ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso2Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorSeleccionarEstEdiCurso2Publish getControladorSeleccionarEstEdiCurso2Publish() {
    if (controladorSeleccionarEstEdiCurso2Publish == null)
      _initControladorSeleccionarEstEdiCurso2PublishProxy();
    return controladorSeleccionarEstEdiCurso2Publish;
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicion() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso2Publish == null)
      _initControladorSeleccionarEstEdiCurso2PublishProxy();
    return controladorSeleccionarEstEdiCurso2Publish.seleccionarEdicion();
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso2Publish == null)
      _initControladorSeleccionarEstEdiCurso2PublishProxy();
    controladorSeleccionarEstEdiCurso2Publish.ingresarEdicion(arg0);
  }
  
  
}