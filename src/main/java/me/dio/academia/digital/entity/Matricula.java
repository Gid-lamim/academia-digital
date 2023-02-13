package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matricula")


public class Matricula {

  private Long id;

  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
