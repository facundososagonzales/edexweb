<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorSeleccionarEstEdiCurso1PublishProxyid" scope="session" class="publicadores.ControladorSeleccionarEstEdiCurso1PublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorSeleccionarEstEdiCurso1PublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorSeleccionarEstEdiCurso1PublishProxyid.getEndpoint();
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
        sampleControladorSeleccionarEstEdiCurso1PublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorSeleccionarEstEdiCurso1Publish getControladorSeleccionarEstEdiCurso1Publish10mtemp = sampleControladorSeleccionarEstEdiCurso1PublishProxyid.getControladorSeleccionarEstEdiCurso1Publish();
if(getControladorSeleccionarEstEdiCurso1Publish10mtemp == null){
%>
<%=getControladorSeleccionarEstEdiCurso1Publish10mtemp %>
<%
}else{
        if(getControladorSeleccionarEstEdiCurso1Publish10mtemp!= null){
        String tempreturnp11 = getControladorSeleccionarEstEdiCurso1Publish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String[] listarEdicion13mtemp = sampleControladorSeleccionarEstEdiCurso1PublishProxyid.listarEdicion();
if(listarEdicion13mtemp == null){
%>
<%=listarEdicion13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarEdicion13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarEdicion13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg019");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        sampleControladorSeleccionarEstEdiCurso1PublishProxyid.ingresarCurso(arg0_1idTemp);
break;
case 21:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg024");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorSeleccionarEstEdiCurso1PublishProxyid.ingresarInstituto(arg0_2idTemp);
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