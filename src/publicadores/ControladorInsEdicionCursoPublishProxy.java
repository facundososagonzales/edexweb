package publicadores;

public class ControladorInsEdicionCursoPublishProxy implements publicadores.ControladorInsEdicionCursoPublish {
  private String _endpoint = null;
  private publicadores.ControladorInsEdicionCursoPublish controladorInsEdicionCursoPublish = null;
  
  public ControladorInsEdicionCursoPublishProxy() {
    _initControladorInsEdicionCursoPublishProxy();
  }
  
  public ControladorInsEdicionCursoPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorInsEdicionCursoPublishProxy();
  }
  
  private void _initControladorInsEdicionCursoPublishProxy() {
    try {
      controladorInsEdicionCursoPublish = (new publicadores.ControladorInsEdicionCursoPublishServiceLocator()).getControladorInsEdicionCursoPublishPort();
      if (controladorInsEdicionCursoPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorInsEdicionCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorInsEdicionCursoPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorInsEdicionCursoPublish != null)
      ((javax.xml.rpc.Stub)controladorInsEdicionCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorInsEdicionCursoPublish getControladorInsEdicionCursoPublish() {
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish;
  }
  
  public java.lang.String[] listarCategorias() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.listarCategorias();
  }
  
  public void ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    controladorInsEdicionCursoPublish.ingresarInstituto(arg0);
  }
  
  public java.lang.String[] listarInstitutos() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.listarInstitutos();
  }
  
  public java.lang.String[] listarCursos() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.listarCursos();
  }
  
  public java.lang.String[] listarEdicion() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.listarEdicion();
  }
  
  public void ingresarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    controladorInsEdicionCursoPublish.ingresarEdicion(arg0);
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicion() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.seleccionarEdicion();
  }
  
  public boolean inscripcionEstudiante(java.lang.String arg0, java.util.Calendar arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.inscripcionEstudiante(arg0, arg1, arg2);
  }
  
  public void ingresarCursoInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    controladorInsEdicionCursoPublish.ingresarCursoInstituto(arg0);
  }
  
  public java.lang.String[] listarEdicionCat() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.listarEdicionCat();
  }
  
  public java.lang.String[] listarEstudiantes() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.listarEstudiantes();
  }
  
  public java.lang.String[] listarCursosCategoria() throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    return controladorInsEdicionCursoPublish.listarCursosCategoria();
  }
  
  public void inscripcionEstudianteW(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    controladorInsEdicionCursoPublish.inscripcionEstudianteW(arg0, arg1);
  }
  
  public void ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    controladorInsEdicionCursoPublish.ingresarCategoria(arg0);
  }
  
  public void ingresarCursoporCat(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorInsEdicionCursoPublish == null)
      _initControladorInsEdicionCursoPublishProxy();
    controladorInsEdicionCursoPublish.ingresarCursoporCat(arg0);
  }
  
  
}