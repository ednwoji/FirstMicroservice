package com.daveproject.External.ValueObject;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BioEntity {



    private Long id;
    private String accno;
    private String cusname;
}
