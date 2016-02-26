package com.bsuir.runner;

import java.util.ArrayList;
import java.util.List;

import com.bsuir.command.Command;
import com.bsuir.command.CompositeService;
import com.bsuir.command.FactoryService;

public class Runner {

	public static void main(String args[]) {

		List<Command> commands = new ArrayList<Command>();
		commands.add(new CompositeService());
		commands.add(new FactoryService());

		for (Command command : commands) {
			command.execute();
		}
	}
}
