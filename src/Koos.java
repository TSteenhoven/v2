import sun.security.provider.certpath.AdjacencyList;

public class Koos {

    /*Attributes*/
    private Graph g;
    private String Path;

    /*Constructor*/
    public Koos(){
        this.g = new Graph();
        this.Path="";
    }
    public Koos(Graph g){
        this.g = g;
    }
    /*Methods*/

    //region Getters and setters

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public Graph getG() {
        return g;
    }

    public void setG(Graph g) {
        this.g = g;
    }
    //endregion

    public void update(Graph g){
        this.g = g;
    }

    public String Path(Integer code){

        String Path = findPath(code);

        Path = Path + " 1";

        return Path;

    }

    public String findPath(Integer code){


        /* Blijf recurseren to hij gevonden is
        *  baseline: V1 staat in adjacencylist
        */
        Vertex v = this.g.vertexIterator(code);
        int x = v.smallAdjIterator(code);

        if (v.getCode() == 0){return "";}

        if (x > 0){ return (Path = Path + " " + v.getCode().toString() + findPath(x));}

        return Path;
    }


}
