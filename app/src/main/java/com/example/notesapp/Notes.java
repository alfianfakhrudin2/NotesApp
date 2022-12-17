package com.example.notesapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.sql.Timestamp;

// With parcelable, a program can deliver the object in data class with its intent.
public class Notes implements Parcelable {
    private String id;
    private String title;
    private String subtitle;
    private String notes;
    private String timestamp;
    private String bgColor;

    // CONSTRUCTOR
    public Notes(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    // READ THE VALUE DATAS
    protected Notes(Parcel in) {
        id = in.readString();
        title = in.readString();
        subtitle = in.readString();
        notes = in.readString();
    }

    public static final Creator<Notes> CREATOR = new Creator<Notes>() {
        @Override
        /* Membuat data Notes dengan variable yang dibuat di class notes dengan parcel
           dan mengembalikannya ke object Notes readstring*/
        public Notes createFromParcel(Parcel source) {
            return new Notes(source);
        }

        // Menyimpan data ke dalam array
        @Override
        public Notes[] newArray(int size) {
            return new Notes[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    // WRITE THE VALUE DATAS
    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(id);
        parcel.writeString(title);
        parcel.writeString(subtitle);
        parcel.writeString(notes);
    }
}
