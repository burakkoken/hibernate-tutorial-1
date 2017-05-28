import Models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Burak Köken on 28.5.2017.
 */
public class HibernateTest {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Burak Köken");
        employee.setSalary(4500);

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();

    }
}
