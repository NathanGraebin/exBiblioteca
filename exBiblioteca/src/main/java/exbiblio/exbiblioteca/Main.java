/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exbiblio.exbiblioteca;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        
        String cadastrarTitulo;
        String cadastrarAutor;
        String cadastrarArea;
        String cadastrarEditora;
        String cadastrarAno;
        String cadastrarEdicao;
        String cadastrarTotalPaginas;
        
        
       
        
        Scanner Ler = new Scanner(System.in);
        
            
            Livros[] livros = new Livros[10];
            
            Usuario[] usuario = new Usuario[10];
                                   
            for (int i = 0; i < livros.length; i++){
            
             
            //livros[i] = new Livros("Tit "+i,"Aut"+i,"Area"+i,"Editora"+i,"Ano"+1,"Edicao"+1,"Total Paginas"+i);
            
            livros[i] = new Livros("","","","","","","","");
            
            usuario[i] = new Usuario("",0,"","");
            }
         
                     
            //livros.setTitulo(op1);
            //livros.setAutor("Autor Nathan");
            //livros.setArea("Area Nathan");
            //livros.setEditora("Editora Nathan");
            //livros.setAno("1994");
            //livros.setEdicao("Edicao Nathan");
            //livros.setTotalPaginas("190");
            
            
            
            
            // CADASTRO DOS LIVROS //
            
            // Devemos primeiramente verificar a disponibilidade de cadastro dentro da posição do vetor
            
            // então, usaremos o TITULO como verificação, caso ele verifique o Titulo e não encontre nada
            // ele vai cadastrar nessa posição do vetor
            
            //
            int opcao = -1;
            while (opcao != 0){
                int op;
                
                System.out.println("1 - CADASTRAR LIVRO");
                System.out.println("2 - MOSTRAR LIVROS"); 
                
                
                System.out.println("3 - CADASTRAR PESSOA");
                
                System.out.println("4 - FAZER EMPRESTIMO");
                
                System.out.println("0 - SAIR");
                
                op = Ler.nextInt();
                
                switch(op){
                    
                    
                    
                case 1:
                System.out.println("Cadastre um Livro");
                for (int i = 0; i < livros.length; i++){
                if(livros[i].getTitulo() == ""){
                System.out.println("A posição INDEX "+ i + " esta livre e sera usado para cadastrar");
                System.out.println("Vamos cadastrar um Livro");
                
                
                System.out.println("Titulo: ");
                cadastrarTitulo = Ler.next();
                
                livros[i] = new Livros(cadastrarTitulo,"","","","","","","");
                
                i = livros.length;
                
                }
                
                
                else{
                    System.out.println("A posição INDEX " + i + "esta ocupada, vamos para o proxima posição");
                    
                
                    }
                
                    }
                break;
                case 2:
                    for (int i = 0; i < livros.length; i++){
                    System.out.println("XXXXX LIVRO XXXXX " + " INDEX:"+i);    
                    System.out.println(livros[i].getTitulo());
                    System.out.println(livros[i].getAutor());
                    System.out.println(livros[i].getArea());
                    System.out.println(livros[i].getEditora());
                    System.out.println(livros[i].getAno());
                    System.out.println(livros[i].getEdicao());
                    System.out.println(livros[i].getTotalPaginas());
            }
                break;
                
                    case 3:
                    System.out.println("Cadastre um Usuario");
                    for (int i = 0; i < livros.length; i++){
                    if(usuario[i].getNome() == ""){
                    System.out.println("A posição INDEX "+ i + " esta livre e sera usado para cadastrar");
                    System.out.println("Vamos cadastrar uma pessoa");
                    String nome = Ler.next();
                    int idade = Ler.nextInt();
                    String sexo = Ler.next();
                    String telefone = Ler.next();
                    
                    usuario[i].cadastrarUsuario(nome,idade,sexo,telefone);
                    
                    System.out.println("Cadastro efetuado com sucesso");
                        
                        }
                    for (i = 0; i < livros.length; i++){
                       
                    System.out.println("XXXXX CADASTROS XXXXX " + " INDEX:"+i);    
                    System.out.println(usuario[i].getNome());
                    System.out.println(usuario[i].getIdade());
                    System.out.println(usuario[i].getSexo());
                    System.out.println(usuario[i].getTelefone());

                    }    
                        
                    
                
                     }
                    break;
                }
            
            }
}
}
    


