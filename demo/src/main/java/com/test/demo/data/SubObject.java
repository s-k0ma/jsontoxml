package com.test.demo.data;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class SubObject {
    private String b;

    public String getB(){
        return this.b;
    }

    public void setB(String str){
        this.b = str;
    }
}
