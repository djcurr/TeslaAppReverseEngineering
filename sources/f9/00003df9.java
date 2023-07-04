package com.google.zxing;

/* loaded from: classes2.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: c  reason: collision with root package name */
    private static final NotFoundException f17415c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f17415c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f17417b);
    }

    private NotFoundException() {
    }

    public static NotFoundException a() {
        return f17415c;
    }
}