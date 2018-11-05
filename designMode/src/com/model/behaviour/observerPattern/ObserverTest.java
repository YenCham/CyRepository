package com.model.behaviour.observerPattern;

public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.add(new Observer_1());
		subject.add(new Observer_2());
		
		subject.operation();
	}

}
