package publicadores;

public class ControladorSeleccionarEstEdiCurso3PublishProxy implements publicadores.ControladorSeleccionarEstEdiCurso3Publish {
  private String _endpoint = null;
  private publicadores.ControladorSeleccionarEstEdiCurso3Publish controladorSeleccionarEstEdiCurso3Publish = null;
  
  public ControladorSeleccionarEstEdiCurso3PublishProxy() {
    _initControladorSeleccionarEstEdiCurso3PublishProxy();
  }
  
  public ControladorSeleccionarEstEdiCurso3PublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorSeleccionarEstEdiCurso3PublishProxy();
  }
  
  private void _initControladorSeleccionarEstEdiCurso3PublishProxy() {
    try {
      controladorSeleccionarEstEdiCurso3Publish = (new publicadores.ControladorSeleccionarEstEdiCurso3PublishServiceLocator()).getControladorSeleccionarEstEdiCurso3PublishPort();
      if (controladorSeleccionarEstEdiCurso3Publish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso3Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso3Publish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorSeleccionarEstEdiCurso3Publish != null)
      ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso3Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorSeleccionarEstEdiCurso3Publish getControladorSeleccionarEstEdiCurso3Publish() {
    if (controladorSeleccionarEstEdiCurso3Publish == null)
      _initControladorSeleccionarEstEdiCurso3PublishProxy();
    return controladorSeleccionarEstEdiCurso3Publish;
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso3Publish == null)
      _initControladorSeleccionarEstEdiCurso3PublishProxy();
    controladorSeleccionarEstEdiCurso3Publish.ingresarEdicion(arg0);
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso3Publish == null)
      _initControladorSeleccionarEstEdiCurso3PublishProxy();
    controladorSeleccionarEstEdiCurso3Publish.ingresarCurso(arg0);
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso3Publish == null)
      _initControladorSeleccionarEstEdiCurso3PublishProxy();
    controladorSeleccionarEstEdiCurso3Publish.ingresarInstituto(arg0);
  }
  
  public publicadores.DtEstudiante[] listarEstudiantesInscriptos() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso3Publish == null)
      _initControladorSeleccionarEstEdiCurso3PublishProxy();
    return controladorSeleccionarEstEdiCurso3Publish.listarEstudiantesInscriptos();
  }
  
  public java.lang.String[] listarEstudiantes() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso3Publish == null)
      _initControladorSeleccionarEstEdiCurso3PublishProxy();
    return controladorSeleccionarEstEdiCurso3Publish.listarEstudiantes();
  }
  
  
}