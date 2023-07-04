package com.google.firebase.messaging;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;

/* loaded from: classes2.dex */
public final class a implements mm.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mm.a f16727a = new a();

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0306a implements lm.c<an.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0306a f16728a = new C0306a();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f16729b = lm.b.a("projectNumber").b(om.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f16730c = lm.b.a("messageId").b(om.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f16731d = lm.b.a("instanceId").b(om.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f16732e = lm.b.a(ChallengeRequestData.FIELD_MESSAGE_TYPE).b(om.a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f16733f = lm.b.a("sdkPlatform").b(om.a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f16734g = lm.b.a("packageName").b(om.a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f16735h = lm.b.a("collapseKey").b(om.a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final lm.b f16736i = lm.b.a("priority").b(om.a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final lm.b f16737j = lm.b.a("ttl").b(om.a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final lm.b f16738k = lm.b.a("topic").b(om.a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final lm.b f16739l = lm.b.a("bulkId").b(om.a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final lm.b f16740m = lm.b.a("event").b(om.a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final lm.b f16741n = lm.b.a("analyticsLabel").b(om.a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final lm.b f16742o = lm.b.a("campaignId").b(om.a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final lm.b f16743p = lm.b.a("composerLabel").b(om.a.b().c(15).a()).a();

        private C0306a() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(an.a aVar, lm.d dVar) {
            dVar.add(f16729b, aVar.l());
            dVar.add(f16730c, aVar.h());
            dVar.add(f16731d, aVar.g());
            dVar.add(f16732e, aVar.i());
            dVar.add(f16733f, aVar.m());
            dVar.add(f16734g, aVar.j());
            dVar.add(f16735h, aVar.d());
            dVar.add(f16736i, aVar.k());
            dVar.add(f16737j, aVar.o());
            dVar.add(f16738k, aVar.n());
            dVar.add(f16739l, aVar.b());
            dVar.add(f16740m, aVar.f());
            dVar.add(f16741n, aVar.a());
            dVar.add(f16742o, aVar.c());
            dVar.add(f16743p, aVar.e());
        }
    }

    /* loaded from: classes2.dex */
    private static final class b implements lm.c<an.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f16744a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f16745b = lm.b.a("messagingClientEvent").b(om.a.b().c(1).a()).a();

        private b() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(an.b bVar, lm.d dVar) {
            dVar.add(f16745b, bVar.a());
        }
    }

    /* loaded from: classes2.dex */
    private static final class c implements lm.c<k0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f16746a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f16747b = lm.b.d("messagingClientEventExtension");

        private c() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(k0 k0Var, lm.d dVar) {
            dVar.add(f16747b, k0Var.b());
        }
    }

    private a() {
    }

    @Override // mm.a
    public void configure(mm.b<?> bVar) {
        bVar.registerEncoder(k0.class, c.f16746a);
        bVar.registerEncoder(an.b.class, b.f16744a);
        bVar.registerEncoder(an.a.class, C0306a.f16728a);
    }
}