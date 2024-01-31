package com.importantConcepts;


@FunctionalInterface
interface Trial{
	void mthd1() ;
	//void mthd2();
	
	/*without the @FunctionalInterface mthd2() won't give any CE: here it will give error where we have used it so this may create bugs if 
	 * one developer writes here and another is using this functional interface somewhere else. With the  help of the annotation it gives CE: 
	 * so the developer won't write mthd2() here so no bugs.
	 */

}


class A1{
	void disp1() {
		System.out.println("Display method in A1");
	}
}


class A2 extends A1{
	
	@Override
	//void disp() {}
	void disp1() {
		System.out.println("Overriden method");
	}
	
	
	/*here say teamlead told me override diplay method from A1 to A2 there is a high chance that I will miss the disp1 and write it as disp()
	 * if I do so it will be treated as specialized method and my purpose will not be fulfilled. But if I use annotation @Override it will tell
	 * me that no such method is there in parent so I will check for the spelling error
	 */
	
	
	
}

public class AnnotationsEx1 {

	public static void main(String[] args) {

		Trial t=()->{
			System.out.println("mthd1");
		};
		
		t.mthd1();
	}

}
