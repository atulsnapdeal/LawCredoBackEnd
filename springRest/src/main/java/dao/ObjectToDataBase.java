package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.snapdeal.Appointment;




public class ObjectToDataBase {
	
public Object saveObjectToDatabase(Object object){
	
Session session = DaoForAppointment.getSessionFactory().openSession();
session.beginTransaction();
session.save((Appointment)(object));
session.getTransaction().commit();
Query q = session.createQuery("From Appointment");
            
    List<Appointment> resultList = q.list();
    System.out.println("next Appointment:" + resultList.size());
    /*for (Appointment next : resultList) {
        System.out.println("next appointment: " + next.getName()  + next.getAddress());
    }*/
    	return (Appointment)object;
    }

}
