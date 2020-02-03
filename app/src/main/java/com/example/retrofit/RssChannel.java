package com.example.retrofit;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "channel", strict = false)
public class RssChannel {
    @Element
    private String title;
    @Element
    private String description;
    @ElementList(inline = true, required = false)
    public List<RssItem> item;

    @Override
    public String toString() {
        return "RssChannel{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rssItem=" + item +
                '}';
    }
}
