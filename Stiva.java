class Stiva{
    private int maxSize;
    private double[] StivaSir;
    private int top;
    public Stiva(int s){
        maxSize=s;
        StivaSir=new double[maxSize];
        top=-1;
    }
    public void push(double j){
        StivaSir[++top]=j;
    }
    public double pop(){
        return StivaSir[top--];
    }
    public double peek(){
        return StivaSir[top];
    }
    public boolean StivaGoala(){
        return (top==-1);
    }
    public boolean StivaPlina(){
        return (top==maxSize-1);
    }
}
class StivaApp{
    public static void main(String[] args) {
        Stiva OStiva=new Stiva(10);
        OStiva.push(20);
        OStiva.push(40);
        OStiva.push(60);
        OStiva.push(80);
        while(!OStiva.StivaGoala()){
            double value=OStiva.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}