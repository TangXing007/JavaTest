public class BrandPass extends Filter {
    double lowCutoff, highCutoff;
    public BrandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
