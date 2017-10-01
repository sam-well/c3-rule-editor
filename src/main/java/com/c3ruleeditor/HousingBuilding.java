package com.c3ruleeditor;

public final class HousingBuilding {
  public String buildingName;
  public Integer desirabilityDevolveLevel;
  public Integer desirabilityEvolveLevel;
  public Integer entertainmentNeeded;
  public Integer waterNeeded;
  public Integer templesNeededNearby;
  public Integer educationNeeded;
  public Integer marketAccess;
  public Integer barberAccess;
  public Integer bathAccess;
  public Integer foodsRequired;
  public Integer potteryRequired;
  public Integer oilRequired;
  public Integer furnitureRequired;
  public Integer winesRequired;
  public Integer crimeIncrement;
  public Integer crimeBase;
  public Integer prosperityCap;
  public Integer populationLimit;
  public Integer taxMultiplier;

  public HousingBuilding(
      String buildingName, Integer desirabilityDevolveLevel,
      Integer desirabilityEvolveLevel, Integer entertainmentNeeded,
      Integer waterNeeded, Integer templesNeededNearby,
      Integer educationNeeded, Integer marketAccess,
      Integer barberAccess, Integer bathAccess,
      Integer foodsRequired, Integer potteryRequired,
      Integer oilRequired, Integer furnitureRequired,
      Integer winesRequired, Integer crimeIncrement,
      Integer crimeBase, Integer prosperityCap,
      Integer populationLimit, Integer taxMultiplier) {
    this.buildingName = buildingName;
    this.desirabilityDevolveLevel = desirabilityDevolveLevel;
    this.desirabilityEvolveLevel = desirabilityEvolveLevel;
    this.entertainmentNeeded = entertainmentNeeded;
    this.waterNeeded = waterNeeded;
    this.templesNeededNearby = templesNeededNearby;
    this.educationNeeded = educationNeeded;
    this.marketAccess = marketAccess;
    this.barberAccess = barberAccess;
    this.bathAccess = bathAccess;
    this.foodsRequired = foodsRequired;
    this.potteryRequired = potteryRequired;
    this.oilRequired = oilRequired;
    this.furnitureRequired = furnitureRequired;
    this.winesRequired = winesRequired;
    this.crimeIncrement = crimeIncrement;
    this.crimeBase = crimeBase;
    this.prosperityCap = prosperityCap;
    this.populationLimit = populationLimit;
    this.taxMultiplier = taxMultiplier;
  }

  public HousingBuilding() {
    this.buildingName = "Untitled";
    this.desirabilityDevolveLevel = 0;
    this.desirabilityEvolveLevel = 0;
    this.entertainmentNeeded = 0;
    this.waterNeeded = 0;
    this.templesNeededNearby = 0;
    this.educationNeeded = 0;
    this.marketAccess = 0;
    this.barberAccess = 0;
    this.bathAccess = 0;
    this.foodsRequired = 0;
    this.potteryRequired = 0;
    this.oilRequired = 0;
    this.furnitureRequired = 0;
    this.winesRequired = 0;
    this.crimeIncrement = 0;
    this.crimeBase = 0;
    this.prosperityCap = 0;
    this.populationLimit = 0;
    this.taxMultiplier = 0;
  }

  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    } else if (obj == null) {
      return false;
    } else if (obj instanceof HousingBuilding) {
      HousingBuilding other = (HousingBuilding) obj;
      boolean truthiness = other.buildingName.equals(this.buildingName)
          && other.desirabilityDevolveLevel.equals(this.desirabilityDevolveLevel)
          && other.desirabilityEvolveLevel.equals(this.desirabilityEvolveLevel)
          && other.entertainmentNeeded.equals(this.entertainmentNeeded)
          && other.waterNeeded.equals(this.waterNeeded)
          && other.templesNeededNearby.equals(this.templesNeededNearby)
          && other.educationNeeded.equals(this.educationNeeded)
          && other.marketAccess.equals(this.marketAccess)
          && other.barberAccess.equals(this.barberAccess)
          && other.bathAccess.equals(this.bathAccess)
          && other.foodsRequired.equals(this.foodsRequired)
          && other.potteryRequired.equals(this.potteryRequired)
          && other.oilRequired.equals(this.oilRequired)
          && other.furnitureRequired.equals(this.furnitureRequired)
          && other.winesRequired.equals(this.winesRequired)
          && other.crimeIncrement.equals(this.crimeIncrement)
          && other.crimeBase.equals(this.crimeBase)
          && other.prosperityCap.equals(this.prosperityCap)
          && other.populationLimit.equals(this.populationLimit)
          && other.taxMultiplier.equals(this.taxMultiplier);
      return truthiness;
    } else {
      return false;
    }
  }
}
