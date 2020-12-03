<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaEdicionCurso2PublishProxyid" scope="session" class="publicadores.ControladorConsultaEdicionCurso2PublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaEdicionCurso2PublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaEdicionCurso2PublishProxyid.getEndpoint();
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
        sampleControladorConsultaEdicionCurso2PublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaEdicionCurso2Publish getControladorConsultaEdicionCurso2Publish10mtemp = sampleControladorConsultaEdicionCurso2PublishProxyid.getControladorConsultaEdicionCurso2Publish();
if(getControladorConsultaEdicionCurso2Publish10mtemp == null){
%>
<%=getControladorConsultaEdicionCurso2Publish10mtemp %>
<%
}else{
        if(getControladorConsultaEdicionCurso2Publish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaEdicionCurso2Publish10mtemp.toString();
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
        sampleControladorConsultaEdicionCurso2PublishProxyid.ingresarInstituto(arg0_1idTemp);
break;
case 18:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg021");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorConsultaEdicionCurso2PublishProxyid.ingresarCurso(arg0_2idTemp);
break;
case 23:
        gotMethod = true;
        java.lang.String[] listarEdicion23mtemp = sampleControladorConsultaEdicionCurso2PublishProxyid.listarEdicion();
if(listarEdicion23mtemp == null){
%>
<%=listarEdicion23mtemp %>
<%
}else{
        String tempreturnp24 = null;
        if(listarEdicion23mtemp != null){
        java.util.List listreturnp24= java.util.Arrays.asList(listarEdicion23mtemp);
        tempreturnp24 = listreturnp24.toString();
        }
        %>
        <%=tempreturnp24%>
        <%
}
break;
case 26:
        gotMethod = true;
        java.lang.String[] listarEdicionCat26mtemp = sampleControladorConsultaEdicionCurso2PublishProxyid.listarEdicionCat();
if(listarEdicionCat26mtemp == null){
%>
<%=listarEdicionCat26mtemp %>
<%
}else{
        String tempreturnp27 = null;
        if(listarEdicionCat26mtemp != null){
        java.util.List listreturnp27= java.util.Arrays.asList(listarEdicionCat26mtemp);
        tempreturnp27 = listreturnp27.toString();
        }
        %>
        <%=tempreturnp27%>
        <%
}
break;
case 29:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg032");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        sampleControladorConsultaEdicionCurso2PublishProxyid.ingresarCategoria(arg0_3idTemp);
break;
case 34:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg037");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        sampleControladorConsultaEdicionCurso2PublishProxyid.ingresarCursoPorCat(arg0_4idTemp);
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