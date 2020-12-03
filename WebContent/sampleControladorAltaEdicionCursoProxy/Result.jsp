<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorAltaEdicionCursoProxyid" scope="session" class="publicadores.ControladorAltaEdicionCursoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorAltaEdicionCursoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorAltaEdicionCursoProxyid.getEndpoint();
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
        sampleControladorAltaEdicionCursoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorAltaEdicionCurso getControladorAltaEdicionCurso10mtemp = sampleControladorAltaEdicionCursoProxyid.getControladorAltaEdicionCurso();
if(getControladorAltaEdicionCurso10mtemp == null){
%>
<%=getControladorAltaEdicionCurso10mtemp %>
<%
}else{
        if(getControladorAltaEdicionCurso10mtemp!= null){
        String tempreturnp11 = getControladorAltaEdicionCurso10mtemp.toString();
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
        sampleControladorAltaEdicionCursoProxyid.ingresarCurso(arg0_1idTemp);
break;
case 18:
        gotMethod = true;
        sampleControladorAltaEdicionCursoProxyid.limpiarDatos();
break;
case 21:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg024");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorAltaEdicionCursoProxyid.ingresarInstituto(arg0_2idTemp);
break;
case 26:
        gotMethod = true;
        java.lang.String[] listarCursos26mtemp = sampleControladorAltaEdicionCursoProxyid.listarCursos();
if(listarCursos26mtemp == null){
%>
<%=listarCursos26mtemp %>
<%
}else{
        String tempreturnp27 = null;
        if(listarCursos26mtemp != null){
        java.util.List listreturnp27= java.util.Arrays.asList(listarCursos26mtemp);
        tempreturnp27 = listreturnp27.toString();
        }
        %>
        <%=tempreturnp27%>
        <%
}
break;
case 29:
        gotMethod = true;
        java.lang.String[] listarDocentes29mtemp = sampleControladorAltaEdicionCursoProxyid.listarDocentes();
if(listarDocentes29mtemp == null){
%>
<%=listarDocentes29mtemp %>
<%
}else{
        String tempreturnp30 = null;
        if(listarDocentes29mtemp != null){
        java.util.List listreturnp30= java.util.Arrays.asList(listarDocentes29mtemp);
        tempreturnp30 = listreturnp30.toString();
        }
        %>
        <%=tempreturnp30%>
        <%
}
break;
case 32:
        gotMethod = true;
        java.lang.String[] listarInstitutos32mtemp = sampleControladorAltaEdicionCursoProxyid.listarInstitutos();
if(listarInstitutos32mtemp == null){
%>
<%=listarInstitutos32mtemp %>
<%
}else{
        String tempreturnp33 = null;
        if(listarInstitutos32mtemp != null){
        java.util.List listreturnp33= java.util.Arrays.asList(listarInstitutos32mtemp);
        tempreturnp33 = listreturnp33.toString();
        }
        %>
        <%=tempreturnp33%>
        <%
}
break;
case 35:
        gotMethod = true;
        boolean darAltaEdicionCurso35mtemp = sampleControladorAltaEdicionCursoProxyid.darAltaEdicionCurso();
        String tempResultreturnp36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(darAltaEdicionCurso35mtemp));
        %>
        <%= tempResultreturnp36 %>
        <%
break;
case 38:
        gotMethod = true;
        String fechaPub_4id=  request.getParameter("fechaPub43");
            java.util.Calendar fechaPub_4idTemp = null;
        if(!fechaPub_4id.equals("")){
        java.text.DateFormat dateFormatfechaPub43 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaPub43  = dateFormatfechaPub43.parse(fechaPub_4id);
         fechaPub_4idTemp = new java.util.GregorianCalendar();
        fechaPub_4idTemp.setTime(dateTempfechaPub43);
        }
        %>
        <jsp:useBean id="publicadores1DtEdicionDetalle_3id" scope="session" class="publicadores.DtEdicionDetalle" />
        <%
        publicadores1DtEdicionDetalle_3id.setFechaPub(fechaPub_4idTemp);
        boolean ingresarEdicionCurso38mtemp = sampleControladorAltaEdicionCursoProxyid.ingresarEdicionCurso(publicadores1DtEdicionDetalle_3id);
        String tempResultreturnp39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarEdicionCurso38mtemp));
        %>
        <%= tempResultreturnp39 %>
        <%
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