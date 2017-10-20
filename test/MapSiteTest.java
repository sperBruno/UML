import org.junit.Test;

public class MapSiteTest
{
  Class<?> c;
  
  public MapSiteTest() {}
  
  @org.junit.Before
  public void setUp() throws Exception
  {
    try {
      c = Class.forName("MapSite");
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new Exception("Class MapSite does not exist");
    }
  }
  
  @Test
  public void testSuperClass() {
    if (!MasterTester7.hasSuperClass(c, "Object")) {
      org.junit.Assert.fail("MapSite should not extend anything");
    }
  }
  
  @Test
  public void testAbstract() {
    if (!MasterTester7.isAbstract(c)) {
      org.junit.Assert.fail("MapSite should be abstract class");
    }
  }
  
  @Test
  public void testNumFields() {
    if (!MasterTester7.hasNumFields(c, 0)) {
      org.junit.Assert.fail("MapSite should not have any fields");
    }
  }
  
  @Test
  public void testNumMethods() {
    if (!MasterTester7.hasNumMethods(c, 1)) {
      org.junit.Assert.fail("MapSite should have 1 method");
    }
  }
  
  @Test
  public void testEnterMethod() {
    if (!MasterTester7.hasMethod(c, "enter", Void.TYPE, new Class[0])) {
      org.junit.Assert.fail("MapSite should have an \"enter\" method that accepts no parameters and returns void");
    }
  }
}
