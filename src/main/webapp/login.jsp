<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <form action="AuthenticationServlet" method="post">
            <label for="userName">
                UserName
                <input type="text" name="userName" id="userName" />
            </label><br/>
            <label for="password">
                Password
                <input type="password" name="password" id="password" />
            </label><br/>

            <input type="text" id="pageName" name="pageName" value="login" hidden />

            <br/>
            <% request.getAttribute("message"); %>
            <br/>

            <button>Log In</button>
            <br/>
            <a href="signup.jsp">Register instead</a>
        </form>
    </body>
</html>