package src;

import src.core.Event;
import src.core.Movie;
import src.core.Theatre;

public class Main {

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Середина", 2011, 17),
                new Movie("Чуть больше половины", 2012, 18),
                new Movie("Почти конец", 2013, 18),
                new Movie("Конец", 2019, 21),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Светлана Макронина", 2016, 16),
                new Theatre("Инга Валясина", 2001, 14),
                new Theatre("Сергей Каренин (не муж)", 2016, 14),
                new Theatre("Анна Каренина (полная тезка)", 2021, 21),
        };
    }

    public static void validEvent(Event event) {
        if (event.title.isEmpty() || event.releaseYear == 0 || event.age == 0) {
            throw new RuntimeException();
        }
    }

}
