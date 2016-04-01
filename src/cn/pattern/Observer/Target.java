package cn.pattern.Observer;

import java.util.Vector;

public class Target {
	private String name="hello";
	public void setName(String name) {
		if(!this.name.equals(name)){
			notifyAllObServer();
		}
		this.name = name;
		
	}
	private Vector<Observer> vs = new Vector<Observer>();
	public void notifyAllObServer(){
		for(Observer observer : vs){
			observer.update();
		}
	}
	public void addObserver(Observer observer){
		vs.add(observer);
	}
}
