package servlets;

import entities.GeographicAreaEntity;
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
    public static final String GEO_AREAS_LIST_PAGE = "/geographicAreasList.jsp";
    public static final String GEO_AREA_DETAILS_PAGE = "/geographicAreaDetails.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String areaId = request.getParameter("id");
        String forwardPage = GEO_AREAS_LIST_PAGE;

        if (areaId == null) {
            List<GeographicAreaEntity> areasList = DBUtil.getGeographicAreas();
            request.setAttribute("areasList", areasList);
        } else {
            GeographicAreaEntity area = DBUtil.getGeographicArea(Integer.parseInt(areaId));
            request.setAttribute("area", area);
            forwardPage = GEO_AREA_DETAILS_PAGE;
        }
        RequestDispatcher view = request.getRequestDispatcher(forwardPage);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
