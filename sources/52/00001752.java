package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import md.k;

/* loaded from: classes3.dex */
public class c {
    public static int a(int i11) {
        return e.a(i11);
    }

    public static int b(InputStream inputStream) {
        try {
            int d11 = d(inputStream);
            if (d11 == 0) {
                return 0;
            }
            return e.d(inputStream, d11);
        } catch (IOException unused) {
            return 0;
        }
    }

    private static boolean c(int i11) {
        switch (i11) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private static int d(InputStream inputStream) {
        int a11;
        if (e(inputStream, 225) && (a11 = d.a(inputStream, 2, false) - 2) > 6) {
            int a12 = d.a(inputStream, 4, false);
            int a13 = d.a(inputStream, 2, false);
            int i11 = (a11 - 4) - 2;
            if (a12 == 1165519206 && a13 == 0) {
                return i11;
            }
        }
        return 0;
    }

    public static boolean e(InputStream inputStream, int i11) {
        k.g(inputStream);
        while (d.a(inputStream, 1, false) == 255) {
            int i12 = 255;
            while (i12 == 255) {
                i12 = d.a(inputStream, 1, false);
            }
            if ((i11 != 192 || !c(i12)) && i12 != i11) {
                if (i12 != 216 && i12 != 1) {
                    if (i12 == 217 || i12 == 218) {
                        break;
                    }
                    inputStream.skip(d.a(inputStream, 2, false) - 2);
                }
            } else {
                return true;
            }
        }
        return false;
    }
}