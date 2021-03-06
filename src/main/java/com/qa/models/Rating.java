package com.qa.models;

import javax.persistence.*;

@Entity
//@Table(name = "ratings")
public class Rating extends CardId{

    @Id
    private String id;
    private String clan;

    private float overallrating;
    private float ratingcrab;
    private float ratingcrane;
    private float ratingdragon;
    private float ratinglion;
    private float ratingphoenix;
    private float ratingscorpion;
    private float ratingunicorn;

    private int totalvotescrab;
    private int totalvotescrane;
    private int totalvotesdragon;
    private int totalvoteslion;
    private int totalvotesphoenix;
    private int totalvotesscorpion;
    private int totalvotesunicorn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public float getOverallrating() {
        return overallrating;
    }

    public void setOverallrating(float overallrating) {
        this.overallrating = overallrating;
    }

    public float getRatingcrab() {
        return ratingcrab;
    }

    public void setRatingcrab(float ratingcrab) {
        this.ratingcrab = ratingcrab;
    }

    public float getRatingcrane() {
        return ratingcrane;
    }

    public void setRatingcrane(float ratingcrane) {
        this.ratingcrane = ratingcrane;
    }

    public float getRatingdragon() {
        return ratingdragon;
    }

    public void setRatingdragon(float ratingdragon) {
        this.ratingdragon = ratingdragon;
    }

    public float getRatinglion() {
        return ratinglion;
    }

    public void setRatinglion(float ratinglion) {
        this.ratinglion = ratinglion;
    }

    public float getRatingphoenix() {
        return ratingphoenix;
    }

    public void setRatingphoenix(float ratingphoenix) {
        this.ratingphoenix = ratingphoenix;
    }

    public float getRatingscorpion() {
        return ratingscorpion;
    }

    public void setRatingscorpion(float ratingscorpion) {
        this.ratingscorpion = ratingscorpion;
    }

    public float getRatingunicorn() {
        return ratingunicorn;
    }

    public void setRatingunicorn(float ratingunicorn) {
        this.ratingunicorn = ratingunicorn;
    }

    public int getTotalvotescrab() {
        return totalvotescrab;
    }

    public void setTotalvotescrab(int totalvotescrab) {
        this.totalvotescrab = totalvotescrab;
    }

    public int getTotalvotescrane() {
        return totalvotescrane;
    }

    public void setTotalvotescrane(int totalvotescrane) {
        this.totalvotescrane = totalvotescrane;
    }

    public int getTotalvotesdragon() {
        return totalvotesdragon;
    }

    public void setTotalvotesdragon(int totalvotesdragon) {
        this.totalvotesdragon = totalvotesdragon;
    }

    public int getTotalvoteslion() {
        return totalvoteslion;
    }

    public void setTotalvoteslion(int totalvoteslion) {
        this.totalvoteslion = totalvoteslion;
    }

    public int getTotalvotesphoenix() {
        return totalvotesphoenix;
    }

    public void setTotalvotesphoenix(int totalvotesphoenix) {
        this.totalvotesphoenix = totalvotesphoenix;
    }

    public int getTotalvotesscorpion() {
        return totalvotesscorpion;
    }

    public void setTotalvotesscorpion(int totalvotesscorpion) {
        this.totalvotesscorpion = totalvotesscorpion;
    }

    public int getTotalvotesunicorn() {
        return totalvotesunicorn;
    }

    public void setTotalvotesunicorn(int totalvotesunicorn) {
        this.totalvotesunicorn = totalvotesunicorn;
    }


}
