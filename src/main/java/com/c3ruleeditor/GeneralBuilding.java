package com.c3ruleeditor;

import com.c3ruleeditor.GeneralBuildingConfig;

public final class GeneralBuilding {
  public Integer buildingId;
  public String buildingName;
  public Integer buildingCost;
  public Integer initialDesirability;
  public Integer desirabilityStep;
  public Integer desirabilityStepSize;
  public Integer maxDesirabilityRange;
  public Integer employeesNeeded;
  public Integer undetermined1;
  public Integer undetermined2;

  public GeneralBuilding(
      Integer buildingId, String buildingName, Integer buildingCost,
      Integer initialDesirability, Integer desirabilityStep,
      Integer desirabilityStepSize, Integer maxDesirabilityRange,
      Integer employeesNeeded, Integer undetermined1, Integer undetermined2 
    ) {
    this.buildingId = buildingId;
    this.buildingName = buildingName;
    this.buildingCost = buildingCost;
    this.initialDesirability = initialDesirability;
    this.desirabilityStep = desirabilityStep;
    this.desirabilityStepSize = desirabilityStepSize;
    this.maxDesirabilityRange = maxDesirabilityRange;
    this.employeesNeeded = employeesNeeded;
    this.undetermined1 = undetermined1;
    this.undetermined2 = undetermined2;
  }

  public GeneralBuilding() {
    this.buildingId = 0;
    this.buildingName = "Untitled";
    this.buildingCost = 0;
    this.initialDesirability = 0;
    this.desirabilityStep = 0;
    this.desirabilityStepSize = 0;
    this.maxDesirabilityRange = 0;
    this.employeesNeeded = 0;
    this.undetermined1 = 0;
    this.undetermined2 = 0;
  }

  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    } else if (obj == null) {
      return false;
    } else if (obj instanceof GeneralBuilding) {
      GeneralBuilding other = (GeneralBuilding) obj;
      boolean truthiness = other.buildingId.equals(this.buildingId) &&
          other.buildingName.equals(this.buildingName) &&
          other.buildingCost.equals(this.buildingCost) &&
          other.initialDesirability.equals(this.initialDesirability) &&
          other.desirabilityStep.equals(this.desirabilityStep) &&
          other.desirabilityStepSize.equals(this.desirabilityStepSize) &&
          other.maxDesirabilityRange.equals(this.maxDesirabilityRange) &&
          other.employeesNeeded.equals(this.employeesNeeded) &&
          other.undetermined1.equals(this.undetermined1) &&
          other.undetermined2.equals(this.undetermined2);
      return truthiness;
    } else {
      return false;
    }
  }
}
