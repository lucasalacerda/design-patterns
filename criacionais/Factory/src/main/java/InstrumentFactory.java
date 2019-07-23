public class InstrumentFactory {

    public Instrument getInstrument(InstrumentName instrumentName) {
        switch (instrumentName) {
            case GUITAR:
                return new Guitar();
            case BASS:
                return new Bass();
            case DRUMS:
                return new Drums();
            default:
                throw new RuntimeException("You must pass a valid Instrument: GUITAR, BASS, DRUMS");
        }

    }
}
