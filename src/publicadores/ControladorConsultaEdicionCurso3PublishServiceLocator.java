/**
 * ControladorConsultaEdicionCurso3PublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorConsultaEdicionCurso3PublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorConsultaEdicionCurso3PublishService {

    public ControladorConsultaEdicionCurso3PublishServiceLocator() {
    }


    public ControladorConsultaEdicionCurso3PublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorConsultaEdicionCurso3PublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorConsultaEdicionCurso3PublishPort
    private java.lang.String ControladorConsultaEdicionCurso3PublishPort_address = "http://127.0.0.1:1942/ControladorConsultaEdicionCurso3Publish";

    public java.lang.String getControladorConsultaEdicionCurso3PublishPortAddress() {
        return ControladorConsultaEdicionCurso3PublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorConsultaEdicionCurso3PublishPortWSDDServiceName = "ControladorConsultaEdicionCurso3PublishPort";

    public java.lang.String getControladorConsultaEdicionCurso3PublishPortWSDDServiceName() {
        return ControladorConsultaEdicionCurso3PublishPortWSDDServiceName;
    }

    public void setControladorConsultaEdicionCurso3PublishPortWSDDServiceName(java.lang.String name) {
        ControladorConsultaEdicionCurso3PublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorConsultaEdicionCurso3Publish getControladorConsultaEdicionCurso3PublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorConsultaEdicionCurso3PublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorConsultaEdicionCurso3PublishPort(endpoint);
    }

    public publicadores.ControladorConsultaEdicionCurso3Publish getControladorConsultaEdicionCurso3PublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorConsultaEdicionCurso3PublishPortBindingStub _stub = new publicadores.ControladorConsultaEdicionCurso3PublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorConsultaEdicionCurso3PublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorConsultaEdicionCurso3PublishPortEndpointAddress(java.lang.String address) {
        ControladorConsultaEdicionCurso3PublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorConsultaEdicionCurso3Publish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorConsultaEdicionCurso3PublishPortBindingStub _stub = new publicadores.ControladorConsultaEdicionCurso3PublishPortBindingStub(new java.net.URL(ControladorConsultaEdicionCurso3PublishPort_address), this);
                _stub.setPortName(getControladorConsultaEdicionCurso3PublishPortWSDDServiceName());
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
        if ("ControladorConsultaEdicionCurso3PublishPort".equals(inputPortName)) {
            return getControladorConsultaEdicionCurso3PublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaEdicionCurso3PublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorConsultaEdicionCurso3PublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorConsultaEdicionCurso3PublishPort".equals(portName)) {
            setControladorConsultaEdicionCurso3PublishPortEndpointAddress(address);
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
