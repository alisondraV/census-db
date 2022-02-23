package servlets;

import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "GeographicAreasServlet", value = "/geographic-areas-servlet")
public class GeographicAreasServlet extends HttpServlet {
    List<String> areasList;

    public List getList() {
        return areasList;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CensusManager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query query = entityManager.createQuery("select ga.name from GeographicAreaEntity ga");
        areasList = query.getResultList();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
