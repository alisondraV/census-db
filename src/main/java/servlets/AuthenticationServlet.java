package servlets;

import util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "AuthenticationServlet", value = "/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    private final String EMP_SIGNUP = "/signup";
    private final String EMP_LOGIN = "/login";
    private final String EMP_SUCCESS = "/home";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageName = request.getParameter("pageName");
        String forward = "";

        if (pageName.equals("signup")) {
            DBUtil.createUser(
                request.getParameter("userName"),
                request.getParameter("password")
            );
            forward = EMP_LOGIN;
        } else if (pageName.equals("login")) {
            boolean userExists = DBUtil.verifyCredentials(
                request.getParameter("userName"),
                request.getParameter("password")
            );
            if (userExists) {
                forward = EMP_SUCCESS;
            } else {
                String message = "User does not exist";
                request.setAttribute("message", message);
                forward = EMP_LOGIN;
            }
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
}
