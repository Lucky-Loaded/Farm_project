package uni.fmi;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import uni.fmi.models.Farm;
import uni.fmi.models.Animal;
import uni.fmi.models.Association;
import uni.fmi.models.Owner;

public class FirstTest {

  @Test
  public void testSetWithStrings() {
    final Set<String> testInstance = new HashSet<String>();
    String value1 = "value";
    testInstance.add(value1);
    String value2 = "value";
    testInstance.add(value2);
    String value3 = "value";
    testInstance.add(value3);
    assertEquals(1, testInstance.size());
  }
  
  @Test
  public void testSetWithFarm() {
    final Set<Farm> testInstance = new HashSet<Farm>();
    Farm value1 = new Farm();
    value1.setName("FamilyFarm");
    testInstance.add(value1);
    Farm value2 = new Farm();
    value2.setName("BerkShier");
    testInstance.add(value2);
    Farm value3 = new Farm();
    value3.setName("KonstantinovkaFarm");
    testInstance.add(value3);
    assertEquals(3, testInstance.size());
  }
  
  @Test
  public void testSetWithAnimal() {
    final Set<Animal> testInstance = new HashSet<Animal>();
    Animal value1 = new Animal();
    value1.setType("Cow");
    value1.setAge(12);
    testInstance.add(value1);
    Animal value2 = new Animal();
    value2.setType("Sheep");
    value2.setAge(4);
    testInstance.add(value2);
    assertEquals(2, testInstance.size());
  }
  
  @Test
  public void testSetWithAssociation() {
	  final Set<Association> testInstance = new HashSet<Association>();
	  Association value1 = new Association();
	    value1.setName("CowAssociation");
	    testInstance.add(value1);
	    Association value2 = new Association();
	    value2.setName("SheepAssociation");
	    testInstance.add(value2);
	    assertEquals(2, testInstance.size());
  }
  @Test
  public void testSetWithOwner() {
	  final Set<Owner> testInstance = new HashSet<Owner>();
	  Owner value1 = new Owner();
	    value1.setName("Cow");
	    value1.setAddress("Konstantinovka");
	    value1.setPhone("88005553535");
	    value1.setEmail("stu190@uni-plovdiv.bg");
	    testInstance.add(value1);
	    Owner value2 = new Owner();
	    value2.setName("Sheep");
	    value2.setAddress("Akimovka");
	    value2.setPhone("0896030470");
	    value2.setEmail("stu192@uni-plovdiv.bg");
	    testInstance.add(value2);
	    assertEquals(2, testInstance.size());
  }
}
