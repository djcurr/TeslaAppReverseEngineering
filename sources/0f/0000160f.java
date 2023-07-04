package com.facebook.datasource;

/* loaded from: classes.dex */
public interface e<T> {
    void onCancellation(c<T> cVar);

    void onFailure(c<T> cVar);

    void onNewResult(c<T> cVar);

    void onProgressUpdate(c<T> cVar);
}