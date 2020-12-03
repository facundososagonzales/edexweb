package publicadores;

public class ControladorIniciarSesionProxy implements publicadores.ControladorIniciarSesion {
  private String _endpoint = null;
  private publicadores.ControladorIniciarSesion controladorIniciarSesion = null;
  
  public ControladorIniciarSesionProxy() {
    _initControladorIniciarSesionProxy();
  }
  
  public ControladorIniciarSesionProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorIniciarSesionProxy();
  }
  
  private void _initControladorIniciarSesionProxy() {
    try {
      controladorIniciarSesion = (new publicadores.ControladorIniciarSesionServiceLocator()).getControladorIniciarSesionPort();
      if (controladorIniciarSesion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorIniciarSesion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorIniciarSesion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorIniciarSesion != null)
      ((javax.xml.rpc.Stub)controladorIniciarSesion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorIniciarSesion getControladorIniciarSesion() {
    if (controladorIniciarSesion == null)
      _initControladorIniciarSesionProxy();
    return controladorIniciarSesion;
  }
  
  public java.lang.String tipoUsuario(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorIniciarSesion == null)
      _initControladorIniciarSesionProxy();
    return controladorIniciarSesion.tipoUsuario(arg0);
  }
  
  public boolean ingresarUsuario(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorIniciarSesion == null)
      _initControladorIniciarSesionProxy();
    return controladorIniciarSesion.ingresarUsuario(arg0, arg1);
  }
  
  
}