<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <script src="https://cdn.tailwindcss.com"></script>
        <link rel="icon" href="favicon.ico"/>
    </head>
    <body class="bg-fixed bg-gradient-to-b from-blue-100 to-yellow-100">
        <div class="h-screen flex items-center justify-center">
            <form action="AuthenticationServlet" method="post" class="w-64">
                <label for="userName" class="text-xl font-bold py-2">
                    UserName
                    <input type="text" name="userName" id="userName" class="border w-full mb-2" />
                </label>
                <label for="password" class="text-xl font-bold py-2">
                    Password
                    <input type="password" name="password" id="password" class="border w-full" />
                </label><br/>

                <input type="text" id="pageName" name="pageName" value="login" hidden />

                <br/>
                <% request.getAttribute("message"); %>
                <br/>

                <div class="flex flex-col items-center">
                    <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded mb-4">
                        Log In
                    </button>
                    <a href="signup.jsp" class="underline text-blue">Register instead</a>
                </div>
            </form>
        </div>
    </body>
</html>