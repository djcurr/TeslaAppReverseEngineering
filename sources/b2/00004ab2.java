package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum p {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    p(int i11) {
        this.index = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean shouldReadFromMemoryCache(int i11) {
        return (i11 & NO_CACHE.index) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean shouldWriteToMemoryCache(int i11) {
        return (i11 & NO_STORE.index) == 0;
    }
}