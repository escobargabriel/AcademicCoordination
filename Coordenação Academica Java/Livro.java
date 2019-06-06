
public class Livro{
    private String autores;
    private String titulo;
    private int edicao;
    private String editora;
    private String cidadeImpress;
    private String estadoImpress;
    private int anoPublicacao;
    private int numPaginas;
    private int copiasDisponiveis;
    private String disciplina;
    private String categoria;
    public Livro(String autores, String titulo, int edicao,String editora,String cidadeImpress,String estadoImpress, int anoPublicacao,int numPaginas,int copiasDisponiveis,String disciplina,String categoria){
        setAutores(autores);
        setTitulo(titulo);
        setEdicao(edicao);
        setEditora(editora);
        setCidadeImpress(cidadeImpress);
        setEstadoImpress(estadoImpress);
        setAnoPublicacao(anoPublicacao);
        setNumPaginas(numPaginas);
        setCopiasDisponiveis(copiasDisponiveis);    
        setDisciplina(disciplina);
        setCategoria(categoria);
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    
    public void setAutores(String autores){
            this.autores = autores;
    }
    public void setTitulo(String titulo){
            this.titulo = titulo;
    }
    public void setEdicao(int edicao){
            this.edicao = edicao;
    }
    public void setEditora(String editora){
            this.editora = editora;
    }
    public void setCidadeImpress(String cidadeImpress){
            this.cidadeImpress = cidadeImpress;
    }
    public void setEstadoImpress(String estadoImpress){
            this.estadoImpress = estadoImpress;
    }
    public void setAnoPublicacao(int anoPublicacao){
            this.anoPublicacao = anoPublicacao;
    }
    public void setNumPaginas(int numPaginas){
            this.numPaginas = numPaginas;
    }
    public void setCopiasDisponiveis(int copiasDisponiveis){
            this.copiasDisponiveis = copiasDisponiveis;
    }
     public String getAutores(){
            return autores;
     }
     public String getTitulo(){
           return titulo;
     }
     public int edicao(){
            return edicao;
     }
     public String getEditora(){
            return editora;
     }
     public String cidadeImpress(){
           return cidadeImpress;
     }
     public String estadoImpress(){
            return estadoImpress;
     }
     public int getAnoPublicacao(){
           return anoPublicacao;
     }
     public int getNumPaginas(){
           return numPaginas;
     }
     public int getCopiasDisponiveis(){
           return copiasDisponiveis;
     }
     public String toString(){
            return "\n\nInformações do livro: \nAutores: " + autores + "\nTitulo do livro: " + titulo + "\nEdicao: " + edicao + "\nEditora: " + editora +"\nCidade da impressao: " + cidadeImpress
            + "\nEstado da impressão: " + estadoImpress + "\nAno da publicacao: " + anoPublicacao + "\nNumero de paginas: " + numPaginas + "\nCopias disponíveis: " + copiasDisponiveis
            + "\nNome da disciplina: " + disciplina + "\nCategoria: " + categoria;
            
        }
    }
