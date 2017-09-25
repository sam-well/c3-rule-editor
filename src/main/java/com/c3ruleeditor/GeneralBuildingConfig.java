package com.c3ruleeditor;

// import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class GeneralBuildingConfig {
  private Integer buildingCost;
  private Integer initialDesirability;
  private Integer desirabilityStep;
  private Integer desirabilityStepSize;
  private Integer maxDesirabilityRange;
  private Integer employeesNeeded;
  private Integer undetermined1;
  private Integer undetermined2;

  public GeneralBuildingConfig(
      Integer buildingCost, Integer initialDesirability, Integer desirabilityStep,
      Integer desirabilityStepSize, Integer maxDesirabilityRange,
      Integer employeesNeeded, Integer undetermined1, Integer undetermined2
  ) {
    this.buildingCost = buildingCost;
    this.initialDesirability = initialDesirability;
    this.desirabilityStep = desirabilityStep;
    this.desirabilityStepSize = desirabilityStepSize;
    this.maxDesirabilityRange = maxDesirabilityRange;
    this.employeesNeeded = employeesNeeded;
    this.undetermined1 = undetermined1;
    this.undetermined2 = undetermined2;
  }

  public Integer getBuildingCost() {
    return this.buildingCost;
  }

  public Integer getInitialDesirability() {
    return this.initialDesirability;
  }

  public Integer getDesirabilityStep() {
    return this.desirabilityStep;
  }

  public Integer getDesirabilityStepSize() {
    return this.desirabilityStepSize;
  }

  public Integer getMaxDesirabilityRange() {
    return this.maxDesirabilityRange;
  }

  public Integer getEmployeesNeeded() {
    return this.employeesNeeded;
  }

  public Integer getUndetermined1() {
    return this.undetermined1;
  }

  public Integer getUndetermined2() {
    return this.undetermined2;
  }
}
