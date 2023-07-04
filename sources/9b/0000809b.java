package kr;

import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;

/* loaded from: classes2.dex */
public final class a<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f35688a;

    public a(f<T> fVar) {
        this.f35688a = fVar;
    }

    @Override // com.squareup.moshi.f
    public T b(h hVar) {
        if (hVar.t0() == h.c.NULL) {
            return (T) hVar.e0();
        }
        return this.f35688a.b(hVar);
    }

    @Override // com.squareup.moshi.f
    public void j(m mVar, T t11) {
        if (t11 == null) {
            mVar.R();
        } else {
            this.f35688a.j(mVar, t11);
        }
    }

    public String toString() {
        return this.f35688a + ".nullSafe()";
    }
}