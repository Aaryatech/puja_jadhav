package com.section10.generic;

public class GenericClass<T>{
	T obj;////use any type data 
	public void add(T obj) {
		this.obj =  obj;
	}
	T get() {
		return this.obj;
	}

}
