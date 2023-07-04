package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import xf.a;

@a
/* loaded from: classes3.dex */
public class AndroidUnicodeUtils {
    @a
    public static String convertToCase(String str, int i11, boolean z11) {
        Locale locale = z11 ? Locale.getDefault() : Locale.ENGLISH;
        if (i11 != 0) {
            if (i11 == 1) {
                return str.toLowerCase(locale);
            }
            throw new RuntimeException("Invalid target case");
        }
        return str.toUpperCase(locale);
    }

    @a
    public static String dateFormat(double d11, boolean z11, boolean z12) {
        DateFormat timeInstance;
        if (z11 && z12) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z11) {
            timeInstance = DateFormat.getDateInstance(2);
        } else if (z12) {
            timeInstance = DateFormat.getTimeInstance(2);
        } else {
            throw new RuntimeException("Bad dateFormat configuration");
        }
        return timeInstance.format(Long.valueOf((long) d11)).toString();
    }

    @a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @a
    public static String normalize(String str, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return Normalizer.normalize(str, Normalizer.Form.NFKD);
                    }
                    throw new RuntimeException("Invalid form");
                }
                return Normalizer.normalize(str, Normalizer.Form.NFKC);
            }
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        return Normalizer.normalize(str, Normalizer.Form.NFC);
    }
}