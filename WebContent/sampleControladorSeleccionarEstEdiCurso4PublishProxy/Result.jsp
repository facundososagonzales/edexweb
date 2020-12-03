<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorSeleccionarEstEdiCurso4PublishProxyid" scope="session" class="publicadores.ControladorSeleccionarEstEdiCurso4PublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorSeleccionarEstEdiCurso4PublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorSeleccionarEstEdiCurso4PublishProxyid.getEndpoint();
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
        sampleControladorSeleccionarEstEdiCurso4PublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorSeleccionarEstEdiCurso4Publish getControladorSeleccionarEstEdiCurso4Publish10mtemp = sampleControladorSeleccionarEstEdiCurso4PublishProxyid.getControladorSeleccionarEstEdiCurso4Publish();
if(getControladorSeleccionarEstEdiCurso4Publish10mtemp == null){
%>
<%=getControladorSeleccionarEstEdiCurso4Publish10mtemp %>
<%
}else{
        if(getControladorSeleccionarEstEdiCurso4Publish10mtemp!= null){
        String tempreturnp11 = getControladorSeleccionarEstEdiCurso4Publish10mtemp.toString();
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
        sampleControladorSeleccionarEstEdiCurso4PublishProxyid.ingresarEdicion(arg0_1idTemp);
break;
case 18:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg021");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorSeleccionarEstEdiCurso4PublishProxyid.ingresarCurso(arg0_2idTemp);
break;
case 23:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg026");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        sampleControladorSeleccionarEstEdiCurso4PublishProxyid.ingresarInstituto(arg0_3idTemp);
break;
case 28:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg031");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        sampleControladorSeleccionarEstEdiCurso4PublishProxyid.seleccionarEstadoEstudiante(arg0_4idTemp);
break;
case 33:
        gotMethod = true;
        publicadores.DtEstudiante[] listarEstudiantesInscriptos33mtemp = sampleControladorSeleccionarEstEdiCurso4PublishProxyid.listarEstudiantesInscriptos();
if(listarEstudiantesInscriptos33mtemp == null){
%>
<%=listarEstudiantesInscriptos33mtemp %>
<%
}else{
        String tempreturnp34 = null;
        if(listarEstudiantesInscriptos33mtemp != null){
        java.util.List listreturnp34= java.util.Arrays.asList(listarEstudiantesInscriptos33mtemp);
        tempreturnp34 = listreturnp34.toString();
        }
        %>
        <%=tempreturnp34%>
        <%
}
break;
case 36:
        gotMethod = true;
        String arg0_5id=  request.getParameter("arg039");
            java.lang.String arg0_5idTemp = null;
        if(!arg0_5id.equals("")){
         arg0_5idTemp  = arg0_5id;
        }
        sampleControladorSeleccionarEstEdiCurso4PublishProxyid.ingresarEstudiante(arg0_5idTemp);
break;
case 41:
        gotMethod = true;
        java.lang.String[] listarEstudiantes41mtemp = sampleControladorSeleccionarEstEdiCurso4PublishProxyid.listarEstudiantes();
if(listarEstudiantes41mtemp == null){
%>
<%=listarEstudiantes41mtemp %>
<%
}else{
        String tempreturnp42 = null;
        if(listarEstudiantes41mtemp != null){
        java.util.List listreturnp42= java.util.Arrays.asList(listarEstudiantes41mtemp);
        tempreturnp42 = listreturnp42.toString();
        }
        %>
        <%=tempreturnp42%>
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