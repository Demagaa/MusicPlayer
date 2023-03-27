package com.music;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aleksei Chursin
 */

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class Config {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PunkMusic jazzMusic() {
        return new PunkMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}