package com.cepav.facturacrud.services;

import com.cepav.facturacrud.models.Factura;


import java.util.List;

public interface IAllServices {
    public List<Factura> obtenerTodo();
    public Factura save(Factura factura);
    Factura findById(Long id);

    public void delete(Long id);

}
