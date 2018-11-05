package com.model.behaviour.observerPattern;

public interface Subject {

	// 增加观察者
	void add(Observer observer);
	
	// 删除观察者
	void del(Observer observer);
	
	// 通知所有的观察者
	void notifyAllObservers();
	
	// 自身操作
	void operation();
	
}
