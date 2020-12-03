<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaDeCursoPublishProxyid" scope="session" class="publicadores.ControladorConsultaDeCursoPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaDeCursoPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaDeCursoPublishProxyid.getEndpoint();
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
        sampleControladorConsultaDeCursoPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaDeCursoPublish getControladorConsultaDeCursoPublish10mtemp = sampleControladorConsultaDeCursoPublishProxyid.getControladorConsultaDeCursoPublish();
if(getControladorConsultaDeCursoPublish10mtemp == null){
%>
<%=getControladorConsultaDeCursoPublish10mtemp %>
<%
}else{
        if(getControladorConsultaDeCursoPublish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaDeCursoPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg030");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.DtInfoProgCurso seleccionarCurso13mtemp = sampleControladorConsultaDeCursoPublishProxyid.seleccionarCurso(arg0_1idTemp);
if(seleccionarCurso13mtemp == null){
%>
<%=seleccionarCurso13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">texto:</TD>
<TD>
<%
if(seleccionarCurso13mtemp != null){
java.lang.String typetexto16 = seleccionarCurso13mtemp.getTexto();
        String tempResulttexto16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetexto16));
        %>
        <%= tempResulttexto16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dt:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">url:</TD>
<TD>
<%
if(seleccionarCurso13mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCurso13mtemp.getDt();
if(tebece0 != null){
java.lang.String typeurl20 = tebece0.getUrl();
        String tempResulturl20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeurl20));
        %>
        <%= tempResulturl20 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">creditos:</TD>
<TD>
<%
if(seleccionarCurso13mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCurso13mtemp.getDt();
if(tebece0 != null){
%>
<%=tebece0.getCreditos()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">cantHoras:</TD>
<TD>
<%
if(seleccionarCurso13mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCurso13mtemp.getDt();
if(tebece0 != null){
publicadores.Time typecantHoras24 = tebece0.getCantHoras();
        if(typecantHoras24!= null){
        String tempcantHoras24 = typecantHoras24.toString();
        %>
        <%=tempcantHoras24%>
        <%
        }}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionarCurso13mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCurso13mtemp.getDt();
if(tebece0 != null){
java.lang.String typeduracion26 = tebece0.getDuracion();
        String tempResultduracion26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeduracion26));
        %>
        <%= tempResultduracion26 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">fechaR:</TD>
<TD>
<%
if(seleccionarCurso13mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCurso13mtemp.getDt();
if(tebece0 != null){
java.util.Calendar typefechaR28 = tebece0.getFechaR();
        java.text.DateFormat dateFormatfechaR28 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaR28 = typefechaR28.getTime();
        String tempResultfechaR28 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaR28.format(datefechaR28));
        %>
        <%= tempResultfechaR28 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 32:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg035");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtCursoBase[] ingresarInstituto32mtemp = sampleControladorConsultaDeCursoPublishProxyid.ingresarInstituto(arg0_2idTemp);
if(ingresarInstituto32mtemp == null){
%>
<%=ingresarInstituto32mtemp %>
<%
}else{
        String tempreturnp33 = null;
        if(ingresarInstituto32mtemp != null){
        java.util.List listreturnp33= java.util.Arrays.asList(ingresarInstituto32mtemp);
        tempreturnp33 = listreturnp33.toString();
        }
        %>
        <%=tempreturnp33%>
        <%
}
break;
case 37:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg042");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtEdicionDetalle seleccionarEdicion37mtemp = sampleControladorConsultaDeCursoPublishProxyid.seleccionarEdicion(arg0_3idTemp);
if(seleccionarEdicion37mtemp == null){
%>
<%=seleccionarEdicion37mtemp %>
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
if(seleccionarEdicion37mtemp != null){
java.util.Calendar typefechaPub40 = seleccionarEdicion37mtemp.getFechaPub();
        java.text.DateFormat dateFormatfechaPub40 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaPub40 = typefechaPub40.getTime();
        String tempResultfechaPub40 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaPub40.format(datefechaPub40));
        %>
        <%= tempResultfechaPub40 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 44:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg055");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        publicadores.DtProgCurso seleccionarPrograma44mtemp = sampleControladorConsultaDeCursoPublishProxyid.seleccionarPrograma(arg0_4idTemp);
if(seleccionarPrograma44mtemp == null){
%>
<%=seleccionarPrograma44mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaI:</TD>
<TD>
<%
if(seleccionarPrograma44mtemp != null){
java.util.Calendar typefechaI47 = seleccionarPrograma44mtemp.getFechaI();
        java.text.DateFormat dateFormatfechaI47 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaI47 = typefechaI47.getTime();
        String tempResultfechaI47 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaI47.format(datefechaI47));
        %>
        <%= tempResultfechaI47 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionarPrograma44mtemp != null){
java.lang.String typedescripcion49 = seleccionarPrograma44mtemp.getDescripcion();
        String tempResultdescripcion49 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion49));
        %>
        <%= tempResultdescripcion49 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaF:</TD>
<TD>
<%
if(seleccionarPrograma44mtemp != null){
java.util.Calendar typefechaF51 = seleccionarPrograma44mtemp.getFechaF();
        java.text.DateFormat dateFormatfechaF51 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaF51 = typefechaF51.getTime();
        String tempResultfechaF51 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaF51.format(datefechaF51));
        %>
        <%= tempResultfechaF51 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionarPrograma44mtemp != null){
java.lang.String typenombre53 = seleccionarPrograma44mtemp.getNombre();
        String tempResultnombre53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre53));
        %>
        <%= tempResultnombre53 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 57:
        gotMethod = true;
        String arg0_5id=  request.getParameter("arg060");
            java.lang.String arg0_5idTemp = null;
        if(!arg0_5id.equals("")){
         arg0_5idTemp  = arg0_5id;
        }
        publicadores.DtCursoBase[] ingresarCategoria57mtemp = sampleControladorConsultaDeCursoPublishProxyid.ingresarCategoria(arg0_5idTemp);
if(ingresarCategoria57mtemp == null){
%>
<%=ingresarCategoria57mtemp %>
<%
}else{
        String tempreturnp58 = null;
        if(ingresarCategoria57mtemp != null){
        java.util.List listreturnp58= java.util.Arrays.asList(ingresarCategoria57mtemp);
        tempreturnp58 = listreturnp58.toString();
        }
        %>
        <%=tempreturnp58%>
        <%
}
break;
case 62:
        gotMethod = true;
        String arg0_6id=  request.getParameter("arg079");
            java.lang.String arg0_6idTemp = null;
        if(!arg0_6id.equals("")){
         arg0_6idTemp  = arg0_6id;
        }
        publicadores.DtInfoProgCurso seleccionarCursoEnCat62mtemp = sampleControladorConsultaDeCursoPublishProxyid.seleccionarCursoEnCat(arg0_6idTemp);
if(seleccionarCursoEnCat62mtemp == null){
%>
<%=seleccionarCursoEnCat62mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">texto:</TD>
<TD>
<%
if(seleccionarCursoEnCat62mtemp != null){
java.lang.String typetexto65 = seleccionarCursoEnCat62mtemp.getTexto();
        String tempResulttexto65 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetexto65));
        %>
        <%= tempResulttexto65 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dt:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">url:</TD>
<TD>
<%
if(seleccionarCursoEnCat62mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCursoEnCat62mtemp.getDt();
if(tebece0 != null){
java.lang.String typeurl69 = tebece0.getUrl();
        String tempResulturl69 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeurl69));
        %>
        <%= tempResulturl69 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">creditos:</TD>
<TD>
<%
if(seleccionarCursoEnCat62mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCursoEnCat62mtemp.getDt();
if(tebece0 != null){
%>
<%=tebece0.getCreditos()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">cantHoras:</TD>
<TD>
<%
if(seleccionarCursoEnCat62mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCursoEnCat62mtemp.getDt();
if(tebece0 != null){
publicadores.Time typecantHoras73 = tebece0.getCantHoras();
        if(typecantHoras73!= null){
        String tempcantHoras73 = typecantHoras73.toString();
        %>
        <%=tempcantHoras73%>
        <%
        }}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionarCursoEnCat62mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCursoEnCat62mtemp.getDt();
if(tebece0 != null){
java.lang.String typeduracion75 = tebece0.getDuracion();
        String tempResultduracion75 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeduracion75));
        %>
        <%= tempResultduracion75 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">fechaR:</TD>
<TD>
<%
if(seleccionarCursoEnCat62mtemp != null){
publicadores.DtCursoDetalle1 tebece0=seleccionarCursoEnCat62mtemp.getDt();
if(tebece0 != null){
java.util.Calendar typefechaR77 = tebece0.getFechaR();
        java.text.DateFormat dateFormatfechaR77 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaR77 = typefechaR77.getTime();
        String tempResultfechaR77 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaR77.format(datefechaR77));
        %>
        <%= tempResultfechaR77 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 81:
        gotMethod = true;
        String arg0_7id=  request.getParameter("arg086");
            java.lang.String arg0_7idTemp = null;
        if(!arg0_7id.equals("")){
         arg0_7idTemp  = arg0_7id;
        }
        publicadores.DtEdicionDetalle seleccionarEdicionCat81mtemp = sampleControladorConsultaDeCursoPublishProxyid.seleccionarEdicionCat(arg0_7idTemp);
if(seleccionarEdicionCat81mtemp == null){
%>
<%=seleccionarEdicionCat81mtemp %>
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
if(seleccionarEdicionCat81mtemp != null){
java.util.Calendar typefechaPub84 = seleccionarEdicionCat81mtemp.getFechaPub();
        java.text.DateFormat dateFormatfechaPub84 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaPub84 = typefechaPub84.getTime();
        String tempResultfechaPub84 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaPub84.format(datefechaPub84));
        %>
        <%= tempResultfechaPub84 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 88:
        gotMethod = true;
        String nombre_9id=  request.getParameter("nombre93");
            java.lang.String nombre_9idTemp = null;
        if(!nombre_9id.equals("")){
         nombre_9idTemp  = nombre_9id;
        }
        %>
        <jsp:useBean id="publicadores1DtEdicionBasico_8id" scope="session" class="publicadores.DtEdicionBasico" />
        <%
        publicadores1DtEdicionBasico_8id.setNombre(nombre_9idTemp);
        sampleControladorConsultaDeCursoPublishProxyid.ingresarDt(publicadores1DtEdicionBasico_8id);
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