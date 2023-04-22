package co.istad.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Author {
    // data of author
    @NotBlank
    private String username;

    @NotBlank
    private String fullName;

}
