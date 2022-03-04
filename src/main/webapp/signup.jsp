<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Register</title>
    </head>
    <body>
        <h1>Register</h1>
        <br/>
        <form action="AuthenticationServlet" method="post">
            <label for="userName">
                userName
                <input type="text" name="userName" id="userName" />
            </label><br/>
            <label for="password">
                password
                <input type="password" name="password" id="password" />
            </label><br/>

            <input type="text" id="pageName" name="pageName" value="signup" hidden />

            <button>Register</button>
        </form>
    </body>
</html>