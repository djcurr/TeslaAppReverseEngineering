package x2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int f56950a;

    /* renamed from: b  reason: collision with root package name */
    private final int f56951b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56952c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56953d;

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
        new m(0, 0, 0, 0);
    }

    public m(int i11, int i12, int i13, int i14) {
        this.f56950a = i11;
        this.f56951b = i12;
        this.f56952c = i13;
        this.f56953d = i14;
    }

    public final int a() {
        return this.f56953d;
    }

    public final int b() {
        return this.f56953d - this.f56951b;
    }

    public final int c() {
        return this.f56950a;
    }

    public final int d() {
        return this.f56952c;
    }

    public final int e() {
        return this.f56951b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f56950a == mVar.f56950a && this.f56951b == mVar.f56951b && this.f56952c == mVar.f56952c && this.f56953d == mVar.f56953d;
        }
        return false;
    }

    public final int f() {
        return this.f56952c - this.f56950a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f56950a) * 31) + Integer.hashCode(this.f56951b)) * 31) + Integer.hashCode(this.f56952c)) * 31) + Integer.hashCode(this.f56953d);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f56950a + ", " + this.f56951b + ", " + this.f56952c + ", " + this.f56953d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}