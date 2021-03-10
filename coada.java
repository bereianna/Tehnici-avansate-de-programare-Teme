public class coada {
    private int dimensiune;
    private int[] CoadaSir;
    private int primul;
    private int ultimul;
    private int nrCelule;

    public coada (int s){
        dimensiune=s;
        CoadaSir=new int[dimensiune];
        primul=0;
        ultimul=-1;
        nrCelule=0;
        
    }
    public void push(int j){
        if(ultimul==dimensiune-1)
            ultimul=-1;
        CoadaSir[++ultimul]=j;
        nrCelule++;
    }
    public int pop(){
        int temp=CoadaSir[primul++];
        if(primul==dimensiune)
            primul=0;
        nrCelule--;
        return temp;
    }
    public double peekFront(){
        return CoadaSir[primul];
    }
    public boolean CoadaGoala(){
        return (nrCelule==0);
    }
    public boolean CoadaPlina(){
        return (nrCelule==dimensiune);
    }
    public int size(){
        return nrCelule;
    }
}
class CoadaApp{
    public static void main(String[] args) {
        coada OCoada=new coada(10);
        OCoada.push(10);
        OCoada.push(20);
        OCoada.push(30);
        OCoada.push(40);
        OCoada.push(50);
        OCoada.pop();
        OCoada.pop();
        OCoada.pop();
        OCoada.push(60);
        OCoada.push(70);
        OCoada.push(80);
        OCoada.push(90);

        while(!OCoada.CoadaGoala()){
            double value=OCoada.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}