package com.cg.day4;

 interface Insta1 {

	abstract public void login();
	

	}
	class Instagram1 implements Insta1
	{
		public void login()
		{
			System.out.println("Body/Implementation");
		}
	}
	 class Driver1
	{
		public static void main(String[] args) {
			Insta1 ref = new Instagram1();
			ref.login();
			
		}
	}
