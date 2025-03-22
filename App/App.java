import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Splinter> list1 = new ArrayList<>();
        ArrayList<Portatil> list2 = new ArrayList<>();
        int escolha = 0;

        while (escolha != 4) {
            System.out.println("==========menu==========");
            System.out.println("1- cadastrar tipo de ar condicionado");
            System.out.println("2- listar ar condicionado");
            System.out.println("3- encerrar");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("qual tipo de ar condicionado voce quer cadastrar");
                    System.out.println("1- splinter");
                    System.out.println("2- portatil");
                    int op = sc.nextInt();
                    sc.nextLine();
                    if (op == 1) {
                        System.out.println(" digite o codigo do ar condicionado Splinter");
                        int codigo = sc.nextInt();
                        sc.nextLine();
                        System.out.println(" a Marca do ar condicionado ");
                        String marca = sc.nextLine();
                        System.out.println("BTU da maquina:");
                        int btu = sc.nextInt();
                        sc.nextLine();
                        System.out.println("tipo de ar condicionado");
                        String tipo = sc.nextLine();
                        System.out.println("tamanho do ar condicionado");
                        String tamanho = sc.nextLine();
                        System.out.println("indique o status do ar condicioado");
                        String statusDoAr = sc.nextLine();
                        list1.add(new Splinter(codigo, marca, btu, statusDoAr, tipo, tamanho));

                    }
                    if (op == 2) {
                        System.out.println("codigo do portatil");
                        int codigo = sc.nextInt();
                        sc.nextLine();
                        System.out.println("marca do portatil");
                        String marca = sc.nextLine();
                        System.out.println("BTU do portatil");
                        int btu = sc.nextInt();
                        sc.nextLine();
                        System.out.println("digite o status do ar-condicionado");
                        String status = sc.nextLine();
                        System.out.println("voltagem do portatil");
                        int voltagem = sc.nextInt();
                        sc.nextLine();
                        System.out.println("cor do ar condicionado portatil");
                        String cor = sc.nextLine();
                        list2.add(new Portatil(codigo, marca, btu, status, voltagem, cor));
                    }

                    break;
                case 2:
                    for (Splinter split : list1) {
                        split.exibirInfo();

                    }
                    for (Portatil portatil : list2) {
                        portatil.exibirInfo();
                    }

                    break;
                case 3:
                    escolha = 4 ;
                default:
                    break;
            }

        }
        sc.close();
    }
}
