package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.snapdeal.Appointment;

public class DaoForAppointment1{

HibernateTemplate template;  
public void setTemplate(HibernateTemplate template) {  
    this.template = template;  
}  
//method to save employee  
@Transactional
public void saveEmployee(Appointment a){  
    template.save(a);  
}  
//method to update employee  
public void updateEmployee(Appointment e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteEmployee(Appointment e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Appointment getById(int id){  
	Appointment e=(Appointment)template.get(Appointment.class,id);  
    return e;  
}  
//method to return all employees  
public List<Appointment> getAppointment(){  
    List<Appointment> list=new ArrayList<Appointment>();  
    list=template.loadAll(Appointment.class);  
    return list;  
}
}