package com.bsuir.factory;

public class ConcreteCreatorB extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}

}
