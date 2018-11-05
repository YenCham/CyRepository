package com.model.behaviour.observerPattern;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		/*
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
		*/
		for(Observer observer : vector) {
			observer.update();
		}
	}

}
