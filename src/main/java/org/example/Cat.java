package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Primary
@Component
@Scope("prototype")
public class Cat implements Animals{

	private String myName;


	public Cat(String myName) {
		this.myName = myName;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"myName='" + myName + '\'' +
				'}';
	}
}
