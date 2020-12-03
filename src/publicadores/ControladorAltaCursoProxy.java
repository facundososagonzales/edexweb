package publicadores;

public class ControladorAltaCursoProxy implements publicadores.ControladorAltaCurso {
  private String _endpoint = null;
  private publicadores.ControladorAltaCurso controladorAltaCurso = null;
  
  public ControladorAltaCursoProxy() {
    _initControladorAltaCursoProxy();
  }
  
  public ControladorAltaCursoProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorAltaCursoProxy();
  }
  
  private void _initControladorAltaCursoProxy() {
    try {
      controladorAltaCurso = (new publicadores.ControladorAltaCursoServiceLocator()).getControladorAltaCursoPort();
      if (controladorAltaCurso != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorAltaCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorAltaCurso)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorAltaCurso != null)
      ((javax.xml.rpc.Stub)controladorAltaCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorAltaCurso getControladorAltaCurso() {
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso;
  }
  
  public boolean agregarPrevias2(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.agregarPrevias2(arg0);
  }
  
  public void ingresarDatos(publicadores.DtCursoDetalle arg0) throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    controladorAltaCurso.ingresarDatos(arg0);
  }
  
  public void limpiarDatos() throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    controladorAltaCurso.limpiarDatos();
  }
  
  public java.lang.String[] getPrevias() throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.getPrevias();
  }
  
  public java.lang.String[] listarCursos() throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.listarCursos();
  }
  
  public boolean ingresarCurso(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.ingresarCurso(arg0);
  }
  
  public java.lang.String[] listarCategorias() throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.listarCategorias();
  }
  
  public boolean agregarCategoria(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.agregarCategoria(arg0);
  }
  
  public boolean ingresarInstituto(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.ingresarInstituto(arg0);
  }
  
  public boolean agregarPrevias(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.agregarPrevias(arg0);
  }
  
  public java.lang.String[] getCategorias() throws java.rmi.RemoteException{
    if (controladorAltaCurso == null)
      _initControladorAltaCursoProxy();
    return controladorAltaCurso.getCategorias();
  }
  
  
}