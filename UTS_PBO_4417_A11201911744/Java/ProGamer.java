import java.util.Random;

public class ProGamer extends Gamer {


    public void Play() {
        Random random = new Random();
        int index = random.nextInt(this.daftarGame.size());
        String shuffleGame = this.daftarGame.get(index);
        System.out.println(this.nama + " is winning on " + shuffleGame);
    }
}
