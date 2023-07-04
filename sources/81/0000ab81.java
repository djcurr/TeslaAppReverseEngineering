package pr;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.p0;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<t<?>, Object> f46895a;

    public s() {
        this(null, 1, null);
    }

    public s(Map<t<?>, ? extends Object> map) {
        kotlin.jvm.internal.s.g(map, "map");
        this.f46895a = map;
    }

    public final <T> T a(t<T> key) {
        kotlin.jvm.internal.s.g(key, "key");
        T t11 = (T) this.f46895a.get(key);
        if (t11 == null) {
            t11 = null;
        }
        return t11 == null ? key.a() : t11;
    }

    public final Map<t<?>, Object> b() {
        return this.f46895a;
    }

    public final <T> s c(vz.p<? extends t<T>, ? extends T> pair) {
        kotlin.jvm.internal.s.g(pair, "pair");
        return new s(p0.q(this.f46895a, pair));
    }

    public boolean equals(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(sVar.b(), b());
    }

    public int hashCode() {
        return this.f46895a.hashCode();
    }

    public String toString() {
        return "ViewEnvironment(" + this.f46895a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ s(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p0.i() : map);
    }
}