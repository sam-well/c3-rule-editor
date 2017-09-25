package com.c3ruleeditor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;

import com.c3ruleeditor.GeneralBuildingConfig;

public class GeneralBuildingConfigTest {

  // @BeforeEach

  @Nested
  public class GetBuildingCost {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          expected, null, null, null, null, null, null, null
      );
      int actual = config.getBuildingCost();
      assertEquals(actual, expected);
    }
  }

  @Nested
  public class GetInitialDesirability {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          null, expected, null, null, null, null, null, null
      );
      int actual = config.getInitialDesirability();
      assertEquals(actual, expected);
    }
  }

  @Nested
  public class GetDesirabilityStep {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          null, null, expected, null, null, null, null, null
      );
      int actual = config.getDesirabilityStep();
      assertEquals(actual, expected);
    }
  }

  @Nested
  public class GetDesirabilityStepSize {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          null, null, null, expected, null, null, null, null
      );
      int actual = config.getDesirabilityStepSize();
      assertEquals(actual, expected);
    }
  }

  @Nested
  public class GetMaxDesirabilityRange {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          null, null, null, null, expected, null, null, null
      );
      int actual = config.getMaxDesirabilityRange();
      assertEquals(actual, expected);
    }
  }

  @Nested
  public class GetEmployeesNeeded {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          null, null, null, null, null, expected, null, null
      );
      int actual = config.getEmployeesNeeded();
      assertEquals(actual, expected);
    }
  }

  @Nested
  public class GetUndetermined1 {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          null, null, null, null, null, null, expected, null
      );
      int actual = config.getUndetermined1();
      assertEquals(actual, expected);
    }
  }

  @Nested
  public class GetUndetermined2 {
    @Test
    public void assertItReturnsTheCorrectValue() {
      int expected = 5;
      GeneralBuildingConfig config = new GeneralBuildingConfig(
          null, null, null, null, null, null, null, expected
      );
      int actual = config.getUndetermined2();
      assertEquals(actual, expected);
    }
  }

}

