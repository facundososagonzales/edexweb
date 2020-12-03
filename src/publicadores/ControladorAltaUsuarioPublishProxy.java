package publicadores;

public class ControladorAltaUsuarioPublishProxy implements publicadores.ControladorAltaUsuarioPublish {
  private String _endpoint = null;
  private publicadores.ControladorAltaUsuarioPublish controladorAltaUsuarioPublish = null;
  
  public ControladorAltaUsuarioPublishProxy() {
    _initControladorAltaUsuarioPublishProxy();
  }
  
  public ControladorAltaUsuarioPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorAltaUsuarioPublishProxy();
  }
  
  private void _initControladorAltaUsuarioPublishProxy() {
    try {
      controladorAltaUsuarioPublish = (new publicadores.ControladorAltaUsuarioPublishServiceLocator()).getControladorAltaUsuarioPublishPort();
      if (controladorAltaUsuarioPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorAltaUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorAltaUsuarioPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorAltaUsuarioPublish != null)
      ((javax.xml.rpc.Stub)controladorAltaUsuarioPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorAltaUsuarioPublish getControladorAltaUsuarioPublish() {
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    return controladorAltaUsuarioPublish;
  }
  
  public boolean ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    return controladorAltaUsuarioPublish.ingresarInstituto(arg0);
  }
  
  public void verificarPassword(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.verificarPassword(arg0);
  }
  
  public boolean ingresarUser(publicadores.DtUsuario arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    return controladorAltaUsuarioPublish.ingresarUser(arg0);
  }
  
  public void altaUsuario() throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.altaUsuario();
  }
  
  public void ingresarPassword(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    controladorAltaUsuarioPublish.ingresarPassword(arg0);
  }
  
  public boolean ingresarUserDoc(publicadores.DtDocente arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    return controladorAltaUsuarioPublish.ingresarUserDoc(arg0);
  }
  
  public boolean ingresarUserEst(publicadores.DtEstudiante arg0) throws java.rmi.RemoteException{
    if (controladorAltaUsuarioPublish == null)
      _initControladorAltaUsuarioPublishProxy();
    return controladorAltaUsuarioPublish.ingresarUserEst(arg0);
  }
  
  
}