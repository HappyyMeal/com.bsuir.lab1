package com.bsuir.abstract_factory;

import com.bsuir.abstract_factory.colors.Color;
import com.bsuir.abstract_factory.shapes.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}