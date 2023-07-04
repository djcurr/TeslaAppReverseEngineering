package androidx.camera.core.impl;

import androidx.camera.core.impl.d0;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b<T> extends d0.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2270a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f2271b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2272c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, Class<T> cls, Object obj) {
        Objects.requireNonNull(str, "Null id");
        this.f2270a = str;
        Objects.requireNonNull(cls, "Null valueClass");
        this.f2271b = cls;
        this.f2272c = obj;
    }

    @Override // androidx.camera.core.impl.d0.a
    public String c() {
        return this.f2270a;
    }

    @Override // androidx.camera.core.impl.d0.a
    public Object d() {
        return this.f2272c;
    }

    @Override // androidx.camera.core.impl.d0.a
    public Class<T> e() {
        return this.f2271b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0.a) {
            d0.a aVar = (d0.a) obj;
            if (this.f2270a.equals(aVar.c()) && this.f2271b.equals(aVar.e())) {
                Object obj2 = this.f2272c;
                if (obj2 == null) {
                    if (aVar.d() == null) {
                        return true;
                    }
                } else if (obj2.equals(aVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f2270a.hashCode() ^ 1000003) * 1000003) ^ this.f2271b.hashCode()) * 1000003;
        Object obj = this.f2272c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f2270a + ", valueClass=" + this.f2271b + ", token=" + this.f2272c + "}";
    }
}