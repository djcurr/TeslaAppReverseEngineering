package com.bumptech.glide.integration.okhttp3;

import ha.e;
import java.io.InputStream;
import na.g;
import na.n;
import na.o;
import na.r;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public class b implements n<g, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Call.Factory f10486a;

    /* loaded from: classes.dex */
    public static class a implements o<g, InputStream> {

        /* renamed from: b  reason: collision with root package name */
        private static volatile Call.Factory f10487b;

        /* renamed from: a  reason: collision with root package name */
        private final Call.Factory f10488a;

        public a() {
            this(b());
        }

        private static Call.Factory b() {
            if (f10487b == null) {
                synchronized (a.class) {
                    if (f10487b == null) {
                        f10487b = new OkHttpClient();
                    }
                }
            }
            return f10487b;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<g, InputStream> c(r rVar) {
            return new b(this.f10488a);
        }

        public a(Call.Factory factory) {
            this.f10488a = factory;
        }
    }

    public b(Call.Factory factory) {
        this.f10486a = factory;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<InputStream> b(g gVar, int i11, int i12, e eVar) {
        return new n.a<>(gVar, new ga.a(this.f10486a, gVar));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(g gVar) {
        return true;
    }
}