package spring.boot.simplesdental.dto;

import java.time.LocalDate;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProfissionalDTO {
    private String nome;
    private String cargo;
    private LocalDate nascimento;
    private LocalDate created_date;
    private List<ContatoDTO> contatos;
}
