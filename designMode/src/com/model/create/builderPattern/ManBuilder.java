package com.model.create.builderPattern;

public class ManBuilder implements PersonBuilder {
	
	private Person person;
	
	public ManBuilder() {
		person = new Person();
	}
	
	@Override
	public void buildHead() {
		person.setHead("�������˵�ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("�������˵�����");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("�������˵Ľ�");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
