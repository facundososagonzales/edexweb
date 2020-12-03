package publicadores;

public class ControladorDejarDeSeguirProxy implements publicadores.ControladorDejarDeSeguir {
  private String _endpoint = null;
  private publicadores.ControladorDejarDeSeguir controladorDejarDeSeguir = null;
  
  public ControladorDejarDeSeguirProxy() {
    _initControladorDejarDeSeguirProxy();
  }
  
  public ControladorDejarDeSeguirProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorDejarDeSeguirProxy();
  }
  
  private void _initControladorDejarDeSeguirProxy() {
    try {
      controladorDejarDeSeguir = (new publicadores.ControladorDejarDeSeguirServiceLocator()).getControladorDejarDeSeguirPort();
      if (controladorDejarDeSeguir != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorDejarDeSeguir)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorDejarDeSeguir)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorDejarDeSeguir != null)
      ((javax.xml.rpc.Stub)controladorDejarDeSeguir)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorDejarDeSeguir getControladorDejarDeSeguir() {
    if (controladorDejarDeSeguir == null)
      _initControladorDejarDeSeguirProxy();
    return controladorDejarDeSeguir;
  }
  
  public boolean ingresarUser(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorDejarDeSeguir == null)
      _initControladorDejarDeSeguirProxy();
    return controladorDejarDeSeguir.ingresarUser(arg0);
  }
  
  public java.lang.String[] listarSeguidos(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorDejarDeSeguir == null)
      _initControladorDejarDeSeguirProxy();
    return controladorDejarDeSeguir.listarSeguidos(arg0);
  }
  
  public void dejarDeSeguir(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorDejarDeSeguir == null)
      _initControladorDejarDeSeguirProxy();
    controladorDejarDeSeguir.dejarDeSeguir(arg0);
  }
  
  
}