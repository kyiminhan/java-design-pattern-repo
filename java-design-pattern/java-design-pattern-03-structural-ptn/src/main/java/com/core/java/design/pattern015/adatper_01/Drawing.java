package com.core.java.design.pattern015.adatper_01;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j2;

/**
 * The Class Drawing. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper <BR>
 *        Drawing.java <BR>
 */
@Log4j2
public class Drawing {

	/** The shapes. */
	List<Shape> shapes = new ArrayList<>();

	/**
	 * Instantiates a new drawing.
	 */
	public Drawing() {
		super();
	}

	/**
	 * Adds the shape.
	 *
	 * @param shape the shape
	 */
	public void addShape(final Shape shape) {
		this.shapes.add(shape);
	}

	public List<Shape> getShapes() {
		return new ArrayList<>(this.shapes);
	}

	/**
	 * Draw.
	 */
	public void draw() {
		if (this.shapes.isEmpty()) {
			log.info("Nothing to draw!");
		} else {
			this.shapes.stream().forEach(shape -> shape.draw());
		}
	}

	/**
	 * Resize.
	 */
	public void resize() {
		if (this.shapes.isEmpty()) {
			log.info("Nothing to resize!");
		} else {
			this.shapes.stream().forEach(shape -> shape.resize());
		}
	}
}