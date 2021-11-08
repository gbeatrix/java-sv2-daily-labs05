package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> shows;

    public Movie(String title, List<LocalDateTime> shows) {
        this.title = title;
        this.shows = shows;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getShows() {
        return shows;
    }
}
