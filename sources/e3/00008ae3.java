package net.time4j.calendar.service;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import net.time4j.engine.x;

/* loaded from: classes5.dex */
public final class a {
    public static String a(String str, x xVar, Locale locale) {
        net.time4j.format.e ofStyle = net.time4j.format.e.ofStyle(xVar.getStyleValue());
        if (str.equals("iso8601")) {
            return net.time4j.format.b.r(ofStyle, locale);
        }
        String str2 = "F(" + Character.toLowerCase(ofStyle.name().charAt(0)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        net.time4j.i18n.e i11 = b.i(str, locale);
        if (!i11.b(str2)) {
            i11 = b.i("generic", locale);
        }
        return i11.f(str2);
    }
}