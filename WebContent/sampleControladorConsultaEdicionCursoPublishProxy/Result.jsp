<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaEdicionCursoPublishProxyid" scope="session" class="publicadores.ControladorConsultaEdicionCursoPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaEdicionCursoPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaEdicionCursoPublishProxyid.getEndpoint();
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
        sampleControladorConsultaEdicionCursoPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaEdicionCursoPublish getControladorConsultaEdicionCursoPublish10mtemp = sampleControladorConsultaEdicionCursoPublishProxyid.getControladorConsultaEdicionCursoPublish();
if(getControladorConsultaEdicionCursoPublish10mtemp == null){
%>
<%=getControladorConsultaEdicionCursoPublish10mtemp %>
<%
}else{
        if(getControladorConsultaEdicionCursoPublish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaEdicionCursoPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String[] listarInstituto13mtemp = sampleControladorConsultaEdicionCursoPublishProxyid.listarInstituto();
if(listarInstituto13mtemp == null){
%>
<%=listarInstituto13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarInstituto13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarInstituto13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        java.lang.String[] listarCategoria16mtemp = sampleControladorConsultaEdicionCursoPublishProxyid.listarCategoria();
if(listarCategoria16mtemp == null){
%>
<%=listarCategoria16mtemp %>
<%
}else{
        String tempreturnp17 = null;
        if(listarCategoria16mtemp != null){
        java.util.List listreturnp17= java.util.Arrays.asList(listarCategoria16mtemp);
        tempreturnp17 = listreturnp17.toString();
        }
        %>
        <%=tempreturnp17%>
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