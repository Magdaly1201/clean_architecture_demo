package com.magdy.demo.cleanArchitecture.core.film.model;

public class Result {

    private String id;
    private int numberOfEpisodes;
    private int runningTimeInMinutes;
    private int seriesEndYear;
    private int seriesStartYear;
    private String title;
    private String titleType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getSeriesEndYear() {
        return seriesEndYear;
    }

    public void setSeriesEndYear(int seriesEndYear) {
        this.seriesEndYear = seriesEndYear;
    }

    public int getSeriesStartYear() {
        return seriesStartYear;
    }

    public void setSeriesStartYear(int seriesStartYear) {
        this.seriesStartYear = seriesStartYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }
}
