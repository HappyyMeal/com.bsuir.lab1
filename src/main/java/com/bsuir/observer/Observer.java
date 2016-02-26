package com.bsuir.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}