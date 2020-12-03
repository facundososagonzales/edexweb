<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorInsEdicionCursoPublishProxyid" scope="session" class="publicadores.ControladorInsEdicionCursoPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorInsEdicionCursoPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorInsEdicionCursoPublishProxyid.getEndpoint();
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
        sampleControladorInsEdicionCursoPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorInsEdicionCursoPublish getControladorInsEdicionCursoPublish10mtemp = sampleControladorInsEdicionCursoPublishProxyid.getControladorInsEdicionCursoPublish();
if(getControladorInsEdicionCursoPublish10mtemp == null){
%>
<%=getControladorInsEdicionCursoPublish10mtemp %>
<%
}else{
        if(getControladorInsEdicionCursoPublish10mtemp!= null){
        String tempreturnp11 = getControladorInsEdicionCursoPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String[] listarCategorias13mtemp = sampleControladorInsEdicionCursoPublishProxyid.listarCategorias();
if(listarCategorias13mtemp == null){
%>
<%=listarCategorias13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarCategorias13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarCategorias13mtemp);
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
        sampleControladorInsEdicionCursoPublishProxyid.ingresarInstituto(arg0_1idTemp);
break;
case 21:
        gotMethod = true;
        java.lang.String[] listarInstitutos21mtemp = sampleControladorInsEdicionCursoPublishProxyid.listarInstitutos();
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
        java.lang.String[] listarCursos24mtemp = sampleControladorInsEdicionCursoPublishProxyid.listarCursos();
if(listarCursos24mtemp == null){
%>
<%=listarCursos24mtemp %>
<%
}else{
        String tempreturnp25 = null;
        if(listarCursos24mtemp != null){
        java.util.List listreturnp25= java.util.Arrays.asList(listarCursos24mtemp);
        tempreturnp25 = listreturnp25.toString();
        }
        %>
        <%=tempreturnp25%>
        <%
}
break;
case 27:
        gotMethod = true;
        java.lang.String[] listarEdicion27mtemp = sampleControladorInsEdicionCursoPublishProxyid.listarEdicion();
if(listarEdicion27mtemp == null){
%>
<%=listarEdicion27mtemp %>
<%
}else{
        String tempreturnp28 = null;
        if(listarEdicion27mtemp != null){
        java.util.List listreturnp28= java.util.Arrays.asList(listarEdicion27mtemp);
        tempreturnp28 = listreturnp28.toString();
        }
        %>
        <%=tempreturnp28%>
        <%
}
break;
case 30:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg033");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorInsEdicionCursoPublishProxyid.ingresarEdicion(arg0_2idTemp);
break;
case 35:
        gotMethod = true;
        publicadores.DtEdicionDetalle seleccionarEdicion35mtemp = sampleControladorInsEdicionCursoPublishProxyid.seleccionarEdicion();
if(seleccionarEdicion35mtemp == null){
%>
<%=seleccionarEdicion35mtemp %>
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
if(seleccionarEdicion35mtemp != null){
java.util.Calendar typefechaPub38 = seleccionarEdicion35mtemp.getFechaPub();
        java.text.DateFormat dateFormatfechaPub38 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaPub38 = typefechaPub38.getTime();
        String tempResultfechaPub38 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaPub38.format(datefechaPub38));
        %>
        <%= tempResultfechaPub38 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 40:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg043");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        String arg1_4id=  request.getParameter("arg145");
            java.util.Calendar arg1_4idTemp = null;
        if(!arg1_4id.equals("")){
        java.text.DateFormat dateFormatarg145 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTemparg145  = dateFormatarg145.parse(arg1_4id);
         arg1_4idTemp = new java.util.GregorianCalendar();
        arg1_4idTemp.setTime(dateTemparg145);
        }
        String arg2_5id=  request.getParameter("arg247");
            java.lang.String arg2_5idTemp = null;
        if(!arg2_5id.equals("")){
         arg2_5idTemp  = arg2_5id;
        }
        boolean inscripcionEstudiante40mtemp = sampleControladorInsEdicionCursoPublishProxyid.inscripcionEstudiante(arg0_3idTemp,arg1_4idTemp,arg2_5idTemp);
        String tempResultreturnp41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(inscripcionEstudiante40mtemp));
        %>
        <%= tempResultreturnp41 %>
        <%
break;
case 49:
        gotMethod = true;
        String arg0_6id=  request.getParameter("arg052");
            java.lang.String arg0_6idTemp = null;
        if(!arg0_6id.equals("")){
         arg0_6idTemp  = arg0_6id;
        }
        sampleControladorInsEdicionCursoPublishProxyid.ingresarCursoInstituto(arg0_6idTemp);
break;
case 54:
        gotMethod = true;
        java.lang.String[] listarEdicionCat54mtemp = sampleControladorInsEdicionCursoPublishProxyid.listarEdicionCat();
if(listarEdicionCat54mtemp == null){
%>
<%=listarEdicionCat54mtemp %>
<%
}else{
        String tempreturnp55 = null;
        if(listarEdicionCat54mtemp != null){
        java.util.List listreturnp55= java.util.Arrays.asList(listarEdicionCat54mtemp);
        tempreturnp55 = listreturnp55.toString();
        }
        %>
        <%=tempreturnp55%>
        <%
}
break;
case 57:
        gotMethod = true;
        java.lang.String[] listarEstudiantes57mtemp = sampleControladorInsEdicionCursoPublishProxyid.listarEstudiantes();
if(listarEstudiantes57mtemp == null){
%>
<%=listarEstudiantes57mtemp %>
<%
}else{
        String tempreturnp58 = null;
        if(listarEstudiantes57mtemp != null){
        java.util.List listreturnp58= java.util.Arrays.asList(listarEstudiantes57mtemp);
        tempreturnp58 = listreturnp58.toString();
        }
        %>
        <%=tempreturnp58%>
        <%
}
break;
case 60:
        gotMethod = true;
        java.lang.String[] listarCursosCategoria60mtemp = sampleControladorInsEdicionCursoPublishProxyid.listarCursosCategoria();
if(listarCursosCategoria60mtemp == null){
%>
<%=listarCursosCategoria60mtemp %>
<%
}else{
        String tempreturnp61 = null;
        if(listarCursosCategoria60mtemp != null){
        java.util.List listreturnp61= java.util.Arrays.asList(listarCursosCategoria60mtemp);
        tempreturnp61 = listreturnp61.toString();
        }
        %>
        <%=tempreturnp61%>
        <%
}
break;
case 63:
        gotMethod = true;
        String arg0_7id=  request.getParameter("arg066");
            java.lang.String arg0_7idTemp = null;
        if(!arg0_7id.equals("")){
         arg0_7idTemp  = arg0_7id;
        }
        String arg1_8id=  request.getParameter("arg168");
            java.lang.String arg1_8idTemp = null;
        if(!arg1_8id.equals("")){
         arg1_8idTemp  = arg1_8id;
        }
        sampleControladorInsEdicionCursoPublishProxyid.inscripcionEstudianteW(arg0_7idTemp,arg1_8idTemp);
break;
case 70:
        gotMethod = true;
        String arg0_9id=  request.getParameter("arg073");
            java.lang.String arg0_9idTemp = null;
        if(!arg0_9id.equals("")){
         arg0_9idTemp  = arg0_9id;
        }
        sampleControladorInsEdicionCursoPublishProxyid.ingresarCategoria(arg0_9idTemp);
break;
case 75:
        gotMethod = true;
        String arg0_10id=  request.getParameter("arg078");
            java.lang.String arg0_10idTemp = null;
        if(!arg0_10id.equals("")){
         arg0_10idTemp  = arg0_10id;
        }
        sampleControladorInsEdicionCursoPublishProxyid.ingresarCursoporCat(arg0_10idTemp);
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