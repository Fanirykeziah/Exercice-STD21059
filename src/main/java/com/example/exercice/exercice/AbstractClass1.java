package com.example.exercice.exercice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {

    @Autowired
    protected ConcreteDependance1 dependance1 ;

    @Autowired
    protected ConcreteDependance2 dependance2;
}
