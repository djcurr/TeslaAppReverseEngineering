package dw;

import ch.qos.logback.core.CoreConstants;
import dw.c;
import dw.k;
import dw.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import nr.v;
import nr.y;
import vz.b0;

/* loaded from: classes6.dex */
public final class m extends nr.k<a, dw.k, b, c> {

    /* renamed from: a  reason: collision with root package name */
    private final fw.a f24296a;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f24297a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24298b;

        /* renamed from: c  reason: collision with root package name */
        private final String f24299c;

        public a(String sessionToken, String verificationToken, String str) {
            s.g(sessionToken, "sessionToken");
            s.g(verificationToken, "verificationToken");
            this.f24297a = sessionToken;
            this.f24298b = verificationToken;
            this.f24299c = str;
        }

        public final String a() {
            return this.f24299c;
        }

        public final String b() {
            return this.f24297a;
        }

        public final String c() {
            return this.f24298b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f24297a, aVar.f24297a) && s.c(this.f24298b, aVar.f24298b) && s.c(this.f24299c, aVar.f24299c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.f24297a.hashCode() * 31) + this.f24298b.hashCode()) * 31;
            String str = this.f24299c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Input(sessionToken=" + this.f24297a + ", verificationToken=" + this.f24298b + ", phonePrefill=" + ((Object) this.f24299c) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24300a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: dw.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0469b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0469b f24301a = new C0469b();

            private C0469b() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String message) {
                super(null);
                s.g(message, "message");
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f24302a;

            /* renamed from: b  reason: collision with root package name */
            private final h00.l<String, b0> f24303b;

            /* renamed from: c  reason: collision with root package name */
            private final h00.a<b0> f24304c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f24305d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f24306e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(String confirmationCode, h00.l<? super String, b0> onTextChange, h00.a<b0> onClick, boolean z11, boolean z12) {
                super(null);
                s.g(confirmationCode, "confirmationCode");
                s.g(onTextChange, "onTextChange");
                s.g(onClick, "onClick");
                this.f24302a = confirmationCode;
                this.f24303b = onTextChange;
                this.f24304c = onClick;
                this.f24305d = z11;
                this.f24306e = z12;
            }

            public final String a() {
                return this.f24302a;
            }

            public final boolean b() {
                return this.f24306e;
            }

            public final h00.a<b0> c() {
                return this.f24304c;
            }

            public final h00.l<String, b0> d() {
                return this.f24303b;
            }

            public final boolean e() {
                return this.f24305d;
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f24307a;

            /* renamed from: b  reason: collision with root package name */
            private final h00.l<String, b0> f24308b;

            /* renamed from: c  reason: collision with root package name */
            private final h00.a<b0> f24309c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f24310d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f24311e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(String phoneNumber, h00.l<? super String, b0> onTextChange, h00.a<b0> onClick, boolean z11, boolean z12) {
                super(null);
                s.g(phoneNumber, "phoneNumber");
                s.g(onTextChange, "onTextChange");
                s.g(onClick, "onClick");
                this.f24307a = phoneNumber;
                this.f24308b = onTextChange;
                this.f24309c = onClick;
                this.f24310d = z11;
                this.f24311e = z12;
            }

            public final boolean a() {
                return this.f24311e;
            }

            public final h00.a<b0> b() {
                return this.f24309c;
            }

            public final h00.l<String, b0> c() {
                return this.f24308b;
            }

            public final String d() {
                return this.f24307a;
            }

            public final boolean e() {
                return this.f24310d;
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class d extends u implements h00.l<String, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<a, dw.k, b, c>.a f24312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f24313b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dw.k f24314c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dw.k f24315a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f24316b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dw.k kVar, String str) {
                super(1);
                this.f24315a = kVar;
                this.f24316b = str;
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(((k.c) this.f24315a).b(this.f24316b, false));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(nr.k<? super a, dw.k, ? extends b, ? extends c>.a aVar, m mVar, dw.k kVar) {
            super(1);
            this.f24312a = aVar;
            this.f24313b = mVar;
            this.f24314c = kVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String newPhone) {
            nr.q<? super a, dw.k, ? extends b> d11;
            s.g(newPhone, "newPhone");
            nr.h<nr.q<? super a, dw.k, ? extends b>> b11 = this.f24312a.b();
            d11 = y.d(this.f24313b, null, new a(this.f24314c, newPhone), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class e extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f24317a = new e();

        e() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class f extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<a, dw.k, b, c>.a f24318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f24319b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dw.k f24320c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dw.k f24321a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dw.k kVar) {
                super(1);
                this.f24321a = kVar;
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new k.e(((k.c) this.f24321a).d()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(nr.k<? super a, dw.k, ? extends b, ? extends c>.a aVar, m mVar, dw.k kVar) {
            super(0);
            this.f24318a = aVar;
            this.f24319b = mVar;
            this.f24320c = kVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super a, dw.k, ? extends b> d11;
            nr.h<nr.q<? super a, dw.k, ? extends b>> b11 = this.f24318a.b();
            d11 = y.d(this.f24319b, null, new a(this.f24320c), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class g extends u implements h00.l<c.a, nr.q<? super a, dw.k, ? extends b>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dw.k f24323b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24324a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new k.b("", false, 2, null));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dw.k f24325a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(dw.k kVar) {
                super(1);
                this.f24325a = kVar;
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new k.c(((k.e) this.f24325a).b(), true));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(dw.k kVar) {
            super(1);
            this.f24323b = kVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<a, dw.k, b> invoke(c.a it2) {
            nr.q<a, dw.k, b> d11;
            nr.q<a, dw.k, b> d12;
            s.g(it2, "it");
            if (it2 instanceof c.a.b) {
                d12 = y.d(m.this, null, a.f24324a, 1, null);
                return d12;
            } else if (s.c(it2, c.a.C0466a.f24266a)) {
                d11 = y.d(m.this, null, new b(this.f24323b), 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class h extends u implements h00.l<String, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f24326a = new h();

        h() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it2) {
            s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class i extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f24327a = new i();

        i() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class j extends u implements h00.l<String, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<a, dw.k, b, c>.a f24328a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f24329b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dw.k f24330c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dw.k f24331a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f24332b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dw.k kVar, String str) {
                super(1);
                this.f24331a = kVar;
                this.f24332b = str;
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(((k.b) this.f24331a).b(this.f24332b, false));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(nr.k<? super a, dw.k, ? extends b, ? extends c>.a aVar, m mVar, dw.k kVar) {
            super(1);
            this.f24328a = aVar;
            this.f24329b = mVar;
            this.f24330c = kVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String newConfirmationCode) {
            nr.q<? super a, dw.k, ? extends b> d11;
            s.g(newConfirmationCode, "newConfirmationCode");
            nr.h<nr.q<? super a, dw.k, ? extends b>> b11 = this.f24328a.b();
            d11 = y.d(this.f24329b, null, new a(this.f24330c, newConfirmationCode), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class k extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<a, dw.k, b, c>.a f24333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f24334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dw.k f24335c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dw.k f24336a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(dw.k kVar) {
                super(1);
                this.f24336a = kVar;
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new k.d(((k.b) this.f24336a).c()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(nr.k<? super a, dw.k, ? extends b, ? extends c>.a aVar, m mVar, dw.k kVar) {
            super(0);
            this.f24333a = aVar;
            this.f24334b = mVar;
            this.f24335c = kVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super a, dw.k, ? extends b> d11;
            nr.h<nr.q<? super a, dw.k, ? extends b>> b11 = this.f24333a.b();
            d11 = y.d(this.f24334b, null, new a(this.f24335c), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class l extends u implements h00.l<p.a, nr.q<? super a, dw.k, ? extends b>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dw.k f24338b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24339a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.d(b.C0469b.f24301a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f24340a = new b();

            b() {
                super(1);
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.d(b.C0469b.f24301a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class c extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dw.k f24341a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(dw.k kVar) {
                super(1);
                this.f24341a = kVar;
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new k.b(((k.d) this.f24341a).b(), true));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class d extends u implements h00.l<nr.q<? super a, dw.k, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f24342a = new d();

            d() {
                super(1);
            }

            public final void a(nr.q<? super a, dw.k, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.d(new b.c("There was a problem submitting the phone verification."));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, dw.k, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(dw.k kVar) {
            super(1);
            this.f24338b = kVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<a, dw.k, b> invoke(p.a it2) {
            nr.q<a, dw.k, b> d11;
            nr.q<a, dw.k, b> d12;
            nr.q<a, dw.k, b> d13;
            nr.q<a, dw.k, b> d14;
            s.g(it2, "it");
            if (it2 instanceof p.a.d) {
                d14 = y.d(m.this, null, a.f24339a, 1, null);
                return d14;
            } else if (it2 instanceof p.a.b) {
                d13 = y.d(m.this, null, b.f24340a, 1, null);
                return d13;
            } else if (s.c(it2, p.a.c.f24357a)) {
                d12 = y.d(m.this, null, new c(this.f24338b), 1, null);
                return d12;
            } else if (s.c(it2, p.a.C0471a.f24355a)) {
                d11 = y.d(m.this, null, d.f24342a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dw.m$m  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0470m extends u implements h00.l<String, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0470m f24343a = new C0470m();

        C0470m() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it2) {
            s.g(it2, "it");
        }
    }

    public m(fw.a service) {
        s.g(service, "service");
        this.f24296a = service;
    }

    @Override // nr.k
    /* renamed from: h */
    public dw.k d(a props, nr.i iVar) {
        s.g(props, "props");
        dw.k a11 = iVar == null ? null : dw.k.f24280a.a(iVar.b());
        if (a11 == null) {
            String a12 = props.a();
            if (a12 == null) {
                a12 = "";
            }
            a11 = new k.c(a12, false, 2, null);
        }
        return a11;
    }

    @Override // nr.k
    /* renamed from: i */
    public c f(a props, dw.k state, nr.k<? super a, dw.k, ? extends b, ? extends c>.a context) {
        s.g(props, "props");
        s.g(state, "state");
        s.g(context, "context");
        if (state instanceof k.c) {
            k.c cVar = (k.c) state;
            return new c.b(cVar.d(), new d(context, this, state), new f(context, this, state), false, cVar.c());
        } else if (state instanceof k.e) {
            k.e eVar = (k.e) state;
            v.i(context, dw.d.a(this.f24296a, props.b(), props.c(), eVar.b()), m0.m(dw.c.class), "", new g(state));
            return new c.b(eVar.b(), h.f24326a, i.f24327a, true, false);
        } else if (state instanceof k.b) {
            k.b bVar = (k.b) state;
            return new c.a(bVar.c(), new j(context, this, state), new k(context, this, state), false, bVar.d());
        } else if (state instanceof k.d) {
            k.d dVar = (k.d) state;
            v.i(context, q.a(this.f24296a, props.b(), props.c(), dVar.b()), m0.m(p.class), "", new l(state));
            return new c.a(dVar.b(), C0470m.f24343a, e.f24317a, true, false);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // nr.k
    /* renamed from: j */
    public nr.i g(dw.k state) {
        s.g(state, "state");
        return state.a();
    }
}