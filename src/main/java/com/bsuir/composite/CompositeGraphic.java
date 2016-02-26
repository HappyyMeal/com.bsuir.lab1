package com.bsuir.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

	private List<Graphic> composite = new ArrayList<Graphic>();

	public void print() {
		for (Graphic graphic : composite) {
			graphic.print();
		}

	}

	public void add(Graphic graphic) {
		composite.add(graphic);
	}

	public void remove(Graphic graphic) {
		composite.remove(graphic);
	}
}
