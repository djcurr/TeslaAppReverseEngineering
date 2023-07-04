package com.drew.lang;

import java.io.IOException;

/* loaded from: classes.dex */
public final class BufferBoundsException extends IOException {
    public BufferBoundsException(int i11, int i12, long j11) {
        super(a(i11, i12, j11));
    }

    private static String a(int i11, int i12, long j11) {
        return i11 < 0 ? String.format("Attempt to read from buffer using a negative index (%d)", Integer.valueOf(i11)) : i12 < 0 ? String.format("Number of requested bytes cannot be negative (%d)", Integer.valueOf(i12)) : (((long) i11) + ((long) i12)) - 1 > 2147483647L ? String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format("Attempt to read from beyond end of underlying data source (requested index: %d, requested count: %d, max index: %d)", Integer.valueOf(i11), Integer.valueOf(i12), Long.valueOf(j11 - 1));
    }

    public BufferBoundsException(String str) {
        super(str);
    }
}