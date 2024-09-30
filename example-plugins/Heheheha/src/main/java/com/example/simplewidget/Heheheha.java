package com.example.simplewidget;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import com.example.simplewidget.data.type.PointType;
import com.example.simplewidget.widget.HehehehaWidget;

import java.util.List;
import java.util.Map;

/**
 * An example plugin that provides a custom data type (a 2D point) and a simple widget for viewing such data.
 */
@Description(
    group = "com.example",
    name = "Heheheha",
    version = "2019.1.1",
    summary = "An Heheheha plugin that provides a Heheheha data type and a Heheheha widget for viewing it"
)
public final class Heheheha extends Plugin {

  @Override
  public List<DataType> getDataTypes() {
    return List.of(
        PointType.Instance
    );
  }

  @Override
  public List<ComponentType> getComponents() {
    return List.of(
        WidgetType.forAnnotatedWidget(HehehehaWidget.class)
    );
  }

  @Override
  public Map<DataType, ComponentType> getDefaultComponents() {
    return Map.of(
        PointType.Instance, WidgetType.forAnnotatedWidget(HehehehaWidget.class)
    );
  }
}
