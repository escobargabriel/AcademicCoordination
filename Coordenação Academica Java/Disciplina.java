public class Disciplina{
    //Declaração de atributos da classe
    protected String nome;
    protected String id;
    protected int cargaHoraria;
    protected int cargaTeorica;
    protected int cargaPratica;
    protected int periodo;
    protected String ementa;
    protected String biblioBasica;
    protected String biblioComplementar;
    
    protected int cursoId;
    //Método contrutor da classe Disciplina
    public Disciplina(String nome,String id,int cargaHoraria,int cargaTeorica,int cargaPratica, int periodo,String ementa,String biblioBasica,String biblioComplementar,int cursoid){
        setNome(nome);
        setId(id);
        setCargaHoraria(cargaHoraria);
        setCargaPratica(cargaPratica);
        setCargaTeorica(cargaTeorica);
        setPeriodo(periodo);
        setEmenta(ementa);
        setBiblioBasica(biblioBasica);
        setBiblioComplementar(biblioComplementar);
        setCursoId(cursoId);
    }
    //método para alterar o identificador do curso
    public void setCursoId(int cursoId){
        this.cursoId = cursoId;
    }
    //Método para alterar carga horaria
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    //Método para alterar nome
    public void setNome(String nome){
        this.nome = nome;
    }
    //Método para alterar id (1 para obrigatória ou 2 para DCG)
    public void setId(String id){
        this.id = id;
    }
    
    //Método para alterar carga prática
    public void setCargaPratica(int cargaPratica){
        this.cargaPratica = cargaPratica;
    }
    //Método para alterar carga prática
    public void setCargaTeorica(int cargaTeorica){
        this.cargaTeorica = cargaTeorica;
    }
    //Método para alterar periodo da disciplina
    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }
    //Método para alterar ementa da disciplina
    public void setEmenta(String ementa){
        this.ementa = ementa;
    }
    //Método para alterar Bibliografia básica da disciplina
    public void setBiblioBasica(String biblioBasica){
        this.biblioBasica = biblioBasica;
    }
    
    //Método para alterar Bibliografia básica da disciplina
    public void setBiblioComplementar(String biblioComplementar){
        this.biblioComplementar = biblioComplementar;
    }

    public int getCursoId(){
        return cursoId;
    }
    //Método para retornar nome da disciplina
    public String getNome(){
        return nome;
    }
       //Método para retornar id da disciplina
    public String getId(){
        return id;
    }
        //Método para retornar carga horária da disciplina
    public int getCargaHoraria(){
        return cargaHoraria;
    }
        //Método para retornar carga horaria teorica da disciplina
    public int getCargaTeorica(){
        return cargaTeorica;
    }
        //Método para retornar carga horaria pratica da disciplina
    public int getCargaPratica(){
        return cargaPratica;
    }
        //Método para retornar ementa da disciplina
    public String getEmenta(){
        return ementa;
    }
        //Método para retornar periodo da disciplina
    public int getPeriodo(){
        return periodo;
    }
        //Método para retornar bibliografica basica da disciplina
    public String getBiblioBasica(){
        return biblioBasica;
    }
        //Método para retornar bibliografica complementa da disciplina
    public String getBiblioComplementar(){
        return biblioComplementar;
    }
    //Método para exibir todas as informações correspondentes a disciplina
    public String toString(){
        return "\n\nDisciplina de: " + nome + "\nCódigo da disciplina: " + id + " \nPeríodo correspondente: " + periodo +
        "\nCarga Horária total: " + cargaHoraria + "\nCarga horária Teórica: " + cargaTeorica + 
        "\nCarga horária Pratica: "+ cargaPratica +
        "\nEmenta:" + ementa + "\nBibliografia Básica: " + biblioBasica +
        "\nBibliografica Complementar: " + biblioComplementar;
    }
}   
    