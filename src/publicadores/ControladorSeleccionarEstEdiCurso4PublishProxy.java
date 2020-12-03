package publicadores;

public class ControladorSeleccionarEstEdiCurso4PublishProxy implements publicadores.ControladorSeleccionarEstEdiCurso4Publish {
  private String _endpoint = null;
  private publicadores.ControladorSeleccionarEstEdiCurso4Publish controladorSeleccionarEstEdiCurso4Publish = null;
  
  public ControladorSeleccionarEstEdiCurso4PublishProxy() {
    _initControladorSeleccionarEstEdiCurso4PublishProxy();
  }
  
  public ControladorSeleccionarEstEdiCurso4PublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorSeleccionarEstEdiCurso4PublishProxy();
  }
  
  private void _initControladorSeleccionarEstEdiCurso4PublishProxy() {
    try {
      controladorSeleccionarEstEdiCurso4Publish = (new publicadores.ControladorSeleccionarEstEdiCurso4PublishServiceLocator()).getControladorSeleccionarEstEdiCurso4PublishPort();
      if (controladorSeleccionarEstEdiCurso4Publish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso4Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso4Publish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorSeleccionarEstEdiCurso4Publish != null)
      ((javax.xml.rpc.Stub)controladorSeleccionarEstEdiCurso4Publish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorSeleccionarEstEdiCurso4Publish getControladorSeleccionarEstEdiCurso4Publish() {
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    return controladorSeleccionarEstEdiCurso4Publish;
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    controladorSeleccionarEstEdiCurso4Publish.ingresarEdicion(arg0);
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    controladorSeleccionarEstEdiCurso4Publish.ingresarCurso(arg0);
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    controladorSeleccionarEstEdiCurso4Publish.ingresarInstituto(arg0);
  }
  
  public void seleccionarEstadoEstudiante(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    controladorSeleccionarEstEdiCurso4Publish.seleccionarEstadoEstudiante(arg0);
  }
  
  public publicadores.DtEstudiante[] listarEstudiantesInscriptos() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    return controladorSeleccionarEstEdiCurso4Publish.listarEstudiantesInscriptos();
  }
  
  public void ingresarEstudiante(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    controladorSeleccionarEstEdiCurso4Publish.ingresarEstudiante(arg0);
  }
  
  public java.lang.String[] listarEstudiantes() throws java.rmi.RemoteException{
    if (controladorSeleccionarEstEdiCurso4Publish == null)
      _initControladorSeleccionarEstEdiCurso4PublishProxy();
    return controladorSeleccionarEstEdiCurso4Publish.listarEstudiantes();
  }
  
  
}