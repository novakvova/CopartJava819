import org.hibernate.Session;
import utils.HibernateSessionFactory;

public class Main {
    public static void main(String [] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.close();
    }
}
