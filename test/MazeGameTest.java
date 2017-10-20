import org.junit.Test;

public class MazeGameTest
{
  Class<?> c;
  
  public MazeGameTest() {}
  
  @org.junit.Before
  public void setUp() throws Exception
  {
    try {
      c = Class.forName("MazeGame");
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new Exception("Class MazeGame does not exist");
    }
  }
  
  @Test
  public void testSuperClass() {
    if (!MasterTester7.hasSuperClass(c, "Object")) {
      org.junit.Assert.fail("MazeGame should not extend anything");
    }
  }
  
  @Test
  public void testAbstract() {
    if (MasterTester7.isAbstract(c)) {
      org.junit.Assert.fail("MazeGame should not be abstract");
    }
  }
  
  @Test
  public void testNumFields() {
    if (!MasterTester7.hasNumFields(c, 0)) {
      org.junit.Assert.fail("MazeGame should have 0 fields");
    }
  }
  
  @Test
  public void testNumMethods() {
    if (!MasterTester7.hasNumMethods(c, 2)) {
      org.junit.Assert.fail("MazeGame should have 2 methods");
    }
  }
  
  @Test
  public void testCreateMazeMethod() {
    if (!MasterTester7.hasMethod(c, "createMaze", Maze.class, new Class[0])) {
      org.junit.Assert.fail("MazeGame should have a \"createMaze\" method that accepts no parameters and returns a Maze object");
    }
  }
  
  @Test
  public void testLoadMazeMethod() {
    if (!MasterTester7.hasMethod(c, "loadMaze", Void.TYPE, new Class[0])) {
      org.junit.Assert.fail("MazeGame should have a \"loadMaze\" method that accepts no parameters and returns void");
    }
  }
}
