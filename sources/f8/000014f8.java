package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(int i11) {
        this("Http request failed", i11);
    }

    public HttpException(String str, int i11) {
        this(str, i11, null);
    }

    public HttpException(String str, int i11, Throwable th2) {
        super(str + ", status code: " + i11, th2);
    }
}