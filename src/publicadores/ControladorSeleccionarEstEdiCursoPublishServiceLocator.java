/**
 * ControladorSeleccionarEstEdiCursoPublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorSeleccionarEstEdiCursoPublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorSeleccionarEstEdiCursoPublishService {

    public ControladorSeleccionarEstEdiCursoPublishServiceLocator() {
    }


    public ControladorSeleccionarEstEdiCursoPublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorSeleccionarEstEdiCursoPublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorSeleccionarEstEdiCursoPublishPort
    private java.lang.String ControladorSeleccionarEstEdiCursoPublishPort_address = "http://127.0.0.1:1942/ControladorSeleccionarEstEdiCursoPublish";

    public java.lang.String getControladorSeleccionarEstEdiCursoPublishPortAddress() {
        return ControladorSeleccionarEstEdiCursoPublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorSeleccionarEstEdiCursoPublishPortWSDDServiceName = "ControladorSeleccionarEstEdiCursoPublishPort";

    public java.lang.String getControladorSeleccionarEstEdiCursoPublishPortWSDDServiceName() {
        return ControladorSeleccionarEstEdiCursoPublishPortWSDDServiceName;
    }

    public void setControladorSeleccionarEstEdiCursoPublishPortWSDDServiceName(java.lang.String name) {
        ControladorSeleccionarEstEdiCursoPublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorSeleccionarEstEdiCursoPublish getControladorSeleccionarEstEdiCursoPublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorSeleccionarEstEdiCursoPublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorSeleccionarEstEdiCursoPublishPort(endpoint);
    }

    public publicadores.ControladorSeleccionarEstEdiCursoPublish getControladorSeleccionarEstEdiCursoPublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorSeleccionarEstEdiCursoPublishPortBindingStub _stub = new publicadores.ControladorSeleccionarEstEdiCursoPublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorSeleccionarEstEdiCursoPublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorSeleccionarEstEdiCursoPublishPortEndpointAddress(java.lang.String address) {
        ControladorSeleccionarEstEdiCursoPublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorSeleccionarEstEdiCursoPublish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorSeleccionarEstEdiCursoPublishPortBindingStub _stub = new publicadores.ControladorSeleccionarEstEdiCursoPublishPortBindingStub(new java.net.URL(ControladorSeleccionarEstEdiCursoPublishPort_address), this);
                _stub.setPortName(getControladorSeleccionarEstEdiCursoPublishPortWSDDServiceName());
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
        if ("ControladorSeleccionarEstEdiCursoPublishPort".equals(inputPortName)) {
            return getControladorSeleccionarEstEdiCursoPublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorSeleccionarEstEdiCursoPublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorSeleccionarEstEdiCursoPublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorSeleccionarEstEdiCursoPublishPort".equals(portName)) {
            setControladorSeleccionarEstEdiCursoPublishPortEndpointAddress(address);
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
