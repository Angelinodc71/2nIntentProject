package com.example.retrofit;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item", strict = false)
class RssItem {
    @Element
    private String title;

    @Element
    private String link;

    @Element
    private String pubDate;

    @Element
    private String description;

    @Override
    public String toString() {
        return "RssItem{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
