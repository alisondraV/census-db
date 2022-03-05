<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Age List</title>
</head>
<body>
    <h2>Age List</h2>
    <table>
        <tr>
            <th>Age Group</th>
            <th>Male Population</th>
            <th>Female Population</th>
        </tr>
        <c:forEach var="ageGroup" items="${ageGroups}">
            <tr>
                <td>${ageGroup.getDescription()}</td>
                <td>${ageGroup.getMale()}</td>
                <td>${ageGroup.getFemale()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
