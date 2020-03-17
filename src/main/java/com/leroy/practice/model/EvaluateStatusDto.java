package com.leroy.practice.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EvaluateStatusDto implements Serializable {

    private static final long serialVersionUID = 4853773895114230667L;


    private String evaluateCode;


    private String sceneCode;


    private String evaluateStatus;


    private String bizCode;


}
