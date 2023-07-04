package g20;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class s<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f27440a;

    /* renamed from: b  reason: collision with root package name */
    private final T f27441b;

    /* renamed from: c  reason: collision with root package name */
    private final String f27442c;

    /* renamed from: d  reason: collision with root package name */
    private final u10.b f27443d;

    public s(T t11, T t12, String filePath, u10.b classId) {
        kotlin.jvm.internal.s.g(filePath, "filePath");
        kotlin.jvm.internal.s.g(classId, "classId");
        this.f27440a = t11;
        this.f27441b = t12;
        this.f27442c = filePath;
        this.f27443d = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return kotlin.jvm.internal.s.c(this.f27440a, sVar.f27440a) && kotlin.jvm.internal.s.c(this.f27441b, sVar.f27441b) && kotlin.jvm.internal.s.c(this.f27442c, sVar.f27442c) && kotlin.jvm.internal.s.c(this.f27443d, sVar.f27443d);
        }
        return false;
    }

    public int hashCode() {
        T t11 = this.f27440a;
        int hashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.f27441b;
        return ((((hashCode + (t12 != null ? t12.hashCode() : 0)) * 31) + this.f27442c.hashCode()) * 31) + this.f27443d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f27440a + ", expectedVersion=" + this.f27441b + ", filePath=" + this.f27442c + ", classId=" + this.f27443d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}