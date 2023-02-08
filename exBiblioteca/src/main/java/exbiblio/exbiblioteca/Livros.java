/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exbiblio.exbiblioteca;

/**
 *
 * @author User
 */
public class Livros {

    private String Titulo;
    private String Autor;
    private String Area;
    private String Editora;
    private String Ano;
    private String Edicao;
    private String TotalPaginas;
    private String idLivro;
    
    

    public Livros(String Titulo, String Autor, String Area, String Editora, String Ano, String Edicao, String TotalPaginas,String idLivro) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Area = Area;
        this.Editora = Editora;
        this.Ano = Ano;
        this.Edicao = Edicao;
        this.TotalPaginas = TotalPaginas;
        this.idLivro = idLivro;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String Edicao) {
        this.Edicao = Edicao;
    }

    public String getTotalPaginas() {
        return TotalPaginas;
    }

    public void setTotalPaginas(String TotalPaginas) {
        this.TotalPaginas = TotalPaginas;
    }
    
    
}
