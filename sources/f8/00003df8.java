package com.google.zxing;

/* loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* renamed from: c  reason: collision with root package name */
    private static final FormatException f17414c;

    static {
        FormatException formatException = new FormatException();
        f17414c = formatException;
        formatException.setStackTrace(ReaderException.f17417b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f17416a ? new FormatException() : f17414c;
    }

    public static FormatException b(Throwable th2) {
        return ReaderException.f17416a ? new FormatException(th2) : f17414c;
    }

    private FormatException(Throwable th2) {
        super(th2);
    }
}