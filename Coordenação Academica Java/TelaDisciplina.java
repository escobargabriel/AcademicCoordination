import java.util.*; 
    public class TelaDisciplina{
    private ListaDisciplina lista = new ListaDisciplina();
    
    public void Questionario(){
        int opcao;
        int opcao2;
        char resposta;
        char resposa2 = 's';
        Scanner sc = new Scanner(System.in);
        do{
            
            System.out.println("|-----------------------------------------------------|");
            System.out.println("|                   SISTEMA DE CADASTRO               |");
            System.out.println("|                                                     |");
            System.out.println("|   Digite:                                           |");              
            System.out.println("|       [1] para visualizar disciplinas cadastradas   |");
            System.out.println("|       [2] adicionar uma nova Disciplinas            |");
            System.out.println("|       [3] para procurar uma disciplina              |");
            System.out.println("|       [4] deletar uma disciplina                    |");
            System.out.println("|       [5] ver lista de disciplinas.                 |");
            System.out.println("|       [6] SAIR.                                        |");
            System.out.println("|-----------------------------------------------------|");
         
            opcao = sc.nextInt();
            sc.nextLine();   
         
         if(opcao == 1){
          System.out.println(lista);
         }
         if (opcao == 2){
                lista.adicionar();
         }
         if(opcao == 3){
             do{
                    System.out.println("Você escolheu procurar uma disciplina!");
                    System.out.println("");
                    System.out.println("[1] para procurar disciplina ");
                    System.out.println("[2] para sair.");
                    opcao2 = sc.nextInt();
                    if(opcao2==1)
                    lista.consultarDisciplina();
                    else
                        System.out.println("Função desabilitada!");
                    }while(opcao2<2||opcao2>2);
                }
               if(opcao == 4){
                   lista.deletarDisciplina();
                }   
                if(opcao == 5){
                    lista.imprimeDisciplinas();
                }
                }while(opcao<6|opcao>6);
         }
    }