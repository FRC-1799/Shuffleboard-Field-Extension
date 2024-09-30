package com.example.simplewidget.data.type;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.api.util.Maps;

import com.example.simplewidget.data.Field2d;

import java.util.Map;
import java.util.function.Function;

/**
 * Represents data of the {@link Field2d} type.
 */
public final class PointType extends ComplexDataType<Field2d> {

  /**
   * The name of data of this type as it would appear in a WPILib sendable's {@code .type} entry; a differential drive
   * base a {@code .type} of "DifferentialDrive", a sendable chooser has it set to "String Chooser"; a hypothetical
   * 2D point would have it set to "Field2d".
   */
  private static final String TYPE_NAME = "Field2d";

  /**
   * The single instance of the point type. By convention, this is a {@code public static final}
   * field and the constructor is private to ensure only a single instance of the data type exists.
   */
  public static final PointType Instance = new PointType();

  private PointType() {
    super(TYPE_NAME, Field2d.class);
  }

  @Override
  public Function<Map<String, Object>, Field2d> fromMap() {
    return map -> new Field2d(
        Maps.getOrDefault(map, "x", 0),
        Maps.getOrDefault(map, "y", 0)
    );
  }

  @Override
  public Field2d getDefaultValue() {
    return new Field2d(0, 0);
  }
}
