package cn.hui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import cn.hui.bean.MyBean;

public class BeanTest {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test.xml"));
		MyBean myBean = (MyBean) bf.getBean("myBean");
		System.out.println(myBean.getUserName());
		
	}
}
