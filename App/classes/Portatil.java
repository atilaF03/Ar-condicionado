public class Portatil extends Ar {
    private int voltagem;
    private String Cor;



    public Portatil(int codigo, String marca, int bTU, String statusDoAr, int voltagem, String cor) {
        super(codigo, marca, bTU, statusDoAr);
        this.voltagem = voltagem;
        Cor = cor;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public void exibirInfo(){
        System.out.println("\ncodigo do Portatil: "+ getCodigo()+"\na marca é:"+getMarca()+"\nbtu: "+getBTU()+"\nstatus do ar: "+ getStatusDoAr()+"\ntipo do ar condicionado: "+ "\na voltagem é: "+getVoltagem()+ "\na cor do portatil é: "+ getCor());
    
        }
}
