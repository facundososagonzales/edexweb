package publicadores;

public class ControladorConsultaEdicionCurso2PublishProxy implements publicadores.ControladorConsultaEdicionCurso2Publish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaEdicionCurso2Publish controladorConsultaEdicionCurso2Publish = null;
  
  public ControladorConsultaEdicionCurso2PublishProxy() {
    _initControladorConsultaEdicionCurso2PublishProxy();
  }
  
  public ControladorConsultaEdicionCurso2PublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaEdicionCurso2PublishProxy();
  }
  
  private void _initControladorConsultaEdicionCurso2PublishProxy() {
    try {
      controladorConsultaEdicionCurso2Publish = (new publicadores.ControladorConsultaEdicionCurso2PublishServiceLocator()).getControladorConsultaEdicionCurso2PublishPort();
      if (controladorConsultaEdicionCurso2Publish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaEdicionCurso2Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaEdicionCurso2Publish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaEdicionCurso2Publish != null)
      ((javax.xml.rpc.Stub)controladorConsultaEdicionCurso2Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaEdicionCurso2Publish getControladorConsultaEdicionCurso2Publish() {
    if (controladorConsultaEdicionCurso2Publish == null)
      _initControladorConsultaEdicionCurso2PublishProxy();
    return controladorConsultaEdicionCurso2Publish;
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso2Publish == null)
      _initControladorConsultaEdicionCurso2PublishProxy();
    controladorConsultaEdicionCurso2Publish.ingresarInstituto(arg0);
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso2Publish == null)
      _initControladorConsultaEdicionCurso2PublishProxy();
    controladorConsultaEdicionCurso2Publish.ingresarCurso(arg0);
  }
  
  public java.lang.String[] listarEdicion() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso2Publish == null)
      _initControladorConsultaEdicionCurso2PublishProxy();
    return controladorConsultaEdicionCurso2Publish.listarEdicion();
  }
  
  public java.lang.String[] listarEdicionCat() throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso2Publish == null)
      _initControladorConsultaEdicionCurso2PublishProxy();
    return controladorConsultaEdicionCurso2Publish.listarEdicionCat();
  }
  
  public void ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso2Publish == null)
      _initControladorConsultaEdicionCurso2PublishProxy();
    controladorConsultaEdicionCurso2Publish.ingresarCategoria(arg0);
  }
  
  public void ingresarCursoPorCat(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaEdicionCurso2Publish == null)
      _initControladorConsultaEdicionCurso2PublishProxy();
    controladorConsultaEdicionCurso2Publish.ingresarCursoPorCat(arg0);
  }
  
  
}