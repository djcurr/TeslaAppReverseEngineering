package u1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f52896a;

    /* renamed from: b  reason: collision with root package name */
    private final long f52897b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52898c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    private c(String str, long j11, int i11) {
        this.f52896a = str;
        this.f52897b = j11;
        this.f52898c = i11;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i11 < -1 || i11 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ c(String str, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j11, i11);
    }

    public abstract float[] a(float[] fArr);

    public final int b() {
        return b.f(f());
    }

    public final int c() {
        return this.f52898c;
    }

    public abstract float d(int i11);

    public abstract float e(int i11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !s.c(m0.b(getClass()), m0.b(obj.getClass()))) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f52898c == cVar.f52898c && s.c(this.f52896a, cVar.f52896a)) {
            return b.e(f(), cVar.f());
        }
        return false;
    }

    public final long f() {
        return this.f52897b;
    }

    public final String g() {
        return this.f52896a;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return (((this.f52896a.hashCode() * 31) + b.g(f())) * 31) + this.f52898c;
    }

    public abstract float[] i(float[] fArr);

    public String toString() {
        return this.f52896a + " (id=" + this.f52898c + ", model=" + ((Object) b.h(f())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}