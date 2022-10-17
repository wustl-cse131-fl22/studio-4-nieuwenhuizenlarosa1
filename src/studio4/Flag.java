package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color purple = new Color(255, 0, 255);
		StdDraw.setPenColor(purple);
		StdDraw.filledRectangle(0.5, 0.17, 1, .17);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 1-0.17, 1, .17);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledEllipse(0.5, .5, .25, .25);
		Color dar = new Color(0, 150, 0);
		StdDraw.setPenColor(dar);
		StdDraw.filledEllipse(0.5, .5, .15, .15);
	}
}