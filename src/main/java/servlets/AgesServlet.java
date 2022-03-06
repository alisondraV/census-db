package servlets;

import entities.AgeGroupEntity;
import util.DBUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

// Handles requests to retrieve age group information
@WebServlet(name = "AgesServlet", value = "/ages-servlet")
public class AgesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String yearString = request.getParameter("year");
        int year = yearString == null ? 2016 : Integer.parseInt(yearString);
        List<AgeGroupEntity> ageGroups = DBUtil.getAges(year);
        request.setAttribute("ageGroups", ageGroups);

        RequestDispatcher view = request.getRequestDispatcher("/ageGroups.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
