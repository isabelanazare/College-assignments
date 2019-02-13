package model;

public class PearTree implements Tree{
    private String name;
    private Integer age;

    public PearTree(String name, Integer age){
        this.name=name;
        this.age=age;
    }
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
}
