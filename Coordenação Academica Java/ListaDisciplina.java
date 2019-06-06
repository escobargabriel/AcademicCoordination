import java.util.*;
public class ListaDisciplina {
   private ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
   private Scanner sc;
   private Curso curso;
   
   private Disciplina c = new Disciplina("Estruturas de dados I","EDI",60,30,30,2,"Pilhas, Filas,Listas, Matrizes","Estruturas de dados em c","Programando em c",1);
   private Disciplina  c1 = new Disciplina("Calculo I","CI",60,45,15,1,"Funções, Limites, Derivadas","Calculo I","Calculo Diferencial",12);
   private Disciplina  c2 = new Disciplina("Programação Orientada a Objetos","POO",60,30,30,4,"Gets, setters, encapsulamento, herança","Java, como programar","Big Java",8);
   private Disciplina  c3 = new Disciplina("Banco de dados I","BDI",60,30,30,4,"Modelo relacional, normalização,algebra booleana","Banco de dados","Modelagem de banco de dados",1);
   private Disciplina  c4 = new Disciplina("Matemática discreta","MD",60,45,15,2,"Indução matemática, grafos","Matemática discreta","Grafos",2);
   public ListaDisciplina() {
            sc = new Scanner(System.in);
            lista = new ArrayList<Disciplina>();
            lista.add(c);
            lista.add(c1);
            lista.add(c2);
            lista.add(c3);
            lista.add(c4);
        }
         public ArrayList<Disciplina> getLista(){
            return lista;
        }
      public void adicionar(){
            int opcao;
            char resposta;
        
            do{
                Disciplina disciplina =  new Disciplina("","",0,0,0,0,"","","",0);
                System.out.println("|                                                     |");
                System.out.println("|              Você escolheu cadastrar uma disciplina!    |");
                System.out.println("---->Digite o nome da disciplina: ");
                disciplina.setNome(sc.nextLine());
                System.out.println("----> Digite o código da disciplina: ");
                disciplina.setId(sc.nextLine());
                System.out.println("----> Digite a carga horaria (total): ");
                disciplina.setCargaHoraria(sc.nextInt());
                System.out.println("----> Digite a carga horaria pratica: ");
                disciplina.setCargaPratica(sc.nextInt());
                System.out.println("----> Digite a carga horaria teorica: ");
                disciplina.setCargaTeorica(sc.nextInt());
                System.out.println("----> Digite a ementa da disciplina: ");
                disciplina.setEmenta(sc.nextLine());
                sc.nextLine();
                System.out.println("----> Digite o periodo(semestre) da disciplina: ");
                disciplina.setPeriodo(sc.nextInt());
                System.out.println("----> Digite a bibliografia basica ");
                disciplina.setBiblioBasica(sc.nextLine());
                sc.nextLine();
                System.out.println("----> Digite a bibliografia complementar");
                disciplina.setBiblioComplementar(sc.nextLine());
                System.out.println("----> Digite o identificador do curso (Ler manual)");
                disciplina.setCursoId(sc.nextInt());
                
                lista.add(disciplina);
                System.out.println();
                System.out.println("|        Cadastro de disciplina realizado com sucesso!   |");
                System.out.println("|                                                     |");
    
                sc.nextLine();
                do{
                    System.out.println("----> Deseja cadastrar outra disciplina? (S/N)");
                    resposta = sc.nextLine().charAt(0);
                }while(resposta!='s' && resposta!='n');
            }while(resposta=='s');
        }
      
        
        
        
      public void consultarDisciplina() { //método para busca de cliente por nome
            char resposta='n';
            int opcao;
            
            do{
               
            System.out.println("|                                                     |");
            System.out.println("|         Você escolheu procurar uma disciplina!          |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.print  ("----> Digite o nome ou a ementa da disciplina que deseja procurar ");
            String disciplina = sc.nextLine();
            System.out.println();
            for(int i=0;i<lista.size();i++) {
                Disciplina d = lista.get(i);
                if(d.toString().contains(disciplina)){
                    System.out.println(d);
                }
            }
    do{
                    System.out.print("----> Deseja procurar outra disciplina? (S/N)");
                    String temp = sc.nextLine();
                    resposta = temp.charAt(0);
                }while(resposta!='s' & resposta!='n');
            
            }while(resposta=='s');
        }
       public void deletarDisciplina(){
             char resposta='n';
        do{
                 
            System.out.println("|                                                     |");
            System.out.println("|          Você escolheu deletar uma disciplina!          |");
            System.out.println("|                                                     |");
            System.out.println("|                                                     |");
            System.out.println(" ---->Digite o nome da disciplina que deseja remover: ");
            String nome = sc.nextLine();
            System.out.println();
            for(int i=0;i<lista.size();i++) {
                Disciplina d = lista.get(i);
                if(d.getNome().equals(nome)){
                    lista.remove(d);
                    System.out.println(" ----> disciplina deletada com sucesso!               ");
                } 
                }
            do{
                System.out.print(" ----> Deseja remover outra disciplina? (S/N)");
                String temp = sc.nextLine();
                resposta = temp.charAt(0);
            }while(resposta!='s' & resposta!='n');
        }while(resposta=='s');
    }
    //método para retornar disciplina
    
    public String toString() {
        String msg = "                As disciplinas cadastradas são:\n\n";
        for (Disciplina disciplina: lista) {
             msg += "  ";
             msg += disciplina;
             msg += '\n';
        }
        if(lista.size()==0){
            return "Nenhuma disciplina cadastrada!";
        }
            return msg;
    }


    public void imprimeDisciplinas(){
       System.out.println("Digite o código do curso que deseja  ver as disciplinas: ");
       String aux = sc.nextLine();
                          
            for(int i=0;i<lista.size();i++) {
                Disciplina d = lista.get(i);
                if(d.getCursoId() == 13){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 1 && aux == "CC"){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 2 && aux == "ES"){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 3 && aux == "EC"){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 4 && aux == "EM"){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 5 && aux == "EE"){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 6 && aux == "EA"){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 7 && aux == "ET"){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 8 && (aux == "CC" || aux == "ES")){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 9 && ( aux == "CC" || aux == "EE" || aux == "ET")){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 10 && (aux != "CC" && aux != "ES")){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 11 && (aux == "EE" || aux == "ET")){
                    System.out.println("Disciplina Obrigatória" + d);
                }
                if(d.getCursoId() == 12 && aux != "ES") {
                    System.out.println("Disciplina Obrigatória" + d);
                }
                else
                System.out.println("DCG " + d);
                
            }
    }

}

    
