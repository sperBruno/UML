import org.junit.Assert;
import org.junit.Test;

public class WallTest
{
  Class<?> c;
  
  public WallTest() {}
  
  @org.junit.Before
  public void setUp() throws Exception
  {
    try
    {
      c = Class.forName("Wall");
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new Exception("Class Wall does not exist");
    }
  }
  
  @Test
  public void testSuperClass() {
    if (!MasterTester7.hasSuperClass(c, "Object")) {
      Assert.fail("Wall should not extend anything");
    }
  }
  
  @Test
  public void testAbstract() {
    if (MasterTester7.isAbstract(c)) {
      Assert.fail("Wall should not be abstract");
    }
  }
  
  @Test
  public void testNumFields() {
    if (!MasterTester7.hasNumFields(c, 0)) {
      Assert.fail("Wall should have 0 fields");
    }
  }
  
  @Test
  public void testNumMethods() {
    if (!MasterTester7.hasNumMethods(c, 0)) {
      Assert.fail("Wall should have 0 methods");
    }
  }
}
