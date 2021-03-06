package elements;

import Primitives.Vector;
import Primitives.Color;
import Primitives.Point3D;
import Primitives.Vector;

/**
 * directional light class
 */
public class DirectionalLight extends Light implements LightSource {
    /**
     * the direction of the light
     */
    private final Vector _direction;

    /**
     * Initialize directional light with it's intensity and direction, direction
     * vector will be normalized.
     *
     * @param colorintensity intensity of the light
     * @param direction      direction vector
     */
    public DirectionalLight(Color colorintensity, Vector direction) {
        _intensity = colorintensity;
        _direction = direction.normalized();
    }
    /**
     * @param p the lighted point is not used and is mentioned
     *          only for compatibility with LightSource
     * @return fixed intensity of the directionLight
     */
    @Override
    public Color getIntensity(Point3D p) {
        return super.getIntensity();
        //       return _intensity;
    }

    //instead of getDirection()

    /**
     *
     * @param p the lighted point
     * @return the direction of the light
     */
    @Override
    public Vector getL(Point3D p) {
        return _direction;
    }

    /**
     *
     * @param point
     * @return the distance betweeen
     */
    @Override
    public double getDistance(Point3D point) {
        return Double.POSITIVE_INFINITY;
    }


}

