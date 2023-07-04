package n2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final k f40312a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40313b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40314c;

    public j(k intrinsics, int i11, int i12) {
        kotlin.jvm.internal.s.g(intrinsics, "intrinsics");
        this.f40312a = intrinsics;
        this.f40313b = i11;
        this.f40314c = i12;
    }

    public final int a() {
        return this.f40314c;
    }

    public final k b() {
        return this.f40312a;
    }

    public final int c() {
        return this.f40313b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return kotlin.jvm.internal.s.c(this.f40312a, jVar.f40312a) && this.f40313b == jVar.f40313b && this.f40314c == jVar.f40314c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f40312a.hashCode() * 31) + Integer.hashCode(this.f40313b)) * 31) + Integer.hashCode(this.f40314c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f40312a + ", startIndex=" + this.f40313b + ", endIndex=" + this.f40314c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}