import java.util.ArrayList;
import java.util.Iterator;

public class Graph {
    /*Attributes*/
    private ArrayList<Vertex> VertexColl;

    /*Constructor*/
    public Graph(){
        VertexColl = new ArrayList<>();

    }

    /*Methods*/

    //region Gs and Ss

    public ArrayList<Vertex> getVertexColl() {
        return VertexColl;
    }

    public void setVertexColl(ArrayList<Vertex> vertexColl) {
        VertexColl = vertexColl;
    }
    //endregion

    //Add remove vertex

    public void addVertex(Integer code){
        Vertex v = new Vertex(code);
        v.addAdjacency(code);
        this.VertexColl.add(v);

    }

    public void removeVertex(Vertex v){

        this.VertexColl.remove(v);
    }
    //add remove edge
    public void addEdge(Integer code1, Integer code2){

        if(code1 == null && code2 !=  null){
            vertexIterator(code2).addAdjacency(code1);
        }
        else if(code1 != null && code2 == null){
            vertexIterator(code1).addAdjacency(code2);
        }
        else {
            vertexIterator(code1).addAdjacency(code2);
            vertexIterator(code2).addAdjacency(code1);
        }
    }

    public void removeEdge (){

    }


    public void printGraph(){

        for (Vertex v : VertexColl)
        {
            System.out.print(v.getCode());
            v.printAdjList();
        }
        System.out.print("\n");
    }








    //iterator code ===============================================

    public Vertex vertexIterator(Integer code){

        Iterator<Vertex> iterator = this.VertexColl.iterator();
        while (iterator.hasNext()){
            Vertex vertex = iterator.next();
            if (vertex.getCode().equals(code)){
                return vertex;
            }
        }


        return null;
    }



}
