package portable;

public interface Portable {
    default void play() {
        System.out.println(String.format("play the %s", getClass().getSimpleName()));
    }
}
