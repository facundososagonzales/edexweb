/**
 * ControladorCrearProgFormacionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorCrearProgFormacionServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorCrearProgFormacionService {

    public ControladorCrearProgFormacionServiceLocator() {
    }


    public ControladorCrearProgFormacionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorCrearProgFormacionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorCrearProgFormacionPort
    private java.lang.String ControladorCrearProgFormacionPort_address = "http://127.0.0.1:1942/ControladorCrearProgDeFormacion";

    public java.lang.String getControladorCrearProgFormacionPortAddress() {
        return ControladorCrearProgFormacionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorCrearProgFormacionPortWSDDServiceName = "ControladorCrearProgFormacionPort";

    public java.lang.String getControladorCrearProgFormacionPortWSDDServiceName() {
        return ControladorCrearProgFormacionPortWSDDServiceName;
    }

    public void setControladorCrearProgFormacionPortWSDDServiceName(java.lang.String name) {
        ControladorCrearProgFormacionPortWSDDServiceName = name;
    }

    public publicadores.ControladorCrearProgFormacion getControladorCrearProgFormacionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorCrearProgFormacionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorCrearProgFormacionPort(endpoint);
    }

    public publicadores.ControladorCrearProgFormacion getControladorCrearProgFormacionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorCrearProgFormacionPortBindingStub _stub = new publicadores.ControladorCrearProgFormacionPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorCrearProgFormacionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorCrearProgFormacionPortEndpointAddress(java.lang.String address) {
        ControladorCrearProgFormacionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorCrearProgFormacion.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorCrearProgFormacionPortBindingStub _stub = new publicadores.ControladorCrearProgFormacionPortBindingStub(new java.net.URL(ControladorCrearProgFormacionPort_address), this);
                _stub.setPortName(getControladorCrearProgFormacionPortWSDDServiceName());
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
        if ("ControladorCrearProgFormacionPort".equals(inputPortName)) {
            return getControladorCrearProgFormacionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorCrearProgFormacionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorCrearProgFormacionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorCrearProgFormacionPort".equals(portName)) {
            setControladorCrearProgFormacionPortEndpointAddress(address);
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
