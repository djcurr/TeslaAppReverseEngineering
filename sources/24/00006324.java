package com.withpersona.sdk.inquiry.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w;
import cw.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.u;
import pr.v;
import pr.z;
import v20.i;
import v20.o0;
import vz.b0;
import vz.k;
import vz.l;
import vz.r;
import x20.h;
import zv.a0;
import zv.j0;
import zv.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/InquiryActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk/inquiry/internal/InquiryActivity$b;", "model", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class InquiryActivity extends androidx.appcompat.app.d {

    /* renamed from: d */
    private static final Intent f22562d;

    /* renamed from: a */
    private final androidx.activity.result.d<Uri> f22563a = cw.d.e(this);

    /* renamed from: b */
    private final androidx.activity.result.d<String[]> f22564b = cw.d.c(this);

    /* renamed from: c */
    private final androidx.activity.result.d<String> f22565c = j.b(this);

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends p0 {

        /* renamed from: a */
        private final l0 f22566a;

        /* renamed from: b */
        private m f22567b;

        /* renamed from: c */
        private u<j0.b> f22568c;

        /* renamed from: d */
        private final x20.e<j0.a> f22569d;

        /* renamed from: e */
        private final k f22570e;

        /* loaded from: classes6.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.a<h0<? extends Object>> {

            /* renamed from: com.withpersona.sdk.inquiry.internal.InquiryActivity$b$a$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C0432a extends p implements h00.p<j0.a, b0> {
                C0432a(Object obj) {
                    super(2, obj, x20.e.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                @Override // h00.p
                /* renamed from: d */
                public final Object mo160invoke(j0.a aVar, zz.d<? super b0> dVar) {
                    return ((x20.e) this.receiver).b(aVar, dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a() {
                super(0);
                b.this = r1;
            }

            @Override // h00.a
            /* renamed from: a */
            public final h0<Object> mo11invoke() {
                u uVar;
                m mVar = b.this.f22567b;
                if (mVar == null) {
                    s.x("component");
                    mVar = null;
                }
                j0 b11 = mVar.b();
                o0 a11 = q0.a(b.this);
                l0 l0Var = b.this.f22566a;
                u uVar2 = b.this.f22568c;
                if (uVar2 == null) {
                    s.x("props");
                    uVar = null;
                } else {
                    uVar = uVar2;
                }
                return pr.a.b(b11, a11, uVar, l0Var, null, new C0432a(b.this.f22569d), 16, null);
            }
        }

        public b(l0 savedStateHandle) {
            s.g(savedStateHandle, "savedStateHandle");
            this.f22566a = savedStateHandle;
            this.f22569d = h.b(0, null, null, 7, null);
            this.f22570e = l.a(new a());
        }

        public final h0<Object> j() {
            return (h0) this.f22570e.mo16getValue();
        }

        public final void k(m component, j0.b props) {
            s.g(component, "component");
            s.g(props, "props");
            this.f22567b = component;
            u<j0.b> uVar = this.f22568c;
            if (uVar == null) {
                this.f22568c = kotlinx.coroutines.flow.j0.a(props);
                return;
            }
            if (uVar == null) {
                s.x("props");
                uVar = null;
            }
            uVar.setValue(props);
        }

        public final Object l(zz.d<? super j0.a> dVar) {
            return this.f22569d.e(dVar);
        }

        public final v m() {
            m mVar = this.f22567b;
            if (mVar == null) {
                s.x("component");
                mVar = null;
            }
            return mVar.a();
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<s0.b> {

        /* renamed from: a */
        final /* synthetic */ ComponentActivity f22572a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f22572a = componentActivity;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public final s0.b mo11invoke() {
            s0.b defaultViewModelProviderFactory = this.f22572a.getDefaultViewModelProviderFactory();
            s.f(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<t0> {

        /* renamed from: a */
        final /* synthetic */ ComponentActivity f22573a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f22573a = componentActivity;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public final t0 mo11invoke() {
            t0 viewModelStore = this.f22573a.getViewModelStore();
            s.f(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    @f(c = "com.withpersona.sdk.inquiry.internal.InquiryActivity$onCreate$3", f = "InquiryActivity.kt", l = {com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a */
        int f22574a;

        /* renamed from: c */
        final /* synthetic */ k<b> f22576c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k<b> kVar, zz.d<? super e> dVar) {
            super(2, dVar);
            InquiryActivity.this = r1;
            this.f22576c = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new e(this.f22576c, dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((e) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f22574a;
            if (i11 == 0) {
                r.b(obj);
                b v11 = InquiryActivity.v(this.f22576c);
                this.f22574a = 1;
                obj = v11.l(this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            j0.a aVar = (j0.a) obj;
            if (aVar instanceof j0.a.f) {
                InquiryActivity inquiryActivity = InquiryActivity.this;
                Intent intent = new Intent();
                intent.putExtra("PERSONA_ACTIVITY_RESULT", com.withpersona.sdk.inquiry.internal.b.INQUIRY_SUCCESS.name());
                j0.a.f fVar = (j0.a.f) aVar;
                intent.putExtra("INQUIRY_ID_KEY", fVar.b());
                intent.putExtra("ATTRIBUTES", fVar.a());
                intent.putExtra("RELATIONSHIPS", fVar.c());
                b0 b0Var = b0.f54756a;
                inquiryActivity.setResult(-1, intent);
            } else if (aVar instanceof j0.a.c) {
                InquiryActivity inquiryActivity2 = InquiryActivity.this;
                Intent intent2 = new Intent();
                intent2.putExtra("PERSONA_ACTIVITY_RESULT", com.withpersona.sdk.inquiry.internal.b.INQUIRY_SUCCESS.name());
                j0.a.c cVar = (j0.a.c) aVar;
                intent2.putExtra("INQUIRY_ID_KEY", cVar.b());
                intent2.putExtra("ATTRIBUTES", cVar.a());
                intent2.putExtra("RELATIONSHIPS", cVar.c());
                b0 b0Var2 = b0.f54756a;
                inquiryActivity2.setResult(-1, intent2);
            } else if (s.c(aVar, j0.a.e.f61015a)) {
                InquiryActivity inquiryActivity3 = InquiryActivity.this;
                Intent intent3 = new Intent();
                intent3.putExtra("PERSONA_ACTIVITY_RESULT", com.withpersona.sdk.inquiry.internal.b.INQUIRY_NETWORK_ERROR.name());
                b0 b0Var3 = b0.f54756a;
                inquiryActivity3.setResult(0, intent3);
            } else if (s.c(aVar, j0.a.C1403a.f61007a)) {
                InquiryActivity inquiryActivity4 = InquiryActivity.this;
                Intent intent4 = new Intent();
                intent4.putExtra("PERSONA_ACTIVITY_RESULT", com.withpersona.sdk.inquiry.internal.b.INQUIRY_BAD_TEMPLATE_ID_ERROR.name());
                b0 b0Var4 = b0.f54756a;
                inquiryActivity4.setResult(0, intent4);
            } else if (aVar instanceof j0.a.d) {
                InquiryActivity inquiryActivity5 = InquiryActivity.this;
                Intent intent5 = new Intent();
                intent5.putExtra("PERSONA_ACTIVITY_RESULT", com.withpersona.sdk.inquiry.internal.b.INQUIRY_FAILED.name());
                j0.a.d dVar = (j0.a.d) aVar;
                intent5.putExtra("INQUIRY_ID_KEY", dVar.b());
                intent5.putExtra("ATTRIBUTES", dVar.a());
                intent5.putExtra("RELATIONSHIPS", dVar.c());
                b0 b0Var5 = b0.f54756a;
                inquiryActivity5.setResult(-1, intent5);
            } else if (s.c(aVar, j0.a.b.f61008a)) {
                InquiryActivity.this.setResult(0, InquiryActivity.f22562d);
            } else if (s.c(aVar, j0.a.g.f61019a)) {
                InquiryActivity inquiryActivity6 = InquiryActivity.this;
                Intent intent6 = new Intent();
                intent6.putExtra("PERSONA_ACTIVITY_RESULT", com.withpersona.sdk.inquiry.internal.b.INQUIRY_UNKNOWN_ERROR.name());
                b0 b0Var6 = b0.f54756a;
                inquiryActivity6.setResult(0, intent6);
            }
            InquiryActivity.this.finish();
            return b0.f54756a;
        }
    }

    static {
        new a(null);
        Intent intent = new Intent();
        intent.putExtra("PERSONA_ACTIVITY_RESULT", com.withpersona.sdk.inquiry.internal.b.INQUIRY_CANCELED.name());
        f22562d = intent;
    }

    private final String m() {
        String string;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("ACCESS_TOKEN_KEY")) == null) {
            return null;
        }
        return s.p("Bearer ", string);
    }

    private final String n() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getString("ACCOUNT_ID_KEY");
    }

    private final com.withpersona.sdk.inquiry.internal.a o() {
        Bundle extras = getIntent().getExtras();
        String string = extras == null ? null : extras.getString("ENVIRONMENT_KEY");
        com.withpersona.sdk.inquiry.internal.a aVar = com.withpersona.sdk.inquiry.internal.a.PRODUCTION;
        if (s.c(string, aVar.name())) {
            return aVar;
        }
        com.withpersona.sdk.inquiry.internal.a aVar2 = com.withpersona.sdk.inquiry.internal.a.SANDBOX;
        return s.c(string, aVar2.name()) ? aVar2 : aVar;
    }

    private final a0 p() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return (a0) extras.getParcelable("FIELDS_MAP_KEY");
    }

    private final String q() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getString("INQUIRY_ID_KEY");
    }

    private final String r() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getString("NOTE_KEY");
    }

    private final String s() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getString("REFERENCE_ID_KEY");
    }

    private final String t() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getString("TEMPLATE_ID_KEY");
    }

    private final Integer u() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return Integer.valueOf(extras.getInt("THEME_KEY"));
    }

    public static final b v(k<b> kVar) {
        return kVar.mo16getValue();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        j0.b aVar;
        super.onCreate(bundle);
        setResult(0, f22562d);
        Integer u11 = u();
        if (u11 != null) {
            setTheme(u11.intValue());
        }
        m component = zv.e.c().c(new zv.h(this)).b(new cw.a(this.f22563a, this.f22564b)).d(new cw.h(this.f22565c)).a();
        r0 r0Var = new r0(m0.b(b.class), new d(this), new c(this));
        b v11 = v(r0Var);
        s.f(component, "component");
        if (q() == null) {
            String t11 = t();
            s.e(t11);
            String n11 = n();
            String s11 = s();
            a0 p11 = p();
            aVar = new j0.b.C1404b(t11, n11, s11, p11 == null ? null : p11.a(), r(), o());
        } else {
            String q11 = q();
            s.e(q11);
            aVar = new j0.b.a(q11, m(), o());
        }
        v11.k(component, aVar);
        z zVar = new z(this, null, 2, null);
        zVar.d(v(r0Var).j(), v(r0Var).m());
        b0 b0Var = b0.f54756a;
        setContentView(zVar);
        i.d(w.a(this), null, null, new e(r0Var, null), 3, null);
    }
}