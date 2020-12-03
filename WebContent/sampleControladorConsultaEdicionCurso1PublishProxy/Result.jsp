<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaEdicionCurso1PublishProxyid" scope="session" class="publicadores.ControladorConsultaEdicionCurso1PublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaEdicionCurso1PublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaEdicionCurso1PublishProxyid.getEndpoint();
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
        sampleControladorConsultaEdicionCurso1PublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaEdicionCurso1Publish getControladorConsultaEdicionCurso1Publish10mtemp = sampleControladorConsultaEdicionCurso1PublishProxyid.getControladorConsultaEdicionCurso1Publish();
if(getControladorConsultaEdicionCurso1Publish10mtemp == null){
%>
<%=getControladorConsultaEdicionCurso1Publish10mtemp %>
<%
}else{
        if(getControladorConsultaEdicionCurso1Publish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaEdicionCurso1Publish10mtemp.toString();
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
        sampleControladorConsultaEdicionCurso1PublishProxyid.ingresarInstituto(arg0_1idTemp);
break;
case 18:
        gotMethod = true;
        java.lang.String[] listarCurso18mtemp = sampleControladorConsultaEdicionCurso1PublishProxyid.listarCurso();
if(listarCurso18mtemp == null){
%>
<%=listarCurso18mtemp %>
<%
}else{
        String tempreturnp19 = null;
        if(listarCurso18mtemp != null){
        java.util.List listreturnp19= java.util.Arrays.asList(listarCurso18mtemp);
        tempreturnp19 = listreturnp19.toString();
        }
        %>
        <%=tempreturnp19%>
        <%
}
break;
case 21:
        gotMethod = true;
        java.lang.String[] listarCursoPorCategoria21mtemp = sampleControladorConsultaEdicionCurso1PublishProxyid.listarCursoPorCategoria();
if(listarCursoPorCategoria21mtemp == null){
%>
<%=listarCursoPorCategoria21mtemp %>
<%
}else{
        String tempreturnp22 = null;
        if(listarCursoPorCategoria21mtemp != null){
        java.util.List listreturnp22= java.util.Arrays.asList(listarCursoPorCategoria21mtemp);
        tempreturnp22 = listreturnp22.toString();
        }
        %>
        <%=tempreturnp22%>
        <%
}
break;
case 24:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg027");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorConsultaEdicionCurso1PublishProxyid.ingresarCategoria(arg0_2idTemp);
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