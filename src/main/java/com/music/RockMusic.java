package com.music;

import org.springframework.stereotype.Component;

/**
 * @author Aleksei Chursin
 */

@Component
public class RockMusic implements Music{
    public String getSong() {
        return "Moscow calling";
    }
}
