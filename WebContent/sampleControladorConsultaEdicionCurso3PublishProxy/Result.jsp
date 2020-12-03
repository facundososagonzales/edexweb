<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaEdicionCurso3PublishProxyid" scope="session" class="publicadores.ControladorConsultaEdicionCurso3PublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaEdicionCurso3PublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaEdicionCurso3PublishProxyid.getEndpoint();
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
        sampleControladorConsultaEdicionCurso3PublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaEdicionCurso3Publish getControladorConsultaEdicionCurso3Publish10mtemp = sampleControladorConsultaEdicionCurso3PublishProxyid.getControladorConsultaEdicionCurso3Publish();
if(getControladorConsultaEdicionCurso3Publish10mtemp == null){
%>
<%=getControladorConsultaEdicionCurso3Publish10mtemp %>
<%
}else{
        if(getControladorConsultaEdicionCurso3Publish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaEdicionCurso3Publish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        publicadores.DtEdicionDetalle seleccionarEdicion13mtemp = sampleControladorConsultaEdicionCurso3PublishProxyid.seleccionarEdicion();
if(seleccionarEdicion13mtemp == null){
%>
<%=seleccionarEdicion13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaPub:</TD>
<TD>
<%
if(seleccionarEdicion13mtemp != null){
java.util.Calendar typefechaPub16 = seleccionarEdicion13mtemp.getFechaPub();
        java.text.DateFormat dateFormatfechaPub16 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaPub16 = typefechaPub16.getTime();
        String tempResultfechaPub16 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaPub16.format(datefechaPub16));
        %>
        <%= tempResultfechaPub16 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 18:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg021");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        sampleControladorConsultaEdicionCurso3PublishProxyid.ingresarEdicion(arg0_1idTemp);
break;
case 23:
        gotMethod = true;
        java.lang.String[] listarDocentes23mtemp = sampleControladorConsultaEdicionCurso3PublishProxyid.listarDocentes();
if(listarDocentes23mtemp == null){
%>
<%=listarDocentes23mtemp %>
<%
}else{
        String tempreturnp24 = null;
        if(listarDocentes23mtemp != null){
        java.util.List listreturnp24= java.util.Arrays.asList(listarDocentes23mtemp);
        tempreturnp24 = listreturnp24.toString();
        }
        %>
        <%=tempreturnp24%>
        <%
}
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