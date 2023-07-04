package com.withpersona.sdk.inquiry.governmentid;

import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.governmentid.a;
import com.withpersona.sdk.inquiry.governmentid.b;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import nr.k;
import nr.n;
import pv.f;
import vz.b0;
import wv.g;
import wv.h;
import wv.j0;
import wv.z;
import wz.e0;
import yv.a;
import yv.d;
import yv.e;

/* loaded from: classes6.dex */
public final class b extends nr.k<C0415b, z, c, d> {

    /* renamed from: a */
    private final pv.f f22405a;

    /* renamed from: b */
    private final e.a f22406b;

    /* renamed from: c */
    private final d.a f22407c;

    /* renamed from: d */
    private final a.b f22408d;

    /* renamed from: e */
    private final h.a f22409e;

    /* renamed from: f */
    private final wv.g f22410f;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$b */
    /* loaded from: classes6.dex */
    public static final class C0415b {

        /* renamed from: a */
        private final String f22411a;

        /* renamed from: b */
        private final String f22412b;

        /* renamed from: c */
        private final String f22413c;

        /* renamed from: d */
        private final List<Id> f22414d;

        public C0415b(String sessionToken, String verificationToken, String countryCode, List<Id> enabledIdClasses) {
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            kotlin.jvm.internal.s.g(enabledIdClasses, "enabledIdClasses");
            this.f22411a = sessionToken;
            this.f22412b = verificationToken;
            this.f22413c = countryCode;
            this.f22414d = enabledIdClasses;
        }

        public final String a() {
            return this.f22413c;
        }

        public final List<Id> b() {
            return this.f22414d;
        }

        public final String c() {
            return this.f22411a;
        }

        public final String d() {
            return this.f22412b;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a */
            public static final a f22415a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$c$b */
        /* loaded from: classes6.dex */
        public static final class C0416b extends c {

            /* renamed from: a */
            public static final C0416b f22416a = new C0416b();

            private C0416b() {
                super(null);
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$c$c */
        /* loaded from: classes6.dex */
        public static final class C0417c extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0417c(String message) {
                super(null);
                kotlin.jvm.internal.s.g(message, "message");
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends c {

            /* renamed from: a */
            public static final d f22417a = new d();

            private d() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class e extends c {

            /* renamed from: a */
            public static final e f22418a = new e();

            private e() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class d {

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$d$b */
        /* loaded from: classes6.dex */
        public static final class C0423b extends d {

            /* renamed from: a */
            private final int f22432a;

            /* renamed from: b */
            private final h00.a<b0> f22433b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0423b(int i11, h00.a<b0> onClick) {
                super(null);
                kotlin.jvm.internal.s.g(onClick, "onClick");
                this.f22432a = i11;
                this.f22433b = onClick;
            }

            public final int a() {
                return this.f22432a;
            }

            public final h00.a<b0> b() {
                return this.f22433b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0423b) {
                    C0423b c0423b = (C0423b) obj;
                    return this.f22432a == c0423b.f22432a && kotlin.jvm.internal.s.c(this.f22433b, c0423b.f22433b);
                }
                return false;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f22432a) * 31) + this.f22433b.hashCode();
            }

            public String toString() {
                return "FailedScreen(message=" + this.f22432a + ", onClick=" + this.f22433b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends d {

            /* renamed from: a */
            private final List<Id> f22434a;

            /* renamed from: b */
            private final h00.l<Id, b0> f22435b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<Id> enabledIdClasses, h00.l<? super Id, b0> selectIdClass) {
                super(null);
                kotlin.jvm.internal.s.g(enabledIdClasses, "enabledIdClasses");
                kotlin.jvm.internal.s.g(selectIdClass, "selectIdClass");
                this.f22434a = enabledIdClasses;
                this.f22435b = selectIdClass;
            }

            public final List<Id> a() {
                return this.f22434a;
            }

            public final h00.l<Id, b0> b() {
                return this.f22435b;
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$d$d */
        /* loaded from: classes6.dex */
        public static final class C0424d extends d {

            /* renamed from: a */
            private final int f22436a;

            /* renamed from: b */
            private final int f22437b;

            /* renamed from: c */
            private final String f22438c;

            /* renamed from: d */
            private final h00.a<b0> f22439d;

            /* renamed from: e */
            private final h00.a<b0> f22440e;

            /* renamed from: f */
            private final h00.a<b0> f22441f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0424d(int i11, int i12, String imagePath, h00.a<b0> acceptImage, h00.a<b0> retryImage, h00.a<b0> close) {
                super(null);
                kotlin.jvm.internal.s.g(imagePath, "imagePath");
                kotlin.jvm.internal.s.g(acceptImage, "acceptImage");
                kotlin.jvm.internal.s.g(retryImage, "retryImage");
                kotlin.jvm.internal.s.g(close, "close");
                this.f22436a = i11;
                this.f22437b = i12;
                this.f22438c = imagePath;
                this.f22439d = acceptImage;
                this.f22440e = retryImage;
                this.f22441f = close;
            }

            public final h00.a<b0> a() {
                return this.f22439d;
            }

            public final h00.a<b0> b() {
                return this.f22441f;
            }

            public final String c() {
                return this.f22438c;
            }

            public final int d() {
                return this.f22437b;
            }

            public final h00.a<b0> e() {
                return this.f22440e;
            }

            public final int f() {
                return this.f22436a;
            }
        }

        /* loaded from: classes6.dex */
        public static final class e extends d {

            /* renamed from: a */
            public static final e f22442a = new e();

            private e() {
                super(null);
            }
        }

        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* loaded from: classes6.dex */
        public static final class a extends d {

            /* renamed from: a */
            private final int f22419a;

            /* renamed from: b */
            private final int f22420b;

            /* renamed from: c */
            private final int f22421c;

            /* renamed from: d */
            private final Id.b f22422d;

            /* renamed from: e */
            private final EnumC0419b f22423e;

            /* renamed from: f */
            private final c f22424f;

            /* renamed from: g */
            private final h00.l<String, b0> f22425g;

            /* renamed from: h */
            private final h00.a<b0> f22426h;

            /* renamed from: i */
            private final h00.a<b0> f22427i;

            /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$d$a$a */
            /* loaded from: classes6.dex */
            public static final class C0418a extends kotlin.jvm.internal.u implements h00.l<String, b0> {

                /* renamed from: a */
                public static final C0418a f22428a = new C0418a();

                C0418a() {
                    super(1);
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ b0 invoke(String str) {
                    invoke2(str);
                    return b0.f54756a;
                }

                /* renamed from: invoke */
                public final void invoke2(String it2) {
                    kotlin.jvm.internal.s.g(it2, "it");
                }
            }

            /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$d$a$b */
            /* loaded from: classes6.dex */
            public enum EnumC0419b {
                Disabled,
                Enabled,
                Hidden
            }

            /* loaded from: classes6.dex */
            public static abstract class c {

                /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$d$a$c$a */
                /* loaded from: classes6.dex */
                public static final class C0420a extends c {

                    /* renamed from: a */
                    public static final C0420a f22429a = new C0420a();

                    private C0420a() {
                        super(null);
                    }
                }

                /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$d$a$c$b */
                /* loaded from: classes6.dex */
                public static final class C0421b extends c {

                    /* renamed from: a */
                    public static final C0421b f22430a = new C0421b();

                    private C0421b() {
                        super(null);
                    }
                }

                /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$d$a$c$c */
                /* loaded from: classes6.dex */
                public static final class C0422c extends c {

                    /* renamed from: a */
                    private final int f22431a;

                    public C0422c(int i11) {
                        super(null);
                        this.f22431a = i11;
                    }

                    public final int a() {
                        return this.f22431a;
                    }
                }

                private c() {
                }

                public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ a(int i11, int i12, int i13, Id.b bVar, EnumC0419b enumC0419b, c cVar, h00.l lVar, h00.a aVar, h00.a aVar2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, i12, i13, bVar, enumC0419b, cVar, (i14 & 64) != 0 ? C0418a.f22428a : lVar, aVar, aVar2);
            }

            public final Id.b a() {
                return this.f22422d;
            }

            public final h00.a<b0> b() {
                return this.f22427i;
            }

            public final EnumC0419b c() {
                return this.f22423e;
            }

            public final h00.a<b0> d() {
                return this.f22426h;
            }

            public final int e() {
                return this.f22421c;
            }

            public final h00.l<String, b0> f() {
                return this.f22425g;
            }

            public final int g() {
                return this.f22420b;
            }

            public final c h() {
                return this.f22424f;
            }

            public final int i() {
                return this.f22419a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(int i11, int i12, int i13, Id.b autoCaptureSide, EnumC0419b captureButtonState, c overlay, h00.l<? super String, b0> manuallyCapture, h00.a<b0> close, h00.a<b0> back) {
                super(null);
                kotlin.jvm.internal.s.g(autoCaptureSide, "autoCaptureSide");
                kotlin.jvm.internal.s.g(captureButtonState, "captureButtonState");
                kotlin.jvm.internal.s.g(overlay, "overlay");
                kotlin.jvm.internal.s.g(manuallyCapture, "manuallyCapture");
                kotlin.jvm.internal.s.g(close, "close");
                kotlin.jvm.internal.s.g(back, "back");
                this.f22419a = i11;
                this.f22420b = i12;
                this.f22421c = i13;
                this.f22422d = autoCaptureSide;
                this.f22423e = captureButtonState;
                this.f22424f = overlay;
                this.f22425g = manuallyCapture;
                this.f22426h = close;
                this.f22427i = back;
            }
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22443a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22444b;

        static {
            int[] iArr = new int[com.withpersona.sdk.inquiry.governmentid.network.b.values().length];
            iArr[com.withpersona.sdk.inquiry.governmentid.network.b.Passport.ordinal()] = 1;
            iArr[com.withpersona.sdk.inquiry.governmentid.network.b.Visa.ordinal()] = 2;
            f22443a = iArr;
            int[] iArr2 = new int[Id.b.values().length];
            iArr2[Id.b.Front.ordinal()] = 1;
            iArr2[Id.b.Back.ordinal()] = 2;
            iArr2[Id.b.FrontOrBack.ordinal()] = 3;
            iArr2[Id.b.BarcodePdf417.ordinal()] = 4;
            iArr2[Id.b.PassportSignature.ordinal()] = 5;
            f22444b = iArr2;
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

        /* renamed from: a */
        final /* synthetic */ com.withpersona.sdk.inquiry.governmentid.a f22445a;

        /* renamed from: b */
        final /* synthetic */ z f22446b;

        /* renamed from: c */
        final /* synthetic */ Id f22447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.withpersona.sdk.inquiry.governmentid.a aVar, z zVar, Id id2) {
            super(1);
            this.f22445a = aVar;
            this.f22446b = zVar;
            this.f22447c = id2;
        }

        public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
            z fVar;
            d.a.EnumC0419b enumC0419b;
            List V;
            kotlin.jvm.internal.s.g(action, "$this$action");
            com.withpersona.sdk.inquiry.governmentid.a aVar = this.f22445a;
            List<com.withpersona.sdk.inquiry.governmentid.a> z02 = aVar == null ? null : e0.z0(action.c().c(), aVar);
            if (z02 == null) {
                z02 = action.c().c();
            }
            Id.b bVar = (Id.b) wz.u.d0(this.f22446b.b());
            if (bVar != null) {
                Id id2 = this.f22447c;
                if (bVar == Id.b.PassportSignature) {
                    enumC0419b = d.a.EnumC0419b.Enabled;
                } else if (!kotlin.jvm.internal.s.c(action.b().a(), "US") && bVar == Id.b.Back) {
                    enumC0419b = d.a.EnumC0419b.Enabled;
                } else {
                    enumC0419b = d.a.EnumC0419b.Hidden;
                }
                d.a.EnumC0419b enumC0419b2 = enumC0419b;
                V = e0.V(this.f22446b.b(), 1);
                fVar = new z.h(bVar, z02, id2, enumC0419b2, V);
            } else {
                fVar = new z.f(z02, null, null, 6, null);
            }
            action.e(fVar);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
            a(cVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<e.b, nr.q<? super C0415b, z, ? extends c>> {

        /* renamed from: b */
        final /* synthetic */ com.withpersona.sdk.inquiry.governmentid.a f22449b;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ com.withpersona.sdk.inquiry.governmentid.a f22450a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.withpersona.sdk.inquiry.governmentid.a aVar) {
                super(1);
                this.f22450a = aVar;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(action.c().d(this.f22450a));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$g$b */
        /* loaded from: classes6.dex */
        public static final class C0425b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final C0425b f22451a = new C0425b();

            C0425b() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(new c.C0417c("There was a problem uploading the ID"));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.withpersona.sdk.inquiry.governmentid.a aVar) {
            super(1);
            b.this = r1;
            this.f22449b = aVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<C0415b, z, c> invoke(e.b it2) {
            nr.q<C0415b, z, c> d11;
            nr.q<C0415b, z, c> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, e.b.C1368b.f59897a)) {
                d12 = nr.y.d(b.this, null, new a(this.f22449b), 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, e.b.a.f59896a)) {
                d11 = nr.y.d(b.this, null, C0425b.f22451a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<g.b, nr.q<? super C0415b, z, ? extends c>> {

        /* renamed from: b */
        final /* synthetic */ z f22453b;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ z f22454a;

            /* renamed from: b */
            final /* synthetic */ g.b f22455b;

            /* renamed from: c */
            final /* synthetic */ b f22456c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, g.b bVar, b bVar2) {
                super(1);
                this.f22454a = zVar;
                this.f22455b = bVar;
                this.f22456c = bVar2;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.d(this.f22454a.a(), action.c().c(), ((z.a) this.f22454a).g(), new com.withpersona.sdk.inquiry.governmentid.a(this.f22455b.a(), this.f22456c.q(this.f22454a.a()), ((z.a) this.f22454a).g().d(), a.EnumC0413a.AUTO, null, 16, null), this.f22454a.b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(z zVar) {
            super(1);
            b.this = r1;
            this.f22453b = zVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<C0415b, z, c> invoke(g.b it2) {
            nr.q<C0415b, z, c> d11;
            kotlin.jvm.internal.s.g(it2, "it");
            b bVar = b.this;
            d11 = nr.y.d(bVar, null, new a(this.f22453b, it2, bVar), 1, null);
            return d11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.h<c> f22457a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(nr.h<? super c> hVar) {
            super(0);
            this.f22457a = hVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f22457a.d(c.C0416b.f22416a);
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.h<c> f22458a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(nr.h<? super c> hVar) {
            super(0);
            this.f22458a = hVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f22458a.d(c.e.f22418a);
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.k<C0415b, z, c, d>.a f22459a;

        /* renamed from: b */
        final /* synthetic */ b f22460b;

        /* renamed from: c */
        final /* synthetic */ z f22461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(nr.k<? super C0415b, z, ? extends c, ? extends d>.a aVar, b bVar, z zVar) {
            super(0);
            this.f22459a = aVar;
            this.f22460b = bVar;
            this.f22461c = zVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            nr.h<nr.q<? super C0415b, z, ? extends c>> b11 = this.f22459a.b();
            b bVar = this.f22460b;
            z zVar = this.f22461c;
            b11.d(bVar.k(zVar, ((z.d) zVar).g(), ((z.d) this.f22461c).h()));
        }
    }

    /* loaded from: classes6.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.k<C0415b, z, c, d>.a f22462a;

        /* renamed from: b */
        final /* synthetic */ b f22463b;

        /* renamed from: c */
        final /* synthetic */ z f22464c;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ z f22465a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar) {
                super(1);
                this.f22465a = zVar;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.h(this.f22465a.a(), action.c().c(), ((z.d) this.f22465a).g(), d.a.EnumC0419b.Hidden, this.f22465a.b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(nr.k<? super C0415b, z, ? extends c, ? extends d>.a aVar, b bVar, z zVar) {
            super(0);
            this.f22462a = aVar;
            this.f22463b = bVar;
            this.f22464c = zVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            nr.q<? super C0415b, z, ? extends c> d11;
            nr.h<nr.q<? super C0415b, z, ? extends c>> b11 = this.f22462a.b();
            d11 = nr.y.d(this.f22463b, null, new a(this.f22464c), 1, null);
            b11.d(d11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.h<c> f22466a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(nr.h<? super c> hVar) {
            super(0);
            this.f22466a = hVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f22466a.d(c.C0416b.f22416a);
        }
    }

    /* loaded from: classes6.dex */
    public static final class n extends kotlin.jvm.internal.u implements h00.l<d.b, nr.q<? super C0415b, z, ? extends c>> {

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final a f22468a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.g(null, null, null, 7, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$n$b */
        /* loaded from: classes6.dex */
        public static final class C0426b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final C0426b f22469a = new C0426b();

            C0426b() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(new c.C0417c("There was a problem uploading the government ID."));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n() {
            super(1);
            b.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<C0415b, z, c> invoke(d.b it2) {
            nr.q<C0415b, z, c> d11;
            nr.q<C0415b, z, c> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 instanceof d.b.C1367b) {
                d12 = nr.y.d(b.this, null, a.f22468a, 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, d.b.a.f59886a)) {
                d11 = nr.y.d(b.this, null, C0426b.f22469a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class o extends kotlin.jvm.internal.u implements h00.l<a.c, nr.q<? super C0415b, z, ? extends c>> {

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final a f22471a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.d.f22417a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$o$b */
        /* loaded from: classes6.dex */
        public static final class C0427b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ a.c f22472a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0427b(a.c cVar) {
                super(1);
                this.f22472a = cVar;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.b(null, null, ((a.c.b) this.f22472a).a(), null, 11, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final c f22473a = new c();

            c() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.d.f22417a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final d f22474a = new d();

            d() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(new c.C0417c("There was a problem retrieving the status of the government ID verification."));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o() {
            super(1);
            b.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<C0415b, z, c> invoke(a.c it2) {
            nr.q<C0415b, z, c> d11;
            nr.q<C0415b, z, c> d12;
            nr.q<C0415b, z, c> d13;
            nr.q<C0415b, z, c> d14;
            kotlin.jvm.internal.s.g(it2, "it");
            if (it2 instanceof a.c.d) {
                d14 = nr.y.d(b.this, null, a.f22471a, 1, null);
                return d14;
            } else if (it2 instanceof a.c.b) {
                d13 = nr.y.d(b.this, null, new C0427b(it2), 1, null);
                return d13;
            } else if (kotlin.jvm.internal.s.c(it2, a.c.C1364c.f59868a)) {
                d12 = nr.y.d(b.this, null, c.f22473a, 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, a.c.C1363a.f59866a)) {
                d11 = nr.y.d(b.this, null, d.f22474a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class p extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.k<C0415b, z, c, d>.a f22475a;

        /* renamed from: b */
        final /* synthetic */ b f22476b;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final a f22477a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.d.f22417a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(nr.k<? super C0415b, z, ? extends c, ? extends d>.a aVar, b bVar) {
            super(0);
            this.f22475a = aVar;
            this.f22476b = bVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            nr.q<? super C0415b, z, ? extends c> d11;
            nr.h<nr.q<? super C0415b, z, ? extends c>> b11 = this.f22475a.b();
            d11 = nr.y.d(this.f22476b, null, a.f22477a, 1, null);
            b11.d(d11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class q extends kotlin.jvm.internal.u implements h00.l<Id, b0> {

        /* renamed from: a */
        final /* synthetic */ nr.k<C0415b, z, c, d>.a f22478a;

        /* renamed from: b */
        final /* synthetic */ b f22479b;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ Id f22480a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Id id2) {
                super(1);
                this.f22480a = id2;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                Id id2 = this.f22480a;
                action.e(new z.c(null, null, id2, id2.c(), 3, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(nr.k<? super C0415b, z, ? extends c, ? extends d>.a aVar, b bVar) {
            super(1);
            this.f22478a = aVar;
            this.f22479b = bVar;
        }

        public final void a(Id idClass) {
            nr.q<? super C0415b, z, ? extends c> d11;
            kotlin.jvm.internal.s.g(idClass, "idClass");
            nr.h<nr.q<? super C0415b, z, ? extends c>> b11 = this.f22478a.b();
            d11 = nr.y.d(this.f22479b, null, new a(idClass), 1, null);
            b11.d(d11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Id id2) {
            a(id2);
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class r extends kotlin.jvm.internal.u implements h00.l<f.a, nr.q<? super C0415b, z, ? extends c>> {

        /* renamed from: b */
        final /* synthetic */ z f22482b;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final a f22483a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.e(null, null, null, 7, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$r$b */
        /* loaded from: classes6.dex */
        public static final class C0428b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            public static final C0428b f22484a = new C0428b();

            C0428b() {
                super(1);
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(c.a.f22415a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(z zVar) {
            super(1);
            b.this = r1;
            this.f22482b = zVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<C0415b, z, c> invoke(f.a it2) {
            nr.q<C0415b, z, c> d11;
            nr.q<C0415b, z, c> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, f.a.c.f46939a)) {
                b bVar = b.this;
                z zVar = this.f22482b;
                return bVar.k(zVar, ((z.c) zVar).g(), null);
            } else if (kotlin.jvm.internal.s.c(it2, f.a.C1007a.f46937a)) {
                d12 = nr.y.d(b.this, null, a.f22483a, 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, f.a.b.f46938a)) {
                d11 = nr.y.d(b.this, null, C0428b.f22484a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class s extends kotlin.jvm.internal.u implements h00.l<Id, b0> {

        /* renamed from: a */
        public static final s f22485a = new s();

        s() {
            super(1);
        }

        public final void a(Id it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Id id2) {
            a(id2);
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class t extends kotlin.jvm.internal.u implements h00.l<h.b, nr.q<? super C0415b, z, ? extends c>> {

        /* renamed from: b */
        final /* synthetic */ z f22487b;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ z f22488a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar) {
                super(1);
                this.f22488a = zVar;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.a(this.f22488a.a(), action.c().c(), ((z.h) this.f22488a).g(), this.f22488a.b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.b$t$b */
        /* loaded from: classes6.dex */
        public static final class C0429b extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ z f22489a;

            /* renamed from: b */
            final /* synthetic */ h.b f22490b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0429b(z zVar, h.b bVar) {
                super(1);
                this.f22489a = zVar;
                this.f22490b = bVar;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.d(this.f22489a.a(), action.c().c(), ((z.h) this.f22489a).g(), ((h.b.a) this.f22490b).a(), this.f22489a.b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(z zVar) {
            super(1);
            b.this = r1;
            this.f22487b = zVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<C0415b, z, c> invoke(h.b it2) {
            nr.q<C0415b, z, c> d11;
            nr.q<C0415b, z, c> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, h.b.C1276b.f56274a)) {
                d12 = nr.y.d(b.this, null, new a(this.f22487b), 1, null);
                return d12;
            } else if (it2 instanceof h.b.a) {
                d11 = nr.y.d(b.this, null, new C0429b(this.f22487b, it2), 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class u extends kotlin.jvm.internal.u implements h00.l<b0, nr.q<? super C0415b, z, ? extends c>> {

        /* renamed from: b */
        final /* synthetic */ z f22492b;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ z f22493a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar) {
                super(1);
                this.f22493a = zVar;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(z.h.f((z.h) this.f22493a, null, action.c().c(), null, d.a.EnumC0419b.Enabled, null, 21, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(z zVar) {
            super(1);
            b.this = r1;
            this.f22492b = zVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<C0415b, z, c> invoke(b0 it2) {
            nr.q<C0415b, z, c> d11;
            kotlin.jvm.internal.s.g(it2, "it");
            d11 = nr.y.d(b.this, null, new a(this.f22492b), 1, null);
            return d11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class v extends kotlin.jvm.internal.u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ nr.k<C0415b, z, c, d>.a f22494a;

        /* renamed from: b */
        final /* synthetic */ b f22495b;

        /* renamed from: c */
        final /* synthetic */ z f22496c;

        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

            /* renamed from: a */
            final /* synthetic */ z f22497a;

            /* renamed from: b */
            final /* synthetic */ String f22498b;

            /* renamed from: c */
            final /* synthetic */ b f22499c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, String str, b bVar) {
                super(1);
                this.f22497a = zVar;
                this.f22498b = str;
                this.f22499c = bVar;
            }

            public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(new z.d(this.f22497a.a(), action.c().c(), ((z.h) this.f22497a).g(), new com.withpersona.sdk.inquiry.governmentid.a(this.f22498b, this.f22499c.q(this.f22497a.a()), ((z.h) this.f22497a).g().d(), a.EnumC0413a.MANUAL, null, 16, null), this.f22497a.b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(nr.k<? super C0415b, z, ? extends c, ? extends d>.a aVar, b bVar, z zVar) {
            super(1);
            this.f22494a = aVar;
            this.f22495b = bVar;
            this.f22496c = zVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String absolutePath) {
            nr.q<? super C0415b, z, ? extends c> d11;
            kotlin.jvm.internal.s.g(absolutePath, "absolutePath");
            nr.h<nr.q<? super C0415b, z, ? extends c>> b11 = this.f22494a.b();
            b bVar = this.f22495b;
            d11 = nr.y.d(bVar, null, new a(this.f22496c, absolutePath, bVar), 1, null);
            b11.d(d11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class w extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.h<c> f22500a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(nr.h<? super c> hVar) {
            super(0);
            this.f22500a = hVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f22500a.d(c.C0416b.f22416a);
        }
    }

    /* loaded from: classes6.dex */
    public static final class x extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a */
        final /* synthetic */ nr.h<c> f22501a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(nr.h<? super c> hVar) {
            super(0);
            this.f22501a = hVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f22501a.d(c.e.f22418a);
        }
    }

    /* loaded from: classes6.dex */
    public static final class y extends kotlin.jvm.internal.u implements h00.l<nr.q<? super C0415b, z, ? extends c>.c, b0> {

        /* renamed from: a */
        final /* synthetic */ c f22502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(c cVar) {
            super(1);
            this.f22502a = cVar;
        }

        public final void a(nr.q<? super C0415b, z, ? extends c>.c action) {
            kotlin.jvm.internal.s.g(action, "$this$action");
            action.d(this.f22502a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super C0415b, z, ? extends c>.c cVar) {
            a(cVar);
            return b0.f54756a;
        }
    }

    static {
        new a(null);
    }

    public b(pv.f cameraPermissionWorker, e.a updateVerificationWorker, d.a submitVerificationWorker, a.b checkVerificationWorker, h.a governmentIdAnalyzeWorker, wv.g countdownCameraWorker) {
        kotlin.jvm.internal.s.g(cameraPermissionWorker, "cameraPermissionWorker");
        kotlin.jvm.internal.s.g(updateVerificationWorker, "updateVerificationWorker");
        kotlin.jvm.internal.s.g(submitVerificationWorker, "submitVerificationWorker");
        kotlin.jvm.internal.s.g(checkVerificationWorker, "checkVerificationWorker");
        kotlin.jvm.internal.s.g(governmentIdAnalyzeWorker, "governmentIdAnalyzeWorker");
        kotlin.jvm.internal.s.g(countdownCameraWorker, "countdownCameraWorker");
        this.f22405a = cameraPermissionWorker;
        this.f22406b = updateVerificationWorker;
        this.f22407c = submitVerificationWorker;
        this.f22408d = checkVerificationWorker;
        this.f22409e = governmentIdAnalyzeWorker;
        this.f22410f = countdownCameraWorker;
    }

    public static /* synthetic */ void h(k.a aVar, b bVar, c cVar) {
        o(aVar, bVar, cVar);
    }

    public final nr.q<C0415b, z, c> k(z zVar, Id id2, com.withpersona.sdk.inquiry.governmentid.a aVar) {
        nr.q<C0415b, z, c> d11;
        d11 = nr.y.d(this, null, new f(aVar, zVar, id2), 1, null);
        return d11;
    }

    private final z l(C0415b c0415b) {
        if (c0415b.b().size() == 1) {
            Id id2 = (Id) wz.u.b0(c0415b.b());
            return new z.c(null, null, id2, id2.c(), 3, null);
        }
        return new z.e(null, null, null, 7, null);
    }

    public static final void o(k.a context, b this$0, c it2) {
        nr.q d11;
        kotlin.jvm.internal.s.g(context, "$context");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(it2, "it");
        nr.h b11 = context.b();
        d11 = nr.y.d(this$0, null, new y(it2), 1, null);
        b11.d(d11);
    }

    public final a.c q(Id.b bVar) {
        int i11 = e.f22444b[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return a.c.BACK;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return a.c.BACK;
                }
                return a.c.FRONT;
            }
            return a.c.BACK;
        }
        return a.c.FRONT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.os.Parcelable, java.lang.Object] */
    @Override // nr.k
    /* renamed from: m */
    public z d(C0415b props, nr.i iVar) {
        kotlin.jvm.internal.s.g(props, "props");
        z zVar = null;
        if (iVar != null) {
            okio.i b11 = iVar.b();
            if (!(b11.z() > 0)) {
                b11 = null;
            }
            if (b11 != null) {
                Parcel obtain = Parcel.obtain();
                kotlin.jvm.internal.s.f(obtain, "obtain()");
                byte[] E = b11.E();
                obtain.unmarshall(E, 0, E.length);
                obtain.setDataPosition(0);
                ?? readParcelable = obtain.readParcelable(nr.i.class.getClassLoader());
                kotlin.jvm.internal.s.e(readParcelable);
                kotlin.jvm.internal.s.f(readParcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
                zVar = readParcelable;
            }
            zVar = zVar;
        }
        return zVar == null ? l(props) : zVar;
    }

    @Override // nr.k
    /* renamed from: n */
    public d f(C0415b props, z state, final nr.k<? super C0415b, z, ? extends c, ? extends d>.a context) {
        d c0424d;
        d.a.c cVar;
        d.a.c cVar2;
        d.a.c c0422c;
        kotlin.jvm.internal.s.g(props, "props");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(context, "context");
        nr.h hVar = new nr.h() { // from class: wv.e0
            @Override // nr.h
            public final void d(Object obj) {
                com.withpersona.sdk.inquiry.governmentid.b.h(k.a.this, this, (b.c) obj);
            }
        };
        for (com.withpersona.sdk.inquiry.governmentid.a aVar : state.c()) {
            nr.v.i(context, this.f22406b.a(props.c(), props.d(), aVar), m0.m(yv.e.class), aVar.toString(), new g(aVar));
        }
        if (state instanceof z.e) {
            return new d.c(props.b(), new q(context, this));
        }
        if (state instanceof z.c) {
            nr.v.i(context, this.f22405a, m0.m(pv.f.class), "", new r(state));
            return new d.c(props.b(), s.f22485a);
        }
        if (state instanceof z.h) {
            z.h hVar2 = (z.h) state;
            nr.v.i(context, this.f22409e.a(state.a(), hVar2.g().d()), m0.m(wv.h.class), "", new t(state));
            nr.v.i(context, n.a.b(nr.n.f41819a, 8000L, null, 2, null), m0.n(nr.n.class, n00.r.f40137c.d(m0.m(b0.class))), "", new u(state));
            int title = state.a().getTitle();
            int i11 = j0.f56332g;
            int label = hVar2.g().d().toLabel();
            Id.b a11 = state.a();
            d.a.EnumC0419b h11 = hVar2.h();
            if (state.a() == Id.b.BarcodePdf417) {
                c0422c = d.a.c.C0420a.f22429a;
            } else if (state.a() == Id.b.PassportSignature) {
                c0422c = new d.a.c.C0422c(state.a().getOverlayHint());
            } else if (hVar2.g().d() == com.withpersona.sdk.inquiry.governmentid.network.b.Passport) {
                c0422c = d.a.c.C0421b.f22430a;
            } else {
                c0422c = hVar2.g().d() == com.withpersona.sdk.inquiry.governmentid.network.b.Visa ? d.a.c.C0421b.f22430a : new d.a.c.C0422c(state.a().getOverlayHint());
            }
            c0424d = new d.a(title, i11, label, a11, h11, c0422c, new v(context, this, state), new w(hVar), new x(hVar));
        } else if (state instanceof z.a) {
            nr.v.i(context, this.f22410f, m0.m(wv.g.class), "", new h(state));
            int title2 = state.a().getTitle();
            int i12 = j0.f56326a;
            z.a aVar2 = (z.a) state;
            int label2 = aVar2.g().d().toLabel();
            Id.b a12 = state.a();
            d.a.EnumC0419b enumC0419b = d.a.EnumC0419b.Disabled;
            int i13 = e.f22443a[aVar2.g().d().ordinal()];
            if (i13 == 1) {
                cVar = d.a.c.C0421b.f22430a;
            } else if (i13 != 2) {
                cVar2 = new d.a.c.C0422c(state.a().getOverlayHint());
                return new d.a(title2, i12, label2, a12, enumC0419b, cVar2, null, new i(hVar), new j(hVar), 64, null);
            } else {
                cVar = d.a.c.C0421b.f22430a;
            }
            cVar2 = cVar;
            return new d.a(title2, i12, label2, a12, enumC0419b, cVar2, null, new i(hVar), new j(hVar), 64, null);
        } else if (state instanceof z.d) {
            c0424d = new d.C0424d(state.a().getReviewTitle(), j0.O, ((z.d) state).h().a(), new k(context, this, state), new l(context, this, state), new m(hVar));
        } else if (state instanceof z.f) {
            if (state.c().isEmpty()) {
                nr.v.i(context, this.f22407c.a(props.c(), props.d()), m0.m(yv.d.class), "", new n());
            }
            return d.e.f22442a;
        } else if (state instanceof z.g) {
            nr.v.i(context, this.f22408d.a(props.c(), props.d()), m0.m(yv.a.class), "", new o());
            return d.e.f22442a;
        } else if (state instanceof z.b) {
            return new d.C0423b(((z.b) state).g().toMessage(), new p(context, this));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c0424d;
    }

    @Override // nr.k
    /* renamed from: p */
    public nr.i g(z state) {
        kotlin.jvm.internal.s.g(state, "state");
        return jw.a.a(state);
    }
}