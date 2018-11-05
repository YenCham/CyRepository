package com.model.create.prototypePattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5772972288378087113L;
	
	private int base;
	
	private Integer obj;
	
	/**
	 * 浅复制
	 * @throws CloneNotSupportedException 
	 */
	
	public Object clone() throws CloneNotSupportedException {
		// 因为Cloneable接口是个空接口，你可以任意定义实现类的方法名
		// 如cloneA或者cloneB，因为此处的重点是super.clone()这句话
		// super.clone()调用的是Object的clone()方法
		// 而在Object类中，clone()是native（本地方法）的
		Prototype proto = (Prototype)super.clone();
		return proto;
	}
	
	
	/**
	 * 深复制
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		// 写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		// 读出二进制流产生的新对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
		
		return ois.readObject();
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public Integer getObj() {
		return obj;
	}

	public void setObj(Integer obj) {
		this.obj = obj;
	}
	
	
}
