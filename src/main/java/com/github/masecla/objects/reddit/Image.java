package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Image extends Variant {
    @SerializedName("id")
    private String id;

    @SerializedName("variants")
    private Variants variants;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Variants getVariants() {
        return variants;
    }

    public void setVariants(Variants variants) {
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", variants=" + variants +
                "} " + super.toString();
    }
}
