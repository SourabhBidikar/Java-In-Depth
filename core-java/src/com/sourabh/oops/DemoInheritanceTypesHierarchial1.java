package com.sourabh.oops;

public class DemoInheritanceTypesHierarchial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Obj M");
		M m1= new M();
		m1.showM();
		
		System.out.println("\n\nObj N");
		N n1= new N();
		n1.showM();
		n1.showN();
		//n1.showO(); will give error
		
		
		System.out.println("\n\nObj O");
		O o1 = new O();
		o1.showM();
		o1.showO();
		//o1.showN(); will give error

	}

}


class M{
	void showM() {
		System.out.println("class M show method");
	}
}

class N extends M{
	void showN() {
		System.out.println("class N show method");
	}
}

class O extends M{
	void showO() {
		System.out.println("class O show method");
	}
}