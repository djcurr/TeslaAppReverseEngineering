package v6;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final int f54210a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f54211b;

    /* renamed from: c  reason: collision with root package name */
    private final s f54212c;

    public r(int i11, Integer num, s option) {
        kotlin.jvm.internal.s.g(option, "option");
        this.f54210a = i11;
        this.f54211b = num;
        this.f54212c = option;
    }

    public final s a() {
        return this.f54212c;
    }

    public final Integer b() {
        return this.f54211b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f54210a == rVar.f54210a && kotlin.jvm.internal.s.c(this.f54211b, rVar.f54211b) && this.f54212c == rVar.f54212c;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f54210a) * 31;
        Integer num = this.f54211b;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f54212c.hashCode();
    }

    public String toString() {
        return "InstallmentModel(textResId=" + this.f54210a + ", value=" + this.f54211b + ", option=" + this.f54212c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}