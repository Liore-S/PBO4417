public class Pembeli extends User{
    public int id;
    public String name;
    public int birthYear;
    public String alamat;
    public boolean buyerType;

    public Pembeli(){
        
        this.id = 0;
        this.name = "Ilham Ilyas";
        this.birthYear = 2001;
        this.alamat = "Semarang";
        this.buyerType = true;
        
    }

    public Pembeli(int id,String name, int birthYear,String alamat,boolean isBorongan){
        super(id,name,birthYear,alamat);
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.alamat = alamat;
        this.buyerType = isBorongan;
    };
}