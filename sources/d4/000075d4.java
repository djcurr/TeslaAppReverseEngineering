package io.grpc;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLong f30579d = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final String f30580a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30581b;

    /* renamed from: c  reason: collision with root package name */
    private final long f30582c;

    g0(String str, String str2, long j11) {
        com.google.common.base.u.p(str, "typeName");
        com.google.common.base.u.e(!str.isEmpty(), "empty type");
        this.f30580a = str;
        this.f30581b = str2;
        this.f30582c = j11;
    }

    public static g0 a(Class<?> cls, String str) {
        return b(c(cls), str);
    }

    public static g0 b(String str, String str2) {
        return new g0(str, str2, e());
    }

    private static String c(Class<?> cls) {
        String simpleName = ((Class) com.google.common.base.u.p(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long e() {
        return f30579d.incrementAndGet();
    }

    public long d() {
        return this.f30582c;
    }

    public String f() {
        return this.f30580a + "<" + this.f30582c + ">";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        if (this.f30581b != null) {
            sb2.append(": (");
            sb2.append(this.f30581b);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb2.toString();
    }
}