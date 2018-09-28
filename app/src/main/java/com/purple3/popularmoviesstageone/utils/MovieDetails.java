package com.purple3.popularmoviesstageone.utils;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * MovieDetails class holds the results in themoviedb API' Json Response.
 *
 * @author : Pratyusha Vankayala
 */


public class MovieDetails implements Parcelable{

    @SerializedName("vote_count")
    private String voteCount;

    @SerializedName("id")
    private String id;

    @SerializedName("video")
    private boolean video;

    @SerializedName("vote_average")
    private String voteAverage;

    @SerializedName("title")
    private String title;

    @SerializedName("poster_path")
    private String poster_path;

    @SerializedName("popularity")
    private String popularity;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("genre_ids")
    private String[] genreIds;

    @SerializedName("backdrop_path")
    private String backDropPath;

    @SerializedName("adult")
    private boolean isAdult;

    @SerializedName("overview")
    private String overView;

    @SerializedName("release_date")
    private String releaseDate;

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public MovieDetails() {
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public MovieDetails(String voteCount, String id, boolean video, String voteAverage, String title, String posterPath,
//                        String popularity, String originalLanguage, String originalTitle, String[] genreIds,
//                        String backDropPath, boolean isAdult, String overView, String releaseDate) {
//        this.voteCount = voteCount;
//        this.id = id;
//        this.video = video;
//        this.voteAverage = voteAverage;
//        this.title = title;
//        this.poster_path = posterPath;
//        this.popularity = popularity;
//        this.originalLanguage = originalLanguage;
//        this.originalTitle = originalTitle;
//        this.genreIds = genreIds;
//        this.backDropPath = backDropPath;
//        this.isAdult = isAdult;
//        this.overView = overView;
//        this.releaseDate = releaseDate;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public String getVoteCount() {
//        return voteCount;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setVoteCount(String voteCount) {
//        this.voteCount = voteCount;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public String getId() {
//        return id;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setId(String id) {
//        this.id = id;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public boolean isVideo() {
//        return video;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setVideo(boolean video) {
//        this.video = video;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

    public String getVoteAverage() {
        return voteAverage;
    }

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setVoteAverage(String voteAverage) {
//        this.voteAverage = voteAverage;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

    public String getTitle() {
        return title;
    }

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setTitle(String title) {
//        this.title = title;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

    public String getPosterPath() {
        return poster_path;
    }

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setPosterPath(String posterPath) {
//        this.poster_path     = posterPath;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public String getPopularity() {
//        return popularity;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setPopularity(String popularity) {
//        this.popularity = popularity;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public String getOriginalLanguage() {
//        return originalLanguage;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setOriginalLanguage(String originalLanguage) {
//        this.originalLanguage = originalLanguage;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public String getOriginalTitle() {
//        return originalTitle;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setOriginalTitle(String originalTitle) {
//        this.originalTitle = originalTitle;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public String[] getGenreIds() {
//        return genreIds;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setGenreIds(String[] genreIds) {
//        this.genreIds = genreIds;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public String getBackDropPath() {
//        return backDropPath;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setBackDropPath(String backDropPath) {
//        this.backDropPath = backDropPath;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public boolean isAdult() {
//        return isAdult;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setAdult(boolean adult) {
//        isAdult = adult;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

    public String getOverView() {
        return overView;
    }

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setOverView(String overView) {
//        this.overView = overView;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

    public String getReleaseDate() {
        return releaseDate;
    }

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setReleaseDate(String releaseDate) {
//        this.releaseDate = releaseDate;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

    /**
     * Describe the kinds of special objects contained in this Parcelable
     * instance's marshaled representation. For example, if the object will
     * include a file descriptor in the output of {@link #writeToParcel(Parcel, int)},
     * the return value of this method must include the
     * {@link #CONTENTS_FILE_DESCRIPTOR} bit.
     *
     * @return a bitmask indicating the set of special object types marshaled
     * by this Parcelable object instance.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Flatten this object in to a Parcel.
     *
     * @param dest  The Parcel in which the object should be written.
     * @param flags Additional flags about how the object should be written.
     *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(poster_path);
        dest.writeString(overView);
        dest.writeString(voteAverage);
        dest.writeString(releaseDate);
    }


    private MovieDetails(Parcel in){
        this.title = in.readString();
        this.poster_path = in.readString();
        this.overView = in.readString();
        this.voteAverage = in.readString();
        this.releaseDate = in.readString();
    }

    public static final Parcelable.Creator<MovieDetails> CREATOR = new Parcelable.Creator<MovieDetails>() {

        /**
         * Create a new instance of the Parcelable class, instantiating it
         * from the given Parcel whose data had previously been written by
         * {@link Parcelable#writeToParcel Parcelable.writeToParcel()}.
         *
         * @param source The Parcel to read the object's data from.
         * @return Returns a new instance of the Parcelable class.
         */
        @Override
        public MovieDetails createFromParcel(Parcel source) {
            return new MovieDetails(source);
        }

        /**
         * Create a new array of the Parcelable class.
         *
         * @param size Size of the array.
         * @return Returns an array of the Parcelable class, with every entry
         * initialized to null.
         */
        @Override
        public MovieDetails[] newArray(int size) {
            return new MovieDetails[size];
        }
    };

}
