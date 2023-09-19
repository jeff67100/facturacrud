package com.cepav.facturacrud.services;

import com.cepav.facturacrud.models.Factura;
import com.cepav.facturacrud.repository.AllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllServicesImpl implements IAllServices{
    @Autowired
    AllRepository allRepository;
    @Override
    public List<Factura> obtenerTodo() {
        return allRepository.findAll();
    }

    @Override
    public Factura save(Factura factura) {
        return allRepository.save(factura);
    }

    @Override
    public Factura findById(Long id) {
        return allRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        allRepository.deleteById(id);

    }
}
