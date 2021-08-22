package src.core;

public abstract class Event {
    public String title;
    public int releaseYear;
    public int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.age = age;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Событие " + title + " " + releaseYear + " года премьеры не подходит для зрителей младше " + age + " лет";
    }
}
