import org.junit.Test;

public class RoomTest
{
  Class<?> c;
  
  public RoomTest() {}
  
  @org.junit.Before
  public void setUp() throws Exception
  {
    try {
      c = Class.forName("Room");
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new Exception("Class Room does not exist");
    }
  }
  
  @Test
  public void testSuperClass() {
    if (!MasterTester7.hasSuperClass(c, "MapSite")) {
      org.junit.Assert.fail("Room should extend MapSite");
    }
  }
  
  @Test
  public void testAbstract() {
    if (MasterTester7.isAbstract(c)) {
      org.junit.Assert.fail("Room should not be abstract");
    }
  }
  
  @Test
  public void testNumFields() {
    if (!MasterTester7.hasNumFields(c, 3)) {
      org.junit.Assert.fail("Room should have 3 fields");
    }
  }
  
  @Test
  public void testRoomNumberField() {
    if (!MasterTester7.hasPublicField(c, "int", "roomNumber")) {
      org.junit.Assert.fail("Room should have public field of type int called roomNumber");
    }
  }
  
  @Test
  public void testSidesField() {
    if (!MasterTester7.hasPublicField(c, "Wall[]", "sides")) {
      org.junit.Assert.fail("Room should have public field of type Wall[] called sides");
    }
  }
  
  @Test
  public void testMapSitesField() {
    if (!MasterTester7.hasPublicField(c, "MapSite[]", "mapsites")) {
      org.junit.Assert.fail("Room should have public field of type MapSite[] called mapsites");
    }
  }
  
  @Test
  public void testNumMethods() {
    if (!MasterTester7.hasNumMethods(c, 2)) {
      org.junit.Assert.fail("Room should have 2 methods");
    }
  }
  
  @Test
  public void testGetSideMethod() {
    if (!MasterTester7.hasMethod(c, "getSide", Wall.class, new Class[] { Integer.TYPE })) {
      org.junit.Assert.fail("Room should have a \"getSide\" method that accepts an int parameter and returns a Wall object");
    }
  }
  
  @Test
  public void testSetSideMethod() {
    Class[] arrayOfClass = new Class[2];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = Wall.class;
    MasterTester7.hasMethod(c, "setSide", Void.TYPE, arrayOfClass);
    if (!MasterTester7.hasMethod(c, "setSide", Void.TYPE, arrayOfClass)) {
      org.junit.Assert.fail("Room should have a \"setSide\" method that accepts int and Wall parameters and returns void");
    }
  }
}
