import org.testng.annotations.Test;

public class AnimalTest {

  @Test
  public void eat() {
//    throw new RuntimeException("Test not implemented");

	  Animal animal = new Animal("Dog", 1);

	  animal.eat();



  }

  @Test
  public void sleep() {
//    throw new RuntimeException("Test not implemented");
	  Animal animal = new Animal("Cat", 1);

	  animal.sleep();

  }
}
