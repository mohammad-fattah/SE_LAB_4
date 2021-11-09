package Abstract_Factory.Factories;

import Abstract_Factory.Flowers.CherryBlossom;
import Abstract_Factory.Flowers.Flower;
import Abstract_Factory.Trees.JapaneseMaple;
import Abstract_Factory.Trees.Tree;

public class JapaneseGardenCreator implements GardenCreator{
    @Override
    public Tree createTree() {
        return new JapaneseMaple();
    }

    @Override
    public Flower createFlower() {
        return new CherryBlossom();
    }
}
