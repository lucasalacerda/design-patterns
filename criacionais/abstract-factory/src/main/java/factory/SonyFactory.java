package factory;

import console.Console;
import console.SonyConsole;
import portable.Portable;
import portable.SonyPortable;

public class SonyFactory implements VideoGameFactory {

    @Override
    public Portable createPortable() {
        return new SonyPortable();
    }

    @Override
    public Console createConsole() {
        return new SonyConsole();
    }
}
