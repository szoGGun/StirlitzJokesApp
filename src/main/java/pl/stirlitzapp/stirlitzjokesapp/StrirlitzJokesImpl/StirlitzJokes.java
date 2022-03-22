package pl.stirlitzapp.stirlitzjokesapp.StrirlitzJokesImpl;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

public class StirlitzJokes {

    private List<String> jokes;

    public StirlitzJokes() {
        jokes = Arrays.asList(
                "Gestapo obstawiło wszystkie wyjścia, ale Stirlitz ich przechytrzył. Uciekł przez wejście.",
                "Stołówka Urzędu Bezpieczeństwa Rzeszy. Mueller, Himmler i Bormann cierpliwie stoją w kolejce. Stirlitz wchodzi i od ręki dostaje obiad. Mueller, Himmler i Bormann patrzą osłupiali. Nie wiedzą, że kobiety ciężarne i Bohaterowie Związku Radzieckiego obsługiwani są poza kolejnością.",
                "Stirlitzowi popsuła się radiostacja, a musiał rozesłać ważne meldunki do Warszawy i Pragi. Nie namyślając się długo, wsiadł na rower. Zadanie było wyjątkowo niebezpieczne, więc poprosił o wsparcie Müllera i Kaltenbrunera. Koledzy nie dali się długo namawiać. Ruszyli w drogę. O dziwo po drodze witały ich tłumy rozradowanych mieszkańców. W Trybunie Ludu, Neues Deutschland i Rudym Pravie można było śledzić poczynania śmiałków. Ku uciesze gawiedzi cali i zdrowi powrócili do Berlina. Stirlitz coś czuł, coś miarkował, ale jeszcze nie zdawał sobie sprawy, że była to pierwsza edycja Wyścigu Pokoju.",
                "Odcinek 333: Stirlitz myśli.",
                "Stirlitz zmiął papier, wrzucił do muszli i spuścił wodę. Meldunek dotarł do Centrali supertajnym kanałem.",
                "W kawiarni Elefant Stirlitz miał się spotkać z łącznikiem. Nie ustalono niestety żadnego znaku rozpoznawczego. Na szczęście łącznikowi zwisały spod marynarki szelki spadochronu.",
                "Stirlitz, wychodząc z baru, poczuł silne uderzenie w potylicę. Szybko odwrócił się – to był asfalt.",
                "Stirlitz wyszedł z piwiarni, upadł twarzą w błoto i zasnął. Za 15 minut obudzi się, wstanie i znowu zacznie ciężko pracować – da o sobie znać latami wypracowywany refleks.",
                "Bormann wsiadł do Mercedesa prowadzonego przez Stirlitza. Stirlitz dał gazu. Bormann ścisnął nos i wyskoczył z Mercedesa.",
                "Stirlitz twardo obstawał przy swoim. Tak, jak na początku rozmowy doradził mu Müller.",
                "Stirlitz nie lubił uczestnictwa w publicznych egzekucjach. Ale nie wypadało odmówić, gdy koledzy zapraszają na imprezę.",
                "Jako as szpiegów Stirlitz korzystał z cennych kontaktów. Korzystała z nich również jego gosposia podłączając do nich odkurzacz, tudzież inny sprzęt AGD.",
                "Stirlitz posłał Müllera do diabła. Następnego dnia diabła odwiedziło Gestapo."
        );
    }

    public String getRandomJoke() {
        return jokes.get(ThreadLocalRandom.current().nextInt(0, jokes.size()));
    }
}
