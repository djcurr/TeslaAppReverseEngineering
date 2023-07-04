package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class d {
    public static int a(InputStream inputStream, int i11, boolean z11) {
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z11) {
                i12 = (read & 255) << (i14 * 8);
            } else {
                i13 <<= 8;
                i12 = read & 255;
            }
            i13 |= i12;
        }
        return i13;
    }
}