package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;
/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		 int red = in.nextInt();
	        int green = in.nextInt();
	        int blue = in.nextInt();
	        StdDraw.setPenColor(red, green, blue);
        if (shapeType.equals("rectangle")) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            double halfWidth = in.nextDouble();
            double halfHeight = in.nextDouble();

                StdDraw.rectangle(x, y, halfWidth, halfHeight);
            }

        in.close();
	}
}
