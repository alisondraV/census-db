import javax.persistence.*;
import java.util.List;

public class CensusManager {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CensusManager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query query = entityManager.createQuery("select ga.name from GeographicAreaEntity ga");
        List<String> list = query.getResultList();

        for (String area : list) {
            System.out.println("Area: " + area);
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
