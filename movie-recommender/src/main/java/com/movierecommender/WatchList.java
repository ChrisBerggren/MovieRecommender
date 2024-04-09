package com.movierecommender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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

        if (foundMovies.isEmpty()) {
            // Array of possible statements
            String[] noMoviesFoundStatements = {
                "These aren't the movies you're looking for... No movies found",
                "Houston, we have a problem... No movies found",
                "You can't handle the truth!... No movies found",
                "I have a bad feeling about this... No movies found",
                "I'm sorry, Dave. I'm afraid I can't do that... No movies found",
                "Frankly, my dear, I don't give any movies... No movies found",
                "You're gonna need a bigger boat... No movies found",
                "I feel the need... the need for movies... No movies found",
                "I'll be back... No movies found",
                "You've got to ask yourself one question: 'Do I feel lucky?' Well, do ya, punk?... No movies found",
                "Show me the movies!... No movies found",
                "You can't sit with us... No movies found",
                "Surely you can't be serious... No movies found (and don't call me Shirley)",
                "Movies? Where we're going, we don't need movies... No movies found",
                "Movies? We ain't got no movies! We don't need no movies! I don't have to show you any stinking movies!... No movies found",
                "You're killing me, Smalls!... No movies found",
                "Elementary, my dear Watson... No movies found",
                "I see dead results... No movies found",
                "Snap out of it!... No movies found",
                "Nobody puts movies in a corner... No movies found",
                "I'll get you, my pretty, and your little list of movies too!... No movies found",
                "Mirror, mirror on the wall, where's my movie list?... No movies found",
                "I'm sorry, Wilson!... No movies found",
                "I'm not bad. I'm just drawn that way... No movies found",
                "You talkin' to me?... No movies found",
                "Inconceivable!... No movies found",
                "The greatest trick the devil ever pulled was convincing the world there were no movies... No movies found",
                "You had me at '" + genre + "'... No movies found",
            };

            // Randomly select one statement
            Random rand = new Random();
            String selectedNoMoviesFoundStatement = noMoviesFoundStatements[rand.nextInt(noMoviesFoundStatements.length)];
            
            System.out.println(selectedNoMoviesFoundStatement);
        } else{
            System.out.println("Loading movie list...");
        }

        foundMovies.forEach(movie -> System.out.println(movie.getName()));

        System.out.println("\nThese are the movies we found. Enjoy!");

        scanner.close();
    }

    private List<Movie> loadMovieList() {

        Movie movie1 = Movie.builder().name("The Shawshank Redemption").genres(Arrays.asList("drama")).releaseYear(1994).build();
        Movie movie2 = Movie.builder().name("Dark Knight").genres(Arrays.asList("drama", "crime", "thriller")).releaseYear(2008).build();
        Movie movie3 = Movie.builder().name("Parasite").genres(Arrays.asList("drama", "thriller", "comedy")).releaseYear(2019).build();
        Movie movie4 = Movie.builder().name("The Notebook").genres(Arrays.asList("drama")).releaseYear(2004).build();
        Movie movie5 = Movie.builder().name("Inception").genres(Arrays.asList("action", "sci-fi", "thriller")).releaseYear(2010).build();
        Movie movie6 = Movie.builder().name("Pulp Fiction").genres(Arrays.asList("crime", "drama")).releaseYear(1994).build();
        Movie movie7 = Movie.builder().name("The Matrix").genres(Arrays.asList("action", "sci-fi")).releaseYear(1999).build();
        Movie movie8 = Movie.builder().name("The Godfather").genres(Arrays.asList("crime", "drama")).releaseYear(1972).build();
        Movie movie9 = Movie.builder().name("Fight Club").genres(Arrays.asList("drama", "thriller")).releaseYear(1999).build();
        Movie movie10 = Movie.builder().name("The Lord of the Rings: The Fellowship of the Ring").genres(Arrays.asList("adventure", "fantasy")).releaseYear(2001).build();
        
        Movie movie11 = Movie.builder().name("The Avengers").genres(Arrays.asList("action", "sci-fi")).releaseYear(2012).build();
        Movie movie12 = Movie.builder().name("Forrest Gump").genres(Arrays.asList("drama", "romance")).releaseYear(1994).build();
        Movie movie13 = Movie.builder().name("The Lion King").genres(Arrays.asList("animation", "adventure", "drama")).releaseYear(1994).build();
        Movie movie14 = Movie.builder().name("Interstellar").genres(Arrays.asList("adventure", "drama", "sci-fi")).releaseYear(2014).build();
        Movie movie15 = Movie.builder().name("The Dark Knight Rises").genres(Arrays.asList("action", "thriller")).releaseYear(2012).build();
        Movie movie16 = Movie.builder().name("Inglourious Basterds").genres(Arrays.asList("adventure", "drama", "war")).releaseYear(2009).build();
        Movie movie17 = Movie.builder().name("The Godfather: Part II").genres(Arrays.asList("crime", "drama")).releaseYear(1974).build();
        Movie movie18 = Movie.builder().name("The Social Network").genres(Arrays.asList("biography", "drama")).releaseYear(2010).build();
        Movie movie19 = Movie.builder().name("The Silence of the Lambs").genres(Arrays.asList("crime", "drama", "thriller")).releaseYear(1991).build();
        
        Movie movie20 = Movie.builder().name("The Departed").genres(Arrays.asList("crime", "drama", "thriller")).releaseYear(2006).build();
        Movie movie21 = Movie.builder().name("The Prestige").genres(Arrays.asList("drama", "mystery", "thriller")).releaseYear(2006).build();
        Movie movie22 = Movie.builder().name("The Great Gatsby").genres(Arrays.asList("drama", "romance")).releaseYear(2013).build();
        Movie movie23 = Movie.builder().name("The Revenant").genres(Arrays.asList("adventure", "drama", "thriller")).releaseYear(2015).build();
        Movie movie24 = Movie.builder().name("La La Land").genres(Arrays.asList("comedy", "drama", "music")).releaseYear(2016).build();
        Movie movie25 = Movie.builder().name("The Wolf of Wall Street").genres(Arrays.asList("biography", "comedy", "crime")).releaseYear(2013).build();
        Movie movie26 = Movie.builder().name("Gone Girl").genres(Arrays.asList("crime", "drama", "mystery")).releaseYear(2014).build();
        Movie movie27 = Movie.builder().name("The Grand Budapest Hotel").genres(Arrays.asList("adventure", "comedy", "crime")).releaseYear(2014).build();
        Movie movie28 = Movie.builder().name("Whiplash").genres(Arrays.asList("drama", "music")).releaseYear(2014).build();
        Movie movie29 = Movie.builder().name("The Green Mile").genres(Arrays.asList("crime", "drama", "fantasy")).releaseYear(1999).build();
        Movie movie30 = Movie.builder().name("The Princess Bride").genres(Arrays.asList("adventure", "comedy", "fantasy")).releaseYear(1987).build();

        movieList.addAll(Arrays.asList(movie1,movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10));
        movieList.addAll(Arrays.asList(movie11, movie12, movie13, movie14, movie15, movie16, movie17, movie18, movie19, movie20));
        movieList.addAll(Arrays.asList(movie21, movie22, movie23, movie24, movie25, movie26, movie27, movie28, movie29, movie30));

        return movieList;
    }

    private List<Movie> findMoviesByGenre(String genre) {
        List<Movie> allMovies = loadMovieList();
        return allMovies.stream().filter(movie -> movie.getGenres().contains(genre)).collect(Collectors.toList());
    }
}