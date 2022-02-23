package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;


//java base
@Configuration
//annotation base
@ComponentScan("org.example")
public class RootConfiguration {

	@Bean
	public String name(){
		return "Test";
	}

	@Primary
	@Bean
	public String name2(){
		return "Test2";
	}

	@Scope("prototype")
	@Bean
	public Cat cat2(@Qualifier("name") String asdasd){
		return new Cat(asdasd);
	}

	@Bean
	public Dog dog(){
		return new Dog();
	}

	@Bean(initMethod = "init", destroyMethod = "destr")
	public User user(Cat cat, Dog dog){
		return new User(cat, dog);
	}
}
