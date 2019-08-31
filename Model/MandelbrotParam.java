package Model;

import java.io.Serializable;

/**
 * This class contains all the parameters for calculating and generating the
 * Mandelbrot Set image. The colour is changed in a preset order.
 * 
 * @author 180007800
 */
public class MandelbrotParam implements Serializable {
	private static final long serialVersionUID = 1L;
	// parameters values.
	private double minReal;
	private double minImag;
	private double maxReal;
	private double maxImag;
	private int maxIteration;
	private int xResolution;
	private int yResolution;
	// the colour scheme
	private String colorScheme;

	public MandelbrotParam(double minReal, double maxReal, double minImag, double maxImag, String colorScheme,
			int maxIteration) {
		this.minReal = minReal;
		this.minImag = minImag;
		this.maxReal = maxReal;
		this.maxImag = maxImag;
		this.colorScheme = colorScheme;
		this.maxIteration = maxIteration;
	}

	public double getMinReal() {
		return minReal;
	}

	public double getMinImag() {
		return minImag;
	}

	public double getMaxReal() {
		return maxReal;
	}

	public double getMaxImag() {
		return maxImag;
	}

	public String getColorScheme() {
		return colorScheme;
	}

	public int getxResolution() {
		return xResolution;
	}

	public int getyResolution() {
		return yResolution;
	}

	// the colour sequence.
	public String getNextColor(String colorScheme) {
		switch (colorScheme) {
		case "BlackWhite":
			return "Blue";
		case "Blue":
			return "Red";
		case "Red":
			return "Green";
		case "Green":
			return "Rainbow";
		case "Rainbow":
			return "BlackWhite";
		}
		return "BlackWhite";
	}

	public int getMaxIteration() {
		return maxIteration;
	}
}