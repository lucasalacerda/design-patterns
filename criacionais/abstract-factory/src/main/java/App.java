import factory.NintendoFactory;
import factory.SonyFactory;
import factory.VideoGameFactory;

public class App {

    public static void main(String[] args) {

        System.out.println("----- Nintendo -----");
        VideoGameFactory nintendoFactory = new NintendoFactory();
        Client nintendoClient = new Client(nintendoFactory);

        nintendoClient.play();

        System.out.println("----- Sony -----");
        VideoGameFactory sonyFactory = new SonyFactory();
        Client sonyClient = new Client(sonyFactory);

        sonyClient.play();

    }
}
