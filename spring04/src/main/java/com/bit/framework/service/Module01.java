package com.bit.framework.service;

public class Module01 {
		public void func01() {
			EngConsoleService sonsole =new EngConsoleService() ;
			sonsole.SayHello();
		}
		public void func02() {
			EngConsoleService sonsole =new EngConsoleService() ;
			for(int i=0; i<5;i++)
			sonsole.SayHi();
			
		}
	
}
