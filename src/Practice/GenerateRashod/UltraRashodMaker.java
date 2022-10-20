package Practice.GenerateRashod;

public class UltraRashodMaker implements IRashodMaker{
    @Override
    public IRashod createRashod() {
        return new UltraRashod();
    }
}
