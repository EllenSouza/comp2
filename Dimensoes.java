public class Dimensoes {
    private int comprimentoEmCentimetros;
    private int larguraEmCentimetros;
    private int volumeEmCentrimetrosCubicos;
    private int alturaEmCentimetros;

    public Dimensoes(){

    }
    public void setComprimentoEmCentimetros(int comprimentoEmCentimetros){
        this.comprimentoEmCentimetros=comprimentoEmCentimetros;
    }
    public int getComprimentoEmCentimetros() {
        return this.comprimentoEmCentimetros;
    }

    public void setLarguraEmCentimetros(int larguraEmCentimetros){
        this.larguraEmCentimetros=larguraEmCentimetros;
    }
    public int getLarguraEmCentimetros() {
        return this.larguraEmCentimetros;
    }

    public void setAlturaEmCentimetros(int alturaEmCentimetros){
        this.alturaEmCentimetros=alturaEmCentimetros;
    }
    public int getAlturaEmCentimetros() {
        return this.alturaEmCentimetros;
    }

    public void setVolumeEmCentrimetrosCubicos(int volumeEmCentrimetrosCubicos) {
        this.volumeEmCentrimetrosCubicos = volumeEmCentrimetrosCubicos;
    }
    public int getVolumeEmCentimetrosCubicos() {
        return this.volumeEmCentrimetrosCubicos;
    }
}
