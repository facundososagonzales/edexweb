package publicadores;

public class ControladorListaCursoProgramaPublishProxy implements publicadores.ControladorListaCursoProgramaPublish {
  private String _endpoint = null;
  private publicadores.ControladorListaCursoProgramaPublish controladorListaCursoProgramaPublish = null;
  
  public ControladorListaCursoProgramaPublishProxy() {
    _initControladorListaCursoProgramaPublishProxy();
  }
  
  public ControladorListaCursoProgramaPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorListaCursoProgramaPublishProxy();
  }
  
  private void _initControladorListaCursoProgramaPublishProxy() {
    try {
      controladorListaCursoProgramaPublish = (new publicadores.ControladorListaCursoProgramaPublishServiceLocator()).getControladorListaCursoProgramaPublishPort();
      if (controladorListaCursoProgramaPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorListaCursoProgramaPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorListaCursoProgramaPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorListaCursoProgramaPublish != null)
      ((javax.xml.rpc.Stub)controladorListaCursoProgramaPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorListaCursoProgramaPublish getControladorListaCursoProgramaPublish() {
    if (controladorListaCursoProgramaPublish == null)
      _initControladorListaCursoProgramaPublishProxy();
    return controladorListaCursoProgramaPublish;
  }
  
  public publicadores.DtWebCurso[] listarCursos() throws java.rmi.RemoteException{
    if (controladorListaCursoProgramaPublish == null)
      _initControladorListaCursoProgramaPublishProxy();
    return controladorListaCursoProgramaPublish.listarCursos();
  }
  
  public publicadores.DtWebProgF[] listarProgramas() throws java.rmi.RemoteException{
    if (controladorListaCursoProgramaPublish == null)
      _initControladorListaCursoProgramaPublishProxy();
    return controladorListaCursoProgramaPublish.listarProgramas();
  }
  
  public void ingresarDtExtra(publicadores.DtExtra arg0) throws java.rmi.RemoteException{
    if (controladorListaCursoProgramaPublish == null)
      _initControladorListaCursoProgramaPublishProxy();
    controladorListaCursoProgramaPublish.ingresarDtExtra(arg0);
  }
  
  
}