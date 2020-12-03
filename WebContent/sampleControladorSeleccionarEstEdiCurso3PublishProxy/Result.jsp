<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorSeleccionarEstEdiCurso3PublishProxyid" scope="session" class="publicadores.ControladorSeleccionarEstEdiCurso3PublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorSeleccionarEstEdiCurso3PublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorSeleccionarEstEdiCurso3PublishProxyid.getEndpoint();
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
        sampleControladorSeleccionarEstEdiCurso3PublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorSeleccionarEstEdiCurso3Publish getControladorSeleccionarEstEdiCurso3Publish10mtemp = sampleControladorSeleccionarEstEdiCurso3PublishProxyid.getControladorSeleccionarEstEdiCurso3Publish();
if(getControladorSeleccionarEstEdiCurso3Publish10mtemp == null){
%>
<%=getControladorSeleccionarEstEdiCurso3Publish10mtemp %>
<%
}else{
        if(getControladorSeleccionarEstEdiCurso3Publish10mtemp!= null){
        String tempreturnp11 = getControladorSeleccionarEstEdiCurso3Publish10mtemp.toString();
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
        sampleControladorSeleccionarEstEdiCurso3PublishProxyid.ingresarEdicion(arg0_1idTemp);
break;
case 18:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg021");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorSeleccionarEstEdiCurso3PublishProxyid.ingresarCurso(arg0_2idTemp);
break;
case 23:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg026");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        sampleControladorSeleccionarEstEdiCurso3PublishProxyid.ingresarInstituto(arg0_3idTemp);
break;
case 28:
        gotMethod = true;
        publicadores.DtEstudiante[] listarEstudiantesInscriptos28mtemp = sampleControladorSeleccionarEstEdiCurso3PublishProxyid.listarEstudiantesInscriptos();
if(listarEstudiantesInscriptos28mtemp == null){
%>
<%=listarEstudiantesInscriptos28mtemp %>
<%
}else{
        String tempreturnp29 = null;
        if(listarEstudiantesInscriptos28mtemp != null){
        java.util.List listreturnp29= java.util.Arrays.asList(listarEstudiantesInscriptos28mtemp);
        tempreturnp29 = listreturnp29.toString();
        }
        %>
        <%=tempreturnp29%>
        <%
}
break;
case 31:
        gotMethod = true;
        java.lang.String[] listarEstudiantes31mtemp = sampleControladorSeleccionarEstEdiCurso3PublishProxyid.listarEstudiantes();
if(listarEstudiantes31mtemp == null){
%>
<%=listarEstudiantes31mtemp %>
<%
}else{
        String tempreturnp32 = null;
        if(listarEstudiantes31mtemp != null){
        java.util.List listreturnp32= java.util.Arrays.asList(listarEstudiantes31mtemp);
        tempreturnp32 = listreturnp32.toString();
        }
        %>
        <%=tempreturnp32%>
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