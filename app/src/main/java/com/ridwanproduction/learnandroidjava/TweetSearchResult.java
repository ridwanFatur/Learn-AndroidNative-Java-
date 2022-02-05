package com.ridwanproduction.learnandroidjava;

import android.os.Parcel;
import android.os.Parcelable;

public class TweetSearchResult implements Parcelable {
    protected TweetSearchResult(Parcel in) {
    }

    public static final Creator<TweetSearchResult> CREATOR = new Creator<TweetSearchResult>() {
        @Override
        public TweetSearchResult createFromParcel(Parcel in) {
            return new TweetSearchResult(in);
        }

        @Override
        public TweetSearchResult[] newArray(int size) {
            return new TweetSearchResult[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
