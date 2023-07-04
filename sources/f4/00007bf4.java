package jj;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import jj.j;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a */
    public final ci.i f33846a;

    /* renamed from: b */
    public final String f33847b;

    /* renamed from: c */
    public final long f33848c;

    /* renamed from: d */
    public final List<d> f33849d;

    /* renamed from: e */
    private final h f33850e;

    /* loaded from: classes3.dex */
    public static class b extends i implements ij.d {

        /* renamed from: f */
        final j.a f33851f;

        public b(long j11, ci.i iVar, String str, j.a aVar, List<d> list) {
            super(j11, iVar, str, aVar, list);
            this.f33851f = aVar;
        }

        @Override // jj.i
        public String a() {
            return null;
        }

        @Override // jj.i
        public ij.d b() {
            return this;
        }

        @Override // ij.d
        public long c(long j11) {
            return this.f33851f.j(j11);
        }

        @Override // ij.d
        public long d(long j11, long j12) {
            return this.f33851f.h(j11, j12);
        }

        @Override // ij.d
        public long e(long j11, long j12) {
            return this.f33851f.d(j11, j12);
        }

        @Override // ij.d
        public long f(long j11, long j12) {
            return this.f33851f.f(j11, j12);
        }

        @Override // ij.d
        public h g(long j11) {
            return this.f33851f.k(this, j11);
        }

        @Override // ij.d
        public long h(long j11, long j12) {
            return this.f33851f.i(j11, j12);
        }

        @Override // ij.d
        public int i(long j11) {
            return this.f33851f.g(j11);
        }

        @Override // ij.d
        public boolean j() {
            return this.f33851f.l();
        }

        @Override // ij.d
        public long k() {
            return this.f33851f.e();
        }

        @Override // ij.d
        public int l(long j11, long j12) {
            return this.f33851f.c(j11, j12);
        }

        @Override // jj.i
        public h m() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends i {

        /* renamed from: f */
        private final String f33852f;

        /* renamed from: g */
        private final h f33853g;

        /* renamed from: h */
        private final l f33854h;

        public c(long j11, ci.i iVar, String str, j.e eVar, List<d> list, String str2, long j12) {
            super(j11, iVar, str, eVar, list);
            Uri.parse(str);
            h c11 = eVar.c();
            this.f33853g = c11;
            this.f33852f = str2;
            this.f33854h = c11 != null ? null : new l(new h(null, 0L, j12));
        }

        @Override // jj.i
        public String a() {
            return this.f33852f;
        }

        @Override // jj.i
        public ij.d b() {
            return this.f33854h;
        }

        @Override // jj.i
        public h m() {
            return this.f33853g;
        }
    }

    public static i o(long j11, ci.i iVar, String str, j jVar, List<d> list) {
        return p(j11, iVar, str, jVar, list, null);
    }

    public static i p(long j11, ci.i iVar, String str, j jVar, List<d> list, String str2) {
        if (jVar instanceof j.e) {
            return new c(j11, iVar, str, (j.e) jVar, list, str2, -1L);
        }
        if (jVar instanceof j.a) {
            return new b(j11, iVar, str, (j.a) jVar, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract ij.d b();

    public abstract h m();

    public h n() {
        return this.f33850e;
    }

    private i(long j11, ci.i iVar, String str, j jVar, List<d> list) {
        List<d> unmodifiableList;
        this.f33846a = iVar;
        this.f33847b = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f33849d = unmodifiableList;
        this.f33850e = jVar.a(this);
        this.f33848c = jVar.b();
    }
}