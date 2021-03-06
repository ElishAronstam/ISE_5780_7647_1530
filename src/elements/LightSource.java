package elements;

import Primitives.Color;
import Primitives.Point3D;
import Primitives.Vector;

/**
 *interface LightSource represents light sources in the scene
 * @author the quad
 *
 */
public interface LightSource {
    /**
     * Get light source intensity as it reaches a point I<sub>P</sub>
     *
     * @param p the lighted point
     * @return intensity I<sub>P</sub>
     */
    Color getIntensity(Point3D p);

    /**
     * Get normalized vector in the direction from light source
     * towards the lighted point
     *
     * @param p the lighted point
     * @return light to point vector
     */
    Vector getL(Point3D p);
    /**
     * @param point
     * @return distance
     */
    double getDistance(Point3D point);


}
