package com.bumptech.glide.load.data;

/* loaded from: classes.dex */
public interface d<T> {

    /* loaded from: classes.dex */
    public interface a<T> {
        void b(Exception exc);

        void e(T t11);
    }

    Class<T> a();

    com.bumptech.glide.load.a c();

    void cancel();

    void cleanup();

    void d(com.bumptech.glide.h hVar, a<? super T> aVar);
}