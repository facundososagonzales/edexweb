/**
 * ControladorDejarDeSeguirServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorDejarDeSeguirServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorDejarDeSeguirService {

    public ControladorDejarDeSeguirServiceLocator() {
    }


    public ControladorDejarDeSeguirServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorDejarDeSeguirServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorDejarDeSeguirPort
    private java.lang.String ControladorDejarDeSeguirPort_address = "http://127.0.0.1:1942/ControladorDejarDeSeguir";

    public java.lang.String getControladorDejarDeSeguirPortAddress() {
        return ControladorDejarDeSeguirPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorDejarDeSeguirPortWSDDServiceName = "ControladorDejarDeSeguirPort";

    public java.lang.String getControladorDejarDeSeguirPortWSDDServiceName() {
        return ControladorDejarDeSeguirPortWSDDServiceName;
    }

    public void setControladorDejarDeSeguirPortWSDDServiceName(java.lang.String name) {
        ControladorDejarDeSeguirPortWSDDServiceName = name;
    }

    public publicadores.ControladorDejarDeSeguir getControladorDejarDeSeguirPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorDejarDeSeguirPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorDejarDeSeguirPort(endpoint);
    }

    public publicadores.ControladorDejarDeSeguir getControladorDejarDeSeguirPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorDejarDeSeguirPortBindingStub _stub = new publicadores.ControladorDejarDeSeguirPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorDejarDeSeguirPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorDejarDeSeguirPortEndpointAddress(java.lang.String address) {
        ControladorDejarDeSeguirPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorDejarDeSeguir.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorDejarDeSeguirPortBindingStub _stub = new publicadores.ControladorDejarDeSeguirPortBindingStub(new java.net.URL(ControladorDejarDeSeguirPort_address), this);
                _stub.setPortName(getControladorDejarDeSeguirPortWSDDServiceName());
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
        if ("ControladorDejarDeSeguirPort".equals(inputPortName)) {
            return getControladorDejarDeSeguirPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorDejarDeSeguirService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorDejarDeSeguirPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorDejarDeSeguirPort".equals(portName)) {
            setControladorDejarDeSeguirPortEndpointAddress(address);
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
