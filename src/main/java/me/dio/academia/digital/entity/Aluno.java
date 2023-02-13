package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=xZYBH-Z7uZk
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})


public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Column(unique = true)
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  //um aluno pode ter várias avaliações
  //LAZY - carrega sob demanda apenas
  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
  @JsonIgnore
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
