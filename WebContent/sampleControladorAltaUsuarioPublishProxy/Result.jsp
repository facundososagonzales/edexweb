<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorAltaUsuarioPublishProxyid" scope="session" class="publicadores.ControladorAltaUsuarioPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorAltaUsuarioPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorAltaUsuarioPublishProxyid.getEndpoint();
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
        sampleControladorAltaUsuarioPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorAltaUsuarioPublish getControladorAltaUsuarioPublish10mtemp = sampleControladorAltaUsuarioPublishProxyid.getControladorAltaUsuarioPublish();
if(getControladorAltaUsuarioPublish10mtemp == null){
%>
<%=getControladorAltaUsuarioPublish10mtemp %>
<%
}else{
        if(getControladorAltaUsuarioPublish10mtemp!= null){
        String tempreturnp11 = getControladorAltaUsuarioPublish10mtemp.toString();
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
        boolean ingresarInstituto13mtemp = sampleControladorAltaUsuarioPublishProxyid.ingresarInstituto(arg0_1idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarInstituto13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 18:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg021");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        sampleControladorAltaUsuarioPublishProxyid.verificarPassword(arg0_2idTemp);
break;
case 23:
        gotMethod = true;
        String nick_4id=  request.getParameter("nick28");
            java.lang.String nick_4idTemp = null;
        if(!nick_4id.equals("")){
         nick_4idTemp  = nick_4id;
        }
        String fechaNac_5id=  request.getParameter("fechaNac30");
            java.util.Calendar fechaNac_5idTemp = null;
        if(!fechaNac_5id.equals("")){
        java.text.DateFormat dateFormatfechaNac30 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaNac30  = dateFormatfechaNac30.parse(fechaNac_5id);
         fechaNac_5idTemp = new java.util.GregorianCalendar();
        fechaNac_5idTemp.setTime(dateTempfechaNac30);
        }
        String correo_6id=  request.getParameter("correo32");
            java.lang.String correo_6idTemp = null;
        if(!correo_6id.equals("")){
         correo_6idTemp  = correo_6id;
        }
        String apellido_7id=  request.getParameter("apellido34");
            java.lang.String apellido_7idTemp = null;
        if(!apellido_7id.equals("")){
         apellido_7idTemp  = apellido_7id;
        }
        String nombre_8id=  request.getParameter("nombre36");
            java.lang.String nombre_8idTemp = null;
        if(!nombre_8id.equals("")){
         nombre_8idTemp  = nombre_8id;
        }
        %>
        <jsp:useBean id="publicadores1DtUsuario_3id" scope="session" class="publicadores.DtUsuario" />
        <%
        publicadores1DtUsuario_3id.setNick(nick_4idTemp);
        publicadores1DtUsuario_3id.setFechaNac(fechaNac_5idTemp);
        publicadores1DtUsuario_3id.setCorreo(correo_6idTemp);
        publicadores1DtUsuario_3id.setApellido(apellido_7idTemp);
        publicadores1DtUsuario_3id.setNombre(nombre_8idTemp);
        boolean ingresarUser23mtemp = sampleControladorAltaUsuarioPublishProxyid.ingresarUser(publicadores1DtUsuario_3id);
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarUser23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
break;
case 38:
        gotMethod = true;
        sampleControladorAltaUsuarioPublishProxyid.altaUsuario();
break;
case 41:
        gotMethod = true;
        String arg0_9id=  request.getParameter("arg044");
            java.lang.String arg0_9idTemp = null;
        if(!arg0_9id.equals("")){
         arg0_9idTemp  = arg0_9id;
        }
        sampleControladorAltaUsuarioPublishProxyid.ingresarPassword(arg0_9idTemp);
break;
case 46:
        gotMethod = true;
        %>
        <jsp:useBean id="publicadores1DtDocente_10id" scope="session" class="publicadores.DtDocente" />
        <%
        boolean ingresarUserDoc46mtemp = sampleControladorAltaUsuarioPublishProxyid.ingresarUserDoc(publicadores1DtDocente_10id);
        String tempResultreturnp47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarUserDoc46mtemp));
        %>
        <%= tempResultreturnp47 %>
        <%
break;
case 51:
        gotMethod = true;
        %>
        <jsp:useBean id="publicadores1DtEstudiante_11id" scope="session" class="publicadores.DtEstudiante" />
        <%
        boolean ingresarUserEst51mtemp = sampleControladorAltaUsuarioPublishProxyid.ingresarUserEst(publicadores1DtEstudiante_11id);
        String tempResultreturnp52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(ingresarUserEst51mtemp));
        %>
        <%= tempResultreturnp52 %>
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