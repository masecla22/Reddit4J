package com.github.masecla.objects.reddit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Metadata {
    @SerializedName("status")
    private String status;

    @SerializedName("e")
    private String e;

    @SerializedName("m")
    private String m;

    @SerializedName("p")
    private List<Resolution> p;

    @SerializedName("s")
    private Resolution s;

    @SerializedName("id")
    private String id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public List<Resolution> getP() {
        return p;
    }

    public void setP(List<Resolution> p) {
        this.p = p;
    }

    public Resolution getS() {
        return s;
    }

    public void setS(Resolution s) {
        this.s = s;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "status='" + status + '\'' +
                ", e='" + e + '\'' +
                ", m='" + m + '\'' +
                ", p=" + p +
                ", s=" + s +
                ", id='" + id + '\'' +
                '}';
    }
}
