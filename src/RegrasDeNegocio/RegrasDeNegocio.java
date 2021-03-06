package RegrasDeNegocio;

public interface RegrasDeNegocio {
    
    public int GeradorDeForca();
    
    public int GeradorDeConstituicao();
    
    public int GeradorDeTamanho();
    
    public int GeradorDeDestreza();
    
    public int GeradorDeAparencia();
    
    public int GeradorDeInteligencia();
    
    public int GeradorDeEducacao();
    
    public int GeradorDePoder();
    
    public int GeradorDeSorte();
    
    public int GeradorDeMovimento(int forca, int destreza, int tamanho);
    
    public int GeradorDeBonusDeDanoCorporal(int forca, int tamanho);
    
    public int GeradorDeBuild(int forca, int tamanho);
    
}
