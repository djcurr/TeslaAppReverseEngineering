package u10;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlin.text.i f52999a;

    static {
        new g();
        f52999a = new kotlin.text.i("[^\\p{L}\\p{Digit}]");
    }

    private g() {
    }

    public static final String a(String name) {
        s.g(name, "name");
        return f52999a.i(name, "_");
    }
}