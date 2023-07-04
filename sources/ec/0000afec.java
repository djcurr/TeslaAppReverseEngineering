package r10;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j {
    public static final boolean a(a version) {
        s.g(version, "version");
        return version.a() == 1 && version.b() >= 4;
    }

    public static final boolean b(a version) {
        s.g(version, "version");
        return a(version);
    }
}