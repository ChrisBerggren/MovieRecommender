package com.movierecommender;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WatchList {

    private List<Movie> movieList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("WatchList");
        WatchList watchList = new WatchList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a genre:");
        String genre = scanner.nextLine().toLowerCase();

        List<Movie> foundMovies = watchList.findMoviesByGenre(genre);
        foundMovies.forEach(movie -> System.out.println(movie.getName()));

        scanner.close();
    }

    private List<Movie> loadMovieList() {
        System.out.println("Loading movie list");

        Movie movie1 = Movie.builder().name("The Shawshank Redemption").genres(Arrays.asList("drama", "crime")).releaseDate(new Date()).build();
        Movie movie2 = Movie.builder().name("Dark Knight").genres(Arrays.asList("drama", "crime", "thriller")).releaseDate(new Date()).build();
        Movie movie3 = Movie.builder().name("Parasite").genres(Arrays.asList("drama", "thriller", "comedy")).releaseDate(new Date()).build();
        Movie movie4 = Movie.builder().name("The Notebook").genres(Arrays.asList("drama")).releaseDate(new Date()).build();

        movieList.addAll(Arrays.asList(movie1,movie2, movie3, movie4));

        return movieList;
    }

    private List<Movie> findMoviesByGenre(String genre) { //, List<Movie> movieList
        List<Movie> allMovies = loadMovieList();
        return allMovies.stream().filter(movie -> movie.getGenres().contains(genre)).collect(Collectors.toList());
    }
}