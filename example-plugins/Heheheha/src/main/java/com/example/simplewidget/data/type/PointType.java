package com.example.simplewidget.data.type;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.api.util.Maps;

import com.example.simplewidget.data.Hehehe2d;

import java.util.Map;
import java.util.function.Function;

/**
 * Represents data of the {@link Hehehe2d} type.
 */
public final class PointType extends ComplexDataType<Hehehe2d> {

  /**
   * The name of data of this type as it would appear in a WPILib sendable's {@code .type} entry; a differential drive
   * base a {@code .type} of "DifferentialDrive", a sendable chooser has it set to "String Chooser"; a hypothetical
   * 2D point would have it set to "Hehehe2d".
   */
  private static final String TYPE_NAME = "Hehehe2d";

  /**
   * The single instance of the point type. By convention, this is a {@code public static final}
   * field and the constructor is private to ensure only a single instance of the data type exists.
   */
  public static final PointType Instance = new PointType();

  private PointType() {
    super(TYPE_NAME, Hehehe2d.class);
  }

  @Override
  public Function<Map<String, Object>, Hehehe2d> fromMap() {
    return map -> new Hehehe2d(
        Maps.getOrDefault(map, "x", 0),
        Maps.getOrDefault(map, "y", 0)
    );
  }

  @Override
  public Hehehe2d getDefaultValue() {
    return new Hehehe2d(0, 0);
  }
}
