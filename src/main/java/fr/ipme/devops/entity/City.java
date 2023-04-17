package fr.ipme.devops.entity;

import com.fasterxml.jackson.annotation.JsonView;
import fr.ipme.devops.views.Views;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.CityResponseView.class)
    private Long id;

    @JsonView(Views.CityResponseView.class)
    private String department_id;

    @JsonView(Views.CityResponseView.class)
    private String siren;
    @JsonView(Views.CityResponseView.class)
    private String population;
    @JsonView(Views.CityResponseView.class)
    private String name;
    @JsonView(Views.CityResponseView.class)
    private String code;


}
