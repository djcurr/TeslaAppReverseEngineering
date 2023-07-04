package com.google.android.gms.internal.location;

import ch.qos.logback.core.CoreConstants;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzbo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static void zza(long j11, StringBuilder sb2) {
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z11 = false;
        if (i11 < 0) {
            sb2.append("-");
            if (j11 != Long.MIN_VALUE) {
                j11 = -j11;
            } else {
                j11 = Long.MAX_VALUE;
                z11 = true;
            }
        }
        if (j11 >= CoreConstants.MILLIS_IN_ONE_DAY) {
            sb2.append(j11 / CoreConstants.MILLIS_IN_ONE_DAY);
            sb2.append("d");
            j11 %= CoreConstants.MILLIS_IN_ONE_DAY;
        }
        if (true == z11) {
            j11 = 25975808;
        }
        if (j11 >= CoreConstants.MILLIS_IN_ONE_HOUR) {
            sb2.append(j11 / CoreConstants.MILLIS_IN_ONE_HOUR);
            sb2.append("h");
            j11 %= CoreConstants.MILLIS_IN_ONE_HOUR;
        }
        if (j11 >= 60000) {
            sb2.append(j11 / 60000);
            sb2.append("m");
            j11 %= 60000;
        }
        if (j11 >= 1000) {
            sb2.append(j11 / 1000);
            sb2.append("s");
            j11 %= 1000;
        }
        if (j11 > 0) {
            sb2.append(j11);
            sb2.append("ms");
        }
    }
}