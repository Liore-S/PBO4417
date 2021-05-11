public class YouTuber extends Gamer {
    public int subscriber;
    public int viewer;

    public YouTuber(int subscriber, int viewer) {
        this.subscriber = subscriber;
        this.viewer = viewer;
    }

    public void ShowSubAndView() {
        System.out.println("Subs dan view " + this.nama);
        System.out.println("Subsciber : " + this.subscriber);
        System.out.println("Viewer : " + this.viewer);
    }
}
