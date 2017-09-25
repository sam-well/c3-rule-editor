package com.c3ruleeditor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.c3ruleeditor.GeneralBuildingConfig;

public class GeneralBuildingConfigTest {
  public GeneralBuildingConfig testConfig;

  @BeforeEach
  public void init() {
    testConfig = new GeneralBuildingConfig();
  }

  @Nested
  public class GetBuildingCost {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.buildingCost = 1;
      assertEquals(testConfig.buildingCost, (Integer) 1);
    }
  }

  @Nested
  public class GetInitialDesirability {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.initialDesirability = 2;
      assertEquals(testConfig.initialDesirability, (Integer) 2);
    }
  }

  @Nested
  public class GetDesirabilityStep {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.desirabilityStep = 3;
      assertEquals(testConfig.desirabilityStep, (Integer) 3);
    }
  }

  @Nested
  public class GetDesirabilityStepSize {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.desirabilityStepSize = 4;
      assertEquals(testConfig.desirabilityStepSize, (Integer) 4);
    }
  }

  @Nested
  public class GetMaxDesirabilityRange {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.maxDesirabilityRange = 5;
      assertEquals(testConfig.maxDesirabilityRange, (Integer) 5);
    }
  }

  @Nested
  public class GetEmployeesNeeded {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.employeesNeeded = 6;
      assertEquals(testConfig.employeesNeeded, (Integer) 6);
    }
  }

  @Nested
  public class GetUndetermined1 {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.undetermined1 = 7;
      assertEquals(testConfig.undetermined1, (Integer) 7);
    }
  }

  @Nested
  public class GetUndetermined2 {
    @Test
    public void assertItReturnsTheCorrectValue() {
      testConfig.undetermined1 = 8;
      assertEquals(testConfig.undetermined1, (Integer) 8);
    }
  }

  @AfterEach
  public void tearDown() {
    testConfig = null;
  }

}

