package com.model.behaviour.observerPattern;

public interface Subject {

	// ���ӹ۲���
	void add(Observer observer);
	
	// ɾ���۲���
	void del(Observer observer);
	
	// ֪ͨ���еĹ۲���
	void notifyAllObservers();
	
	// �������
	void operation();
	
}
