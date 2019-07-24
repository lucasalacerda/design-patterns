package console;

public interface Console {

    default void play() {
        System.out.println(String.format("play the %s", getClass().getSimpleName()));
    }
}
