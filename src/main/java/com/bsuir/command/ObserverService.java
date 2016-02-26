package com.bsuir.command;

import com.bsuir.observer.BinaryObserver;
import com.bsuir.observer.HexaObserver;
import com.bsuir.observer.OctalObserver;
import com.bsuir.observer.Subject;

public class ObserverService implements Command {

	public void execute() {
		System.out.println("Observer pattern executing:");
		
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
