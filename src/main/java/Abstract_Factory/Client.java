package Abstract_Factory;

import Abstract_Factory.Factories.GardenCreator;
import Abstract_Factory.Flowers.Flower;
import Abstract_Factory.Trees.Tree;

public class Client {
    private Tree tree;
    private Flower flower;

    public Client(GardenCreator gardenCreator) {
        tree = gardenCreator.createTree();
        flower = gardenCreator.createFlower();
    }
    public String check(){
        return "Garden created with " + tree.getTree() + " and " + flower.getFlower();
    }
}
