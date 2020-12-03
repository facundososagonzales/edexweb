<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorListaCursoProgramaPublishProxyid" scope="session" class="publicadores.ControladorListaCursoProgramaPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorListaCursoProgramaPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorListaCursoProgramaPublishProxyid.getEndpoint();
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
        sampleControladorListaCursoProgramaPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorListaCursoProgramaPublish getControladorListaCursoProgramaPublish10mtemp = sampleControladorListaCursoProgramaPublishProxyid.getControladorListaCursoProgramaPublish();
if(getControladorListaCursoProgramaPublish10mtemp == null){
%>
<%=getControladorListaCursoProgramaPublish10mtemp %>
<%
}else{
        if(getControladorListaCursoProgramaPublish10mtemp!= null){
        String tempreturnp11 = getControladorListaCursoProgramaPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        publicadores.DtWebCurso[] listarCursos13mtemp = sampleControladorListaCursoProgramaPublishProxyid.listarCursos();
if(listarCursos13mtemp == null){
%>
<%=listarCursos13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarCursos13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarCursos13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        publicadores.DtWebProgF[] listarProgramas16mtemp = sampleControladorListaCursoProgramaPublishProxyid.listarProgramas();
if(listarProgramas16mtemp == null){
%>
<%=listarProgramas16mtemp %>
<%
}else{
        String tempreturnp17 = null;
        if(listarProgramas16mtemp != null){
        java.util.List listreturnp17= java.util.Arrays.asList(listarProgramas16mtemp);
        tempreturnp17 = listreturnp17.toString();
        }
        %>
        <%=tempreturnp17%>
        <%
}
break;
case 19:
        gotMethod = true;
        String fechaPub_2id=  request.getParameter("fechaPub24");
            java.util.Calendar fechaPub_2idTemp = null;
        if(!fechaPub_2id.equals("")){
        java.text.DateFormat dateFormatfechaPub24 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaPub24  = dateFormatfechaPub24.parse(fechaPub_2id);
         fechaPub_2idTemp = new java.util.GregorianCalendar();
        fechaPub_2idTemp.setTime(dateTempfechaPub24);
        }
        String nombre_3id=  request.getParameter("nombre26");
            java.lang.String nombre_3idTemp = null;
        if(!nombre_3id.equals("")){
         nombre_3idTemp  = nombre_3id;
        }
        %>
        <jsp:useBean id="publicadores1DtExtra_1id" scope="session" class="publicadores.DtExtra" />
        <%
        publicadores1DtExtra_1id.setFechaPub(fechaPub_2idTemp);
        publicadores1DtExtra_1id.setNombre(nombre_3idTemp);
        sampleControladorListaCursoProgramaPublishProxyid.ingresarDtExtra(publicadores1DtExtra_1id);
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