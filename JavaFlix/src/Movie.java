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

    public String getTitle() {
    	
    	return movieTitle;
    }
    
   public String getRating() {
	   
	   return movieRating;
	   
   }
   
   public String getGenre() {
	   
	   return movieGenre;
   }
   
   public String getSynopsis() {
	   
	   return movieSynopsis;
   }
   
   public String getDuration() {
	   String duration = movieDuration + " (min)";
	   return duration;
   }
   
    public String toString() {
        String movieInfo = "Title: " + movieTitle + ",\nRated: " + movieRating + ",\nGenre: " +
                movieGenre;

        return movieInfo;
    }





}
