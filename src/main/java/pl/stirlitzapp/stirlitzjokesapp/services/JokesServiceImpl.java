package pl.stirlitzapp.stirlitzjokesapp.services;

import org.springframework.stereotype.Service;
import pl.stirlitzapp.stirlitzjokesapp.StrirlitzJokesImpl.StirlitzJokes;

@Service
public class JokesServiceImpl implements JokesService {

    private final StirlitzJokes stirlitzJokes;

    public JokesServiceImpl(){
        this.stirlitzJokes = new StirlitzJokes();
    }

    @Override
    public String getJoke() {
        return stirlitzJokes.getRandomJoke();
    }
}
