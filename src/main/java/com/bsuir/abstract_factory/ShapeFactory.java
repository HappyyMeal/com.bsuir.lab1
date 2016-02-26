package com.bsuir.abstract_factory;

import com.bsuir.abstract_factory.colors.Color;
import com.bsuir.abstract_factory.shapes.Circle;
import com.bsuir.abstract_factory.shapes.Rectangle;
import com.bsuir.abstract_factory.shapes.Shape;
import com.bsuir.abstract_factory.shapes.Square;

public class ShapeFactory extends AbstractFactory {

	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

	public Color getColor(String color) {
		return null;
	}
}
