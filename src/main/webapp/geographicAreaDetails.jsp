<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Geographic Area</title>
</head>
<body>
    <h2>${area.getName()} Geographic Area</h2>
    <div><b>Code:</b> ${area.getCode()}</div>
    <div><b>Level:</b> ${area.getReadableLevel()}</div>
    <div><b>Population:</b> ${area.getPopulation()}</div>
</body>
</html>
