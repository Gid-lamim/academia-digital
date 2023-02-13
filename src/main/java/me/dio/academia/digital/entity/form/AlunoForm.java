package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//A anotação @Data nos dá os getters and setters
/*@Data is a convenient shortcut annotation
that bundles the features of @ToString,
@EqualsAndHashCode, @Getter / @Setter*/

//@NoArgsConstructor  gera um construtor sem parâmetros
//@AllArgsConstructor gera um construtor com todos os parâmetros

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

}
