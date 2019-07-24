package factory;

import console.Console;
import portable.Portable;

public interface VideoGameFactory {

    Portable createPortable();
    Console createConsole();
}
