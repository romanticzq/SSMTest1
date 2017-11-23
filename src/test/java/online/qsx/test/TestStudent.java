package online.qsx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;

import online.qsx.model.StudentModel;
import online.qsx.service.impl.StudentServerImpl;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext-mybatis.xml","classpath:applicationContext-service.xml");
		StudentServerImpl stu=ac.getBean(StudentServerImpl.class);
		
		PageInfo<StudentModel> pageinfo=stu.getStudents(null, 1, 3);
		for(StudentModel studentModel:pageinfo.getList()) {
			System.out.println(studentModel);
		}
	}
}
