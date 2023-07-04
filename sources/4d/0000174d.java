package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class HeifExifUtil {

    @com.facebook.soloader.e
    /* loaded from: classes3.dex */
    private static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        static int a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e11) {
                nd.a.e("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e11);
                return 0;
            }
        }
    }

    public static int a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.a(inputStream);
        }
        nd.a.b("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}