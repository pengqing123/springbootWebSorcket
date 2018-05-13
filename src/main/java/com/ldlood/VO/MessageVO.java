package com.ldlood.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ldlood on 2017/8/20.
 */
@Setter
@Getter
@Data
public class MessageVO {


    private Integer userNum;


    private Integer type;


    private String message;

    public void setType(int type) {
        this.type = type;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}