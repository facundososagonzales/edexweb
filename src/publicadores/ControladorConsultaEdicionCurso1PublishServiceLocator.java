/**
 * ControladorConsultaEdicionCurso1PublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorConsultaEdicionCurso1PublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorConsultaEdicionCurso1PublishService {

    public ControladorConsultaEdicionCurso1PublishServiceLocator() {
    }


    public ControladorConsultaEdicionCurso1PublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorConsultaEdicionCurso1PublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorConsultaEdicionCurso1PublishPort
    private java.lang.String ControladorConsultaEdicionCurso1PublishPort_address = "http://127.0.0.1:1942/ControladorConsultaEdicionCurso1Publish";

    public java.lang.String getControladorConsultaEdicionCurso1PublishPortAddress() {
        return ControladorConsultaEdicionCurso1PublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorConsultaEdicionCurso1PublishPortWSDDServiceName = "ControladorConsultaEdicionCurso1PublishPort";

    public java.lang.String getControladorConsultaEdicionCurso1PublishPortWSDDServiceName() {
        return ControladorConsultaEdicionCurso1PublishPortWSDDServiceName;
    }

    public void setControladorConsultaEdicionCurso1PublishPortWSDDServiceName(java.lang.String name) {
        ControladorConsultaEdicionCurso1PublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorConsultaEdicionCurso1Publish getControladorConsultaEdicionCurso1PublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorConsultaEdicionCurso1PublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorConsultaEdicionCurso1PublishPort(endpoint);
    }

    public publicadores.ControladorConsultaEdicionCurso1Publish getControladorConsultaEdicionCurso1PublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorConsultaEdicionCurso1PublishPortBindingStub _stub = new publicadores.ControladorConsultaEdicionCurso1PublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorConsultaEdicionCurso1PublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorConsultaEdicionCurso1PublishPortEndpointAddress(java.lang.String address) {
        ControladorConsultaEdicionCurso1PublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorConsultaEdicionCurso1Publish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorConsultaEdicionCurso1PublishPortBindingStub _stub = new publicadores.ControladorConsultaEdicionCurso1PublishPortBindingStub(new java.net.URL(ControladorConsultaEdicionCurso1PublishPort_address), this);
                _stub.setPortName(getControladorConsultaEdicionCurso1PublishPortWSDDServiceName());
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
        if ("ControladorConsultaEdicionCurso1PublishPort".equals(inputPortName)) {
            return getControladorConsultaEdicionCurso1PublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaEdicionCurso1PublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaEdicionCurso1PublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorConsultaEdicionCurso1PublishPort".equals(portName)) {
            setControladorConsultaEdicionCurso1PublishPortEndpointAddress(address);
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
