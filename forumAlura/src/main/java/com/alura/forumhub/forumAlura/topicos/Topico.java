package com.alura.forumhub.forumAlura.topicos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name= "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String titulo;
    private String mensagem;
    private String autor;
    private String curso;
    private Boolean ativo;


    public Topico(dadosCadastroTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.ativo = true;
    }

    public void atulizarInformacoes(DadosAtualizacaoTopico atualizar) {
        if (atualizar.titulo() != null) {
            this.titulo = atualizar.titulo();
        }
        if (atualizar.mensagem() != null){
            this.mensagem = atualizar.mensagem();
        }
        if(atualizar.autor()!=null){
                this.autor =atualizar.autor();
        }
        if (atualizar.curso() != null){
            this.curso = atualizar.curso();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
