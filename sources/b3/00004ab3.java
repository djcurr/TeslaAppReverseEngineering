package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    q(int i11) {
        this.index = i11;
    }

    public static boolean isOfflineOnly(int i11) {
        return (i11 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i11) {
        return (i11 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i11) {
        return (i11 & NO_STORE.index) == 0;
    }
}