package com.bsuir.factory;

public class ConcreteCreatorA extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}

}
