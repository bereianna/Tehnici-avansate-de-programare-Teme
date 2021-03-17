public class complex {
    //trei construcitori
    private int img, real;
    //primul primește doi parametri de tip int (primul desemnează partea reală a unui număr complex, al doilea partea imaginară)
    complex(int i, int r){
        img=i;
        real=r;
    }
    //al doilea nu primește niciun parametru și apelează primul constructor cu valorile 0 și 0
    complex(){
        complex a=new complex(0,0);
        img=a.img;
        real=a.real;
    }
    //iar al treilea reprezinta un copy constructor, care primește ca parametru un obiect de tip Complex, care este copiat în obiectul this
    complex(complex b){
        this.img=b.img;
        this.real=b.real;
    }
    //metode de tip getter și setter, prin care putem accesa membrii privați ai clasei
    //getter
    public int getComplexImg(){
        return this.img;
    }
    //setter
    public void getComplexReal(int i, int r){
        this.img=i;
        this.real=r;
    }
    // metodă de tip void numită addWithComplex, care primește ca parametru un obiect de tip Complex, prin care se adună numărul complex dat ca parametru la numărul care apelează funcția (adică la this)
    public void addWithComplex(complex c){
        this.img+=c.img;
        this.real+=c.real;
    }
    //metodă de tip void numita showNumber, prin care se afișează numărul complex

    public void showNumber(){
        System.out.printf("Sum is: "+ this.real+" + "+ this.img +"i");
    }

}
