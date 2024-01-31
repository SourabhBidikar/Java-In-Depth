package com.importantConcepts;

import java.lang.annotation.*;

@Target(ElementType.TYPE)     //target is a meta annonation (meta about meta)   --target--> is for whom class, method,constructor,etc
@Retention(RetentionPolicy.RUNTIME)      //tells till where our custom annotation  --tells till where meaning of our annotations must be retained -- here till JVM(Runtime)
@interface CricketPlayer   //@ specifies to compiler that it is Annotation being created not interface 
{
	/*
	 * String country() default "India"; 
	 * int runs() default 20000;
	 */
	
	//we can give default values like above using that syntax or we can give defaults when using the annotation with the target
	
	String country();
	int runs();
	
}



@CricketPlayer(country = "India", runs = 20000)
class ViratKohli{
	private int innings;
	private String name;
	
	
	
	public int getInnings() {
		return this.innings;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setInnings(int innings) {
		this.innings=innings;
	}
}


public class CustomAnnotationEx1 {

	public static void main(String[] args) {
		ViratKohli vk= new ViratKohli();
		vk.setInnings(300);
		vk.setName("VK");
		
		System.out.println(vk.getInnings());
		System.out.println(vk.getName());


		Class c=vk.getClass();
		Annotation an=c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp= (CricketPlayer)an;
		
		System.out.println(cp.runs());
		System.out.println(cp.country());
		
	}

}
