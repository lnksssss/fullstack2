package diex02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx
		= new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		A a1 = ctx.getBean("a1",A.class);
		
	}

}