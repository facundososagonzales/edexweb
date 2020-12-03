package publicadores;

public class ControladorAgregarCursoAProgFormacionProxy implements publicadores.ControladorAgregarCursoAProgFormacion {
  private String _endpoint = null;
  private publicadores.ControladorAgregarCursoAProgFormacion controladorAgregarCursoAProgFormacion = null;
  
  public ControladorAgregarCursoAProgFormacionProxy() {
    _initControladorAgregarCursoAProgFormacionProxy();
  }
  
  public ControladorAgregarCursoAProgFormacionProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorAgregarCursoAProgFormacionProxy();
  }
  
  private void _initControladorAgregarCursoAProgFormacionProxy() {
    try {
      controladorAgregarCursoAProgFormacion = (new publicadores.ControladorAgregarCursoAProgFormacionServiceLocator()).getControladorAgregarCursoAProgFormacionPort();
      if (controladorAgregarCursoAProgFormacion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorAgregarCursoAProgFormacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorAgregarCursoAProgFormacion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorAgregarCursoAProgFormacion != null)
      ((javax.xml.rpc.Stub)controladorAgregarCursoAProgFormacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorAgregarCursoAProgFormacion getControladorAgregarCursoAProgFormacion() {
    if (controladorAgregarCursoAProgFormacion == null)
      _initControladorAgregarCursoAProgFormacionProxy();
    return controladorAgregarCursoAProgFormacion;
  }
  
  public void seleccionarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAgregarCursoAProgFormacion == null)
      _initControladorAgregarCursoAProgFormacionProxy();
    controladorAgregarCursoAProgFormacion.seleccionarCurso(arg0);
  }
  
  public void confirmar() throws java.rmi.RemoteException{
    if (controladorAgregarCursoAProgFormacion == null)
      _initControladorAgregarCursoAProgFormacionProxy();
    controladorAgregarCursoAProgFormacion.confirmar();
  }
  
  public java.lang.String[] seleccionarProgsFormacion2(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAgregarCursoAProgFormacion == null)
      _initControladorAgregarCursoAProgFormacionProxy();
    return controladorAgregarCursoAProgFormacion.seleccionarProgsFormacion2(arg0);
  }
  
  public java.lang.String[] listarProgsFormacion2() throws java.rmi.RemoteException{
    if (controladorAgregarCursoAProgFormacion == null)
      _initControladorAgregarCursoAProgFormacionProxy();
    return controladorAgregarCursoAProgFormacion.listarProgsFormacion2();
  }
  
  
}