package hr.github.berislavmikulic.registration.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NonNull
    @NotBlank
    @Size(min=3, max = 50)
    private String userName;

    @NonNull
    @NotBlank
    @Size(min=8, max = 100)
    private String password;

    @NotBlank
    @Email
    private String email;

    private LocalDate dateOfBirth;
    private String address;
}
