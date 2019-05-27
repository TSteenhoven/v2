import java.util.ArrayList;
import java.util.Iterator;

public class Vertex {

    /*Attributes*/
    private Integer code;
    private ArrayList<Integer> AdjacencyList;

    /*Constructor*/
    public Vertex(Integer code){
        this.code = code;
        this.AdjacencyList = new ArrayList<Integer>();

    }
    /*Methods*/

    //region G en Ss

    public ArrayList<Integer> getAdjacencyList() {
        return AdjacencyList;
    }

    public Integer getCode() {
        return code;
    }

    public void setAdjacencyList(ArrayList<Integer> adjacencyList) {
        AdjacencyList = adjacencyList;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    //endregion

    public void addAdjacency(Integer code){
        this.AdjacencyList.add(code);
    }

    public void removeAdjacency(Integer code){
        this.AdjacencyList.remove(code);
    }

    public void printAdjList(){

        for (Integer i : AdjacencyList)
        {
            System.out.print("[" + i + "]");
        }
        System.out.print("\n");
    }
    //iterator code ===============================================

    public Integer adjIterator(Integer code){

        Iterator<Integer> iterator = this.AdjacencyList.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i == code){
                return i;
            }
        }
        return null;
    }

    public Integer smallAdjIterator(Integer code){

        Iterator<Integer> iterator = this.AdjacencyList.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i < code){
                return i;
            }
        }
        return 0;
    }

}
