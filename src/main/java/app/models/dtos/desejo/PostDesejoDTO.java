package app.models.dtos.desejo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class PostDesejoDTO {
    private final String cpf;
    private final List<Integer> idDesejoList;
}
