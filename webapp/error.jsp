<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%--  <% List name=(String)request.getAttribute("name"); %>  --%>
<!DOCTYPE HTML >
<style>
html {

        margin:0 auto;

    padding:0;

    height: 100%;

}
.main-bg{
	background-image: url(<%=basePath%>index/main-bg.jpg);
	background-repeat:no-repeat;
	margin:0 auto;
    padding:0;
	width: 100%;
	height: 100%;
}
.main-log{

	position:relative;
	left:32%;
	top:15%;
	width: 35%;
	height: 50%;
	background-image: url(<%=basePath%>index/main-log.png);
	background-size:100% 100%;  
	background-repeat:no-repeat;
}
</style>
<html>
  <head>
 <%--    <base href="<%=basePath%>"> --%>
    
    <title>error</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content=
	"no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body class="main-bg" >	
  	<div class="main-log" >
  	<h1>
  		404
  	</h1>
  		
  	</div>
   	
  </body>
  <script type="text/javascript">
  
  
  </script>
</html>
