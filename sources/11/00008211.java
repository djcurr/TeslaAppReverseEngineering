package l2;

import androidx.compose.ui.platform.b1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k implements v, Iterable<Map.Entry<? extends u<?>, ? extends Object>>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<u<?>, Object> f36435a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private boolean f36436b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36437c;

    @Override // l2.v
    public <T> void b(u<T> key, T t11) {
        kotlin.jvm.internal.s.g(key, "key");
        this.f36435a.put(key, t11);
    }

    public final void c(k peer) {
        kotlin.jvm.internal.s.g(peer, "peer");
        if (peer.f36436b) {
            this.f36436b = true;
        }
        if (peer.f36437c) {
            this.f36437c = true;
        }
        for (Map.Entry<u<?>, Object> entry : peer.f36435a.entrySet()) {
            u<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.f36435a.containsKey(key)) {
                this.f36435a.put(key, value);
            } else if (value instanceof a) {
                Object obj = this.f36435a.get(key);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<u<?>, Object> map = this.f36435a;
                String b11 = aVar.b();
                if (b11 == null) {
                    b11 = ((a) value).b();
                }
                vz.g a11 = aVar.a();
                if (a11 == null) {
                    a11 = ((a) value).a();
                }
                map.put(key, new a(b11, a11));
            }
        }
    }

    public final <T> boolean e(u<T> key) {
        kotlin.jvm.internal.s.g(key, "key");
        return this.f36435a.containsKey(key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return kotlin.jvm.internal.s.c(this.f36435a, kVar.f36435a) && this.f36436b == kVar.f36436b && this.f36437c == kVar.f36437c;
        }
        return false;
    }

    public final k f() {
        k kVar = new k();
        kVar.f36436b = this.f36436b;
        kVar.f36437c = this.f36437c;
        kVar.f36435a.putAll(this.f36435a);
        return kVar;
    }

    public final <T> T h(u<T> key) {
        kotlin.jvm.internal.s.g(key, "key");
        T t11 = (T) this.f36435a.get(key);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public int hashCode() {
        return (((this.f36435a.hashCode() * 31) + Boolean.hashCode(this.f36436b)) * 31) + Boolean.hashCode(this.f36437c);
    }

    public final <T> T i(u<T> key, h00.a<? extends T> defaultValue) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(defaultValue, "defaultValue");
        T t11 = (T) this.f36435a.get(key);
        return t11 == null ? defaultValue.invoke() : t11;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends u<?>, ? extends Object>> iterator() {
        return this.f36435a.entrySet().iterator();
    }

    public final <T> T j(u<T> key, h00.a<? extends T> defaultValue) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(defaultValue, "defaultValue");
        T t11 = (T) this.f36435a.get(key);
        return t11 == null ? defaultValue.invoke() : t11;
    }

    public final boolean k() {
        return this.f36437c;
    }

    public final boolean m() {
        return this.f36436b;
    }

    public final void n(k child) {
        kotlin.jvm.internal.s.g(child, "child");
        for (Map.Entry<u<?>, Object> entry : child.f36435a.entrySet()) {
            u<?> key = entry.getKey();
            Object b11 = key.b(this.f36435a.get(key), entry.getValue());
            if (b11 != null) {
                this.f36435a.put(key, b11);
            }
        }
    }

    public final void o(boolean z11) {
        this.f36437c = z11;
    }

    public final void p(boolean z11) {
        this.f36436b = z11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f36436b) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f36437c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<u<?>, Object> entry : this.f36435a.entrySet()) {
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(entry.getKey().a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return b1.b(this, null) + "{ " + ((Object) sb2) + " }";
    }
}