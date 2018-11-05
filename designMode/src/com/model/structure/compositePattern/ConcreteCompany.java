package com.model.structure.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	private List<Company> cList;
	
	public ConcreteCompany() {
		cList = new ArrayList();
	}
	
	public ConcreteCompany(String name) {
		super(name);
		cList = new ArrayList();
	}
	
	@Override
	protected void add(Company company) {
		cList.add(company);
	}

	@Override
	protected void remove(Company company) {
		cList.remove(company);
	}

	@Override
	protected void display(int depth) {
		StringBuilder sb = new StringBuilder("");
		for(int i=0; i<depth; i++) {
			sb.append("-");
		}
		System.out.println(new String(sb) + this.getName());
		for(Company c : cList) {
			c.display(depth + 2); 
		}
	}

}
