/**
 * DtCursoDetalle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtCursoDetalle  extends publicadores.DtCursoBase  implements java.io.Serializable {
    private java.lang.String duracion;

    private publicadores.Time cantHoras;

    private int creditos;

    private java.util.Calendar fechaR;

    private java.lang.String url;

    public DtCursoDetalle() {
    }

    public DtCursoDetalle(
           java.lang.String nombre,
           java.lang.String descripcion,
           java.lang.String duracion,
           publicadores.Time cantHoras,
           int creditos,
           java.util.Calendar fechaR,
           java.lang.String url) {
        super(
            nombre,
            descripcion);
        this.duracion = duracion;
        this.cantHoras = cantHoras;
        this.creditos = creditos;
        this.fechaR = fechaR;
        this.url = url;
    }


    /**
     * Gets the duracion value for this DtCursoDetalle.
     * 
     * @return duracion
     */
    public java.lang.String getDuracion() {
        return duracion;
    }


    /**
     * Sets the duracion value for this DtCursoDetalle.
     * 
     * @param duracion
     */
    public void setDuracion(java.lang.String duracion) {
        this.duracion = duracion;
    }


    /**
     * Gets the cantHoras value for this DtCursoDetalle.
     * 
     * @return cantHoras
     */
    public publicadores.Time getCantHoras() {
        return cantHoras;
    }


    /**
     * Sets the cantHoras value for this DtCursoDetalle.
     * 
     * @param cantHoras
     */
    public void setCantHoras(publicadores.Time cantHoras) {
        this.cantHoras = cantHoras;
    }


    /**
     * Gets the creditos value for this DtCursoDetalle.
     * 
     * @return creditos
     */
    public int getCreditos() {
        return creditos;
    }


    /**
     * Sets the creditos value for this DtCursoDetalle.
     * 
     * @param creditos
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    /**
     * Gets the fechaR value for this DtCursoDetalle.
     * 
     * @return fechaR
     */
    public java.util.Calendar getFechaR() {
        return fechaR;
    }


    /**
     * Sets the fechaR value for this DtCursoDetalle.
     * 
     * @param fechaR
     */
    public void setFechaR(java.util.Calendar fechaR) {
        this.fechaR = fechaR;
    }


    /**
     * Gets the url value for this DtCursoDetalle.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DtCursoDetalle.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtCursoDetalle)) return false;
        DtCursoDetalle other = (DtCursoDetalle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.duracion==null && other.getDuracion()==null) || 
             (this.duracion!=null &&
              this.duracion.equals(other.getDuracion()))) &&
            ((this.cantHoras==null && other.getCantHoras()==null) || 
             (this.cantHoras!=null &&
              this.cantHoras.equals(other.getCantHoras()))) &&
            this.creditos == other.getCreditos() &&
            ((this.fechaR==null && other.getFechaR()==null) || 
             (this.fechaR!=null &&
              this.fechaR.equals(other.getFechaR()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDuracion() != null) {
            _hashCode += getDuracion().hashCode();
        }
        if (getCantHoras() != null) {
            _hashCode += getCantHoras().hashCode();
        }
        _hashCode += getCreditos();
        if (getFechaR() != null) {
            _hashCode += getFechaR().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtCursoDetalle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtCursoDetalle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duracion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantHoras");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantHoras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
