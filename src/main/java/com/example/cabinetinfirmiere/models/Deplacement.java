package com.example.cabinetinfirmiere.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

@Table(name="deplacement")

public class Deplacement {
    @Id
    private int ID;
    private int patient_id;
    private String Date;
    private double cout;
    private int infimiere_id;

}
