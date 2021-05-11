import java.util.ArrayList;

public class Tournament {
    public static void main(String[] args) {
        ArrayList<String> game = new ArrayList<>();
        game.add("CSGO");
        game.add("Valorant");
        game.add("Dota");
        game.add("MHW");

        System.out.println("----");
        Gamer user = new Gamer("Ilham", 19, game);
        user.Play();
        user.ShowGames();

        System.out.println("----");
        YouTuber yt = new YouTuber(100, 500);
        yt.ShowSubAndView();
        yt.nama = "Ilham";
        yt.umur = 19;
        yt.daftarGame = game;
        yt.ShowGames();
        yt.Play();

        System.out.println("----");
        ProGamer gamer = new ProGamer();
        gamer.nama = "Ilham";
        gamer.umur = 19;
        gamer.daftarGame = game;
        gamer.ShowGames();
        gamer.Play();
    }
}
