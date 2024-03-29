package com.example.retrofit;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict = false)
public class RssFeed {
    @Element
    public RssChannel channel;

    @Override
    public String toString() {
        return "RssFeed{" +
                "rssChannel=" + channel +
                '}';
    }
}
