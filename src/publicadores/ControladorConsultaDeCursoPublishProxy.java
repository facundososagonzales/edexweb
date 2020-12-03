package publicadores;

public class ControladorConsultaDeCursoPublishProxy implements publicadores.ControladorConsultaDeCursoPublish {
  private String _endpoint = null;
  private publicadores.ControladorConsultaDeCursoPublish controladorConsultaDeCursoPublish = null;
  
  public ControladorConsultaDeCursoPublishProxy() {
    _initControladorConsultaDeCursoPublishProxy();
  }
  
  public ControladorConsultaDeCursoPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorConsultaDeCursoPublishProxy();
  }
  
  private void _initControladorConsultaDeCursoPublishProxy() {
    try {
      controladorConsultaDeCursoPublish = (new publicadores.ControladorConsultaDeCursoPublishServiceLocator()).getControladorConsultaDeCursoPublishPort();
      if (controladorConsultaDeCursoPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorConsultaDeCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorConsultaDeCursoPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorConsultaDeCursoPublish != null)
      ((javax.xml.rpc.Stub)controladorConsultaDeCursoPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorConsultaDeCursoPublish getControladorConsultaDeCursoPublish() {
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish;
  }
  
  public publicadores.DtInfoProgCurso seleccionarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish.seleccionarCurso(arg0);
  }
  
  public publicadores.DtCursoBase[] ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish.ingresarInstituto(arg0);
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicion(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish.seleccionarEdicion(arg0);
  }
  
  public publicadores.DtProgCurso seleccionarPrograma(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish.seleccionarPrograma(arg0);
  }
  
  public publicadores.DtCursoBase[] ingresarCategoria(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish.ingresarCategoria(arg0);
  }
  
  public publicadores.DtInfoProgCurso seleccionarCursoEnCat(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish.seleccionarCursoEnCat(arg0);
  }
  
  public publicadores.DtEdicionDetalle seleccionarEdicionCat(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    return controladorConsultaDeCursoPublish.seleccionarEdicionCat(arg0);
  }
  
  public void ingresarDt(publicadores.DtEdicionBasico arg0) throws java.rmi.RemoteException{
    if (controladorConsultaDeCursoPublish == null)
      _initControladorConsultaDeCursoPublishProxy();
    controladorConsultaDeCursoPublish.ingresarDt(arg0);
  }
  
  
}