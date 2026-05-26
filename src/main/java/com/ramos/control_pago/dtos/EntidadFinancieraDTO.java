package com.ramos.control_pago.dtos;

import com.ramos.control_pago.enums.TipoEntidadEnum;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntidadFinancieraDTO {

    private String nombre;
    private TipoEntidadEnum tipoEntidad;

}
