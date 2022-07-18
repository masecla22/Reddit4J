package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleryData {
    @SerializedName("items")
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "GalleryData{" +
                "items=" + items +
                '}';
    }
}
