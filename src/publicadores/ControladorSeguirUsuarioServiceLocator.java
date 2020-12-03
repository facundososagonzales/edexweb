/**
 * ControladorSeguirUsuarioServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorSeguirUsuarioServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorSeguirUsuarioService {

    public ControladorSeguirUsuarioServiceLocator() {
    }


    public ControladorSeguirUsuarioServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorSeguirUsuarioServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorSeguirUsuarioPort
    private java.lang.String ControladorSeguirUsuarioPort_address = "http://127.0.0.1:1942/ControladorSeguirUsuario";

    public java.lang.String getControladorSeguirUsuarioPortAddress() {
        return ControladorSeguirUsuarioPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorSeguirUsuarioPortWSDDServiceName = "ControladorSeguirUsuarioPort";

    public java.lang.String getControladorSeguirUsuarioPortWSDDServiceName() {
        return ControladorSeguirUsuarioPortWSDDServiceName;
    }

    public void setControladorSeguirUsuarioPortWSDDServiceName(java.lang.String name) {
        ControladorSeguirUsuarioPortWSDDServiceName = name;
    }

    public publicadores.ControladorSeguirUsuario getControladorSeguirUsuarioPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorSeguirUsuarioPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorSeguirUsuarioPort(endpoint);
    }

    public publicadores.ControladorSeguirUsuario getControladorSeguirUsuarioPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorSeguirUsuarioPortBindingStub _stub = new publicadores.ControladorSeguirUsuarioPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorSeguirUsuarioPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorSeguirUsuarioPortEndpointAddress(java.lang.String address) {
        ControladorSeguirUsuarioPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorSeguirUsuario.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorSeguirUsuarioPortBindingStub _stub = new publicadores.ControladorSeguirUsuarioPortBindingStub(new java.net.URL(ControladorSeguirUsuarioPort_address), this);
                _stub.setPortName(getControladorSeguirUsuarioPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ControladorSeguirUsuarioPort".equals(inputPortName)) {
            return getControladorSeguirUsuarioPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorSeguirUsuarioService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorSeguirUsuarioPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorSeguirUsuarioPort".equals(portName)) {
            setControladorSeguirUsuarioPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
