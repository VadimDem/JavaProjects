package java_base;

public class Transformers {
    private int x;

    public Transformers(int x){
        this.x = x;
    }

    public double run(){
        x = x + 1;
        return x;
    }
    public static void main(String[] args){
        Transformers optimus = new Transformers(0);
        optimus.run();
        System.out.println(optimus.x);
        optimus.run();
        System.out.println(optimus.x);
    }
}


