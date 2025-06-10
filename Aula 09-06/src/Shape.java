public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name=name;

    }
    //Não temos uma figura especifica, por isso abstraimos
    public abstract double area();

    public String name(){
        return name;
    }
}
