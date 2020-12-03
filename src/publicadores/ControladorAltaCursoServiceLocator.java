/**
 * ControladorAltaCursoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorAltaCursoServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorAltaCursoService {

    public ControladorAltaCursoServiceLocator() {
    }


    public ControladorAltaCursoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorAltaCursoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorAltaCursoPort
    private java.lang.String ControladorAltaCursoPort_address = "http://127.0.0.1:1942/ControladorAltaCurso";

    public java.lang.String getControladorAltaCursoPortAddress() {
        return ControladorAltaCursoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorAltaCursoPortWSDDServiceName = "ControladorAltaCursoPort";

    public java.lang.String getControladorAltaCursoPortWSDDServiceName() {
        return ControladorAltaCursoPortWSDDServiceName;
    }

    public void setControladorAltaCursoPortWSDDServiceName(java.lang.String name) {
        ControladorAltaCursoPortWSDDServiceName = name;
    }

    public publicadores.ControladorAltaCurso getControladorAltaCursoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorAltaCursoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorAltaCursoPort(endpoint);
    }

    public publicadores.ControladorAltaCurso getControladorAltaCursoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorAltaCursoPortBindingStub _stub = new publicadores.ControladorAltaCursoPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorAltaCursoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorAltaCursoPortEndpointAddress(java.lang.String address) {
        ControladorAltaCursoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorAltaCurso.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorAltaCursoPortBindingStub _stub = new publicadores.ControladorAltaCursoPortBindingStub(new java.net.URL(ControladorAltaCursoPort_address), this);
                _stub.setPortName(getControladorAltaCursoPortWSDDServiceName());
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
        if ("ControladorAltaCursoPort".equals(inputPortName)) {
            return getControladorAltaCursoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorAltaCursoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorAltaCursoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorAltaCursoPort".equals(portName)) {
            setControladorAltaCursoPortEndpointAddress(address);
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
