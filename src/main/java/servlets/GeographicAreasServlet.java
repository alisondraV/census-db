package servlets;

import util.DBUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GeographicAreasServlet", value = "/geographic-areas-servlet")
public class GeographicAreasServlet extends HttpServlet {
    List<String> areasList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Connection dbConnection = DBUtil.getConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement("select ga.name from GeographicArea ga");

            ResultSet result = preparedStatement.executeQuery();

            if (result != null) {
                while(result.next()) {
                    areasList.add(result.getString("name"));
                }
            }
            request.setAttribute("areasList", areasList);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher view = request.getRequestDispatcher("/geographicAreas.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
