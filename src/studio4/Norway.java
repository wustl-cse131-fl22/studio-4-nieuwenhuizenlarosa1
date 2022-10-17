package studio4;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Norway {
	public static void main(String[] args) {
		Color purple = new Color(255, 0, 255);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 1, 1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(8.0/50, .5, 4.0/50, 1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(.5, .5, 1, 4.0/50);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(.5, .5, 4.0/50, 1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .5, 1, 2.0/50);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(1-8.0/50, .5, 4.0/50, 1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(1-.5, .5, 1, 4.0/50);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(1-8.0/50, .5, 2.0/50, 1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(1-.5, .5, 1, 2.0/50);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(8.0/50, .5, 2.0/50, 1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .5, 2.0/50, 1);
		
	}
}
