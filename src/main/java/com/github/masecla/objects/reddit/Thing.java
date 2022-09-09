package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

public class Thing<T> {
    @SerializedName("kind")
    private Kind kind;

    @SerializedName("data")
    private T data;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "kind=" + kind +
                ", data=" + data +
                '}';
    }
}
