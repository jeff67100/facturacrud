package com.cepav.facturacrud.repository;

import com.cepav.facturacrud.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public abstract interface AllRepository extends JpaRepository<Factura,Long>{
}
