package Abstract_Factory.Factories;

import Abstract_Factory.Flowers.Flower;
import Abstract_Factory.Flowers.Tulips;
import Abstract_Factory.Trees.Chenar;
import Abstract_Factory.Trees.Tree;

public class IranianGardenCreator implements GardenCreator{
    @Override
    public Tree createTree() {
        return new Chenar();
    }

    @Override
    public Flower createFlower() {
        return new Tulips();
    }
}
