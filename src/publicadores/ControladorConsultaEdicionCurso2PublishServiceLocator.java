/**
 * ControladorConsultaEdicionCurso2PublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorConsultaEdicionCurso2PublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorConsultaEdicionCurso2PublishService {

    public ControladorConsultaEdicionCurso2PublishServiceLocator() {
    }


    public ControladorConsultaEdicionCurso2PublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorConsultaEdicionCurso2PublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorConsultaEdicionCurso2PublishPort
    private java.lang.String ControladorConsultaEdicionCurso2PublishPort_address = "http://127.0.0.1:1942/ControladorConsultaEdicionCurso2Publish";

    public java.lang.String getControladorConsultaEdicionCurso2PublishPortAddress() {
        return ControladorConsultaEdicionCurso2PublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorConsultaEdicionCurso2PublishPortWSDDServiceName = "ControladorConsultaEdicionCurso2PublishPort";

    public java.lang.String getControladorConsultaEdicionCurso2PublishPortWSDDServiceName() {
        return ControladorConsultaEdicionCurso2PublishPortWSDDServiceName;
    }

    public void setControladorConsultaEdicionCurso2PublishPortWSDDServiceName(java.lang.String name) {
        ControladorConsultaEdicionCurso2PublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorConsultaEdicionCurso2Publish getControladorConsultaEdicionCurso2PublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorConsultaEdicionCurso2PublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorConsultaEdicionCurso2PublishPort(endpoint);
    }

    public publicadores.ControladorConsultaEdicionCurso2Publish getControladorConsultaEdicionCurso2PublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorConsultaEdicionCurso2PublishPortBindingStub _stub = new publicadores.ControladorConsultaEdicionCurso2PublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorConsultaEdicionCurso2PublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorConsultaEdicionCurso2PublishPortEndpointAddress(java.lang.String address) {
        ControladorConsultaEdicionCurso2PublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorConsultaEdicionCurso2Publish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorConsultaEdicionCurso2PublishPortBindingStub _stub = new publicadores.ControladorConsultaEdicionCurso2PublishPortBindingStub(new java.net.URL(ControladorConsultaEdicionCurso2PublishPort_address), this);
                _stub.setPortName(getControladorConsultaEdicionCurso2PublishPortWSDDServiceName());
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
        if ("ControladorConsultaEdicionCurso2PublishPort".equals(inputPortName)) {
            return getControladorConsultaEdicionCurso2PublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaEdicionCurso2PublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaEdicionCurso2PublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorConsultaEdicionCurso2PublishPort".equals(portName)) {
            setControladorConsultaEdicionCurso2PublishPortEndpointAddress(address);
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
