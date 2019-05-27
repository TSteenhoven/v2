public class Dora {

    /*Attributes*/
    private Graph g;

    /*Constructor*/
    public Dora(){
        this.g = new Graph();
    }

    public Dora(Graph g){
        this.g = g;
    }

    /*Methods*/

    //region Getters and setters

    public Graph getG() {
        return g;
    }

    public void setG(Graph g) {
        this.g = g;
    }

    //endregion

}
