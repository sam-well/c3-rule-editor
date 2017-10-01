package com.c3ruleeditor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.c3ruleeditor.GeneralBuilding;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GeneralBuildingTest {
  private GeneralBuilding testBuilding;

  @BeforeEach
  public void init() {
    testBuilding = new GeneralBuilding();
  }

  @Nested
  public class GettersAndSetters {
    @Test
    public void testBuildingId() {
      testBuilding.buildingId = 1;
      assertEquals(testBuilding.buildingId, (Integer) 1);
    }

    @Test
    public void testBuildingName() {
      testBuilding.buildingName = "two";
      assertEquals(testBuilding.buildingName, (String) "two");
    }

    @Test
    public void testBuildingCost() {
      testBuilding.buildingCost = 3;
      assertEquals(testBuilding.buildingCost, (Integer) 3);
    }

    @Test
    public void testInitialDesirability() {
      testBuilding.initialDesirability = 4;
      assertEquals(testBuilding.initialDesirability, (Integer) 4);
    }

    @Test
    public void testDesirabilityStep() {
      testBuilding.desirabilityStep = 5;
      assertEquals(testBuilding.desirabilityStep, (Integer) 5);
    }

    @Test
    public void testDesirabilityStepSize() {
      testBuilding.desirabilityStepSize = 6;
      assertEquals(testBuilding.desirabilityStepSize, (Integer) 6);
    }

    @Test
    public void testMaxDesirabilityRange() {
      testBuilding.maxDesirabilityRange = 7;
      assertEquals(testBuilding.maxDesirabilityRange, (Integer) 7);
    }

    @Test
    public void testEmployeesNeeded() {
      testBuilding.employeesNeeded = 8;
      assertEquals(testBuilding.employeesNeeded, (Integer) 8);
    }

    @Test
    public void testUndetermined1() {
      testBuilding.undetermined1 = 9;
      assertEquals(testBuilding.undetermined1, (Integer) 9);
    }

    @Test
    public void testUndetermined2() {
      testBuilding.undetermined2 = 10;
      assertEquals(testBuilding.undetermined2, (Integer) 10);
    }
  }

  @Nested
  public class Equals {
    @Test
    public void returnsTrueWhenEqual() {
      testBuilding = new GeneralBuilding(
          1, "two", 3, 4, 5, 6, 7, 8, 9, 10);
      GeneralBuilding actual = new GeneralBuilding(
          1, "two", 3, 4, 5, 6, 7, 8, 9, 10);
      assertTrue(testBuilding.equals(actual));
    }

    @Test
    public void returnsFalseWhenInequal() {
      testBuilding = new GeneralBuilding(
          1, "two", 3, 4, 5, 6, 7, 8, 9, 10);
      GeneralBuilding actual = new GeneralBuilding(
          0, "two", 3, 4, 5, 6, 7, 8, 9, 10);
      assertFalse(testBuilding.equals(actual));
    }
  }

  @AfterEach
  public void tearDown() {
    testBuilding = null;
  }
}

