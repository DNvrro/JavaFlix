public class Movie {

    private String movieTitle, movieRating, movieSynopsis, movieGenre;
    private int movieDuration;

    public Movie (String _movieTitle, String _movieRating,  String _movieGenre, String _movieSynopsis,
                  int _movieDuration) {

        movieTitle = _movieTitle;
        movieRating = _movieRating;
        movieGenre = _movieGenre;
        movieSynopsis = _movieSynopsis;
        movieDuration = _movieDuration;
    }

    public String toString() {
        String movieInfo = "Title: " + movieTitle + "\nRated: " + movieRating + "\nGenre: " +
                movieGenre + "\nSynopsis: " + movieSynopsis + "\nDuration: " + movieDuration +
                "min.";

        return movieInfo;
    }





}
