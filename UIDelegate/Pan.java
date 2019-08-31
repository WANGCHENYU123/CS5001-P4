package UIDelegate;

/**
 * The Square class contains five attributes as the four boundaries of a line.
 * The constructor below takes in two pairs of Cartesian coordinates and
 * calculate the four attributes.
 * 
 * @author 180007800
 *
 */
public class Pan {
	private double xMin;
	private double yMin;
	private double xMax;
	private double yMax;
	private double disX;
	private double disY;

	public double getxMin() {
		return xMin;
	}

	public double getyMin() {
		return yMin;
	}

	public double getxMax() {
		return xMax;
	}

	public double getyMax() {
		return yMax;
	}

	/**
	 * This method generates a line that starts at the first point, points to the
	 * second point's direction and has the side length of the longer projection.
	 * 
	 * @param x1 x-coordinate of the first point.
	 * @param x2 x-coordinate of the second point.
	 * @param y1 y-coordinate of the first point.
	 * @param y2 y-coordinate of the second point.
	 * @return
	 */

	public Pan(double x1, double x2, double y1, double y2) {
		disX = Math.abs(x2 - x1);
		disY = Math.abs(y2 - y1);
		if (x2 > x1) {
			xMin = disX;
			xMax = 800 + disX;
		} else {
			xMin = -disX;
			xMax = 800 - disX;
		}
		if (y2 > y1) {
			yMin = disY;
			yMax = 800 + disY;
		} else {
			yMin = -disY;
			yMax = 800 - disY;
		}
	}
}