import java.util.ArrayList;

public class Gamer {
    public String nama;
    public int umur;
    public ArrayList<String> daftarGame;

    public Gamer() {
        this.nama = "lele";
        this.umur = 0;
    }

    public Gamer(String nama, int umur, ArrayList<String> daftarGame) {
        this.nama = nama;
        this.umur = umur;
        this.daftarGame = daftarGame;
    }

    public void ShowGames() {
        System.out.println("Daftar Game : ");
        for (int i = 0; i < this.daftarGame.size(); i++) {
            String daftar = this.daftarGame.get(i);
            System.out.println((i + 1) + " " + daftar);
        }
    }

    public void Play() {
        System.out.println(this.nama + " is playing...");
    }
}