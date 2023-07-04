package org.bouncycastle.asn1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
class p1 {

    /* renamed from: a  reason: collision with root package name */
    private static Long f43078a = c(0);

    /* renamed from: b  reason: collision with root package name */
    private static final Map f43079b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    static Locale f43080c = b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Date a(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = f43079b;
        synchronized (map) {
            Long l11 = (Long) map.get(locale);
            if (l11 == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                l11 = time == 0 ? f43078a : c(time);
                map.put(locale, l11);
            }
            if (l11 != f43078a) {
                return new Date(date.getTime() - l11.longValue());
            }
            return date;
        }
    }

    private static Locale b() {
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i11 = 0; i11 != availableLocales.length; i11++) {
            if ("en".equalsIgnoreCase(availableLocales[i11].getLanguage())) {
                return availableLocales[i11];
            }
        }
        return Locale.getDefault();
    }

    private static Long c(long j11) {
        return Long.valueOf(j11);
    }
}