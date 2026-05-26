package com.ramos.control_pago.model;

import com.ramos.control_pago.enums.TipoEntidadEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="entidad_financiera")
public class EntidadFinanciera {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_entidad;

    @NotBlank
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entidad")
    private TipoEntidadEnum tipoEntidad;


}
