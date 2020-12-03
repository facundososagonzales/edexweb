<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorModificarDatosUsuarioPublishProxyid" scope="session" class="publicadores.ControladorModificarDatosUsuarioPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorModificarDatosUsuarioPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorModificarDatosUsuarioPublishProxyid.getEndpoint();
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
        sampleControladorModificarDatosUsuarioPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorModificarDatosUsuarioPublish getControladorModificarDatosUsuarioPublish10mtemp = sampleControladorModificarDatosUsuarioPublishProxyid.getControladorModificarDatosUsuarioPublish();
if(getControladorModificarDatosUsuarioPublish10mtemp == null){
%>
<%=getControladorModificarDatosUsuarioPublish10mtemp %>
<%
}else{
        if(getControladorModificarDatosUsuarioPublish10mtemp!= null){
        String tempreturnp11 = getControladorModificarDatosUsuarioPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg026");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.DtUsuario elegirUsuario13mtemp = sampleControladorModificarDatosUsuarioPublishProxyid.elegirUsuario(arg0_1idTemp);
if(elegirUsuario13mtemp == null){
%>
<%=elegirUsuario13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nick:</TD>
<TD>
<%
if(elegirUsuario13mtemp != null){
java.lang.String typenick16 = elegirUsuario13mtemp.getNick();
        String tempResultnick16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenick16));
        %>
        <%= tempResultnick16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaNac:</TD>
<TD>
<%
if(elegirUsuario13mtemp != null){
java.util.Calendar typefechaNac18 = elegirUsuario13mtemp.getFechaNac();
        java.text.DateFormat dateFormatfechaNac18 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaNac18 = typefechaNac18.getTime();
        String tempResultfechaNac18 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaNac18.format(datefechaNac18));
        %>
        <%= tempResultfechaNac18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">correo:</TD>
<TD>
<%
if(elegirUsuario13mtemp != null){
java.lang.String typecorreo20 = elegirUsuario13mtemp.getCorreo();
        String tempResultcorreo20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecorreo20));
        %>
        <%= tempResultcorreo20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">apellido:</TD>
<TD>
<%
if(elegirUsuario13mtemp != null){
java.lang.String typeapellido22 = elegirUsuario13mtemp.getApellido();
        String tempResultapellido22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeapellido22));
        %>
        <%= tempResultapellido22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(elegirUsuario13mtemp != null){
java.lang.String typenombre24 = elegirUsuario13mtemp.getNombre();
        String tempResultnombre24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre24));
        %>
        <%= tempResultnombre24 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String nick_3id=  request.getParameter("nick33");
            java.lang.String nick_3idTemp = null;
        if(!nick_3id.equals("")){
         nick_3idTemp  = nick_3id;
        }
        String fechaNac_4id=  request.getParameter("fechaNac35");
            java.util.Calendar fechaNac_4idTemp = null;
        if(!fechaNac_4id.equals("")){
        java.text.DateFormat dateFormatfechaNac35 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfechaNac35  = dateFormatfechaNac35.parse(fechaNac_4id);
         fechaNac_4idTemp = new java.util.GregorianCalendar();
        fechaNac_4idTemp.setTime(dateTempfechaNac35);
        }
        String correo_5id=  request.getParameter("correo37");
            java.lang.String correo_5idTemp = null;
        if(!correo_5id.equals("")){
         correo_5idTemp  = correo_5id;
        }
        String apellido_6id=  request.getParameter("apellido39");
            java.lang.String apellido_6idTemp = null;
        if(!apellido_6id.equals("")){
         apellido_6idTemp  = apellido_6id;
        }
        String nombre_7id=  request.getParameter("nombre41");
            java.lang.String nombre_7idTemp = null;
        if(!nombre_7id.equals("")){
         nombre_7idTemp  = nombre_7id;
        }
        %>
        <jsp:useBean id="publicadores1DtUsuario_2id" scope="session" class="publicadores.DtUsuario" />
        <%
        publicadores1DtUsuario_2id.setNick(nick_3idTemp);
        publicadores1DtUsuario_2id.setFechaNac(fechaNac_4idTemp);
        publicadores1DtUsuario_2id.setCorreo(correo_5idTemp);
        publicadores1DtUsuario_2id.setApellido(apellido_6idTemp);
        publicadores1DtUsuario_2id.setNombre(nombre_7idTemp);
        sampleControladorModificarDatosUsuarioPublishProxyid.modificar(publicadores1DtUsuario_2id);
break;
case 43:
        gotMethod = true;
        String arg0_8id=  request.getParameter("arg056");
            java.lang.String arg0_8idTemp = null;
        if(!arg0_8id.equals("")){
         arg0_8idTemp  = arg0_8id;
        }
        publicadores.DtUsuario datosUsuario43mtemp = sampleControladorModificarDatosUsuarioPublishProxyid.datosUsuario(arg0_8idTemp);
if(datosUsuario43mtemp == null){
%>
<%=datosUsuario43mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nick:</TD>
<TD>
<%
if(datosUsuario43mtemp != null){
java.lang.String typenick46 = datosUsuario43mtemp.getNick();
        String tempResultnick46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenick46));
        %>
        <%= tempResultnick46 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaNac:</TD>
<TD>
<%
if(datosUsuario43mtemp != null){
java.util.Calendar typefechaNac48 = datosUsuario43mtemp.getFechaNac();
        java.text.DateFormat dateFormatfechaNac48 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaNac48 = typefechaNac48.getTime();
        String tempResultfechaNac48 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaNac48.format(datefechaNac48));
        %>
        <%= tempResultfechaNac48 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">correo:</TD>
<TD>
<%
if(datosUsuario43mtemp != null){
java.lang.String typecorreo50 = datosUsuario43mtemp.getCorreo();
        String tempResultcorreo50 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecorreo50));
        %>
        <%= tempResultcorreo50 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">apellido:</TD>
<TD>
<%
if(datosUsuario43mtemp != null){
java.lang.String typeapellido52 = datosUsuario43mtemp.getApellido();
        String tempResultapellido52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeapellido52));
        %>
        <%= tempResultapellido52 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(datosUsuario43mtemp != null){
java.lang.String typenombre54 = datosUsuario43mtemp.getNombre();
        String tempResultnombre54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre54));
        %>
        <%= tempResultnombre54 %>
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