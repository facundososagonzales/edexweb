/**
 * DtCursoDetalle1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtCursoDetalle1  extends publicadores.DtCursoBase  implements java.io.Serializable {
    private java.lang.String duracion;

    private publicadores.Time cantHoras;

    private int creditos;

    private java.util.Calendar fechaR;

    private java.lang.String url;

    private java.lang.String[] previas;

    private publicadores.DtEdicionBasico[] ediciones;

    private java.lang.String[] categorias;

    public DtCursoDetalle1() {
    }

    public DtCursoDetalle1(
           java.lang.String nombre,
           java.lang.String descripcion,
           java.lang.String duracion,
           publicadores.Time cantHoras,
           int creditos,
           java.util.Calendar fechaR,
           java.lang.String url,
           java.lang.String[] previas,
           publicadores.DtEdicionBasico[] ediciones,
           java.lang.String[] categorias) {
        super(
            nombre,
            descripcion);
        this.duracion = duracion;
        this.cantHoras = cantHoras;
        this.creditos = creditos;
        this.fechaR = fechaR;
        this.url = url;
        this.previas = previas;
        this.ediciones = ediciones;
        this.categorias = categorias;
    }


    /**
     * Gets the duracion value for this DtCursoDetalle1.
     * 
     * @return duracion
     */
    public java.lang.String getDuracion() {
        return duracion;
    }


    /**
     * Sets the duracion value for this DtCursoDetalle1.
     * 
     * @param duracion
     */
    public void setDuracion(java.lang.String duracion) {
        this.duracion = duracion;
    }


    /**
     * Gets the cantHoras value for this DtCursoDetalle1.
     * 
     * @return cantHoras
     */
    public publicadores.Time getCantHoras() {
        return cantHoras;
    }


    /**
     * Sets the cantHoras value for this DtCursoDetalle1.
     * 
     * @param cantHoras
     */
    public void setCantHoras(publicadores.Time cantHoras) {
        this.cantHoras = cantHoras;
    }


    /**
     * Gets the creditos value for this DtCursoDetalle1.
     * 
     * @return creditos
     */
    public int getCreditos() {
        return creditos;
    }


    /**
     * Sets the creditos value for this DtCursoDetalle1.
     * 
     * @param creditos
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    /**
     * Gets the fechaR value for this DtCursoDetalle1.
     * 
     * @return fechaR
     */
    public java.util.Calendar getFechaR() {
        return fechaR;
    }


    /**
     * Sets the fechaR value for this DtCursoDetalle1.
     * 
     * @param fechaR
     */
    public void setFechaR(java.util.Calendar fechaR) {
        this.fechaR = fechaR;
    }


    /**
     * Gets the url value for this DtCursoDetalle1.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DtCursoDetalle1.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the previas value for this DtCursoDetalle1.
     * 
     * @return previas
     */
    public java.lang.String[] getPrevias() {
        return previas;
    }


    /**
     * Sets the previas value for this DtCursoDetalle1.
     * 
     * @param previas
     */
    public void setPrevias(java.lang.String[] previas) {
        this.previas = previas;
    }

    public java.lang.String getPrevias(int i) {
        return this.previas[i];
    }

    public void setPrevias(int i, java.lang.String _value) {
        this.previas[i] = _value;
    }


    /**
     * Gets the ediciones value for this DtCursoDetalle1.
     * 
     * @return ediciones
     */
    public publicadores.DtEdicionBasico[] getEdiciones() {
        return ediciones;
    }


    /**
     * Sets the ediciones value for this DtCursoDetalle1.
     * 
     * @param ediciones
     */
    public void setEdiciones(publicadores.DtEdicionBasico[] ediciones) {
        this.ediciones = ediciones;
    }

    public publicadores.DtEdicionBasico getEdiciones(int i) {
        return this.ediciones[i];
    }

    public void setEdiciones(int i, publicadores.DtEdicionBasico _value) {
        this.ediciones[i] = _value;
    }


    /**
     * Gets the categorias value for this DtCursoDetalle1.
     * 
     * @return categorias
     */
    public java.lang.String[] getCategorias() {
        return categorias;
    }


    /**
     * Sets the categorias value for this DtCursoDetalle1.
     * 
     * @param categorias
     */
    public void setCategorias(java.lang.String[] categorias) {
        this.categorias = categorias;
    }

    public java.lang.String getCategorias(int i) {
        return this.categorias[i];
    }

    public void setCategorias(int i, java.lang.String _value) {
        this.categorias[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtCursoDetalle1)) return false;
        DtCursoDetalle1 other = (DtCursoDetalle1) obj;
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
              this.url.equals(other.getUrl()))) &&
            ((this.previas==null && other.getPrevias()==null) || 
             (this.previas!=null &&
              java.util.Arrays.equals(this.previas, other.getPrevias()))) &&
            ((this.ediciones==null && other.getEdiciones()==null) || 
             (this.ediciones!=null &&
              java.util.Arrays.equals(this.ediciones, other.getEdiciones()))) &&
            ((this.categorias==null && other.getCategorias()==null) || 
             (this.categorias!=null &&
              java.util.Arrays.equals(this.categorias, other.getCategorias())));
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
        if (getPrevias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdiciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEdiciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEdiciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategorias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategorias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategorias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtCursoDetalle1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtCursoDetalle1"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "previas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ediciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ediciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtEdicionBasico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categorias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categorias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
