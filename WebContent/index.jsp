<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expire" content="-1">

<title>Rest Implementation</title>
<script>
function xmlViewForAll()
{
	window.location = "${pageContext.request.contextPath}/rest/employee/listAllDetails.xml";
}
function xmlViewForSingle()
{
	window.location = "${pageContext.request.contextPath}/rest/employee/listDetails/1.xml";
}
function jsonViewForAll()
{
	window.location = "${pageContext.request.contextPath}/rest/employee/listAllDetails.json";
}
function jsonViewForSingle()
{
	window.location = "${pageContext.request.contextPath}/rest/employee/listDetails/1.json";
}
</script>

</head>
<body>
	<input type="button" value="XML-All" onclick="xmlViewForAll();"><br>
	<input type="button" value="XML-Single" onclick="xmlViewForSingle();"><br>
	<input type="button" value="JSON-All" onclick="jsonViewForAll();"><br>
	<input type="button" value="JSON-Single" onclick="jsonViewForSingle();">
</body>
</html>