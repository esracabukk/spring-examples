package com.haydikodlayalim.repository;

import com.haydikodlayalim.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface KisiRepository extends JpaRepository<Kisi,Long> {
}
