import java.util.*;
public class ListaCurso {
   private ArrayList<Curso> lista = new ArrayList<Curso>();
   private Scanner sc;
   
   private Curso c = new Curso("Ciencia da computação","CC");
   private Curso  c1 = new Curso("Engenharia de software","ES");
   public ListaCurso() {
            sc = new Scanner(System.in);
            lista = new ArrayList<Curso>();
            lista.add(c);
            lista.add(c1);
        }
         public ArrayList<Curso> getLista(){
            return lista;
        }

      public void adicionar(){
            int opcao;
            char resposta;
        
            do{
                Curso curso =  new Curso("","");
                System.out.println("|                                                     |");
                System.out.println("|              Você escolheu cadastrar um curso!    |");
                System.out.println("---->Digite o nome do curso: ");
                curso.setNomeCurso(sc.nextLine());
                System.out.println("----> Digite o código do curso: ");
                curso.setCodigoCurso(sc.nextLine());
                System.out.println();
                /*System.out.println("---->Digite o nome da disciplina: ");
                curso.setNome(sc.nextLine());
                System.out.println("----> Digite o código da disciplina: ");
                curso.setId(sc.nextLine());
                System.out.println("----> Digite a carga horaria (total): ");
                curso.setCargaHoraria(sc.nextInt());
                System.out.println("----> Digite a carga horaria pratica: ");
                curso.setCargaPratica(sc.nextInt());
                System.out.println("----> Digite a carga horaria teorica: ");
                curso.setCargaTeorica(sc.nextInt());
                System.out.println("----> Digite a ementa da disciplina: ");
                curso.setEmenta(sc.nextLine());
                sc.nextLine();
                System.out.println("----> Digite o periodo(semestre) da disciplina: ");
                curso.setPeriodo(sc.nextInt());
                System.out.println("----> Digite a bibliografia basica ");
                curso.setBiblioBasica(sc.nextLine());
                sc.nextLine();
                System.out.println("----> Digite a bibliografia complementar");
                curso.setBiblioComplementar(sc.nextLine());
                System.out.println("----> Digite o tipo da disciplina (DCG,OBRIGATÓRIA)");
                curso.setTipo(sc.nextLine());*/
                lista.add(curso);
                System.out.println();
                System.out.println("|        Cadastro de curso realizado com sucesso!     |");
                System.out.println("|                                                     |");
    
                sc.nextLine();
                do{
                    System.out.println("----> Deseja cadastrar outro curso? (S/N)");
                    resposta = sc.nextLine().charAt(0);
                }while(resposta!='s' && resposta!='n');
            }while(resposta=='s');
        }
      
      
    
    
      public void consultarCurso() { 
            char resposta='n';
            int opcao;
            
            do{
               
            System.out.println("|                                                     |");
            System.out.println("|         Você escolheu procurar um curso!            |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.print  ("----> Digite o nome ou codigo do curso que deseja procurar ");
            String curso = sc.nextLine();
            System.out.println();

            for(int i=0;i<lista.size();i++) {
                Curso c = lista.get(i);
                if(c.toString().contains(curso)){
                    System.out.println(c);
                }
            }
    do{
                    System.out.print("----> Deseja procurar outr curso? (S/N)");
                    String temp = sc.nextLine();
                    resposta = temp.charAt(0);
                }while(resposta!='s' & resposta!='n');
            
            }while(resposta=='s');
        }
       public void deletarCurso(){
             char resposta='n';
        do{
                 
            System.out.println("|                                                     |");
            System.out.println("|          Você escolheu deletar um curso!            |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.println(" ---->Digite o nome do curso que deseja remover: ");
            String nome = sc.nextLine();
            System.out.println();
            for(int i=0;i<lista.size();i++) {
                Curso c = lista.get(i);
                if(c.getNomeCurso().equals(nome)){
                    lista.remove(c);
                    System.out.println(" ----> curso deletada com sucesso!               ");
                } 
                }
            do{
                System.out.print(" ----> Deseja remover outro curso? (s/n)");
                String temp = sc.nextLine();
                resposta = temp.charAt(0);
            }while(resposta!='s' & resposta!='n');
        }while(resposta=='s');
    }
    
    public String toString() {
                String msg = "                Os cursos cadastrados são:\n\n";
                for (Curso curso: lista) {
                    msg += "  ";
                    msg += curso;
                    msg += '\n';
                }
                if(lista.size()==0){
                    return "Nenhum curso cadastrada!";
                }
                return msg;
            }
        }

    
