package com.daveproject.External.ValueObject;

import com.daveproject.External.Entity.SendEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private SendEntity sendEntity;
    private BioEntity bioEntity;
}
