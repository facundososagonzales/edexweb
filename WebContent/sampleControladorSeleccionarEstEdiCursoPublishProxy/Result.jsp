<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorSeleccionarEstEdiCursoPublishProxyid" scope="session" class="publicadores.ControladorSeleccionarEstEdiCursoPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorSeleccionarEstEdiCursoPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorSeleccionarEstEdiCursoPublishProxyid.getEndpoint();
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
        sampleControladorSeleccionarEstEdiCursoPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorSeleccionarEstEdiCursoPublish getControladorSeleccionarEstEdiCursoPublish10mtemp = sampleControladorSeleccionarEstEdiCursoPublishProxyid.getControladorSeleccionarEstEdiCursoPublish();
if(getControladorSeleccionarEstEdiCursoPublish10mtemp == null){
%>
<%=getControladorSeleccionarEstEdiCursoPublish10mtemp %>
<%
}else{
        if(getControladorSeleccionarEstEdiCursoPublish10mtemp!= null){
        String tempreturnp11 = getControladorSeleccionarEstEdiCursoPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String[] listarInstitutos13mtemp = sampleControladorSeleccionarEstEdiCursoPublishProxyid.listarInstitutos();
if(listarInstitutos13mtemp == null){
%>
<%=listarInstitutos13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarInstitutos13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarInstitutos13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        java.lang.String[] listarCursos16mtemp = sampleControladorSeleccionarEstEdiCursoPublishProxyid.listarCursos();
if(listarCursos16mtemp == null){
%>
<%=listarCursos16mtemp %>
<%
}else{
        String tempreturnp17 = null;
        if(listarCursos16mtemp != null){
        java.util.List listreturnp17= java.util.Arrays.asList(listarCursos16mtemp);
        tempreturnp17 = listreturnp17.toString();
        }
        %>
        <%=tempreturnp17%>
        <%
}
break;
case 19:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg022");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        sampleControladorSeleccionarEstEdiCursoPublishProxyid.ingresarInstituto(arg0_1idTemp);
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