

import java.util.*; 
    public class TelaLivro{
    private ListaLivro lista = new ListaLivro();
    
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
            System.out.println("|       [1] para visualizar livros cadastradas        |");
            System.out.println("|       [2] adicionar um novo Livro                   |");
            System.out.println("|       [3] para procurar um Livro                    |");
            System.out.println("|       [4] deletar um Livro                          |");
            System.out.println("|       [5] voltar ao menu anterior.                  |");
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
                    System.out.println("Você escolheu procurar um Livro!");
                    System.out.println("");
                    System.out.println("[1] para procurar Livro ");
                    System.out.println("[2] para sair.");
                    opcao2 = sc.nextInt();
                    if(opcao2==1)
                    lista.consultarLivro();
                    else
                        System.out.println("Função desabilitada!");
                    }while(opcao2<2||opcao2>2);
                }
               if(opcao == 4){
                   lista.deletarLivro();
                }   
                }while(opcao<5|opcao>5);
         }
    }