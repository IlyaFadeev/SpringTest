package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Locale;

/**
 * Created by Fadeev on 07.04.2016.
 */
public class PersonService {

    AnnotationConfiguration aconf;
    Configuration conf;
    private SessionFactory factory;

    private Session session;

    public PersonService(){
        this.aconf = new AnnotationConfiguration().addAnnotatedClass(EMP.class);
        this.conf = aconf.configure();
        this.factory = conf.buildSessionFactory();
        this.session = factory.openSession();
        Locale.setDefault(Locale.US);
    }

    public List<EMP> getAll(){
        Session session = getSession();

        Query query = session.createQuery("FROM EMP");

        return query.list();
    }

    public EMP getEMP(Integer empno){
        Session session = getSession();

        return (EMP)session.get(EMP.class, empno);
    }

    public void addEMP(EMP emp){
        Session session = getSession();

        session.save(emp);
    }

    public void deleteEMP(Integer empno){
        Session session = getSession();

        EMP emp = (EMP)session.get(EMP.class, empno);

        session.delete(emp);
    }

    public Session getSession() {
        return session;
    }
}
