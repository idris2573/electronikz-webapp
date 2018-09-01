package com.electronikz.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    private String filename;
    private Category category1;
    private Category category2;
    private Category category3;
    private String title;
    private String shortTitle;
    private String brand;
    private String description1;
    private String description2;
    private String description3;
    private String review1;
    private String review2;
    private String review3;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
    private String amazonLink;
    private String asin;
    private BigDecimal price;
    private Integer reviewCount;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Category getCategory1() {
        return category1;
    }

    public void setCategory1(Category category1) {
        this.category1 = category1;
    }

    public Category getCategory2() {
        return category2;
    }

    public void setCategory2(Category category2) {
        this.category2 = category2;
    }

    public Category getCategory3() {
        return category3;
    }

    public void setCategory3(Category category3) {
        this.category3 = category3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getReview1() {
        return review1;
    }

    public void setReview1(String review1) {
        this.review1 = review1;
    }

    public String getReview2() {
        return review2;
    }

    public void setReview2(String review2) {
        this.review2 = review2;
    }

    public String getReview3() {
        return review3;
    }

    public void setReview3(String review3) {
        this.review3 = review3;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public String getAmazonLink() {
        return amazonLink;
    }

    public void setAmazonLink(String amazonLink) {
        this.amazonLink = amazonLink;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getShortTitle(){
        shortTitle = title;
        if(shortTitle.length() >= 50){
            return shortTitle.substring(0, 50).concat("...");
        }
        return shortTitle;
    }
    @Override
    public String toString() {
        return "Product{" +
                "filename='" + filename + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
