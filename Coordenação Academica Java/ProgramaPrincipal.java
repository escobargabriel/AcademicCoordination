

import java.util.*;
public class ProgramaPrincipal{
    public static void main(String args[]){
        TelaProgramaPrincipal telaProgramaPrincipal = new TelaProgramaPrincipal();
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("-----------------------------------------------------");
            System.out.println("            Coordenação Acadêmica                    ");
            System.out.println("-----------------------------------------------------");
            System.out.println("        Selecione uma opção abaixo:                  ");
            System.out.println("[1] Opções                                           ");
            System.out.println("[2] Sair                                             ");
            System.out.println("-----------------------------------------------------");
            opcao = sc.nextInt();
            if(opcao==1){
                telaProgramaPrincipal.Questionario();
            }
        }while(opcao<2 | opcao>2);
    }
}