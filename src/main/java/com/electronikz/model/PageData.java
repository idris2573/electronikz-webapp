package com.electronikz.model;

import java.util.Set;

public class PageData {

    private int totalElements;
    private int totalPages;
    private int contentSize;
    private int currentPage;
    private Set content;

    public PageData() {
    }

    public PageData(int currentPage, Set content) {
        this.currentPage = currentPage;
        this.content = content;
    }

    public PageData(Set content) {
        this.content = content;
    }

    public PageData(int totalElements, int totalPages, int contentSize, int currentPage, Set content) {
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.contentSize = contentSize;
        this.currentPage = currentPage;
        this.content = content;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getContentSize() {
        return contentSize;
    }

    public void setContentSize(int contentSize) {
        this.contentSize = contentSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Set getContent() {
        return content;
    }

    public void setContent(Set content) {
        this.content = content;
    }
}
