<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorAgregarCursoAProgFormacionProxyid" scope="session" class="publicadores.ControladorAgregarCursoAProgFormacionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorAgregarCursoAProgFormacionProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorAgregarCursoAProgFormacionProxyid.getEndpoint();
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
        sampleControladorAgregarCursoAProgFormacionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorAgregarCursoAProgFormacion getControladorAgregarCursoAProgFormacion10mtemp = sampleControladorAgregarCursoAProgFormacionProxyid.getControladorAgregarCursoAProgFormacion();
if(getControladorAgregarCursoAProgFormacion10mtemp == null){
%>
<%=getControladorAgregarCursoAProgFormacion10mtemp %>
<%
}else{
        if(getControladorAgregarCursoAProgFormacion10mtemp!= null){
        String tempreturnp11 = getControladorAgregarCursoAProgFormacion10mtemp.toString();
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
        sampleControladorAgregarCursoAProgFormacionProxyid.seleccionarCurso(arg0_1idTemp);
break;
case 18:
        gotMethod = true;
        sampleControladorAgregarCursoAProgFormacionProxyid.confirmar();
break;
case 21:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg024");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        java.lang.String[] seleccionarProgsFormacion221mtemp = sampleControladorAgregarCursoAProgFormacionProxyid.seleccionarProgsFormacion2(arg0_2idTemp);
if(seleccionarProgsFormacion221mtemp == null){
%>
<%=seleccionarProgsFormacion221mtemp %>
<%
}else{
        String tempreturnp22 = null;
        if(seleccionarProgsFormacion221mtemp != null){
        java.util.List listreturnp22= java.util.Arrays.asList(seleccionarProgsFormacion221mtemp);
        tempreturnp22 = listreturnp22.toString();
        }
        %>
        <%=tempreturnp22%>
        <%
}
break;
case 26:
        gotMethod = true;
        java.lang.String[] listarProgsFormacion226mtemp = sampleControladorAgregarCursoAProgFormacionProxyid.listarProgsFormacion2();
if(listarProgsFormacion226mtemp == null){
%>
<%=listarProgsFormacion226mtemp %>
<%
}else{
        String tempreturnp27 = null;
        if(listarProgsFormacion226mtemp != null){
        java.util.List listreturnp27= java.util.Arrays.asList(listarProgsFormacion226mtemp);
        tempreturnp27 = listreturnp27.toString();
        }
        %>
        <%=tempreturnp27%>
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