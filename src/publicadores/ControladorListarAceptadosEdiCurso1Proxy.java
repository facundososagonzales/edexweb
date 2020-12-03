package publicadores;

public class ControladorListarAceptadosEdiCurso1Proxy implements publicadores.ControladorListarAceptadosEdiCurso1 {
  private String _endpoint = null;
  private publicadores.ControladorListarAceptadosEdiCurso1 controladorListarAceptadosEdiCurso1 = null;
  
  public ControladorListarAceptadosEdiCurso1Proxy() {
    _initControladorListarAceptadosEdiCurso1Proxy();
  }
  
  public ControladorListarAceptadosEdiCurso1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorListarAceptadosEdiCurso1Proxy();
  }
  
  private void _initControladorListarAceptadosEdiCurso1Proxy() {
    try {
      controladorListarAceptadosEdiCurso1 = (new publicadores.ControladorListarAceptadosEdiCurso1ServiceLocator()).getControladorListarAceptadosEdiCurso1Port();
      if (controladorListarAceptadosEdiCurso1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorListarAceptadosEdiCurso1 != null)
      ((javax.xml.rpc.Stub)controladorListarAceptadosEdiCurso1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorListarAceptadosEdiCurso1 getControladorListarAceptadosEdiCurso1() {
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    return controladorListarAceptadosEdiCurso1;
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    controladorListarAceptadosEdiCurso1.ingresarInstituto(arg0);
  }
  
  public java.lang.String[] listarEdicion() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    return controladorListarAceptadosEdiCurso1.listarEdicion();
  }
  
  public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    return controladorListarAceptadosEdiCurso1.listarInstitutos();
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    controladorListarAceptadosEdiCurso1.ingresarEdicion(arg0);
  }
  
  public void ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    controladorListarAceptadosEdiCurso1.ingresarCurso(arg0);
  }
  
  public java.lang.String[] listarCursos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    return controladorListarAceptadosEdiCurso1.listarCursos();
  }
  
  public java.lang.String[] listarEstudiantesInscriptos() throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    return controladorListarAceptadosEdiCurso1.listarEstudiantesInscriptos();
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorListarAceptadosEdiCurso1 == null)
      _initControladorListarAceptadosEdiCurso1Proxy();
    return controladorListarAceptadosEdiCurso1.seleccionarEdicion(arg0);
  }
  
  
}