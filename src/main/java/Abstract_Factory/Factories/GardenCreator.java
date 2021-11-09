package Abstract_Factory.Factories;

import Abstract_Factory.Flowers.Flower;
import Abstract_Factory.Trees.Tree;

public interface GardenCreator {
    Tree createTree();
    Flower createFlower();
}
