package com.magdy.demo.cleanArchitecture.core.film.model;

public class Film {

    private String title;
    private int seriesStartYear;
    private int seriesEndYear;
    private int numberOfEpisodes;
    private int runningTimeInMinutes;
    private Long id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeriesStartYear() {
        return seriesStartYear;
    }

    public void setSeriesStartYear(int seriesStartYear) {
        this.seriesStartYear = seriesStartYear;
    }

    public int getSeriesEndYear() {
        return seriesEndYear;
    }

    public void setSeriesEndYear(int seriesEndYear) {
        this.seriesEndYear = seriesEndYear;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getRunningTimeInMinutes() {
        return runningTimeInMinutes;
    }

    public void setRunningTimeInMinutes(int runningTimeInMinutes) {
        this.runningTimeInMinutes = runningTimeInMinutes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
