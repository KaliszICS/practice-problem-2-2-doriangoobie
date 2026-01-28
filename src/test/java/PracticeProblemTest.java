import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

 @Test
   @DisplayName("")
   void compareStringSearchTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("compareStringSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{11, 4}, (int[]) method.invoke(null, new String[] {"A", "Zoo", "animal", "brood", "call", "d", "fall", "gorilla", "help", "python", "there"}, "about"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
   
    @Test
   @DisplayName("")
   void compareStringSearchTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("compareStringSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{9, 2}, (int[]) method.invoke(null, new String[] {"A", "Zoo", "animal", "brood", "call", "d", "fall", "gorilla", "help", "python", "there"}, "help"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
   
    @Test
   @DisplayName("")
   void compareStringSearchTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("compareStringSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{1, 3}, (int[]) method.invoke(null, new String[] {"A", "Zoo", "animal", "brood", "call", "d", "fall", "gorilla", "help", "python", "there"}, "A"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
   
  @Test
   @DisplayName("")
   void compareStringSearchTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("compareStringSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{6, 1}, (int[]) method.invoke(null, new String[] {"A", "Zoo", "animal", "brood", "call", "d", "fall", "gorilla", "help", "python", "there"}, "d"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void compareSearchTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("compareSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{10, 3}, (int[]) method.invoke(null, new int[] {1, 2, 3, 4, 5, 6, 67, 8, 9, 230, 555, 786, 923, 1000, 1500}, 230));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

 @Test
   @DisplayName("")
   void compareSearchTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("compareSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{1, 4}, (int[]) method.invoke(null, new int[] {1, 2, 3, 4, 5, 6, 67, 8, 9, 230, 555, 786, 923, 1000, 1500}, 1));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

 @Test
   @DisplayName("")
   void compareSearchTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("compareSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{8, 1}, (int[]) method.invoke(null, new int[] {1, 2, 3, 4, 5, 6, 7, 67, 200, 230, 555, 786, 923, 1000, 1500}, 67));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

 @Test
   @DisplayName("")
   void compareSearchTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int[].class, int.class };
         Method method = testClass.getDeclaredMethod("compareSearch", cArg);
         // Enter code here
         assertArrayEquals(new int[]{15, 4}, (int[]) method.invoke(null, new int[] {1, 2, 3, 4, 5, 6, 67, 8, 9, 230, 555, 786, 923, 1000, 1500}, 55));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
}
