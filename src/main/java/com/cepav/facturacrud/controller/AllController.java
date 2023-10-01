package com.cepav.facturacrud.controller;

import com.cepav.facturacrud.models.Factura;
import com.cepav.facturacrud.services.AllServicesImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;

@RestController
public class AllController {
    @Autowired
    private AllServicesImpl allServices;

    @GetMapping(value = "/factura")
    public List<Factura> getFactura(){
        return allServices.obtenerTodo();
    }
    @PostMapping(value = "/saveFactura")
    public String saveFactura(@RequestBody Factura factura){
        Factura nueva_factura = allServices.save(factura);
        return String.valueOf(new ResponseEntity<>(nueva_factura, HttpStatus.CREATED));

    }
@GetMapping(value = "/factura/{id}")
    public ResponseEntity<Factura> facturaById(@PathVariable long id){
        Factura facturaId = allServices.findById(id);

        return  ResponseEntity.ok(facturaId);
    }
@PutMapping(value = "/factura/{id}")
    public  ResponseEntity<Factura> update(@PathVariable long id, @RequestBody @NotNull Factura factura){
        Factura facturaId = allServices.findById(id);
        facturaId.setNombre(factura.getNombre());
        facturaId.setApellido(factura.getApellido());
        facturaId.setValor(factura.getValor());

        Factura facturaUpdate = allServices.save(facturaId);
        return new ResponseEntity<>(facturaUpdate, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/factura/{id}")
    public ResponseEntity<HashMap<String, Boolean>> delete(@PathVariable Long id){
        this.allServices.delete(id);
        HashMap<String,Boolean> deleteFactura = new HashMap<>();
        deleteFactura.put("Eliminado",true);
        return ResponseEntity.ok(deleteFactura);

    }
    public double ResponseEntity<Factura>{

    }






}
