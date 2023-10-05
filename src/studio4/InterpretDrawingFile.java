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
	
		String shape=null;
		int r  = 0;
		int g  = 0;
		int b  = 0;
		boolean isfilled=false;
		double[]array=new double[6];
		
		
		
		if(in.hasNext()) {
			shape = in.next();
		}
		
		if(in.hasNextInt()) {
			r =in.nextInt();
			
			g =in.nextInt();
			
			b =in.nextInt();
		}
		
		if(in.hasNextBoolean()) {
			isfilled = in.nextBoolean();
		}
		
		int i = 0;
		
		while(in.hasNextDouble()) {
				array[i] = in.nextDouble();
				i ++;
			}
			
		StdDraw.setPenColor(r,g,b);
		StdDraw.setPenRadius(0.5);
		
		
		
		if(isfilled==true) {
			if(shape.equals("rectangle")) {
			
				StdDraw.filledRectangle(array[0], array[1], array[2], array[3]);
			}
		}
		else if(isfilled==false) {
			if(shape.equals("rectangle")) {
				
				StdDraw.rectangle(array[0], array[1], array[2], array[3]);
			}
		}
		
		StdDraw.show();
		
		}
		
	}
	
	

