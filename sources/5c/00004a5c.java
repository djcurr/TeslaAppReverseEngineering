package com.squareup.moshi;

import com.squareup.moshi.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class f<T> {

    /* loaded from: classes2.dex */
    class a extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f20508a;

        a(f fVar, f fVar2) {
            this.f20508a = fVar2;
        }

        @Override // com.squareup.moshi.f
        public T b(h hVar) {
            return (T) this.f20508a.b(hVar);
        }

        @Override // com.squareup.moshi.f
        boolean e() {
            return this.f20508a.e();
        }

        @Override // com.squareup.moshi.f
        public void j(m mVar, T t11) {
            boolean D = mVar.D();
            mVar.C0(true);
            try {
                this.f20508a.j(mVar, t11);
            } finally {
                mVar.C0(D);
            }
        }

        public String toString() {
            return this.f20508a + ".serializeNulls()";
        }
    }

    /* loaded from: classes2.dex */
    class b extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f20509a;

        b(f fVar, f fVar2) {
            this.f20509a = fVar2;
        }

        @Override // com.squareup.moshi.f
        public T b(h hVar) {
            boolean C = hVar.C();
            hVar.P0(true);
            try {
                return (T) this.f20509a.b(hVar);
            } finally {
                hVar.P0(C);
            }
        }

        @Override // com.squareup.moshi.f
        boolean e() {
            return true;
        }

        @Override // com.squareup.moshi.f
        public void j(m mVar, T t11) {
            boolean J = mVar.J();
            mVar.u0(true);
            try {
                this.f20509a.j(mVar, t11);
            } finally {
                mVar.u0(J);
            }
        }

        public String toString() {
            return this.f20509a + ".lenient()";
        }
    }

    /* loaded from: classes2.dex */
    class c extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f20510a;

        c(f fVar, f fVar2) {
            this.f20510a = fVar2;
        }

        @Override // com.squareup.moshi.f
        public T b(h hVar) {
            boolean m11 = hVar.m();
            hVar.J0(true);
            try {
                return (T) this.f20510a.b(hVar);
            } finally {
                hVar.J0(m11);
            }
        }

        @Override // com.squareup.moshi.f
        boolean e() {
            return this.f20510a.e();
        }

        @Override // com.squareup.moshi.f
        public void j(m mVar, T t11) {
            this.f20510a.j(mVar, t11);
        }

        public String toString() {
            return this.f20510a + ".failOnUnknown()";
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        f<?> a(Type type, Set<? extends Annotation> set, p pVar);
    }

    public final f<T> a() {
        return new c(this, this);
    }

    public abstract T b(h hVar);

    public final T c(String str) {
        h p02 = h.p0(new okio.f().T(str));
        T b11 = b(p02);
        if (e() || p02.t0() == h.c.END_DOCUMENT) {
            return b11;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final T d(okio.h hVar) {
        return b(h.p0(hVar));
    }

    boolean e() {
        return false;
    }

    public final f<T> f() {
        return new b(this, this);
    }

    public final f<T> g() {
        return this instanceof kr.a ? this : new kr.a(this);
    }

    public final f<T> h() {
        return new a(this, this);
    }

    public final String i(T t11) {
        okio.f fVar = new okio.f();
        try {
            k(fVar, t11);
            return fVar.G0();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public abstract void j(m mVar, T t11);

    public final void k(okio.g gVar, T t11) {
        j(m.a0(gVar), t11);
    }
}