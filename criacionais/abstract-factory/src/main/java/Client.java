import console.Console;
import factory.NintendoFactory;
import factory.VideoGameFactory;
import portable.Portable;

public class Client {

   VideoGameFactory factory;

   public Client(VideoGameFactory videoGameFactory) {
        this.factory = videoGameFactory;
   }

   public void play() {

       Console console = factory.createConsole();
       console.play();

       Portable portable = factory.createPortable();
       portable.play();
   }
}
