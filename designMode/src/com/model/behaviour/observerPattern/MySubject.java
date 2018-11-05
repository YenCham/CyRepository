package com.model.behaviour.observerPattern;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyAllObservers();
	}

}
