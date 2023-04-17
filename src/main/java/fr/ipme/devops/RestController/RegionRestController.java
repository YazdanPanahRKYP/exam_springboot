package fr.ipme.devops.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import fr.ipme.devops.service.RegionService;
import fr.ipme.devops.views.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.Region;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/region")
public class RegionRestController {

    private final RegionService regionService;

    @Autowired
    public RegionRestController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    @JsonView(Views.RegionResponseView.class)
    public List<Region> getRegiopnList() {
        return this.regionService.getAll();
    }

    @GetMapping(path = "{id}")
    @JsonView(Views.RegionResponseView.class)
    public Optional<Region> getRegionById(@PathVariable Long id) {
        return regionService.getReionById(id);
    }
}
