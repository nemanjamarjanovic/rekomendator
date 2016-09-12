package org.nemanjamarjanovic.rekomendator.bussines.omdb.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nemanja
 */
@XmlRootElement
public class OmdbMovie
{

    private String title;
    private String year;
    private String runtime;
    private String genre;
    private String director;
    private String actors;
    private String plot;
    private String poster;
    private String imdbRating;

    public OmdbMovie()
    {
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public String getRuntime()
    {
        return runtime;
    }

    public void setRuntime(String runtime)
    {
        this.runtime = runtime;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public String getActors()
    {
        return actors;
    }

    public void setActors(String actors)
    {
        this.actors = actors;
    }

    public String getPlot()
    {
        return plot;
    }

    public void setPlot(String plot)
    {
        this.plot = plot;
    }

    public String getPoster()
    {
        return poster;
    }

    public void setPoster(String poster)
    {
        this.poster = poster;
    }

    public String getImdbRating()
    {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating)
    {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString()
    {
        return "OmdbMovie{" + "title=" + title + ", year=" + year
                + ", runtime=" + runtime + ", genre=" + genre + ", director="
                + director + ", actors=" + actors + ", plot=" + plot
                + ", poster=" + poster + ", imdbRating=" + imdbRating + '}';
    }

}
