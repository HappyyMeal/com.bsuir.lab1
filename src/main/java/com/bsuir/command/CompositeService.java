package com.bsuir.command;

import com.bsuir.composite.CompositeGraphic;
import com.bsuir.composite.Ellipse;
import com.bsuir.composite.Ñircle;

public class CompositeService implements Command {

	public void execute() {
		
		System.out.println("Composite pattern executing:");

		CompositeGraphic genericComposite = new CompositeGraphic();
		CompositeGraphic compositeGraphic2 = new CompositeGraphic();
		CompositeGraphic compositeGraphic3 = new CompositeGraphic();

		Ellipse ellipse = new Ellipse();
		Ellipse ellipse2 = new Ellipse();
		Ellipse ellipse3 = new Ellipse();

		Ñircle ñircle = new Ñircle();
		Ñircle ñircle2 = new Ñircle();
		Ñircle ñircle3 = new Ñircle();

		compositeGraphic2.add(ellipse);
		compositeGraphic2.add(ellipse2);
		compositeGraphic2.add(ñircle3);

		compositeGraphic3.add(ñircle);
		compositeGraphic3.add(ñircle2);
		compositeGraphic3.add(ellipse3);

		genericComposite.add(compositeGraphic2);
		genericComposite.add(compositeGraphic3);

		genericComposite.print();
	}
}
