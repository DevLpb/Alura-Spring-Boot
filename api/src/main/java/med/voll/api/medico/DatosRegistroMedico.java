package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico(
        @NotBlank //Valida que nombre no llegue nulo ni en blanco
        String nombre,

        @NotBlank
        @Email //Valida que se ingrese un formato email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //Valida que se respete un patrón
        String documento,

        @NotNull //En este caso se usa NotNull ya que se trata de un Enum
        Especialidad especialidad,

        @NotNull //En este caso se usa NotNull ya que se trata de un objeto
        @Valid
        DatosDireccion direccion) {
}
