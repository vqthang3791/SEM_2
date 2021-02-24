package Java2.Lab2.Exercise1;

import java.util.ArrayList;

public class MovieList {
    private ArrayList<String> movieList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("    Movie List ");
        System.out.println("-----------------");

        MovieList list = new MovieList();
        list.addMovie("");
        list.displayList();
        list.updateMovie(4, "aaaaaaa");
        list.removeMovie(3);
        list.findMove("The room");

    }

    public void addMovie(String movie) {
        movieList.add("The room");
        movieList.add("The grudge");
        movieList.add("They Live");
        movieList.add("Moneyball");
        movieList.add("Memorist");
        System.out.println(movieList);
    }

    public void displayList() {
        System.out.println("You have " + movieList.size() + " item in list");
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println("Movie  " + (i + 1) + "  " + movieList.get(i));
        }
    }

    public void updateMovie(int index, String movie) {
        movieList.set(index, movie);
        System.out.println("Updated ");
        System.out.println("Movie  " + (index + 1) + " " + movie);
    }

    public void removeMovie(int index) {
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }

    public String findMove(String search) {
        int position = movieList.indexOf(search);
        if (position > 0) {
            return movieList.get(position);
        }
        return null;
    }
}

