package com.haydikodlayalim.repository;

import com.haydikodlayalim.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AdresRepository extends JpaRepository<Adres,Long> {
}
