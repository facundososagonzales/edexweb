package publicadores;

public class ControladorConsultaEdicionCurso3PublishProxy implements publicadores.ControladorConsultaEdicionCurso3Publish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaEdicionCurso3Publish controladorConsultaEdicionCurso3Publish = null;
  
  public ControladorConsultaEdicionCurso3PublishProxy() {
    _initControladorConsultaEdicionCurso3PublishProxy();
  }
  
  public ControladorConsultaEdicionCurso3PublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaEdicionCurso3PublishProxy();
  }
  
  private void _initControladorConsultaEdicionCurso3PublishProxy() {
    try {
      controladorConsultaEdicionCurso3Publish = (new publicadores.ControladorConsultaEdicionCurso3PublishServiceLocator()).getControladorConsultaEdicionCurso3PublishPort();
      if (controladorConsultaEdicionCurso3Publish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaEdicionCurso3Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaEdicionCurso3Publish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaEdicionCurso3Publish != null)
      ((javax.xml.rpc.Stub)controladorConsultaEdicionCurso3Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaEdicionCurso3Publish getControladorConsultaEdicionCurso3Publish() {
    if (controladorConsultaEdicionCurso3Publish == null)
      _initControladorConsultaEdicionCurso3PublishProxy();
    return controladorConsultaEdicionCurso3Publish;
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicion() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso3Publish == null)
      _initControladorConsultaEdicionCurso3PublishProxy();
    return controladorConsultaEdicionCurso3Publish.seleccionarEdicion();
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso3Publish == null)
      _initControladorConsultaEdicionCurso3PublishProxy();
    controladorConsultaEdicionCurso3Publish.ingresarEdicion(arg0);
  }
  
  public java.lang.String[] listarDocentes() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso3Publish == null)
      _initControladorConsultaEdicionCurso3PublishProxy();
    return controladorConsultaEdicionCurso3Publish.listarDocentes();
  }
  
  
}