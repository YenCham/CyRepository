package com.model.structure.facadePattern;

public class Computer {
	
	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	
	
	public Computer() {
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	
	public void startup() {
		System.out.println("start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start the computer finished!");
	}
	
	public void shutdown() {
		System.out.println("begin to close the computer!");
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
		System.out.println("computer closed!");
	}
}
