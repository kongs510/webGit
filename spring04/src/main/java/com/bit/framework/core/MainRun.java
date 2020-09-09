package com.bit.framework.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.framework.service.ConsoleService;
import com.bit.framework.service.KorConsoleService;
import com.bit.framework.service.Module01;
import com.bit.framework.service.Module02;
import com.bit.framework.service.Module03;
import com.bit.framework.service.Module04;
public class MainRun {

	public static void main(String[] args) {
//		IoC(제어의 역전, Inversion of Control)
//		Module02 module=new Module02();
//		module.setConsole(new EngConsoleService());
//		module.func01();
//		module.func02();
		
		ApplicationContext ac=null;
//		ac=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
//		ac=new FileSystemXmlApplicationContext(".\\src\\main\\resources\\applicationContext.xml");
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
//		Module02 module=(Module02) ac.getBean("module02");
//		module.func01();
//		module.func02();
		
		//Module03 module=(Module03) ac.getBean("module03");
		//System.out.println(module);
		Module04 module=(Module04) ac.getBean("module");
		module.ArrayShow();
		module.listShow();
		module.setShow();
		module.mapShow();
	}

}
