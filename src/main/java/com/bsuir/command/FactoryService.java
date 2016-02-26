package com.bsuir.command;

import java.util.ArrayList;
import java.util.List;

import com.bsuir.factory.ConcreteCreatorA;
import com.bsuir.factory.ConcreteCreatorB;
import com.bsuir.factory.Creator;

public class FactoryService implements Command {

	public void execute() {
		System.out.println("Factory pattern executing:");

		List<Creator> creatorList = new ArrayList<Creator>();
		creatorList.add(new ConcreteCreatorA());
		creatorList.add(new ConcreteCreatorB());

		for (Creator creator : creatorList) {
			System.out.println(creator.factoryMethod().getClass().getSimpleName());
		}
	}
}
