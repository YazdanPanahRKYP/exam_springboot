package fr.ipme.devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.synth.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
