package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.react.uimanager.s0;
import com.facebook.react.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    private String f12175b;

    /* renamed from: c  reason: collision with root package name */
    private JSBundleLoader f12176c;

    /* renamed from: d  reason: collision with root package name */
    private String f12177d;

    /* renamed from: e  reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f12178e;

    /* renamed from: f  reason: collision with root package name */
    private Application f12179f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12180g;

    /* renamed from: h  reason: collision with root package name */
    private com.facebook.react.devsupport.b f12181h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12182i;

    /* renamed from: j  reason: collision with root package name */
    private LifecycleState f12183j;

    /* renamed from: k  reason: collision with root package name */
    private s0 f12184k;

    /* renamed from: l  reason: collision with root package name */
    private NativeModuleCallExceptionHandler f12185l;

    /* renamed from: m  reason: collision with root package name */
    private Activity f12186m;

    /* renamed from: n  reason: collision with root package name */
    private com.facebook.react.modules.core.b f12187n;

    /* renamed from: o  reason: collision with root package name */
    private com.facebook.react.devsupport.h f12188o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12189p;

    /* renamed from: q  reason: collision with root package name */
    private bg.a f12190q;

    /* renamed from: r  reason: collision with root package name */
    private JavaScriptExecutorFactory f12191r;

    /* renamed from: u  reason: collision with root package name */
    private JSIModulePackage f12194u;

    /* renamed from: v  reason: collision with root package name */
    private Map<String, Object> f12195v;

    /* renamed from: w  reason: collision with root package name */
    private y.a f12196w;

    /* renamed from: x  reason: collision with root package name */
    private yf.h f12197x;

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f12174a = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private int f12192s = 1;

    /* renamed from: t  reason: collision with root package name */
    private int f12193t = -1;

    /* renamed from: y  reason: collision with root package name */
    private c f12198y = c.OLD_LOGIC;

    private JavaScriptExecutorFactory c(String str, String str2, Context context) {
        c cVar = this.f12198y;
        if (cVar == c.OLD_LOGIC) {
            try {
                r.H(context);
                JSCExecutor.a();
                return new com.facebook.react.jscexecutor.a(str, str2);
            } catch (UnsatisfiedLinkError e11) {
                if (!e11.getMessage().contains("__cxa_bad_typeid")) {
                    HermesExecutor.a();
                    return new com.facebook.hermes.reactexecutor.a();
                }
                throw e11;
            }
        } else if (cVar == c.HERMES) {
            HermesExecutor.a();
            return new com.facebook.hermes.reactexecutor.a();
        } else {
            JSCExecutor.a();
            return new com.facebook.react.jscexecutor.a(str, str2);
        }
    }

    public s a(v vVar) {
        this.f12174a.add(vVar);
        return this;
    }

    public r b() {
        String str;
        wf.a.d(this.f12179f, "Application property has not been set with this builder");
        if (this.f12183j == LifecycleState.RESUMED) {
            wf.a.d(this.f12186m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z11 = true;
        wf.a.b((!this.f12180g && this.f12175b == null && this.f12176c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f12177d == null && this.f12175b == null && this.f12176c == null) {
            z11 = false;
        }
        wf.a.b(z11, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.f12184k == null) {
            this.f12184k = new s0();
        }
        String packageName = this.f12179f.getPackageName();
        String a11 = kg.a.a();
        Application application = this.f12179f;
        Activity activity = this.f12186m;
        com.facebook.react.modules.core.b bVar = this.f12187n;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f12191r;
        JavaScriptExecutorFactory c11 = javaScriptExecutorFactory == null ? c(packageName, a11, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader jSBundleLoader = this.f12176c;
        if (jSBundleLoader == null && (str = this.f12175b) != null) {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.f12179f, str, false);
        }
        JSBundleLoader jSBundleLoader2 = jSBundleLoader;
        String str2 = this.f12177d;
        List<v> list = this.f12174a;
        boolean z12 = this.f12180g;
        com.facebook.react.devsupport.b bVar2 = this.f12181h;
        if (bVar2 == null) {
            bVar2 = new com.facebook.react.devsupport.a();
        }
        return new r(application, activity, bVar, c11, jSBundleLoader2, str2, list, z12, bVar2, this.f12182i, this.f12178e, (LifecycleState) wf.a.d(this.f12183j, "Initial lifecycle state was not set"), this.f12184k, this.f12185l, this.f12188o, this.f12189p, this.f12190q, this.f12192s, this.f12193t, this.f12194u, this.f12195v, this.f12196w, this.f12197x);
    }

    public s d(Application application) {
        this.f12179f = application;
        return this;
    }

    public s e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f12175b = str2;
        this.f12176c = null;
        return this;
    }

    public s f(com.facebook.react.devsupport.b bVar) {
        this.f12181h = bVar;
        return this;
    }

    public s g(LifecycleState lifecycleState) {
        this.f12183j = lifecycleState;
        return this;
    }

    public s h(String str) {
        if (str.startsWith("assets://")) {
            this.f12175b = str;
            this.f12176c = null;
            return this;
        }
        return i(JSBundleLoader.createFileLoader(str));
    }

    public s i(JSBundleLoader jSBundleLoader) {
        this.f12176c = jSBundleLoader;
        this.f12175b = null;
        return this;
    }

    public s j(JSIModulePackage jSIModulePackage) {
        this.f12194u = jSIModulePackage;
        return this;
    }

    public s k(String str) {
        this.f12177d = str;
        return this;
    }

    public s l(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f12191r = javaScriptExecutorFactory;
        return this;
    }

    public s m(y.a aVar) {
        this.f12196w = aVar;
        return this;
    }

    public s n(com.facebook.react.devsupport.h hVar) {
        this.f12188o = hVar;
        return this;
    }

    public s o(boolean z11) {
        this.f12182i = z11;
        return this;
    }

    public s p(yf.h hVar) {
        this.f12197x = hVar;
        return this;
    }

    public s q(s0 s0Var) {
        this.f12184k = s0Var;
        return this;
    }

    public s r(boolean z11) {
        this.f12180g = z11;
        return this;
    }
}