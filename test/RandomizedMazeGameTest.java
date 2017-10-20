import org.junit.Test;

public class RandomizedMazeGameTest
{
  Class<?> c;
  
  public RandomizedMazeGameTest() {}
  
  @org.junit.Before
  public void setUp() throws Exception
  {
    try {
      c = Class.forName("RandomizedMazeGame");
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new Exception("Class RandomizedMazeGame does not exist");
    }
  }
  
  @Test
  public void testSuperClass() {
    if (!MasterTester7.hasSuperClass(c, "MazeGame")) {
      org.junit.Assert.fail("RandomizedMazeGame should extend MazeGame");
    }
  }
  
  @Test
  public void testAbstract() {
    if (MasterTester7.isAbstract(c)) {
      org.junit.Assert.fail("RandomizedMazeGame should not be abstract");
    }
  }
  
  @Test
  public void testNumFields() {
    if (!MasterTester7.hasNumFields(c, 0)) {
      org.junit.Assert.fail("RandomizedMazeGame should have 0 fields");
    }
  }
  
  @Test
  public void testNumMethods() {
    if (!MasterTester7.hasNumMethods(c, 1)) {
      org.junit.Assert.fail("RandomizedMazeGame should have 1 method");
    }
  }
  
  @Test
  public void testRandomizeMethod() {
    if (!MasterTester7.hasMethod(c, "randomize", Maze.class, new Class[] { Integer.TYPE })) {
      org.junit.Assert.fail("RandomizedMazeGame should have a \"randomize\" method that accepts an int parameter and returns a Maze object");
    }
  }
}
