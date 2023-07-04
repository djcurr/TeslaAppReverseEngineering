package it;

import com.squareup.moshi.p;
import com.tesla.features.FeaturesConfigEnvelope;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final vz.k f32748a;

    /* renamed from: it.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0599a extends u implements h00.a<com.squareup.moshi.f<FeaturesConfigEnvelope>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0599a f32749a = new C0599a();

        C0599a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final com.squareup.moshi.f<FeaturesConfigEnvelope> invoke() {
            return new p.b().d().c(FeaturesConfigEnvelope.class);
        }
    }

    static {
        vz.k a11;
        a11 = vz.m.a(C0599a.f32749a);
        f32748a = a11;
    }

    public static final com.squareup.moshi.f<FeaturesConfigEnvelope> a() {
        return (com.squareup.moshi.f) f32748a.getValue();
    }
}