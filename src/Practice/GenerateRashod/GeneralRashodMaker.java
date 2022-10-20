package Practice.GenerateRashod;

public class GeneralRashodMaker implements IRashodMaker{
    @Override
    public IRashod createRashod() {
        return new GeneralRashod();
    }
}
