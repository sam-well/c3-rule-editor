package com.c3ruleeditor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.c3ruleeditor.HousingBuilding;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class HousingBuildingTest {
  private HousingBuilding testBuilding;

  @BeforeEach
  public void init() {
    testBuilding = new HousingBuilding();
  }

  @Nested
  public class GettersAndSetters {
    @Test
    public void testBuildingName() {
      testBuilding.buildingName = "one";
      assertEquals(testBuilding.buildingName, (String) "one");
    }

    @Test
    public void testDesirabilityDevolveLevel() {
      testBuilding.desirabilityDevolveLevel = 2;
      assertEquals(testBuilding.desirabilityDevolveLevel, (Integer) 2);
    }

    @Test
    public void testDesirabilityEvolveLevel() {
      testBuilding.desirabilityEvolveLevel = 3;
      assertEquals(testBuilding.desirabilityEvolveLevel, (Integer) 3);
    }

    @Test
    public void testEntertainmentNeeded() {
      testBuilding.entertainmentNeeded = 4;
      assertEquals(testBuilding.entertainmentNeeded, (Integer) 4);
    }

    @Test
    public void testWaterNeeded() {
      testBuilding.waterNeeded = 5;
      assertEquals(testBuilding.waterNeeded, (Integer) 5);
    }

    @Test
    public void testTemplesNeededNearby() {
      testBuilding.templesNeededNearby = 6;
      assertEquals(testBuilding.templesNeededNearby, (Integer) 6);
    }

    @Test
    public void testEducationNeeded() {
      testBuilding.educationNeeded = 7;
      assertEquals(testBuilding.educationNeeded, (Integer) 7);
    }

    @Test
    public void testMarketAccess() {
      testBuilding.marketAccess = 8;
      assertEquals(testBuilding.marketAccess, (Integer) 8);
    }

    @Test
    public void testBarberAccess() {
      testBuilding.barberAccess = 9;
      assertEquals(testBuilding.barberAccess, (Integer) 9);
    }

    @Test
    public void testBathAccess() {
      testBuilding.bathAccess = 10;
      assertEquals(testBuilding.bathAccess, (Integer) 10);
    }

    @Test
    public void testFoodsRequired() {
      testBuilding.foodsRequired = 11;
      assertEquals(testBuilding.foodsRequired, (Integer) 11);
    }

    @Test
    public void testPotteryRequired() {
      testBuilding.potteryRequired = 12;
      assertEquals(testBuilding.potteryRequired, (Integer) 12);
    }

    @Test
    public void testOilRequired() {
      testBuilding.oilRequired = 13;
      assertEquals(testBuilding.oilRequired, (Integer) 13);
    }

    @Test
    public void testFurnitureRequired() {
      testBuilding.furnitureRequired = 14;
      assertEquals(testBuilding.furnitureRequired, (Integer) 14);
    }

    @Test
    public void testWinesRequired() {
      testBuilding.winesRequired = 15;
      assertEquals(testBuilding.winesRequired, (Integer) 15);
    }

    @Test
    public void testCrimeIncrement() {
      testBuilding.crimeIncrement = 16;
      assertEquals(testBuilding.crimeIncrement, (Integer) 16);
    }

    @Test
    public void testCrimeBase() {
      testBuilding.crimeBase = 17;
      assertEquals(testBuilding.crimeBase, (Integer) 17);
    }

    @Test
    public void testProsperityCap() {
      testBuilding.prosperityCap = 18;
      assertEquals(testBuilding.prosperityCap, (Integer) 18);
    }

    @Test
    public void testPopulationLimit() {
      testBuilding.populationLimit = 19;
      assertEquals(testBuilding.populationLimit, (Integer) 19);
    }

    @Test
    public void testTaxMultiplier() {
      testBuilding.taxMultiplier = 20;
      assertEquals(testBuilding.taxMultiplier, (Integer) 20);
    }
  }

  @Nested
  public class Equals {
    @Test
    public void returnsTrueWhenEqual() {
      testBuilding = new HousingBuilding(
          "one", 2, 3, 4, 5, 6, 7, 8, 9, 10,
          11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
      HousingBuilding actual = new HousingBuilding(
          "one", 2, 3, 4, 5, 6, 7, 8, 9, 10,
          11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
      assertTrue(testBuilding.equals(actual));
    }

    @Test
    public void returnsFalseWhenInequal() {
      testBuilding = new HousingBuilding(
          "one", 2, 3, 4, 5, 6, 7, 8, 9, 10,
          11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
      HousingBuilding actual = new HousingBuilding(
          "onee", 2, 3, 4, 5, 6, 7, 8, 9, 10,
          11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
      assertFalse(testBuilding.equals(actual));
    }
  }

  @AfterEach
  public void tearDown() {
    testBuilding = null;
  }
}

