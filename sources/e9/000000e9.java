package am;

import am.a0;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.modules.appstate.AppStateModule;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.networking.FraudDetectionData;
import expo.modules.constants.ExponentInstallationId;
import ezvcard.property.Kind;

/* loaded from: classes3.dex */
public final class a implements mm.a {

    /* renamed from: a  reason: collision with root package name */
    public static final mm.a f574a = new a();

    /* renamed from: am.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0013a implements lm.c<a0.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0013a f575a = new C0013a();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f576b = lm.b.d("pid");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f577c = lm.b.d("processName");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f578d = lm.b.d("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f579e = lm.b.d("importance");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f580f = lm.b.d("pss");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f581g = lm.b.d("rss");

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f582h = lm.b.d(FraudDetectionData.KEY_TIMESTAMP);

        /* renamed from: i  reason: collision with root package name */
        private static final lm.b f583i = lm.b.d("traceFile");

        private C0013a() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.a aVar, lm.d dVar) {
            dVar.add(f576b, aVar.c());
            dVar.add(f577c, aVar.d());
            dVar.add(f578d, aVar.f());
            dVar.add(f579e, aVar.b());
            dVar.add(f580f, aVar.e());
            dVar.add(f581g, aVar.g());
            dVar.add(f582h, aVar.h());
            dVar.add(f583i, aVar.i());
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements lm.c<a0.c> {

        /* renamed from: a  reason: collision with root package name */
        static final b f584a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f585b = lm.b.d(Action.KEY_ATTRIBUTE);

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f586c = lm.b.d("value");

        private b() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.c cVar, lm.d dVar) {
            dVar.add(f585b, cVar.b());
            dVar.add(f586c, cVar.c());
        }
    }

    /* loaded from: classes3.dex */
    private static final class c implements lm.c<a0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f587a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f588b = lm.b.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f589c = lm.b.d("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f590d = lm.b.d("platform");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f591e = lm.b.d("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f592f = lm.b.d("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f593g = lm.b.d("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f594h = lm.b.d("session");

        /* renamed from: i  reason: collision with root package name */
        private static final lm.b f595i = lm.b.d("ndkPayload");

        private c() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0 a0Var, lm.d dVar) {
            dVar.add(f588b, a0Var.i());
            dVar.add(f589c, a0Var.e());
            dVar.add(f590d, a0Var.h());
            dVar.add(f591e, a0Var.f());
            dVar.add(f592f, a0Var.c());
            dVar.add(f593g, a0Var.d());
            dVar.add(f594h, a0Var.j());
            dVar.add(f595i, a0Var.g());
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements lm.c<a0.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f596a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f597b = lm.b.d("files");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f598c = lm.b.d("orgId");

        private d() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.d dVar, lm.d dVar2) {
            dVar2.add(f597b, dVar.b());
            dVar2.add(f598c, dVar.c());
        }
    }

    /* loaded from: classes3.dex */
    private static final class e implements lm.c<a0.d.b> {

        /* renamed from: a  reason: collision with root package name */
        static final e f599a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f600b = lm.b.d("filename");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f601c = lm.b.d("contents");

        private e() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.d.b bVar, lm.d dVar) {
            dVar.add(f600b, bVar.c());
            dVar.add(f601c, bVar.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class f implements lm.c<a0.e.a> {

        /* renamed from: a  reason: collision with root package name */
        static final f f602a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f603b = lm.b.d("identifier");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f604c = lm.b.d("version");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f605d = lm.b.d("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f606e = lm.b.d("organization");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f607f = lm.b.d("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f608g = lm.b.d("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f609h = lm.b.d("developmentPlatformVersion");

        private f() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.a aVar, lm.d dVar) {
            dVar.add(f603b, aVar.e());
            dVar.add(f604c, aVar.h());
            dVar.add(f605d, aVar.d());
            dVar.add(f606e, aVar.g());
            dVar.add(f607f, aVar.f());
            dVar.add(f608g, aVar.b());
            dVar.add(f609h, aVar.c());
        }
    }

    /* loaded from: classes3.dex */
    private static final class g implements lm.c<a0.e.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final g f610a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f611b = lm.b.d("clsId");

        private g() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.a.b bVar, lm.d dVar) {
            dVar.add(f611b, bVar.a());
        }
    }

    /* loaded from: classes3.dex */
    private static final class h implements lm.c<a0.e.c> {

        /* renamed from: a  reason: collision with root package name */
        static final h f612a = new h();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f613b = lm.b.d("arch");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f614c = lm.b.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f615d = lm.b.d("cores");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f616e = lm.b.d("ram");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f617f = lm.b.d("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f618g = lm.b.d("simulator");

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f619h = lm.b.d("state");

        /* renamed from: i  reason: collision with root package name */
        private static final lm.b f620i = lm.b.d("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        private static final lm.b f621j = lm.b.d("modelClass");

        private h() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.c cVar, lm.d dVar) {
            dVar.add(f613b, cVar.b());
            dVar.add(f614c, cVar.f());
            dVar.add(f615d, cVar.c());
            dVar.add(f616e, cVar.h());
            dVar.add(f617f, cVar.d());
            dVar.add(f618g, cVar.j());
            dVar.add(f619h, cVar.i());
            dVar.add(f620i, cVar.e());
            dVar.add(f621j, cVar.g());
        }
    }

    /* loaded from: classes3.dex */
    private static final class i implements lm.c<a0.e> {

        /* renamed from: a  reason: collision with root package name */
        static final i f622a = new i();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f623b = lm.b.d("generator");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f624c = lm.b.d("identifier");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f625d = lm.b.d("startedAt");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f626e = lm.b.d("endedAt");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f627f = lm.b.d("crashed");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f628g = lm.b.d(Stripe3ds2AuthParams.FIELD_APP);

        /* renamed from: h  reason: collision with root package name */
        private static final lm.b f629h = lm.b.d("user");

        /* renamed from: i  reason: collision with root package name */
        private static final lm.b f630i = lm.b.d("os");

        /* renamed from: j  reason: collision with root package name */
        private static final lm.b f631j = lm.b.d(Kind.DEVICE);

        /* renamed from: k  reason: collision with root package name */
        private static final lm.b f632k = lm.b.d("events");

        /* renamed from: l  reason: collision with root package name */
        private static final lm.b f633l = lm.b.d("generatorType");

        private i() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e eVar, lm.d dVar) {
            dVar.add(f623b, eVar.f());
            dVar.add(f624c, eVar.i());
            dVar.add(f625d, eVar.k());
            dVar.add(f626e, eVar.d());
            dVar.add(f627f, eVar.m());
            dVar.add(f628g, eVar.b());
            dVar.add(f629h, eVar.l());
            dVar.add(f630i, eVar.j());
            dVar.add(f631j, eVar.c());
            dVar.add(f632k, eVar.e());
            dVar.add(f633l, eVar.g());
        }
    }

    /* loaded from: classes3.dex */
    private static final class j implements lm.c<a0.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        static final j f634a = new j();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f635b = lm.b.d("execution");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f636c = lm.b.d("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f637d = lm.b.d("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f638e = lm.b.d(AppStateModule.APP_STATE_BACKGROUND);

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f639f = lm.b.d("uiOrientation");

        private j() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.a aVar, lm.d dVar) {
            dVar.add(f635b, aVar.d());
            dVar.add(f636c, aVar.c());
            dVar.add(f637d, aVar.e());
            dVar.add(f638e, aVar.b());
            dVar.add(f639f, aVar.f());
        }
    }

    /* loaded from: classes3.dex */
    private static final class k implements lm.c<a0.e.d.a.b.AbstractC0017a> {

        /* renamed from: a  reason: collision with root package name */
        static final k f640a = new k();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f641b = lm.b.d("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f642c = lm.b.d("size");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f643d = lm.b.d("name");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f644e = lm.b.d(ExponentInstallationId.LEGACY_UUID_KEY);

        private k() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.a.b.AbstractC0017a abstractC0017a, lm.d dVar) {
            dVar.add(f641b, abstractC0017a.b());
            dVar.add(f642c, abstractC0017a.d());
            dVar.add(f643d, abstractC0017a.c());
            dVar.add(f644e, abstractC0017a.f());
        }
    }

    /* loaded from: classes3.dex */
    private static final class l implements lm.c<a0.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final l f645a = new l();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f646b = lm.b.d("threads");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f647c = lm.b.d("exception");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f648d = lm.b.d("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f649e = lm.b.d("signal");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f650f = lm.b.d("binaries");

        private l() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.a.b bVar, lm.d dVar) {
            dVar.add(f646b, bVar.f());
            dVar.add(f647c, bVar.d());
            dVar.add(f648d, bVar.b());
            dVar.add(f649e, bVar.e());
            dVar.add(f650f, bVar.c());
        }
    }

    /* loaded from: classes3.dex */
    private static final class m implements lm.c<a0.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        static final m f651a = new m();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f652b = lm.b.d("type");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f653c = lm.b.d("reason");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f654d = lm.b.d("frames");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f655e = lm.b.d("causedBy");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f656f = lm.b.d("overflowCount");

        private m() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.a.b.c cVar, lm.d dVar) {
            dVar.add(f652b, cVar.f());
            dVar.add(f653c, cVar.e());
            dVar.add(f654d, cVar.c());
            dVar.add(f655e, cVar.b());
            dVar.add(f656f, cVar.d());
        }
    }

    /* loaded from: classes3.dex */
    private static final class n implements lm.c<a0.e.d.a.b.AbstractC0021d> {

        /* renamed from: a  reason: collision with root package name */
        static final n f657a = new n();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f658b = lm.b.d("name");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f659c = lm.b.d(PaymentMethodOptionsParams.Blik.PARAM_CODE);

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f660d = lm.b.d("address");

        private n() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.a.b.AbstractC0021d abstractC0021d, lm.d dVar) {
            dVar.add(f658b, abstractC0021d.d());
            dVar.add(f659c, abstractC0021d.c());
            dVar.add(f660d, abstractC0021d.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class o implements lm.c<a0.e.d.a.b.AbstractC0023e> {

        /* renamed from: a  reason: collision with root package name */
        static final o f661a = new o();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f662b = lm.b.d("name");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f663c = lm.b.d("importance");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f664d = lm.b.d("frames");

        private o() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.a.b.AbstractC0023e abstractC0023e, lm.d dVar) {
            dVar.add(f662b, abstractC0023e.d());
            dVar.add(f663c, abstractC0023e.c());
            dVar.add(f664d, abstractC0023e.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class p implements lm.c<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> {

        /* renamed from: a  reason: collision with root package name */
        static final p f665a = new p();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f666b = lm.b.d("pc");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f667c = lm.b.d("symbol");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f668d = lm.b.d(Action.FILE_ATTRIBUTE);

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f669e = lm.b.d("offset");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f670f = lm.b.d("importance");

        private p() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.a.b.AbstractC0023e.AbstractC0025b abstractC0025b, lm.d dVar) {
            dVar.add(f666b, abstractC0025b.e());
            dVar.add(f667c, abstractC0025b.f());
            dVar.add(f668d, abstractC0025b.b());
            dVar.add(f669e, abstractC0025b.d());
            dVar.add(f670f, abstractC0025b.c());
        }
    }

    /* loaded from: classes3.dex */
    private static final class q implements lm.c<a0.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        static final q f671a = new q();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f672b = lm.b.d("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f673c = lm.b.d("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f674d = lm.b.d("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f675e = lm.b.d("orientation");

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f676f = lm.b.d("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        private static final lm.b f677g = lm.b.d("diskUsed");

        private q() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.c cVar, lm.d dVar) {
            dVar.add(f672b, cVar.b());
            dVar.add(f673c, cVar.c());
            dVar.add(f674d, cVar.g());
            dVar.add(f675e, cVar.e());
            dVar.add(f676f, cVar.f());
            dVar.add(f677g, cVar.d());
        }
    }

    /* loaded from: classes3.dex */
    private static final class r implements lm.c<a0.e.d> {

        /* renamed from: a  reason: collision with root package name */
        static final r f678a = new r();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f679b = lm.b.d(FraudDetectionData.KEY_TIMESTAMP);

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f680c = lm.b.d("type");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f681d = lm.b.d(Stripe3ds2AuthParams.FIELD_APP);

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f682e = lm.b.d(Kind.DEVICE);

        /* renamed from: f  reason: collision with root package name */
        private static final lm.b f683f = lm.b.d("log");

        private r() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d dVar, lm.d dVar2) {
            dVar2.add(f679b, dVar.e());
            dVar2.add(f680c, dVar.f());
            dVar2.add(f681d, dVar.b());
            dVar2.add(f682e, dVar.c());
            dVar2.add(f683f, dVar.d());
        }
    }

    /* loaded from: classes3.dex */
    private static final class s implements lm.c<a0.e.d.AbstractC0027d> {

        /* renamed from: a  reason: collision with root package name */
        static final s f684a = new s();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f685b = lm.b.d("content");

        private s() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.d.AbstractC0027d abstractC0027d, lm.d dVar) {
            dVar.add(f685b, abstractC0027d.b());
        }
    }

    /* loaded from: classes3.dex */
    private static final class t implements lm.c<a0.e.AbstractC0028e> {

        /* renamed from: a  reason: collision with root package name */
        static final t f686a = new t();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f687b = lm.b.d("platform");

        /* renamed from: c  reason: collision with root package name */
        private static final lm.b f688c = lm.b.d("version");

        /* renamed from: d  reason: collision with root package name */
        private static final lm.b f689d = lm.b.d("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final lm.b f690e = lm.b.d("jailbroken");

        private t() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.AbstractC0028e abstractC0028e, lm.d dVar) {
            dVar.add(f687b, abstractC0028e.c());
            dVar.add(f688c, abstractC0028e.d());
            dVar.add(f689d, abstractC0028e.b());
            dVar.add(f690e, abstractC0028e.e());
        }
    }

    /* loaded from: classes3.dex */
    private static final class u implements lm.c<a0.e.f> {

        /* renamed from: a  reason: collision with root package name */
        static final u f691a = new u();

        /* renamed from: b  reason: collision with root package name */
        private static final lm.b f692b = lm.b.d("identifier");

        private u() {
        }

        @Override // lm.c
        /* renamed from: a */
        public void encode(a0.e.f fVar, lm.d dVar) {
            dVar.add(f692b, fVar.b());
        }
    }

    private a() {
    }

    @Override // mm.a
    public void configure(mm.b<?> bVar) {
        c cVar = c.f587a;
        bVar.registerEncoder(a0.class, cVar);
        bVar.registerEncoder(am.b.class, cVar);
        i iVar = i.f622a;
        bVar.registerEncoder(a0.e.class, iVar);
        bVar.registerEncoder(am.g.class, iVar);
        f fVar = f.f602a;
        bVar.registerEncoder(a0.e.a.class, fVar);
        bVar.registerEncoder(am.h.class, fVar);
        g gVar = g.f610a;
        bVar.registerEncoder(a0.e.a.b.class, gVar);
        bVar.registerEncoder(am.i.class, gVar);
        u uVar = u.f691a;
        bVar.registerEncoder(a0.e.f.class, uVar);
        bVar.registerEncoder(v.class, uVar);
        t tVar = t.f686a;
        bVar.registerEncoder(a0.e.AbstractC0028e.class, tVar);
        bVar.registerEncoder(am.u.class, tVar);
        h hVar = h.f612a;
        bVar.registerEncoder(a0.e.c.class, hVar);
        bVar.registerEncoder(am.j.class, hVar);
        r rVar = r.f678a;
        bVar.registerEncoder(a0.e.d.class, rVar);
        bVar.registerEncoder(am.k.class, rVar);
        j jVar = j.f634a;
        bVar.registerEncoder(a0.e.d.a.class, jVar);
        bVar.registerEncoder(am.l.class, jVar);
        l lVar = l.f645a;
        bVar.registerEncoder(a0.e.d.a.b.class, lVar);
        bVar.registerEncoder(am.m.class, lVar);
        o oVar = o.f661a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0023e.class, oVar);
        bVar.registerEncoder(am.q.class, oVar);
        p pVar = p.f665a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0023e.AbstractC0025b.class, pVar);
        bVar.registerEncoder(am.r.class, pVar);
        m mVar = m.f651a;
        bVar.registerEncoder(a0.e.d.a.b.c.class, mVar);
        bVar.registerEncoder(am.o.class, mVar);
        C0013a c0013a = C0013a.f575a;
        bVar.registerEncoder(a0.a.class, c0013a);
        bVar.registerEncoder(am.c.class, c0013a);
        n nVar = n.f657a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0021d.class, nVar);
        bVar.registerEncoder(am.p.class, nVar);
        k kVar = k.f640a;
        bVar.registerEncoder(a0.e.d.a.b.AbstractC0017a.class, kVar);
        bVar.registerEncoder(am.n.class, kVar);
        b bVar2 = b.f584a;
        bVar.registerEncoder(a0.c.class, bVar2);
        bVar.registerEncoder(am.d.class, bVar2);
        q qVar = q.f671a;
        bVar.registerEncoder(a0.e.d.c.class, qVar);
        bVar.registerEncoder(am.s.class, qVar);
        s sVar = s.f684a;
        bVar.registerEncoder(a0.e.d.AbstractC0027d.class, sVar);
        bVar.registerEncoder(am.t.class, sVar);
        d dVar = d.f596a;
        bVar.registerEncoder(a0.d.class, dVar);
        bVar.registerEncoder(am.e.class, dVar);
        e eVar = e.f599a;
        bVar.registerEncoder(a0.d.b.class, eVar);
        bVar.registerEncoder(am.f.class, eVar);
    }
}