<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Age List</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="icon" href="favicon.ico"/>
</head>
<body class="bg-fixed w-full bg-gradient-to-b from-blue-100 to-yellow-100 p-10">
    <h2 class="text-2xl text-center font-semibold mb-2">Age List</h2>
    <div class="w-full flex justify-center">
        <table class="table-auto">
            <thead>
                <tr>
                    <th class="border border-indigo-800 px-4 py-2">Age Group</th>
                    <th class="border border-indigo-800 px-4 py-2">Male Population</th>
                    <th class="border border-indigo-800 px-4 py-2">Female Population</th>
                </tr>
            </thead>
            <c:forEach var="ageGroup" items="${ageGroups}">
                <tr>
                    <td class="border border-indigo-800 px-4 py-2">${ageGroup.getDescription()}</td>
                    <td class="border border-indigo-800 px-4 py-2">${ageGroup.getMale()}</td>
                    <td class="border border-indigo-800 px-4 py-2">${ageGroup.getFemale()}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
