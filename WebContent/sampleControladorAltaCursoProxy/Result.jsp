<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorAltaCursoProxyid" scope="session" class="publicadores.ControladorAltaCursoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorAltaCursoProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorAltaCursoProxyid.getEndpoint();
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
        sampleControladorAltaCursoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorAltaCurso getControladorAltaCurso10mtemp = sampleControladorAltaCursoProxyid.getControladorAltaCurso();
if(getControladorAltaCurso10mtemp == null){
%>
<%=getControladorAltaCurso10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 17:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg020");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        boolean agregarPrevias217mtemp = sampleControladorAltaCursoProxyid.agregarPrevias2(arg0_1idTemp);
        String tempResultreturnp18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(agregarPrevias217mtemp));
        %>
        <%= tempResultreturnp18 %>
        <%
break;
case 22:
        gotMethod = true;
        %>
        <jsp:useBean id="publicadores1Time_3id" scope="session" class="publicadores.Time" />
        <%
        String creditos_4id=  request.getParameter("creditos29");
        int creditos_4idTemp  = Integer.parseInt(creditos_4id);
        String url_5id=  request.getParameter("url31");
            java.lang.String url_5idTemp = null;
        if(!url_5id.equals("")){
         url_5idTemp  = url_5id;
        }
        String fechaR_6id=  request.getParameter("fechaR33");
            java.util.Calendar fechaR_6idTemp = null;
        if(!fechaR_6id.equals("")){
        java.text.DateFormat dateFormatfechaR33 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaR33  = dateFormatfechaR33.parse(fechaR_6id);
         fechaR_6idTemp = new java.util.GregorianCalendar();
        fechaR_6idTemp.setTime(dateTempfechaR33);
        }
        String duracion_7id=  request.getParameter("duracion35");
            java.lang.String duracion_7idTemp = null;
        if(!duracion_7id.equals("")){
         duracion_7idTemp  = duracion_7id;
        }
        %>
        <jsp:useBean id="publicadores1DtCursoDetalle_2id" scope="session" class="publicadores.DtCursoDetalle" />
        <%
        publicadores1DtCursoDetalle_2id.setCantHoras(publicadores1Time_3id);
        publicadores1DtCursoDetalle_2id.setCreditos(creditos_4idTemp);
        publicadores1DtCursoDetalle_2id.setUrl(url_5idTemp);
        publicadores1DtCursoDetalle_2id.setFechaR(fechaR_6idTemp);
        publicadores1DtCursoDetalle_2id.setDuracion(duracion_7idTemp);
        sampleControladorAltaCursoProxyid.ingresarDatos(publicadores1DtCursoDetalle_2id);
break;
case 37:
        gotMethod = true;
        sampleControladorAltaCursoProxyid.limpiarDatos();
break;
case 40:
        gotMethod = true;
        java.lang.String[] getPrevias40mtemp = sampleControladorAltaCursoProxyid.getPrevias();
if(getPrevias40mtemp == null){
%>
<%=getPrevias40mtemp %>
<%
}else{
        String tempreturnp41 = null;
        if(getPrevias40mtemp != null){
        java.util.List listreturnp41= java.util.Arrays.asList(getPrevias40mtemp);
        tempreturnp41 = listreturnp41.toString();
        }
        %>
        <%=tempreturnp41%>
        <%
}
break;
case 43:
        gotMethod = true;
        java.lang.String[] listarCursos43mtemp = sampleControladorAltaCursoProxyid.listarCursos();
if(listarCursos43mtemp == null){
%>
<%=listarCursos43mtemp %>
<%
}else{
        String tempreturnp44 = null;
        if(listarCursos43mtemp != null){
        java.util.List listreturnp44= java.util.Arrays.asList(listarCursos43mtemp);
        tempreturnp44 = listreturnp44.toString();
        }
        %>
        <%=tempreturnp44%>
        <%
}
break;
case 46:
        gotMethod = true;
        String arg0_8id=  request.getParameter("arg049");
            java.lang.String arg0_8idTemp = null;
        if(!arg0_8id.equals("")){
         arg0_8idTemp  = arg0_8id;
        }
        boolean ingresarCurso46mtemp = sampleControladorAltaCursoProxyid.ingresarCurso(arg0_8idTemp);
        String tempResultreturnp47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarCurso46mtemp));
        %>
        <%= tempResultreturnp47 %>
        <%
break;
case 51:
        gotMethod = true;
        java.lang.String[] listarCategorias51mtemp = sampleControladorAltaCursoProxyid.listarCategorias();
if(listarCategorias51mtemp == null){
%>
<%=listarCategorias51mtemp %>
<%
}else{
        String tempreturnp52 = null;
        if(listarCategorias51mtemp != null){
        java.util.List listreturnp52= java.util.Arrays.asList(listarCategorias51mtemp);
        tempreturnp52 = listreturnp52.toString();
        }
        %>
        <%=tempreturnp52%>
        <%
}
break;
case 54:
        gotMethod = true;
        String arg0_9id=  request.getParameter("arg057");
            java.lang.String arg0_9idTemp = null;
        if(!arg0_9id.equals("")){
         arg0_9idTemp  = arg0_9id;
        }
        boolean agregarCategoria54mtemp = sampleControladorAltaCursoProxyid.agregarCategoria(arg0_9idTemp);
        String tempResultreturnp55 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(agregarCategoria54mtemp));
        %>
        <%= tempResultreturnp55 %>
        <%
break;
case 59:
        gotMethod = true;
        String arg0_10id=  request.getParameter("arg062");
            java.lang.String arg0_10idTemp = null;
        if(!arg0_10id.equals("")){
         arg0_10idTemp  = arg0_10id;
        }
        boolean ingresarInstituto59mtemp = sampleControladorAltaCursoProxyid.ingresarInstituto(arg0_10idTemp);
        String tempResultreturnp60 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarInstituto59mtemp));
        %>
        <%= tempResultreturnp60 %>
        <%
break;
case 64:
        gotMethod = true;
        String arg0_11id=  request.getParameter("arg067");
            java.lang.String arg0_11idTemp = null;
        if(!arg0_11id.equals("")){
         arg0_11idTemp  = arg0_11id;
        }
        boolean agregarPrevias64mtemp = sampleControladorAltaCursoProxyid.agregarPrevias(arg0_11idTemp);
        String tempResultreturnp65 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(agregarPrevias64mtemp));
        %>
        <%= tempResultreturnp65 %>
        <%
break;
case 69:
        gotMethod = true;
        java.lang.String[] getCategorias69mtemp = sampleControladorAltaCursoProxyid.getCategorias();
if(getCategorias69mtemp == null){
%>
<%=getCategorias69mtemp %>
<%
}else{
        String tempreturnp70 = null;
        if(getCategorias69mtemp != null){
        java.util.List listreturnp70= java.util.Arrays.asList(getCategorias69mtemp);
        tempreturnp70 = listreturnp70.toString();
        }
        %>
        <%=tempreturnp70%>
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