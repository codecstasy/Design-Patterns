package Observer_Pattern;

public class Client {
    public static void main(String[] args) {
        Channel shattikMusic = new Channel("Shattik's Music");

        Subscriber s1 = new Subscriber("Arpita");
        Subscriber s2 = new Subscriber("Sanjana");
        Subscriber s3 = new Subscriber("Sajib");
        Subscriber s4 = new Subscriber("Iftekhar");

        shattikMusic.subscribeUser(s1);
        shattikMusic.subscribeUser(s2);
        shattikMusic.subscribeUser(s3);
        shattikMusic.subscribeUser(s4);

        shattikMusic.uploadVideo();
    }
}
