package z30;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class a<L, R> implements Map.Entry<L, R>, Comparable<a<L, R>>, Serializable {
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a<L, R> aVar) {
        return new x30.a().g(b(), aVar.b()).g(c(), aVar.c()).u();
    }

    public abstract L b();

    public abstract R c();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return b();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return c();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    public String toString() {
        return "(" + b() + CoreConstants.COMMA_CHAR + c() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}