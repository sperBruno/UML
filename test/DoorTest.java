import org.junit.Test;

public class DoorTest
{
  Class<?> c;
  
  public DoorTest() {}
  
  @org.junit.Before
  public void setUp() throws Exception
  {
    try {
      c = Class.forName("Door");
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new Exception("Class Door does not exist");
    }
  }
  
  @Test
  public void testSuperClass() {
    if (!MasterTester7.hasSuperClass(c, "MapSite")) {
      org.junit.Assert.fail("Door should extend MapSite");
    }
  }
  
  @Test
  public void testAbstract() {
    if (MasterTester7.isAbstract(c)) {
      org.junit.Assert.fail("Door should not be abstract");
    }
  }
  
  @Test
  public void testNumFields() {
    if (!MasterTester7.hasNumFields(c, 3)) {
      org.junit.Assert.fail("Door should have 3 fields");
    }
  }
  
  @Test
  public void testIsOpenField() {
    if (!MasterTester7.hasPublicField(c, "boolean", "isOpen")) {
      org.junit.Assert.fail("Door should have public field of type boolean called isOpen");
    }
  }
  
  @Test
  public void testRoom1Field() {
    if (!MasterTester7.hasPublicField(c, "Room", "room1")) {
      org.junit.Assert.fail("Door should have public field of type Room called room1");
    }
  }
  
  @Test
  public void testRoom2Field() {
    if (!MasterTester7.hasPublicField(c, "Room", "room2")) {
      org.junit.Assert.fail("Door should have public field of type Room called room2");
    }
  }
  
  @Test
  public void testNumMethods() {
    if (!MasterTester7.hasNumMethods(c, 1)) {
      org.junit.Assert.fail("Door should have 1 method");
    }
  }
  
  @Test
  public void testEnterMethod() {
    if (!MasterTester7.hasMethod(c, "enter", Void.TYPE, new Class[0])) {
      org.junit.Assert.fail("Door should have an \"enter\" method that accepts no parameters and returns void");
    }
  }
}
