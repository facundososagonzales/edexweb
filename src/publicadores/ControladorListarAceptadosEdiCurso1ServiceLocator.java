/**
 * ControladorListarAceptadosEdiCurso1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorListarAceptadosEdiCurso1ServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorListarAceptadosEdiCurso1Service {

    public ControladorListarAceptadosEdiCurso1ServiceLocator() {
    }


    public ControladorListarAceptadosEdiCurso1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorListarAceptadosEdiCurso1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorListarAceptadosEdiCurso1Port
    private java.lang.String ControladorListarAceptadosEdiCurso1Port_address = "http://127.0.0.1:1942/ControladorListarAceptadosEdiCurso1";

    public java.lang.String getControladorListarAceptadosEdiCurso1PortAddress() {
        return ControladorListarAceptadosEdiCurso1Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorListarAceptadosEdiCurso1PortWSDDServiceName = "ControladorListarAceptadosEdiCurso1Port";

    public java.lang.String getControladorListarAceptadosEdiCurso1PortWSDDServiceName() {
        return ControladorListarAceptadosEdiCurso1PortWSDDServiceName;
    }

    public void setControladorListarAceptadosEdiCurso1PortWSDDServiceName(java.lang.String name) {
        ControladorListarAceptadosEdiCurso1PortWSDDServiceName = name;
    }

    public publicadores.ControladorListarAceptadosEdiCurso1 getControladorListarAceptadosEdiCurso1Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorListarAceptadosEdiCurso1Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorListarAceptadosEdiCurso1Port(endpoint);
    }

    public publicadores.ControladorListarAceptadosEdiCurso1 getControladorListarAceptadosEdiCurso1Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorListarAceptadosEdiCurso1PortBindingStub _stub = new publicadores.ControladorListarAceptadosEdiCurso1PortBindingStub(portAddress, this);
            _stub.setPortName(getControladorListarAceptadosEdiCurso1PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorListarAceptadosEdiCurso1PortEndpointAddress(java.lang.String address) {
        ControladorListarAceptadosEdiCurso1Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorListarAceptadosEdiCurso1.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorListarAceptadosEdiCurso1PortBindingStub _stub = new publicadores.ControladorListarAceptadosEdiCurso1PortBindingStub(new java.net.URL(ControladorListarAceptadosEdiCurso1Port_address), this);
                _stub.setPortName(getControladorListarAceptadosEdiCurso1PortWSDDServiceName());
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
        if ("ControladorListarAceptadosEdiCurso1Port".equals(inputPortName)) {
            return getControladorListarAceptadosEdiCurso1Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorListarAceptadosEdiCurso1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorListarAceptadosEdiCurso1Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorListarAceptadosEdiCurso1Port".equals(portName)) {
            setControladorListarAceptadosEdiCurso1PortEndpointAddress(address);
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
