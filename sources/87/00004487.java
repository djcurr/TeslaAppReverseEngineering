package com.plaid.internal.link;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import androidx.fragment.app.z;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.plaid.internal.ae;
import com.plaid.internal.b3;
import com.plaid.internal.core.ui_components.PlaidLoadingView;
import com.plaid.internal.ed;
import com.plaid.internal.f4;
import com.plaid.internal.fb;
import com.plaid.internal.gd;
import com.plaid.internal.h5;
import com.plaid.internal.i5;
import com.plaid.internal.j5;
import com.plaid.internal.k5;
import com.plaid.internal.q6;
import com.plaid.internal.r5;
import com.plaid.internal.s8;
import com.plaid.internal.t8;
import com.plaid.internal.ud;
import com.plaid.internal.w5;
import com.plaid.internal.wa;
import com.plaid.internal.xd;
import com.plaid.internal.y7;
import com.plaid.internal.zd;
import com.plaid.link.Plaid;
import com.plaid.link.R;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import h00.p;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import v20.o0;
import vz.b0;
import vz.k;
import vz.r;

/* loaded from: classes2.dex */
public class LinkActivity extends f4 implements ae, ud {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18987c = new a();

    /* renamed from: b  reason: collision with root package name */
    public final k f18988b = new r0(m0.b(i5.class), new e(this), new f());

    /* loaded from: classes2.dex */
    public static final class a {
        public final Intent a(Context context) {
            s.g(context, "context");
            Intent intent = new Intent(context, LinkActivity.class);
            intent.setFlags(67108864);
            return intent;
        }

        public final Intent b(Context context) {
            s.g(context, "context");
            Intent intent = new Intent(context, TransparentLinkActivity.class);
            intent.setFlags(67108864);
            return intent;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.link.LinkActivity$onBackPressed$1", f = "LinkActivity.kt", l = {137}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18989a;

        public b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        public Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return new b(dVar).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f18989a;
            if (i11 == 0) {
                r.b(obj);
                LinkActivity linkActivity = LinkActivity.this;
                a aVar = LinkActivity.f18987c;
                i5 c11 = linkActivity.c();
                this.f18989a = 1;
                obj = c11.a(this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                LinkActivity.super.onBackPressed();
            }
            return b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.link.LinkActivity$onCreate$1", f = "LinkActivity.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18991a;

        public c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new c(dVar);
        }

        @Override // h00.p
        public Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return new c(dVar).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f18991a;
            boolean z11 = true;
            if (i11 == 0) {
                r.b(obj);
                LinkActivity linkActivity = LinkActivity.this;
                a aVar = LinkActivity.f18987c;
                i5 c11 = linkActivity.c();
                this.f18991a = 1;
                t8 t8Var = c11.f18750e;
                if (t8Var == null) {
                    s.x("clientSideOnlyConfigurationStore");
                    t8Var = null;
                }
                obj = t8Var.a(this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            s8 s8Var = (s8) obj;
            if (s8Var != null) {
                LinkActivity linkActivity2 = LinkActivity.this;
                String str = s8Var.f19433b;
                s.g(linkActivity2, "<this>");
                if (str != null && str.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    try {
                        int parseColor = Color.parseColor(str);
                        linkActivity2.getWindow().addFlags(Integer.MIN_VALUE);
                        linkActivity2.getWindow().setStatusBarColor(parseColor);
                    } catch (Exception unused) {
                        throw new RuntimeException("Expecting " + ((Object) str) + " to have the format #RRGGBB");
                    }
                }
                boolean z12 = s8Var.f19434c;
                a aVar2 = LinkActivity.f18987c;
                linkActivity2.getClass();
                if (z12) {
                    linkActivity2.getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
                }
            }
            return b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.p implements h00.l<b3, b0> {
        public d(Object obj) {
            super(1, obj, LinkActivity.class, "navigate", "navigate(Lcom/plaid/internal/workflow/model/Destination;)V", 0);
        }

        @Override // h00.l
        public b0 invoke(b3 b3Var) {
            LinkError fromException$link_sdk_release;
            b3 p02 = b3Var;
            s.g(p02, "p0");
            LinkActivity linkActivity = (LinkActivity) this.receiver;
            a aVar = LinkActivity.f18987c;
            linkActivity.getClass();
            wa.a.a(wa.f19678a, s.p("Navigating to ", p02), false, 2);
            try {
                if (s.c(p02, b3.c.f18194a)) {
                    linkActivity.a(new q6());
                } else if (p02 instanceof b3.e) {
                    linkActivity.a((Fragment) ((b3.e) p02).f18196a.invoke(((b3.e) p02).a()));
                } else if (p02 instanceof b3.f) {
                    Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(linkActivity, 96171, ((b3.f) p02).f18213a);
                } else if (p02 instanceof b3.b) {
                    Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(linkActivity, 6148, ((b3.b) p02).f18193a);
                } else if (p02 instanceof b3.d) {
                    linkActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((b3.d) p02).f18195a)));
                } else if (p02 instanceof b3.a) {
                    linkActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(s.p("tel:", ((b3.a) p02).f18192a))));
                } else if (p02 instanceof b3.g) {
                    linkActivity.a(new ed());
                }
            } catch (Exception e11) {
                wa.a aVar2 = wa.f19678a;
                wa.a.b(aVar2, (Throwable) e11, s.p("Error occurred while trying to render: ", p02), false, 4);
                if (e11 instanceof r5) {
                    wa.a.a(aVar2, (Throwable) e11, false, 2);
                    fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(new LinkException("Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists"));
                } else {
                    fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(e11);
                }
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(linkActivity, 6148, new LinkExit(fromException$link_sdk_release, null, 2, null));
            }
            return b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends u implements h00.a<t0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f18993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f18993a = componentActivity;
        }

        @Override // h00.a
        public t0 invoke() {
            t0 viewModelStore = this.f18993a.getViewModelStore();
            s.f(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends u implements h00.a<s0.b> {
        public f() {
            super(0);
        }

        @Override // h00.a
        public s0.b invoke() {
            LinkActivity linkActivity = LinkActivity.this;
            linkActivity.getClass();
            Plaid plaid = Plaid.INSTANCE;
            Application application = linkActivity.getApplication();
            s.f(application, "application");
            return new k5(plaid.providePlaidComponent$link_sdk_release(application));
        }
    }

    @Override // com.plaid.internal.ud
    public PlaidLoadingView b() {
        return (PlaidLoadingView) findViewById(R.id.plaid_rising_tide);
    }

    public final i5 c() {
        return (i5) this.f18988b.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        v20.k.d(q0.a(c()), null, null, new b(null), 3, null);
    }

    @Override // com.plaid.internal.f4, androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        w5 w5Var = null;
        v20.k.d(q0.a(c()), null, null, new c(null), 3, null);
        setContentView(R.layout.plaid_activity_link);
        i5 c11 = c();
        d observer = new d(this);
        c11.getClass();
        s.g(this, "lifecycleOwner");
        s.g(observer, "observer");
        w5 w5Var2 = c11.f18747b;
        if (w5Var2 != null) {
            w5Var = w5Var2;
        } else {
            s.x("navigator");
        }
        w5Var.f19665a.observe(this, new j5(observer));
        super.onCreate(bundle);
    }

    @Override // com.plaid.internal.f4
    public void a(Intent intent) {
        fb fbVar;
        Exception runtimeException;
        wa.a.a(wa.f19678a, "onIntentReady", false, 2);
        i5 c11 = c();
        if (intent != null) {
            if (intent.getBooleanExtra("redirect_error", false)) {
                Serializable serializableExtra = intent.getSerializableExtra("redirect_error_exception");
                if (serializableExtra != null) {
                    runtimeException = (Exception) serializableExtra;
                } else {
                    runtimeException = new RuntimeException("Unknown oauth redirect exception");
                }
                fbVar = new fb.b(runtimeException);
            } else if (intent.hasExtra("link_oauth_redirect")) {
                String stringExtra = intent.getStringExtra("link_oauth_received_redirect_uri");
                if (stringExtra == null) {
                    fbVar = new fb.b(new RuntimeException("Redirect uri cannot be null"));
                } else {
                    fbVar = new fb.a(stringExtra);
                }
            }
            c11.getClass();
            v20.k.d(q0.a(c11), null, null, new h5(fbVar, c11, null), 3, null);
        }
        fbVar = null;
        c11.getClass();
        v20.k.d(q0.a(c11), null, null, new h5(fbVar, c11, null), 3, null);
    }

    public void a(Fragment fragment) {
        s.g(fragment, "fragment");
        q supportFragmentManager = getSupportFragmentManager();
        s.f(supportFragmentManager, "supportFragmentManager");
        z m11 = supportFragmentManager.m();
        s.f(m11, "beginTransaction()");
        m11.p(R.id.fragment_container, fragment);
        m11.i();
    }

    @Override // com.plaid.internal.ae
    public s0.b a(h00.l<? super y7, ? extends xd> createWorkflowViewModel) {
        s.g(createWorkflowViewModel, "createWorkflowViewModel");
        return new zd(createWorkflowViewModel, c().f18746a);
    }

    @Override // com.plaid.internal.ae
    public s0.b a() {
        return new gd(c().f18746a);
    }
}