package com.ramos.control_pago.controller;

import com.ramos.control_pago.dtos.EntidadFinancieraDTO;
import com.ramos.control_pago.enums.EstatusEnum;
import com.ramos.control_pago.service.impl.EntidadFinancieraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app/entidadFinanciera")
public class EntidadFinancieraController {

    @Autowired
    private EntidadFinancieraServices servicesEntidad;

    @GetMapping("/activos")
    public ResponseEntity<List<EntidadFinancieraDTO>> findByEntidadEstatusActivo() {
        List<EntidadFinancieraDTO> resultado = servicesEntidad.findByEntidadEstatusActivo();
        return ResponseEntity.ok(resultado);
    }

}
