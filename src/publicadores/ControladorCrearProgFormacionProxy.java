package publicadores;

public class ControladorCrearProgFormacionProxy implements publicadores.ControladorCrearProgFormacion {
  private String _endpoint = null;
  private publicadores.ControladorCrearProgFormacion controladorCrearProgFormacion = null;
  
  public ControladorCrearProgFormacionProxy() {
    _initControladorCrearProgFormacionProxy();
  }
  
  public ControladorCrearProgFormacionProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorCrearProgFormacionProxy();
  }
  
  private void _initControladorCrearProgFormacionProxy() {
    try {
      controladorCrearProgFormacion = (new publicadores.ControladorCrearProgFormacionServiceLocator()).getControladorCrearProgFormacionPort();
      if (controladorCrearProgFormacion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorCrearProgFormacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorCrearProgFormacion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorCrearProgFormacion != null)
      ((javax.xml.rpc.Stub)controladorCrearProgFormacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorCrearProgFormacion getControladorCrearProgFormacion() {
    if (controladorCrearProgFormacion == null)
      _initControladorCrearProgFormacionProxy();
    return controladorCrearProgFormacion;
  }
  
  public boolean ingresarNombreProgFor(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorCrearProgFormacion == null)
      _initControladorCrearProgFormacionProxy();
    return controladorCrearProgFormacion.ingresarNombreProgFor(arg0);
  }
  
  public void ingresarDatos(publicadores.DtProgFormacion arg0) throws java.rmi.RemoteException{
    if (controladorCrearProgFormacion == null)
      _initControladorCrearProgFormacionProxy();
    controladorCrearProgFormacion.ingresarDatos(arg0);
  }
  
  
}