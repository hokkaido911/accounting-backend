package com.guazi.finance.service.impl;


import com.guazi.finance.service.clear.IClearService;
import org.springframework.stereotype.Component;

@Component("clearService")
public class ClearServiceImpl implements IClearService {

    public void clear() {
        System.out.println("clear");
    }
}
