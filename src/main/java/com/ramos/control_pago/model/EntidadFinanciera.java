package com.ramos.control_pago.model;

import com.ramos.control_pago.enums.EstatusEnum;
import com.ramos.control_pago.enums.TipoEntidadEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    private Long idEntidad;

    @NotBlank
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entidad")
    private TipoEntidadEnum tipoEntidad;

    @Enumerated(EnumType.STRING)
    @NotNull
    private EstatusEnum estatus = EstatusEnum.ACTIVO;

    @PrePersist
    public void prePersist(){
        if (estatus == null){
            estatus=EstatusEnum.ACTIVO;
        }
    }
}
