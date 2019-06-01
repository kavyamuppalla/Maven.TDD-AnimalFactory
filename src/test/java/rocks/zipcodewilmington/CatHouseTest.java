package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        Cat cat = new Cat("Kitty", new Date(), 1);
        CatHouse.add(cat);
        Assert.assertEquals(1,CatHouse.getNumberOfCats().intValue());


    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        CatHouse.remove(1);
        Assert.assertEquals(0,CatHouse.getNumberOfCats().intValue());

    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        CatHouse.clear();
        Cat cat = new Cat("Kitty", new Date(), 1);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertEquals(0,CatHouse.getNumberOfCats().intValue());

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatTest() {
        //Give
        Cat c = new Cat("Kitty", new Date(), 1);
        CatHouse.add(c);
        //When get cat by id integer id
        Cat actual = CatHouse.getCatById(1);

        //Then
        Assert.assertEquals(c,actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        CatHouse.clear();
        CatHouse.getNumberOfCats();
        Assert.assertEquals(0,CatHouse.getNumberOfCats().intValue());
    }
}
