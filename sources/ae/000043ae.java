package com.plaid.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.plaid.core.webview.PlaidWebview;
import com.plaid.internal.ed;
import com.plaid.link.R;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class ed extends Fragment implements c8 {

    /* renamed from: a  reason: collision with root package name */
    public va f18541a;

    /* renamed from: b  reason: collision with root package name */
    public fd f18542b;

    /* renamed from: c  reason: collision with root package name */
    public final vz.k f18543c;

    /* renamed from: d  reason: collision with root package name */
    public h00.a<vz.b0> f18544d;

    /* renamed from: e  reason: collision with root package name */
    public h00.a<vz.b0> f18545e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.activity.result.d<String> f18546f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.activity.result.d<String> f18547g;

    /* renamed from: h  reason: collision with root package name */
    public androidx.activity.result.d<vz.b0> f18548h;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<e9> {
        public a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke */
        public e9 mo11invoke() {
            fd fdVar = ed.this.f18542b;
            if (fdVar == null) {
                kotlin.jvm.internal.s.x("viewModel");
                fdVar = null;
            }
            return fdVar.b();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$2", f = "WebviewFragment.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18550a;

        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ed f18552a;

            public a(ed edVar) {
                this.f18552a = edVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                String str = (String) obj;
                va vaVar = this.f18552a.f18541a;
                if (vaVar == null) {
                    kotlin.jvm.internal.s.x("binding");
                    vaVar = null;
                }
                vaVar.f19629b.loadUrl(str);
                return vz.b0.f54756a;
            }
        }

        public b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f18550a;
            if (i11 == 0) {
                vz.r.b(obj);
                fd fdVar = ed.this.f18542b;
                if (fdVar == null) {
                    kotlin.jvm.internal.s.x("viewModel");
                    fdVar = null;
                }
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(fdVar.f18601f);
                a aVar = new a(ed.this);
                this.f18550a = 1;
                if (a11.collect(aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f18553a = new c();

        public c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f18554a = new d();

        public d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            return vz.b0.f54756a;
        }
    }

    public ed() {
        vz.k a11;
        a11 = vz.m.a(new a());
        this.f18543c = a11;
        this.f18544d = d.f18554a;
        this.f18545e = c.f18553a;
        androidx.activity.result.d<String> registerForActivityResult = registerForActivityResult(new f.e(), new androidx.activity.result.b() { // from class: qq.f
            {
                ed.this = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ed.a(ed.this, (Boolean) obj);
            }
        });
        kotlin.jvm.internal.s.f(registerForActivityResult, "registerForActivityResul… onFailed()\n      }\n    }");
        this.f18546f = registerForActivityResult;
        androidx.activity.result.d<String> registerForActivityResult2 = registerForActivityResult(new f.b(), new androidx.activity.result.b() { // from class: qq.g
            {
                ed.this = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ed.a(ed.this, (List) obj);
            }
        });
        kotlin.jvm.internal.s.f(registerForActivityResult2, "registerForActivityResul…putFileCallback(it)\n    }");
        this.f18547g = registerForActivityResult2;
    }

    public static final void a(ed this$0, Boolean granted) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(granted, "granted");
        if (granted.booleanValue()) {
            this$0.f18544d.mo11invoke();
            return;
        }
        Toast.makeText(this$0.getContext(), this$0.getResources().getString(R.string.grant_camera_permission_to_continue), 0).show();
        this$0.f18545e.mo11invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.h activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        androidx.lifecycle.p0 a11 = new androidx.lifecycle.s0(this, ((ae) activity).a()).a(fd.class);
        kotlin.jvm.internal.s.f(a11, "ViewModelProvider(this, …iewViewModel::class.java)");
        this.f18542b = (fd) a11;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        WebViewClient f8Var;
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_webview_fragment, viewGroup, false);
        Objects.requireNonNull(inflate, "rootView");
        PlaidWebview plaidWebview = (PlaidWebview) inflate;
        va vaVar = new va(plaidWebview, plaidWebview);
        kotlin.jvm.internal.s.f(vaVar, "inflate(inflater, container, false)");
        this.f18541a = vaVar;
        androidx.activity.result.d<vz.b0> registerForActivityResult = registerForActivityResult(new gc((e9) this.f18543c.mo16getValue()), new androidx.activity.result.b() { // from class: qq.e
            {
                ed.this = permissionHelper;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ed.a(ed.this, (Uri) obj);
            }
        });
        kotlin.jvm.internal.s.f(registerForActivityResult, "registerForActivityResul…llback(listOf(uri))\n    }");
        this.f18548h = registerForActivityResult;
        va vaVar2 = this.f18541a;
        va vaVar3 = null;
        if (vaVar2 == null) {
            kotlin.jvm.internal.s.x("binding");
            vaVar2 = null;
        }
        PlaidWebview plaidWebview2 = vaVar2.f19629b;
        fd listener = this.f18542b;
        if (listener == null) {
            kotlin.jvm.internal.s.x("viewModel");
            listener = null;
        }
        androidx.activity.result.d<String> fileInputContract = this.f18547g;
        androidx.activity.result.d<vz.b0> takePictureContract = this.f18548h;
        if (takePictureContract == null) {
            kotlin.jvm.internal.s.x("takePictureContract");
            takePictureContract = null;
        }
        plaidWebview2.getClass();
        kotlin.jvm.internal.s.g(listener, "listener");
        kotlin.jvm.internal.s.g(fileInputContract, "fileInputContract");
        kotlin.jvm.internal.s.g(takePictureContract, "takePictureContract");
        kotlin.jvm.internal.s.g(this, "permissionHelper");
        plaidWebview2.setListener(listener);
        if (Build.VERSION.SDK_INT >= 24) {
            f8Var = new ua(listener);
        } else {
            f8Var = new f8(listener);
        }
        plaidWebview2.setWebViewClient(f8Var);
        plaidWebview2.setWebChromeClient(new r8(fileInputContract, takePictureContract, listener, this));
        plaidWebview2.getSettings().setJavaScriptEnabled(true);
        plaidWebview2.getSettings().setDomStorageEnabled(true);
        plaidWebview2.getSettings().setCacheMode(2);
        plaidWebview2.getSettings().setMediaPlaybackRequiresUserGesture(false);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new b(null), 3, null);
        va vaVar4 = this.f18541a;
        if (vaVar4 == null) {
            kotlin.jvm.internal.s.x("binding");
        } else {
            vaVar3 = vaVar4;
        }
        return vaVar3.f19628a;
    }

    public static final void a(ed this$0, List it2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        fd fdVar = this$0.f18542b;
        if (fdVar == null) {
            kotlin.jvm.internal.s.x("viewModel");
            fdVar = null;
        }
        kotlin.jvm.internal.s.f(it2, "it");
        fdVar.a(it2);
    }

    public static final void a(ed this$0, Uri uri) {
        List d11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        fd fdVar = this$0.f18542b;
        if (fdVar == null) {
            kotlin.jvm.internal.s.x("viewModel");
            fdVar = null;
        }
        d11 = wz.v.d(uri);
        fdVar.a(d11);
    }

    @Override // com.plaid.internal.c8
    public boolean a() {
        return androidx.core.content.c.c(requireContext(), "android.permission.CAMERA") == 0;
    }

    @Override // com.plaid.internal.c8
    public void a(h00.a<vz.b0> success, h00.a<vz.b0> failure) {
        kotlin.jvm.internal.s.g(success, "success");
        kotlin.jvm.internal.s.g(failure, "failure");
        this.f18544d = success;
        this.f18545e = failure;
        this.f18546f.b("android.permission.CAMERA");
    }
}