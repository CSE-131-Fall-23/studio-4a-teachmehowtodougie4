package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.clear ();
		StdDraw.setPenColor (0, 0, 0);
		StdDraw.filledRectangle(1,1, 1, 1);
		
		
		StdDraw.setPenColor(26, 132, 79); 
		StdDraw.filledCircle(0.25, 0.25, 0.20);
		
		StdDraw.setPenColor (255, 165,0);
		StdDraw.text(0.25, 0.25, "How");
		
		
		StdDraw.setPenColor (255, 165,0);
		StdDraw.filledCircle(0.75, 0.75, 0.2);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.text(0.75, 0.75, "Me");
		

		StdDraw.setPenColor(200, 42, 69); 
		StdDraw.filledCircle(0.25, 0.75, 0.2);
		
		StdDraw.setPenColor(12, 100, 200); 
		StdDraw.text(0.25, 0.75, "Teach");
		
		
		StdDraw.setPenColor(12, 100, 200);
		StdDraw.filledCircle(0.75, 0.25, 0.2);
		StdDraw.setPenColor(200, 42, 69);
		StdDraw.text(0.75, 0.25, "To");
		

		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.5, 0.50, 0.10);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.text(0.5, 0.5, "Doug(ie)");
		
	}
}


