import java.util.*; 
    public class TelaCurso{
    private ListaCurso lista = new ListaCurso();
    private Curso Curso;
    
    public void Questionario(){
        int opcao;
        int opcao2;
        char resposta;
        char resposa2 = 's';
        Scanner sc = new Scanner(System.in);
        
        
        
        do{
            
            System.out.println("|-----------------------------------------------------|");
            System.out.println("|                   SISTEMA DE CURSOS                 |");
            System.out.println("|                                                     |");
            System.out.println("|   Digite:                                           |");              
            System.out.println("|       [1] para visualizar cursos cadastradas        |");
            System.out.println("|       [2] adicionar um novo curso                   |");
            System.out.println("|       [3] para procurar um curso                    |");
            System.out.println("|       [4] deletar um curso                          |");
            System.out.println("|       [5] voltar ao menu.                           |");
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
                    System.out.println("Você escolheu procurar um curso!");
                    System.out.println("");
                    System.out.println("[1] para procurar curso ");
                    System.out.println("[2] para sair.");
                    opcao2 = sc.nextInt();
                    if(opcao2==1)
                        lista.consultarCurso();
                        else
                        System.out.println("Função desabilitada!");
                    }while(opcao2<2||opcao2>2);
            }
            if(opcao == 4){
                lista.deletarCurso();
            }   
        }while(opcao<5|opcao>5);
         }
    }