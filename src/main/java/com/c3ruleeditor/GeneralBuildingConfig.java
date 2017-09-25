package com.c3ruleeditor;

public final class GeneralBuildingConfig {
  public Integer buildingCost;
  public Integer initialDesirability;
  public Integer desirabilityStep;
  public Integer desirabilityStepSize;
  public Integer maxDesirabilityRange;
  public Integer employeesNeeded;
  public Integer undetermined1;
  public Integer undetermined2;

  public GeneralBuildingConfig() {
    this.buildingCost = null;
    this.initialDesirability = null;
    this.desirabilityStep = null;
    this.desirabilityStepSize = null;
    this.maxDesirabilityRange = null;
    this.employeesNeeded = null;
    this.undetermined1 = null;
    this.undetermined2 = null;
  }

  public GeneralBuildingConfig(
      Integer buildingCost, Integer initialDesirability,
      Integer desirabilityStep, Integer desirabilityStepSize,
      Integer maxDesirabilityRange, Integer employeesNeeded,
      Integer undetermined1, Integer undetermined2
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
}
