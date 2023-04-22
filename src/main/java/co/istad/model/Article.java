package co.istad.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Article {
        private UUID uuid;

        // has a relationship author
        @NotBlank(message = "Author is required....!")
        private Author author;

        @NotBlank(message = "Description is required....!")
        private String description;

        private String thumbnail;


}
