import java.util.*;
public class Curso {
   private String nomeCurso;
   private String codigoCurso;
   private ListaDisciplina lista = new ListaDisciplina();
   public Curso(String nomeCurso, String codigoCurso){
       setNomeCurso(nomeCurso);
       setCodigoCurso(codigoCurso);
    }
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public void setCodigoCurso(String codigoCurso){
        this.codigoCurso = codigoCurso;
    }
    public String getNomeCurso(){
        return nomeCurso;
    }
    public String getCodigoCurso(){
        return codigoCurso;
    }
    
    public String toString(){
        return "\nNome do Curso: " + nomeCurso + "\nCodigo Curso: " +codigoCurso;
    }
}     
    