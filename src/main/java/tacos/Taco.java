package tacos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")         // : imiona min 2 litery (Jano, Io) x_X
    private String name;

    @Size(min = 1, message = "You must choose at least 1 ingreddient")        // : placek powinien być domyślny  x_X
    private List<String> ingredients;
}