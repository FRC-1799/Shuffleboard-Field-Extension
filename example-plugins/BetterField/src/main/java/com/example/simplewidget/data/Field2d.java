package com.example.simplewidget.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;

import java.util.Map;

/**
 * Represents a single point in two-dimensional space.
 */
public final class Field2d extends ComplexData<Field2d> {

  private final double x;
  private final double y;

  /**
   * Creates a new 2D point object.
   *
   * @param x the X-coordinate of the point
   * @param y the Y-coordinate of the point
   */
  public Field2d(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Gets the X-coordinate of this point.
   */
  public double getX() {
    return x;
  }

  /**
   * Gets the Y-coordinate of this point.
   */
  public double getY() {
    return y;
  }

  @Override
  public String toHumanReadableString() {
    // Generates a string formatted like: (x, y) for data recordings converted to a human-readable format
    return "(" + x + ", " + y + ")";
  }

  @Override
  public Map<String, Object> asMap() {
    return Map.of("x", x, "y", y);
  }
}
