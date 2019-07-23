public class App {

    public static void main(String[] args) {

        InstrumentFactory factory = new InstrumentFactory();

        Instrument guitar = factory.getInstrument(InstrumentName.GUITAR);
        guitar.play();

        Instrument bass = factory.getInstrument(InstrumentName.BASS);
        bass.play();

        Instrument drums = factory.getInstrument(InstrumentName.DRUMS);
        drums.play();

    }
}
