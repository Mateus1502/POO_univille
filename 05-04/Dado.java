public class Dado {
    int face;

    public int rolarDado() {
        face= (int) (Math.random()*6)+1;
        System.out.println("O dado caiu no:"+face);
        return face;
    }
}
