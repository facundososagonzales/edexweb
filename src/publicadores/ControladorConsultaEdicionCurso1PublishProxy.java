package publicadores;

public class ControladorConsultaEdicionCurso1PublishProxy implements publicadores.ControladorConsultaEdicionCurso1Publish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaEdicionCurso1Publish controladorConsultaEdicionCurso1Publish = null;
  
  public ControladorConsultaEdicionCurso1PublishProxy() {
    _initControladorConsultaEdicionCurso1PublishProxy();
  }
  
  public ControladorConsultaEdicionCurso1PublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaEdicionCurso1PublishProxy();
  }
  
  private void _initControladorConsultaEdicionCurso1PublishProxy() {
    try {
      controladorConsultaEdicionCurso1Publish = (new publicadores.ControladorConsultaEdicionCurso1PublishServiceLocator()).getControladorConsultaEdicionCurso1PublishPort();
      if (controladorConsultaEdicionCurso1Publish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaEdicionCurso1Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaEdicionCurso1Publish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaEdicionCurso1Publish != null)
      ((javax.xml.rpc.Stub)controladorConsultaEdicionCurso1Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaEdicionCurso1Publish getControladorConsultaEdicionCurso1Publish() {
    if (controladorConsultaEdicionCurso1Publish == null)
      _initControladorConsultaEdicionCurso1PublishProxy();
    return controladorConsultaEdicionCurso1Publish;
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso1Publish == null)
      _initControladorConsultaEdicionCurso1PublishProxy();
    controladorConsultaEdicionCurso1Publish.ingresarInstituto(arg0);
  }
  
  public java.lang.String[] listarCurso() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso1Publish == null)
      _initControladorConsultaEdicionCurso1PublishProxy();
    return controladorConsultaEdicionCurso1Publish.listarCurso();
  }
  
  public java.lang.String[] listarCursoPorCategoria() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso1Publish == null)
      _initControladorConsultaEdicionCurso1PublishProxy();
    return controladorConsultaEdicionCurso1Publish.listarCursoPorCategoria();
  }
  
  public void ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso1Publish == null)
      _initControladorConsultaEdicionCurso1PublishProxy();
    controladorConsultaEdicionCurso1Publish.ingresarCategoria(arg0);
  }
  
  
}