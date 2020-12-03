/**
 * ControladorListaCursoProgramaPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorListaCursoProgramaPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorListaCursoProgramaPublishService {

    public ControladorListaCursoProgramaPublishServiceLocator() {
    }


    public ControladorListaCursoProgramaPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorListaCursoProgramaPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorListaCursoProgramaPublishPort
    private java.lang.String ControladorListaCursoProgramaPublishPort_address = "http://127.0.0.1:1942/controladorListaCursoPrograma";

    public java.lang.String getControladorListaCursoProgramaPublishPortAddress() {
        return ControladorListaCursoProgramaPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorListaCursoProgramaPublishPortWSDDServiceName = "ControladorListaCursoProgramaPublishPort";

    public java.lang.String getControladorListaCursoProgramaPublishPortWSDDServiceName() {
        return ControladorListaCursoProgramaPublishPortWSDDServiceName;
    }

    public void setControladorListaCursoProgramaPublishPortWSDDServiceName(java.lang.String name) {
        ControladorListaCursoProgramaPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorListaCursoProgramaPublish getControladorListaCursoProgramaPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorListaCursoProgramaPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorListaCursoProgramaPublishPort(endpoint);
    }

    public publicadores.ControladorListaCursoProgramaPublish getControladorListaCursoProgramaPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorListaCursoProgramaPublishPortBindingStub _stub = new publicadores.ControladorListaCursoProgramaPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorListaCursoProgramaPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorListaCursoProgramaPublishPortEndpointAddress(java.lang.String address) {
        ControladorListaCursoProgramaPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorListaCursoProgramaPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorListaCursoProgramaPublishPortBindingStub _stub = new publicadores.ControladorListaCursoProgramaPublishPortBindingStub(new java.net.URL(ControladorListaCursoProgramaPublishPort_address), this);
                _stub.setPortName(getControladorListaCursoProgramaPublishPortWSDDServiceName());
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
        if ("ControladorListaCursoProgramaPublishPort".equals(inputPortName)) {
            return getControladorListaCursoProgramaPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorListaCursoProgramaPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorListaCursoProgramaPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorListaCursoProgramaPublishPort".equals(portName)) {
            setControladorListaCursoProgramaPublishPortEndpointAddress(address);
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
