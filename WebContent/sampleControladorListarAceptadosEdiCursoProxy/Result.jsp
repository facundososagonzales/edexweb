<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorListarAceptadosEdiCursoProxyid" scope="session" class="publicadores.ControladorListarAceptadosEdiCursoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorListarAceptadosEdiCursoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorListarAceptadosEdiCursoProxyid.getEndpoint();
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
        sampleControladorListarAceptadosEdiCursoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorListarAceptadosEdiCurso getControladorListarAceptadosEdiCurso10mtemp = sampleControladorListarAceptadosEdiCursoProxyid.getControladorListarAceptadosEdiCurso();
if(getControladorListarAceptadosEdiCurso10mtemp == null){
%>
<%=getControladorListarAceptadosEdiCurso10mtemp %>
<%
}else{
        if(getControladorListarAceptadosEdiCurso10mtemp!= null){
        String tempreturnp11 = getControladorListarAceptadosEdiCurso10mtemp.toString();
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
        sampleControladorListarAceptadosEdiCursoProxyid.ingresarInstituto(arg0_1idTemp);
break;
case 18:
        gotMethod = true;
        java.lang.String[] listarEdicion18mtemp = sampleControladorListarAceptadosEdiCursoProxyid.listarEdicion();
if(listarEdicion18mtemp == null){
%>
<%=listarEdicion18mtemp %>
<%
}else{
        String tempreturnp19 = null;
        if(listarEdicion18mtemp != null){
        java.util.List listreturnp19= java.util.Arrays.asList(listarEdicion18mtemp);
        tempreturnp19 = listreturnp19.toString();
        }
        %>
        <%=tempreturnp19%>
        <%
}
break;
case 21:
        gotMethod = true;
        java.lang.String[] listarInstitutos21mtemp = sampleControladorListarAceptadosEdiCursoProxyid.listarInstitutos();
if(listarInstitutos21mtemp == null){
%>
<%=listarInstitutos21mtemp %>
<%
}else{
        String tempreturnp22 = null;
        if(listarInstitutos21mtemp != null){
        java.util.List listreturnp22= java.util.Arrays.asList(listarInstitutos21mtemp);
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
        sampleControladorListarAceptadosEdiCursoProxyid.ingresarEdicion(arg0_2idTemp);
break;
case 29:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg032");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        sampleControladorListarAceptadosEdiCursoProxyid.ingresarCurso(arg0_3idTemp);
break;
case 34:
        gotMethod = true;
        java.lang.String[] listarCursos34mtemp = sampleControladorListarAceptadosEdiCursoProxyid.listarCursos();
if(listarCursos34mtemp == null){
%>
<%=listarCursos34mtemp %>
<%
}else{
        String tempreturnp35 = null;
        if(listarCursos34mtemp != null){
        java.util.List listreturnp35= java.util.Arrays.asList(listarCursos34mtemp);
        tempreturnp35 = listreturnp35.toString();
        }
        %>
        <%=tempreturnp35%>
        <%
}
break;
case 37:
        gotMethod = true;
        java.lang.String[] listarEstudiantesInscriptos37mtemp = sampleControladorListarAceptadosEdiCursoProxyid.listarEstudiantesInscriptos();
if(listarEstudiantesInscriptos37mtemp == null){
%>
<%=listarEstudiantesInscriptos37mtemp %>
<%
}else{
        String tempreturnp38 = null;
        if(listarEstudiantesInscriptos37mtemp != null){
        java.util.List listreturnp38= java.util.Arrays.asList(listarEstudiantesInscriptos37mtemp);
        tempreturnp38 = listreturnp38.toString();
        }
        %>
        <%=tempreturnp38%>
        <%
}
break;
case 40:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg045");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        publicadores.DtEdicionDetalle seleccionarEdicion40mtemp = sampleControladorListarAceptadosEdiCursoProxyid.seleccionarEdicion(arg0_4idTemp);
if(seleccionarEdicion40mtemp == null){
%>
<%=seleccionarEdicion40mtemp %>
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
if(seleccionarEdicion40mtemp != null){
java.util.Calendar typefechaPub43 = seleccionarEdicion40mtemp.getFechaPub();
        java.text.DateFormat dateFormatfechaPub43 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaPub43 = typefechaPub43.getTime();
        String tempResultfechaPub43 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaPub43.format(datefechaPub43));
        %>
        <%= tempResultfechaPub43 %>
        <%
}%>
</TD>
</TABLE>
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