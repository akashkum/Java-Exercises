package tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import entities.CommonInfo;
import entities.Employee;



public class TesySpring1 {
	public static void main(String[] args){
		//Creates memory object of Configuration
		Resource resource=new ClassPathResource("EmpManagement.xml");
		
		//Create Spring Container
		BeanFactory factory=new XmlBeanFactory(resource);
		System.out.println("Factory Created");
		
		CommonInfo info1=(CommonInfo) factory.getBean("CommonInfo");
		System.out.println(info1);
		
		CommonInfo info2=(CommonInfo) factory.getBean("CommonInfo");
		System.out.println(info2);
		
		Employee emp1=(Employee)factory.getBean("employee");
		System.out.println(emp1.hashCode());
		Employee emp2=(Employee)factory.getBean("employee");
		System.out.println(emp2.hashCode());
	}

}
