package p001if;

import java.util.regex.Pattern;
import md.k;

/* renamed from: if.a  reason: invalid package */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static Pattern f30357c;

    /* renamed from: a  reason: collision with root package name */
    public final int f30358a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30359b;

    public a(int i11, int i12) {
        this.f30358a = i11;
        this.f30359b = i12;
    }

    public static a b(int i11) {
        k.b(Boolean.valueOf(i11 >= 0));
        return new a(i11, Integer.MAX_VALUE);
    }

    public static a c(String str) {
        if (str == null) {
            return null;
        }
        if (f30357c == null) {
            f30357c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f30357c.split(str);
            k.b(Boolean.valueOf(split.length == 4));
            k.b(Boolean.valueOf(split[0].equals("bytes")));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            k.b(Boolean.valueOf(parseInt2 > parseInt));
            k.b(Boolean.valueOf(parseInt3 > parseInt2));
            if (parseInt2 < parseInt3 - 1) {
                return new a(parseInt, parseInt2);
            }
            return new a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e11);
        }
    }

    public static a e(int i11) {
        k.b(Boolean.valueOf(i11 > 0));
        return new a(0, i11);
    }

    private static String f(int i11) {
        return i11 == Integer.MAX_VALUE ? "" : Integer.toString(i11);
    }

    public boolean a(a aVar) {
        return aVar != null && this.f30358a <= aVar.f30358a && this.f30359b >= aVar.f30359b;
    }

    public String d() {
        return String.format(null, "bytes=%s-%s", f(this.f30358a), f(this.f30359b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f30358a == aVar.f30358a && this.f30359b == aVar.f30359b;
        }
        return false;
    }

    public int hashCode() {
        return ud.a.a(this.f30358a, this.f30359b);
    }

    public String toString() {
        return String.format(null, "%s-%s", f(this.f30358a), f(this.f30359b));
    }
}