import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String [ ] args){

//        Graph g = new Graph();
//
//        g.addVertex("Timo");
//        g.addVertex("Marijke");
//        g.addVertex("Steven");
//        g.addVertex("Koen");
//
//        g.addEdge("Timo","Marijke");
//        g.addEdge("Marijke","Steven");
//        g.addEdge("Steven", "Koen");
//
//
//  //     g.removeVertex(g.vertexIterator("Timo"));
//
//        System.out.println("Gelukt!");

    Dora Explorer = new Dora();
    Koos Rekenkern = new Koos();

    Explorer.getG().addVertex(2);
    Explorer.getG().addEdge(1,2);

    Explorer.getG().addVertex(3);
    Explorer.getG().addVertex(4);
    Explorer.getG().addVertex(5);

        Explorer.getG().addEdge(1,2);
        Explorer.getG().addEdge(2,3);
        Explorer.getG().addEdge(3,4);
        Explorer.getG().addEdge(4,5);



    Explorer.getG().printGraph();
    Rekenkern.getG().printGraph();

    Rekenkern.update(Explorer.getG());

    Rekenkern.findPath(3);
    System.out.println(Rekenkern.getPath());



    System.out.println("Gelukt!");

    }












    /*Attributes*/
    /*Constructor*/
    /*Methods*/


}
