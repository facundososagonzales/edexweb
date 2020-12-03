package publicadores;

public class ControladorSeguirUsuarioProxy implements publicadores.ControladorSeguirUsuario {
  private String _endpoint = null;
  private publicadores.ControladorSeguirUsuario controladorSeguirUsuario = null;
  
  public ControladorSeguirUsuarioProxy() {
    _initControladorSeguirUsuarioProxy();
  }
  
  public ControladorSeguirUsuarioProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorSeguirUsuarioProxy();
  }
  
  private void _initControladorSeguirUsuarioProxy() {
    try {
      controladorSeguirUsuario = (new publicadores.ControladorSeguirUsuarioServiceLocator()).getControladorSeguirUsuarioPort();
      if (controladorSeguirUsuario != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorSeguirUsuario)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorSeguirUsuario)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorSeguirUsuario != null)
      ((javax.xml.rpc.Stub)controladorSeguirUsuario)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorSeguirUsuario getControladorSeguirUsuario() {
    if (controladorSeguirUsuario == null)
      _initControladorSeguirUsuarioProxy();
    return controladorSeguirUsuario;
  }
  
  public boolean ingresarUser(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeguirUsuario == null)
      _initControladorSeguirUsuarioProxy();
    return controladorSeguirUsuario.ingresarUser(arg0);
  }
  
  public void seguirUsuario(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeguirUsuario == null)
      _initControladorSeguirUsuarioProxy();
    controladorSeguirUsuario.seguirUsuario(arg0);
  }
  
  
}