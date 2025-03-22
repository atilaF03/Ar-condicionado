public class Splinter extends Ar {

    private String tipos, tamanhos;


    public Splinter(int codigo, String marca, int bTU, String statusDoAr, String tipos, String tamanhos) {
        super(codigo, marca, bTU, statusDoAr);
        this.tipos = tipos;
        this.tamanhos = tamanhos;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(String tamanhos) {
        this.tamanhos = tamanhos;
    }

 
    public void exibirInfo(){
    System.out.println("\ncodigo do Splinter: "+ getCodigo()+"\na marca é: "+getMarca()+"\nbtu: "+getBTU()+"\nstatus do ar: "+ getStatusDoAr()+"\ntipo do ar condicionado: "+ getTipos()+"\ntamanho: "+getTamanhos());

    }
}
