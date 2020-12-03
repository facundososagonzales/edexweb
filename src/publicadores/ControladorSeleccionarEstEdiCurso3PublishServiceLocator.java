/**
 * ControladorSeleccionarEstEdiCurso3PublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class ControladorSeleccionarEstEdiCurso3PublishServiceLocator extends org.apache.axis.client.Service implements publicadores.ControladorSeleccionarEstEdiCurso3PublishService {

    public ControladorSeleccionarEstEdiCurso3PublishServiceLocator() {
    }


    public ControladorSeleccionarEstEdiCurso3PublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ControladorSeleccionarEstEdiCurso3PublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ControladorSeleccionarEstEdiCurso3PublishPort
    private java.lang.String ControladorSeleccionarEstEdiCurso3PublishPort_address = "http://127.0.0.1:1942/ControladorSeleccionarEstEdiCurso3Publish";

    public java.lang.String getControladorSeleccionarEstEdiCurso3PublishPortAddress() {
        return ControladorSeleccionarEstEdiCurso3PublishPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ControladorSeleccionarEstEdiCurso3PublishPortWSDDServiceName = "ControladorSeleccionarEstEdiCurso3PublishPort";

    public java.lang.String getControladorSeleccionarEstEdiCurso3PublishPortWSDDServiceName() {
        return ControladorSeleccionarEstEdiCurso3PublishPortWSDDServiceName;
    }

    public void setControladorSeleccionarEstEdiCurso3PublishPortWSDDServiceName(java.lang.String name) {
        ControladorSeleccionarEstEdiCurso3PublishPortWSDDServiceName = name;
    }

    public publicadores.ControladorSeleccionarEstEdiCurso3Publish getControladorSeleccionarEstEdiCurso3PublishPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ControladorSeleccionarEstEdiCurso3PublishPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getControladorSeleccionarEstEdiCurso3PublishPort(endpoint);
    }

    public publicadores.ControladorSeleccionarEstEdiCurso3Publish getControladorSeleccionarEstEdiCurso3PublishPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            publicadores.ControladorSeleccionarEstEdiCurso3PublishPortBindingStub _stub = new publicadores.ControladorSeleccionarEstEdiCurso3PublishPortBindingStub(portAddress, this);
            _stub.setPortName(getControladorSeleccionarEstEdiCurso3PublishPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setControladorSeleccionarEstEdiCurso3PublishPortEndpointAddress(java.lang.String address) {
        ControladorSeleccionarEstEdiCurso3PublishPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (publicadores.ControladorSeleccionarEstEdiCurso3Publish.class.isAssignableFrom(serviceEndpointInterface)) {
                publicadores.ControladorSeleccionarEstEdiCurso3PublishPortBindingStub _stub = new publicadores.ControladorSeleccionarEstEdiCurso3PublishPortBindingStub(new java.net.URL(ControladorSeleccionarEstEdiCurso3PublishPort_address), this);
                _stub.setPortName(getControladorSeleccionarEstEdiCurso3PublishPortWSDDServiceName());
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
        if ("ControladorSeleccionarEstEdiCurso3PublishPort".equals(inputPortName)) {
            return getControladorSeleccionarEstEdiCurso3PublishPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://publicadores/", "ControladorSeleccionarEstEdiCurso3PublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://publicadores/", "ControladorSeleccionarEstEdiCurso3PublishPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ControladorSeleccionarEstEdiCurso3PublishPort".equals(portName)) {
            setControladorSeleccionarEstEdiCurso3PublishPortEndpointAddress(address);
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
