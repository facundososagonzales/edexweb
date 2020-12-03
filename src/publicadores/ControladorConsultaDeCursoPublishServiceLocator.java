/**
 * ControladorConsultaDeCursoPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorConsultaDeCursoPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorConsultaDeCursoPublishService {

    public ControladorConsultaDeCursoPublishServiceLocator() {
    }


    public ControladorConsultaDeCursoPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorConsultaDeCursoPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorConsultaDeCursoPublishPort
    private java.lang.String ControladorConsultaDeCursoPublishPort_address = "http://127.0.0.1:1942/controladorConsultaDeCurso";

    public java.lang.String getControladorConsultaDeCursoPublishPortAddress() {
        return ControladorConsultaDeCursoPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorConsultaDeCursoPublishPortWSDDServiceName = "ControladorConsultaDeCursoPublishPort";

    public java.lang.String getControladorConsultaDeCursoPublishPortWSDDServiceName() {
        return ControladorConsultaDeCursoPublishPortWSDDServiceName;
    }

    public void setControladorConsultaDeCursoPublishPortWSDDServiceName(java.lang.String name) {
        ControladorConsultaDeCursoPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorConsultaDeCursoPublish getControladorConsultaDeCursoPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorConsultaDeCursoPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorConsultaDeCursoPublishPort(endpoint);
    }

    public publicadores.ControladorConsultaDeCursoPublish getControladorConsultaDeCursoPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorConsultaDeCursoPublishPortBindingStub _stub = new publicadores.ControladorConsultaDeCursoPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorConsultaDeCursoPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorConsultaDeCursoPublishPortEndpointAddress(java.lang.String address) {
        ControladorConsultaDeCursoPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorConsultaDeCursoPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorConsultaDeCursoPublishPortBindingStub _stub = new publicadores.ControladorConsultaDeCursoPublishPortBindingStub(new java.net.URL(ControladorConsultaDeCursoPublishPort_address), this);
                _stub.setPortName(getControladorConsultaDeCursoPublishPortWSDDServiceName());
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
        if ("ControladorConsultaDeCursoPublishPort".equals(inputPortName)) {
            return getControladorConsultaDeCursoPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaDeCursoPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaDeCursoPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorConsultaDeCursoPublishPort".equals(portName)) {
            setControladorConsultaDeCursoPublishPortEndpointAddress(address);
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
