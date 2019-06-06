

import java.util.*;
    public class TelaProgramaPrincipal{
       private TelaDisciplina telaDisciplina = new TelaDisciplina();
       private TelaLivro telaLivro = new TelaLivro();
       private TelaCurso telaCurso = new TelaCurso();
       
       public void Questionario(){
            int opcao;
            int opcao2;
            char resposta;
            char resposa2 = 's';
            Scanner sc = new Scanner(System.in);
          
            do{
            
                System.out.println("|                                                     |");
                System.out.println("|   Escolha uma das opções abaixo:                    |");            
                System.out.println("|             [1] menu de Cursos.                |");
                System.out.println("|             [2] menu de Disciplinas.                |");
                System.out.println("|             [3] menu de livros                      |");
                System.out.println("|             [4] para sair.                          |");
                System.out.println("|                                                     |");
    
                opcao = sc.nextInt();
                if(opcao == 1)
                telaCurso.Questionario();
                if(opcao == 2)
                    telaDisciplina.Questionario();
                if(opcao == 3)
                    telaLivro.Questionario();            
          }while(opcao<4|opcao>4);
        }
    }
    
