package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface g {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final fj.g f14692a;

        /* renamed from: b  reason: collision with root package name */
        public final fj.h f14693b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f14694c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14695d;

        public a(fj.g gVar, fj.h hVar, IOException iOException, int i11) {
            this.f14692a = gVar;
            this.f14693b = hVar;
            this.f14694c = iOException;
            this.f14695d = i11;
        }
    }

    default long a(a aVar) {
        return e(aVar.f14693b.f26296a, aVar.f14692a.f26295b, aVar.f14694c, aVar.f14695d);
    }

    @Deprecated
    default long b(int i11, long j11, IOException iOException, int i12) {
        throw new UnsupportedOperationException();
    }

    default long c(a aVar) {
        return b(aVar.f14693b.f26296a, aVar.f14692a.f26295b, aVar.f14694c, aVar.f14695d);
    }

    int d(int i11);

    @Deprecated
    default long e(int i11, long j11, IOException iOException, int i12) {
        throw new UnsupportedOperationException();
    }

    default void f(long j11) {
    }
}