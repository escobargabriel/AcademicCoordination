

import java.util.*;
public class ListaLivro {
   private ArrayList<Livro> lista = new ArrayList<Livro>();
   private Scanner sc;
   
   private Livro c = new Livro("Sttalings","Arquitetura de Computadores",5,"Cultura","São Paulo","SP",2009,675,8,"Arquitetura e Organização de Computadores I e II","Básica");
   private Livro  c1 = new Livro("Tanembaun","Redes de computadores",6,"Nova era","Rio de Janeiro","RJ",2005,480,6,"Redes de computadores e Comunicação de dados","Básica");
   
   public ListaLivro() {
     sc = new Scanner(System.in);
     lista = new ArrayList<Livro>();
     lista.add(c);
     lista.add(c1); 
   }
   public ArrayList<Livro> getLista(){
     return lista;
   }
      public void adicionar(){
            int opcao;
            char resposta;
        
            do{
                Livro livro =  new Livro("","",0,"","","",0,0,0,"","");
                System.out.println("|                                                     |");
                System.out.println("|              Você escolheu cadastrar um Livro!    |");
                System.out.println("---->Digite o nome dos autores: ");
                livro.setAutores(sc.nextLine());
                System.out.println("----> Digite o titulo do Livro: ");
                livro.setTitulo(sc.nextLine());
                System.out.println("----> Digite a edicao: ");
                livro.setEdicao(sc.nextInt());
                sc.nextLine();
                System.out.println("----> Digite a editora: ");
                livro.setEditora(sc.nextLine());
                System.out.println("----> Digite o nome da(s) disciplinas que o livro faz parte bibliografia  ");
                livro.setDisciplina(sc.nextLine());
                System.out.println("----> Digite a relação do livro com a disciplina (Bibliografia básica ou complementar): ");
                livro.setCategoria(sc.nextLine());
                System.out.println("----> Digite a cidade onde o livro foi impresso: ");
                livro.setCidadeImpress(sc.nextLine());
                System.out.println("----> Digite o estado onde o livro foi impresso: ");
                livro.setEstadoImpress(sc.nextLine());
                System.out.println("----> Digite o ano de publicação: ");
                livro.setAnoPublicacao(sc.nextInt());
                System.out.println("----> Digite o número de páginas do livro:");
                livro.setNumPaginas(sc.nextInt());
                System.out.println("----> Digite o número de cópias disponíveis");
                int aux = sc.nextInt();
                livro.setCopiasDisponiveis(aux);
                lista.add(livro);
                System.out.println();
                System.out.println("|        Cadastro de livro realizado com sucesso!     |");
                System.out.println("|                                                     |");
    
                sc.nextLine();
                do{
                    System.out.println("----> Deseja cadastrar outra disciplina? (s/n)");
                    resposta = sc.nextLine().charAt(0);
                }while(resposta!='s' && resposta!='n');
            }while(resposta=='s');
        }
      public void consultarLivro() { //método para busca de cliente por nome
            char resposta='n';
            int opcao;
            
            do{
            System.out.println("|                                                     |");
            System.out.println("|         Você escolheu procurar um livro!            |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.print  ("----> Digite o nome do autor ou o titulo do livro que deseja procurar ");
            String livro = sc.nextLine();
            System.out.println();
            for(int i=0;i<lista.size();i++) {
                Livro l = lista.get(i);
                if(l.toString().contains(livro)){
                    System.out.println(l);
                }
            }
    do{
                    System.out.print("----> Deseja procurar outro Livro? (s/n)");
                    String temp = sc.nextLine();
                    resposta = temp.charAt(0);
                }while(resposta!='s' & resposta!='n');
            
            }while(resposta=='s');
        }
       public void deletarLivro(){
             char resposta='n';
        do{
                 
            System.out.println("|                                                     |");
            System.out.println("|          Você escolheu deletar uma disciplina!          |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.println(" ---->Digite o titulo do livro que deseja remover: ");
            String nome = sc.nextLine();
            System.out.println();
            for(int i=0;i<lista.size();i++) {
                Livro l = lista.get(i);
                if(l.getTitulo().equals(nome)){
                    lista.remove(l);
                    System.out.println(" ----> Livro deletada com sucesso!               ");
                } 
                }
            do{
                System.out.print(" ----> Deseja remover outra disciplina? (s/n)");
                String temp = sc.nextLine();
                resposta = temp.charAt(0);
            }while(resposta!='s' & resposta!='n');
        }while(resposta=='s');
    }
    
    public String toString() {
                String msg = "                Os Livros cadastrados são:\n\n";
                for (Livro livro: lista) {
                    msg += "  ";
                    msg += livro;
                    msg += '\n';
                }
                if(lista.size()==0){
                    return "Nenhum livro cadastrado!";
                }
                return msg;
            }
        }

    
