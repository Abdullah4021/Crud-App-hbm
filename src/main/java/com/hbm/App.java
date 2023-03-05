package com.hbm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		// student Save-create
		/*
		 * Student st = new Student(); st.setName("Abdullah"); st.setAddress("Lucknow");
		 * st.setCollegeName("Amu"); st.setEmaail("abdul@gmail.com");
		 * 
		 * Student st2 = new Student(); st2.setName("Mohad Amil");
		 * st2.setAddress("Delhi"); st2.setCollegeName("LU");
		 * st2.setEmaail("amil@gmail.com");
		 * 
		 * Transaction tx = session.beginTransaction(); session.save(st);
		 * session.save(st2);
		 * 
		 * tx.commit(); System.out.println("Student Register Successfully..");
		 */
		//read data-All student
		/*
		 * List<Student> list = session.createQuery("from Student",
		 * Student.class).list(); list.forEach(e->System.out.println(e));
		 */
		
		//read student by id-single student
		
//		  Student st = session.get(Student.class, 3);
		  Student st = session.load(Student.class, 3);
		  System.out.println(st);
		 
		//update data
		/*
		 * Student st=session.get(Student.class, 1); st.setName("Mohd Adil");
		 * st.setAddress("SakiNaka"); st.setCollegeName("Integral Uni");
		 * st.setEmaail("adil@gmail.com"); Transaction tx = session.beginTransaction();
		 * session.saveOrUpdate(st); tx.commit();
		 * System.out.println("Successfully Updated");
		 */
		//delete data
		/*
		 * Student st = session.get(Student.class, 3); Transaction tx =
		 * session.beginTransaction(); session.delete(st); tx.commit();
		 * System.out.println("Data delete successfully");
		 */
		session.close();
		factory.close();

	}
}
