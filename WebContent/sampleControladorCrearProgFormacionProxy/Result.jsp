<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorCrearProgFormacionProxyid" scope="session" class="publicadores.ControladorCrearProgFormacionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorCrearProgFormacionProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleControladorCrearProgFormacionProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleControladorCrearProgFormacionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorCrearProgFormacion getControladorCrearProgFormacion10mtemp = sampleControladorCrearProgFormacionProxyid.getControladorCrearProgFormacion();
if(getControladorCrearProgFormacion10mtemp == null){
%>
<%=getControladorCrearProgFormacion10mtemp %>
<%
}else{
        if(getControladorCrearProgFormacion10mtemp!= null){
        String tempreturnp11 = getControladorCrearProgFormacion10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg016");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        boolean ingresarNombreProgFor13mtemp = sampleControladorCrearProgFormacionProxyid.ingresarNombreProgFor(arg0_1idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarNombreProgFor13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 18:
        gotMethod = true;
        String fechaI_3id=  request.getParameter("fechaI23");
            java.util.Calendar fechaI_3idTemp = null;
        if(!fechaI_3id.equals("")){
        java.text.DateFormat dateFormatfechaI23 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaI23  = dateFormatfechaI23.parse(fechaI_3id);
         fechaI_3idTemp = new java.util.GregorianCalendar();
        fechaI_3idTemp.setTime(dateTempfechaI23);
        }
        String descripcion_4id=  request.getParameter("descripcion25");
            java.lang.String descripcion_4idTemp = null;
        if(!descripcion_4id.equals("")){
         descripcion_4idTemp  = descripcion_4id;
        }
        String fechaF_5id=  request.getParameter("fechaF27");
            java.util.Calendar fechaF_5idTemp = null;
        if(!fechaF_5id.equals("")){
        java.text.DateFormat dateFormatfechaF27 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaF27  = dateFormatfechaF27.parse(fechaF_5id);
         fechaF_5idTemp = new java.util.GregorianCalendar();
        fechaF_5idTemp.setTime(dateTempfechaF27);
        }
        String fechaAlta_6id=  request.getParameter("fechaAlta29");
            java.util.Calendar fechaAlta_6idTemp = null;
        if(!fechaAlta_6id.equals("")){
        java.text.DateFormat dateFormatfechaAlta29 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaAlta29  = dateFormatfechaAlta29.parse(fechaAlta_6id);
         fechaAlta_6idTemp = new java.util.GregorianCalendar();
        fechaAlta_6idTemp.setTime(dateTempfechaAlta29);
        }
        %>
        <jsp:useBean id="publicadores1DtProgFormacion_2id" scope="session" class="publicadores.DtProgFormacion" />
        <%
        publicadores1DtProgFormacion_2id.setFechaI(fechaI_3idTemp);
        publicadores1DtProgFormacion_2id.setDescripcion(descripcion_4idTemp);
        publicadores1DtProgFormacion_2id.setFechaF(fechaF_5idTemp);
        publicadores1DtProgFormacion_2id.setFechaAlta(fechaAlta_6idTemp);
        sampleControladorCrearProgFormacionProxyid.ingresarDatos(publicadores1DtProgFormacion_2id);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>