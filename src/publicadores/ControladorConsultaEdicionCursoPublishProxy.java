package publicadores;

public class ControladorConsultaEdicionCursoPublishProxy implements publicadores.ControladorConsultaEdicionCursoPublish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaEdicionCursoPublish controladorConsultaEdicionCursoPublish = null;
  
  public ControladorConsultaEdicionCursoPublishProxy() {
    _initControladorConsultaEdicionCursoPublishProxy();
  }
  
  public ControladorConsultaEdicionCursoPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaEdicionCursoPublishProxy();
  }
  
  private void _initControladorConsultaEdicionCursoPublishProxy() {
    try {
      controladorConsultaEdicionCursoPublish = (new publicadores.ControladorConsultaEdicionCursoPublishServiceLocator()).getControladorConsultaEdicionCursoPublishPort();
      if (controladorConsultaEdicionCursoPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaEdicionCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaEdicionCursoPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaEdicionCursoPublish != null)
      ((javax.xml.rpc.Stub)controladorConsultaEdicionCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaEdicionCursoPublish getControladorConsultaEdicionCursoPublish() {
    if (controladorConsultaEdicionCursoPublish == null)
      _initControladorConsultaEdicionCursoPublishProxy();
    return controladorConsultaEdicionCursoPublish;
  }
  
  public java.lang.String[] listarInstituto() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCursoPublish == null)
      _initControladorConsultaEdicionCursoPublishProxy();
    return controladorConsultaEdicionCursoPublish.listarInstituto();
  }
  
  public java.lang.String[] listarCategoria() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCursoPublish == null)
      _initControladorConsultaEdicionCursoPublishProxy();
    return controladorConsultaEdicionCursoPublish.listarCategoria();
  }
  
  
}