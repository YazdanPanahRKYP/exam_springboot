package fr.ipme.devops.service;

import fr.ipme.devops.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.Region;
import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    @Autowired
    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public List<Region> getAll() {
        return this.regionRepository.findAll();
    }

    public Optional<Region> getReionById(Long id) {
        return this.regionRepository.findById(id);
    }
}
