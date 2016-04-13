package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Fadeev on 07.04.2016.
 */
public class HibernateUtil {
    public static void main(String[] args) {
        AnnotationConfiguration aconf = new AnnotationConfiguration()
                .addAnnotatedClass(EMP.class);
        Configuration conf = aconf.configure();

        EMP emp = new EMP();
        emp.setEmpNo(4444);
        emp.setEname("1dqefe");
        emp.setComm(1341);
        emp.setDeptno(15);
        emp.setJob("IT");
        emp.setMgr(1111);
        emp.setSal(1111);
        emp.setHireDate(new Date(1111111l));


        //ServiceRegistry ssrb = new ServiceRegistryBuilder().applySetting(conf.getProperties()).buildServiceRegistry();

        Locale.setDefault(Locale.US);
        SessionFactory factory = conf.buildSessionFactory();

        Session session = factory.openSession();
        EMP emp1 = (EMP)session.get(EMP.class, 7499);
        System.out.println("Name:" + emp1.getEname());

        /*session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();*/


        PersonService personService = new PersonService();
        ArrayList<EMP> employees = (ArrayList<EMP>)personService.getAll();

        for (EMP employee : employees) {
            System.out.println(employee.getEname());
        }


    }
}
