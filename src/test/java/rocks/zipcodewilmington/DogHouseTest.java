package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        Dog dog = new Dog("Doggy", new Date(),1);
        DogHouse.add(dog);
        Dog d = DogHouse.getDogById(1);
        Assert.assertEquals(dog,d);

    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTestID() {
        DogHouse.clear();
        Dog d = new Dog("Doggy", new Date(),1);
        DogHouse.add(d);
        Dog e = DogHouse.getDogById(1);
        Assert.assertEquals(d,e);


        }
    // TODO - Create tests for `void remove(Dog dog)`
   @Test
    public void removeTest() {
    DogHouse.clear();
    Dog dog = new Dog("Doggy", new Date(),1);
    DogHouse.add(dog);
        Dog dog2 = new Dog("Doggy", new Date(),1);
        DogHouse.add(dog2);
    DogHouse.remove(dog);
    DogHouse.getDogById(1);
    Assert.assertEquals(1,DogHouse.getNumberOfDogs().intValue());
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        DogHouse.clear();
        Dog dog = new Dog("Doggy", new Date(),1);
        DogHouse.add(dog);
        Dog dv= DogHouse.getDogById(1);
        Assert.assertEquals(dog,dv);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
