package factory;

import console.Console;
import console.NintendoConsole;
import portable.NintendoPortable;
import portable.Portable;

public class NintendoFactory implements VideoGameFactory {

    @Override
    public Portable createPortable() {
        return new NintendoPortable();
    }

    @Override
    public Console createConsole() {
        return new NintendoConsole();
    }
}
