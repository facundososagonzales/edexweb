/**
 * DtProgCurso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtProgCurso  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.lang.String descripcion;

    private java.util.Calendar fechaI;

    private java.util.Calendar fechaF;

    private publicadores.DtCursoBase[] dtCursos;

    public DtProgCurso() {
    }

    public DtProgCurso(
           java.lang.String nombre,
           java.lang.String descripcion,
           java.util.Calendar fechaI,
           java.util.Calendar fechaF,
           publicadores.DtCursoBase[] dtCursos) {
           this.nombre = nombre;
           this.descripcion = descripcion;
           this.fechaI = fechaI;
           this.fechaF = fechaF;
           this.dtCursos = dtCursos;
    }


    /**
     * Gets the nombre value for this DtProgCurso.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtProgCurso.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the descripcion value for this DtProgCurso.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this DtProgCurso.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the fechaI value for this DtProgCurso.
     * 
     * @return fechaI
     */
    public java.util.Calendar getFechaI() {
        return fechaI;
    }


    /**
     * Sets the fechaI value for this DtProgCurso.
     * 
     * @param fechaI
     */
    public void setFechaI(java.util.Calendar fechaI) {
        this.fechaI = fechaI;
    }


    /**
     * Gets the fechaF value for this DtProgCurso.
     * 
     * @return fechaF
     */
    public java.util.Calendar getFechaF() {
        return fechaF;
    }


    /**
     * Sets the fechaF value for this DtProgCurso.
     * 
     * @param fechaF
     */
    public void setFechaF(java.util.Calendar fechaF) {
        this.fechaF = fechaF;
    }


    /**
     * Gets the dtCursos value for this DtProgCurso.
     * 
     * @return dtCursos
     */
    public publicadores.DtCursoBase[] getDtCursos() {
        return dtCursos;
    }


    /**
     * Sets the dtCursos value for this DtProgCurso.
     * 
     * @param dtCursos
     */
    public void setDtCursos(publicadores.DtCursoBase[] dtCursos) {
        this.dtCursos = dtCursos;
    }

    public publicadores.DtCursoBase getDtCursos(int i) {
        return this.dtCursos[i];
    }

    public void setDtCursos(int i, publicadores.DtCursoBase _value) {
        this.dtCursos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtProgCurso)) return false;
        DtProgCurso other = (DtProgCurso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.fechaI==null && other.getFechaI()==null) || 
             (this.fechaI!=null &&
              this.fechaI.equals(other.getFechaI()))) &&
            ((this.fechaF==null && other.getFechaF()==null) || 
             (this.fechaF!=null &&
              this.fechaF.equals(other.getFechaF()))) &&
            ((this.dtCursos==null && other.getDtCursos()==null) || 
             (this.dtCursos!=null &&
              java.util.Arrays.equals(this.dtCursos, other.getDtCursos())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getFechaI() != null) {
            _hashCode += getFechaI().hashCode();
        }
        if (getFechaF() != null) {
            _hashCode += getFechaF().hashCode();
        }
        if (getDtCursos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDtCursos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDtCursos(), i);
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
        new org.apache.axis.description.TypeDesc(DtProgCurso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtProgCurso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtCursos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtCursos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtCursoBase"));
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
