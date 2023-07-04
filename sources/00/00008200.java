package l2;

import ch.qos.logback.core.CoreConstants;
import vz.g;

/* loaded from: classes.dex */
public final class a<T extends vz.g<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final String f36381a;

    /* renamed from: b  reason: collision with root package name */
    private final T f36382b;

    public a(String str, T t11) {
        this.f36381a = str;
        this.f36382b = t11;
    }

    public final T a() {
        return this.f36382b;
    }

    public final String b() {
        return this.f36381a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(this.f36381a, aVar.f36381a) && kotlin.jvm.internal.s.c(this.f36382b, aVar.f36382b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f36381a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        T t11 = this.f36382b;
        return hashCode + (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + ((Object) this.f36381a) + ", action=" + this.f36382b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}