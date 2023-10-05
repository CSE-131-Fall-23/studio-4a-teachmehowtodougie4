package studio4;

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

		// set variables with right names
		String shapeType; 
		int redComponent; 
		int greenComponent; 
		int blueComponent; 
		boolean isFilled; 
		double x;
		double y;
		double halfwidth; 
		double halfheight; 

		// read through text file in correct order
		shapeType = in.next();
		redComponent = in.nextInt();
		greenComponent = in.nextInt();
		blueComponent = in.nextInt();
		isFilled = in.nextBoolean();
		x = in.nextDouble(); 
		y = in.nextDouble(); 
		halfwidth = in.nextDouble(); 
		halfheight = in.nextDouble(); 


		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if (shapeType.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.filledRectangle(x, y, halfwidth, halfheight);
			}
			else {
				StdDraw.rectangle(x, y, halfwidth, halfheight);
			}
		}

		if (shapeType.equals("ellipse")) {
			if (isFilled == true) {
				StdDraw.filledEllipse(x, y, halfwidth, halfheight);
			}
			
			else {
				StdDraw.ellipse(x, y, halfwidth, halfheight);
			}
		}
	}
}
