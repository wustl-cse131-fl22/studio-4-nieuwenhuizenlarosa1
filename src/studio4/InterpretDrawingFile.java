package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		Color purple = new Color(255, 0, 255);
		StdDraw.setPenColor(purple);
		String x = in.nextLine();
		int index = x.indexOf(" ");
		String xname = x.substring(0, index);

		if(xname.equals("rectangle")) {
			
			Color thing = new Color();
			StdDraw.rectangle(.5, .5, .25 , .25);
			}
		if(xname.equals("ellipse")) {
			Color thing = new Color();
			StdDraw.rectangle(.5, .5, .25 , .25);
			}
		if(xname.equals("triangle")) {
			Color thing = new Color();
			StdDraw.rectangle(.5, .5, .25 , .25);
			}

}
}
