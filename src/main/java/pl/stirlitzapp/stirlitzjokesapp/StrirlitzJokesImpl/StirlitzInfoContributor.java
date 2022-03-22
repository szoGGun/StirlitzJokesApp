package pl.stirlitzapp.stirlitzjokesapp.StrirlitzJokesImpl;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

public class StirlitzInfoContributor implements InfoContributor {

    private StirlitzJokes quotes = new StirlitzJokes();

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("Stirlitz", quotes.getRandomJoke());
    }
}
