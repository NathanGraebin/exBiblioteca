/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exbiblio.exbiblioteca;

/**
 *
 * @author User
 */
public class Usuario {
    private String Nome;
    private int Idade;
    private String Sexo;
    private String Telefone;
    
    

    public Usuario(String Nome, int Idade, String Sexo, String Telefone) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return "Nome: "+ Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public void cadastrarUsuario(String nome, int idade, String sexo, String telefone){
    this.Nome = nome;
    this.Idade = idade;
    this.Sexo = sexo;
    this.Telefone = telefone;
    }
}

