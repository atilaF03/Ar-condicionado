public class Ar {
    private int codigo;
    private String marca;
    private int BTU;
    private String statusDoAr;
    
    public Ar(int codigo, String marca, int bTU, String statusDoAr) {
        this.codigo = codigo;
        this.marca = marca;
        BTU = bTU;
        this.statusDoAr = statusDoAr;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBTU() {
        return BTU;
    }

    public void setBTU(int bTU) {
        BTU = bTU;
    }

    public String getStatusDoAr() {
        return statusDoAr;
    }

    public void setStatusDoAr(String statusDoAr) {
        this.statusDoAr = statusDoAr;
    }





    
}