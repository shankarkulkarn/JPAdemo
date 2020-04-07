package com.cg.demo.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.demo.entity.Employee;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Employee employee = em.find(Employee.class,10);
		if(employee==null)
		{
			System.out.println(" NOT FOUND ");
		}
		else
		{
			//em.remove(employee);
			//System.out.println(" Removed ");
		    employee.setEmployeeSalary(12000);
		    em.merge(employee);
		    System.out.println(" UPDATED ");
		}
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
