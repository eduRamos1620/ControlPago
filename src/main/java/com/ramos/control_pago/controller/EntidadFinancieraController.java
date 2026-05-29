package com.ramos.control_pago.controller;

import com.ramos.control_pago.dtos.EntidadFinancieraDTO;
import com.ramos.control_pago.enums.EstatusEnum;
import com.ramos.control_pago.service.impl.EntidadFinancieraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody EntidadFinancieraDTO entidadFinancieraDTO) {
        try {
            servicesEntidad.save(entidadFinancieraDTO);
            return ResponseEntity.ok("Entidad financiera guardada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al guardar la entidad financiera: " + e.getMessage());
        }
    }
}
