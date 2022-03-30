package JFS.disc;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration config=new Configuration().configure().addAnnotatedClass(Ipair.class).addAnnotatedClass(Person.class);
    	 //.addAnnotatedClass(Person.class);
    	 
         ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(
         		config.getProperties()).buildServiceRegistry();
         SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
         Session session=sessionFactory.openSession();
         session.beginTransaction();
        // session.getTransaction().commit();
         Query q=session.createQuery("from Ipair");
         List<Ipair >l=q.list();
         for(Ipair p:l) {
         	System.out.println(p);
         }
         
         Query q2=session.createQuery("from Ipair where id>3");
         System.out.println("Directly printing from query result:\n"+q2.uniqueResult());
         Ipair p=(Ipair)q2.uniqueResult();
         System.out.println("After assigning to Person variable:\n"+p);
         
         Query q3=session.createQuery("update Ipair set brand='dell' where id=4");
         int valueupdate = q3.executeUpdate();
         System.out.println(valueupdate);
         
//         Query q4=session.createQuery("delete from Person  where pid=11");
//         int valuedelete = q4.executeUpdate();
//         System.out.println(valuedelete);
         
         Query q5=session.createQuery("from Ipair p order by p.id desc");
         List<Ipair> l1=q5.list();
         for (Ipair p1:l1) {
         	System.out.println(p1);
         }
         
         Query q6=session.createQuery("select name from Person ");
         List  l2=q6.list();
         for (Object p2:l2) {
         	System.out.println(p2);
         }
         
         Query q7 = session.createQuery("select sum(price) from Ipair");
         System.out.println("Sum of price value is:"+q7.uniqueResult());
       
        	
        session.getTransaction().commit();
         
         
         
//        Ipair ipair=new Ipair();
//        ipair.setLid(1);
//       ipair.setBrand("android");
//        ipair.setPrice(18000);
//       session.save(ipair);
//           Ipair ipair1=new Ipair();
//           ipair1.setLid(2);
//          ipair1.setBrand("arun");
//           ipair1.setPrice(20000);
//           session.save(ipair1);
//              Ipair ipair2=new Ipair();
//           ipair2.setLid(3);
//           ipair2.setBrand("dhoni");
//           ipair2.setPrice(12345);
//           session.save(ipair2);
//             Ipair ipair3=new Ipair();
//           ipair3.setLid(4);
//          ipair3.setBrand("sandy");
//           ipair3.setPrice(65879);
//           session.save(ipair3);
//             Person person=new Person();
//       person.setPid(11);
//        person.setName("karthi");
//        person.getIpair().add(ipair);
//        session.save(person);
//        session.getTransaction().commit();
//           Person person1=new Person();
//        person1.setPid(12);
//        person1.setName("dinesh");
//         person1.getIpair().add(ipair1);
//         session.save(person1);
//         session.getTransaction().commit();
//         Person person2=new Person();
//         person2.setPid(13);
//         person2.setName("gowtham");
//         person2.getIpair().add(ipair2);
//          session.save(person2);
//          
//           Person person3=new Person();
//         person3.setPid(15);
//          person3.setName("dhanush");
//           person3.getIpair().add(ipair3);
//          session.save(person3);
//          session.getTransaction().commit();
    }
    }



