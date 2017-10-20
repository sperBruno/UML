import org.junit.Test;

public class MazeTest
{
  Class<?> c;
  
  public MazeTest() {}
  
  @org.junit.Before
  public void setUp() throws Exception
  {
    try {
      c = Class.forName("Maze");
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new Exception("Class Maze does not exist");
    }
  }
  
  @Test
  public void testSuperClass() {
    if (!MasterTester7.hasSuperClass(c, "Object")) {
      org.junit.Assert.fail("Maze should not extend anything");
    }
  }
  
  @Test
  public void testAbstract() {
    if (MasterTester7.isAbstract(c)) {
      org.junit.Assert.fail("Maze should not be abstract");
    }
  }
  
  @Test
  public void testNumFields() {
    if (!MasterTester7.hasNumFields(c, 1)) {
      org.junit.Assert.fail("Maze should have 1 field");
    }
  }
  
  @Test
  public void testRoomField() {
    if (!MasterTester7.hasPublicField(c, "Room[]", "rooms")) {
      org.junit.Assert.fail("Maze should have public Room[] field called rooms");
    }
  }
  
  @Test
  public void testNumMethods() {
    if (!MasterTester7.hasNumMethods(c, 1)) {
      org.junit.Assert.fail("Maze should have 1 method");
    }
  }
  
  @Test
  public void testAddRoomMethod() {
    if (!MasterTester7.hasMethod(c, "addRoom", Void.TYPE, new Class[] { Room.class })) {
      org.junit.Assert.fail("Maze should have a \"addRoom\" method that accepts a Room object parameter and returns void");
    }
  }
}
