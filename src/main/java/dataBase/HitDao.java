package dataBase;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class HitDao {

    public HitStorageBD findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(HitStorageBD.class, id);
    }

    public void save(HitStorageBD user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(HitStorageBD user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(HitStorageBD user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }


    public List<HitStorageBD> findAll() {
        List<HitStorageBD> Hits = (List<HitStorageBD>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From HitStorageBD").list();
        return Hits;
    }
}
