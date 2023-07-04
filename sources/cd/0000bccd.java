package wj;

import ak.k0;
import ak.v;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f55967a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(v vVar) {
        String o11;
        while (true) {
            String o12 = vVar.o();
            if (o12 == null) {
                return null;
            }
            if (f55967a.matcher(o12).matches()) {
                do {
                    o11 = vVar.o();
                    if (o11 != null) {
                    }
                } while (!o11.isEmpty());
            } else {
                Matcher matcher = f.f55940a.matcher(o12);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(v vVar) {
        String o11 = vVar.o();
        return o11 != null && o11.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] M0 = k0.M0(str, "\\.");
        long j11 = 0;
        for (String str2 : k0.L0(M0[0], ":")) {
            j11 = (j11 * 60) + Long.parseLong(str2);
        }
        long j12 = j11 * 1000;
        if (M0.length == 2) {
            j12 += Long.parseLong(M0[1]);
        }
        return j12 * 1000;
    }

    public static void e(v vVar) {
        int e11 = vVar.e();
        if (b(vVar)) {
            return;
        }
        vVar.O(e11);
        String valueOf = String.valueOf(vVar.o());
        throw new ParserException(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
    }
}