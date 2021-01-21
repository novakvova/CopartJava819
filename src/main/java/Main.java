import beans.Mark;
import beans.Model;
import org.hibernate.Session;
import utils.HibernateSessionFactory;

public class Main {
    public static void main(String [] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Mark mark = session.get(Mark.class, 1);

        System.out.println(mark);

        session.close();
    }
}
