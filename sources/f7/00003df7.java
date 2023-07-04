package com.google.zxing;

/* loaded from: classes2.dex */
public final class ChecksumException extends ReaderException {

    /* renamed from: c  reason: collision with root package name */
    private static final ChecksumException f17413c;

    static {
        ChecksumException checksumException = new ChecksumException();
        f17413c = checksumException;
        checksumException.setStackTrace(ReaderException.f17417b);
    }

    private ChecksumException() {
    }

    public static ChecksumException a() {
        return ReaderException.f17416a ? new ChecksumException() : f17413c;
    }
}