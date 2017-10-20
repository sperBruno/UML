import java.lang.reflect.Field;

public class MasterTester7 {
  public MasterTester7() {}
  
  public static boolean hasSuperClass(Class<?> paramClass, String paramString) {
    return paramClass.getSuperclass().getSimpleName().equals(paramString);
  }
  
  public static boolean isAbstract(Class<?> paramClass) {
    return java.lang.reflect.Modifier.isAbstract(paramClass.getModifiers());
  }
  
  public static boolean hasFieldType(Class<?> paramClass, String paramString) {
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    for (Field localField : arrayOfField1) {
      if (localField.getType().getSimpleName().equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  



  public static boolean hasFieldName(Class<?> paramClass, String paramString)
  {
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    for (Field localField : arrayOfField1) {
      if (localField.getName().equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean hasPrivateField(Class<?> paramClass, String paramString1, String paramString2) {
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    for (Field localField : arrayOfField1) {
      if (localField.getName().equals(paramString2))
      {
        if (!localField.getType().getSimpleName().equals(paramString1))
          return false;
        if (!java.lang.reflect.Modifier.isPrivate(localField.getModifiers()))
          return false;
        return true;
      }
    }
    return false;
  }
  
  public static boolean hasPublicField(Class<?> paramClass, String paramString1, String paramString2)
  {
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    for (Field localField : arrayOfField1) {
      if (localField.getName().equals(paramString2)) {
        if (!localField.getType().getSimpleName().equals(paramString1))
          return false;
        if (!java.lang.reflect.Modifier.isPublic(localField.getModifiers()))
          return false;
        return true;
      }
    }
    return false;
  }
  
  public static boolean hasNumberOfFieldType(Class<?> paramClass, String paramString, int paramInt) {
    int i = 0;
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    for (Field localField : arrayOfField1) {
      if (localField.getType().getSimpleName().equals(paramString)) {
        i++;
      }
    }
    return i == paramInt;
  }
  
  public static boolean hasMethod(Class<?> paramClass1, String paramString, Class<?> paramClass2, Class<?>... paramVarArgs) {
    Object localObject1;
    if (paramVarArgs == null) {
      localObject1 = paramClass1.getDeclaredMethods();
      for (Object localObject3 : localObject1) {
        if (localObject3.getName().equals(paramString))
          return true;
      }
      return false;
    }
    

    try
    {
      localObject1 = paramClass1.getDeclaredMethod(paramString, paramVarArgs);
      if (!((java.lang.reflect.Method)localObject1).getReturnType().equals(paramClass2))
      {
        return false;
      }
      return true;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    
    return false;
  }
  
  public static boolean hasNumFields(Class<?> paramClass, int paramInt)
  {
    return paramClass.getDeclaredFields().length == paramInt;
  }
  
  public static boolean hasNumMethods(Class<?> paramClass, int paramInt) {
    return paramClass.getDeclaredMethods().length == paramInt;
  }
  
  public boolean implementsInterfaces(Class<?> paramClass, java.util.List<String> paramList) {
    Class[] arrayOfClass1 = paramClass.getInterfaces();
    int i = 0;
    for (Class localClass : arrayOfClass1) {
      if (!paramList.contains(localClass.getSimpleName())) {
        return false;
      }
      
      i++;
    }
    
    return paramList.size() == i;
  }
}
