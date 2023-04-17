package fr.ipme.devops.entity;

import com.fasterxml.jackson.annotation.JsonView;
import fr.ipme.devops.views.Views;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Region {

    @Id
    @GeneratedValue
    @JsonView(Views.RegionResponseView.class)
    private Long id;

    @JsonView(Views.RegionResponseView.class)
    private String name;
    @JsonView(Views.RegionResponseView.class)
    private String code;

}
