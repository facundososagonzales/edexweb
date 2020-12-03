/**
 * ControladorSeleccionarEstEdiCurso2PublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorSeleccionarEstEdiCurso2PublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorSeleccionarEstEdiCurso2PublishService {

    public ControladorSeleccionarEstEdiCurso2PublishServiceLocator() {
    }


    public ControladorSeleccionarEstEdiCurso2PublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorSeleccionarEstEdiCurso2PublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorSeleccionarEstEdiCurso2PublishPort
    private java.lang.String ControladorSeleccionarEstEdiCurso2PublishPort_address = "http://127.0.0.1:1942/ControladorSeleccionarEstEdiCurso2Publish";

    public java.lang.String getControladorSeleccionarEstEdiCurso2PublishPortAddress() {
        return ControladorSeleccionarEstEdiCurso2PublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorSeleccionarEstEdiCurso2PublishPortWSDDServiceName = "ControladorSeleccionarEstEdiCurso2PublishPort";

    public java.lang.String getControladorSeleccionarEstEdiCurso2PublishPortWSDDServiceName() {
        return ControladorSeleccionarEstEdiCurso2PublishPortWSDDServiceName;
    }

    public void setControladorSeleccionarEstEdiCurso2PublishPortWSDDServiceName(java.lang.String name) {
        ControladorSeleccionarEstEdiCurso2PublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorSeleccionarEstEdiCurso2Publish getControladorSeleccionarEstEdiCurso2PublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorSeleccionarEstEdiCurso2PublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorSeleccionarEstEdiCurso2PublishPort(endpoint);
    }

    public publicadores.ControladorSeleccionarEstEdiCurso2Publish getControladorSeleccionarEstEdiCurso2PublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorSeleccionarEstEdiCurso2PublishPortBindingStub _stub = new publicadores.ControladorSeleccionarEstEdiCurso2PublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorSeleccionarEstEdiCurso2PublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorSeleccionarEstEdiCurso2PublishPortEndpointAddress(java.lang.String address) {
        ControladorSeleccionarEstEdiCurso2PublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorSeleccionarEstEdiCurso2Publish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorSeleccionarEstEdiCurso2PublishPortBindingStub _stub = new publicadores.ControladorSeleccionarEstEdiCurso2PublishPortBindingStub(new java.net.URL(ControladorSeleccionarEstEdiCurso2PublishPort_address), this);
                _stub.setPortName(getControladorSeleccionarEstEdiCurso2PublishPortWSDDServiceName());
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
        if ("ControladorSeleccionarEstEdiCurso2PublishPort".equals(inputPortName)) {
            return getControladorSeleccionarEstEdiCurso2PublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorSeleccionarEstEdiCurso2PublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorSeleccionarEstEdiCurso2PublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorSeleccionarEstEdiCurso2PublishPort".equals(portName)) {
            setControladorSeleccionarEstEdiCurso2PublishPortEndpointAddress(address);
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
