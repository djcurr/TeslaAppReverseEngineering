package com.drew.imaging;

import com.drew.lang.CompoundException;

/* loaded from: classes.dex */
public class ImageProcessingException extends CompoundException {
    public ImageProcessingException(String str) {
        super(str);
    }

    public ImageProcessingException(Throwable th2) {
        super(th2);
    }
}