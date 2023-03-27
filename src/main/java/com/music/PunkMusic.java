package com.music;

import org.springframework.stereotype.Component;

/**
 * @author Aleksei Chursin
 */

@Component
public class PunkMusic implements Music{
    @Override
    public String getSong() {
        return "Idles";
    }
}
