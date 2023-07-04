package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.u0;
import androidx.core.view.f;
import androidx.core.view.g0;
import androidx.core.view.i0;
import androidx.core.view.l0;
import androidx.lifecycle.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.Thread;
import java.util.List;
import l.b;
import l.f;
import l3.h;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends androidx.appcompat.app.f implements e.a, LayoutInflater.Factory2 {

    /* renamed from: l3  reason: collision with root package name */
    private static final androidx.collection.g<String, Integer> f1150l3 = new androidx.collection.g<>();

    /* renamed from: m3  reason: collision with root package name */
    private static final boolean f1151m3;

    /* renamed from: n3  reason: collision with root package name */
    private static final int[] f1152n3;

    /* renamed from: o3  reason: collision with root package name */
    private static final boolean f1153o3;

    /* renamed from: p3  reason: collision with root package name */
    private static final boolean f1154p3;

    /* renamed from: q3  reason: collision with root package name */
    private static boolean f1155q3;
    private TextView A;
    private View B;
    private boolean C;
    private boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean K;
    boolean L;
    private boolean O;
    private u[] P;
    private u Q;
    private boolean Q1;
    private Rect Q2;
    private boolean R;
    private boolean T;
    private q V1;
    private boolean Y;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f1156b1;

    /* renamed from: b2  reason: collision with root package name */
    private q f1157b2;

    /* renamed from: d  reason: collision with root package name */
    final Object f1158d;

    /* renamed from: e  reason: collision with root package name */
    final Context f1159e;

    /* renamed from: f  reason: collision with root package name */
    Window f1160f;

    /* renamed from: g  reason: collision with root package name */
    private o f1161g;

    /* renamed from: g1  reason: collision with root package name */
    boolean f1162g1;

    /* renamed from: g2  reason: collision with root package name */
    boolean f1163g2;

    /* renamed from: h  reason: collision with root package name */
    final androidx.appcompat.app.e f1164h;

    /* renamed from: i  reason: collision with root package name */
    androidx.appcompat.app.a f1165i;

    /* renamed from: i3  reason: collision with root package name */
    private Rect f1166i3;

    /* renamed from: j  reason: collision with root package name */
    MenuInflater f1167j;

    /* renamed from: j3  reason: collision with root package name */
    private androidx.appcompat.app.j f1168j3;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1169k;

    /* renamed from: k3  reason: collision with root package name */
    private androidx.appcompat.app.k f1170k3;

    /* renamed from: l  reason: collision with root package name */
    private a0 f1171l;

    /* renamed from: m  reason: collision with root package name */
    private i f1172m;

    /* renamed from: n  reason: collision with root package name */
    private v f1173n;

    /* renamed from: o  reason: collision with root package name */
    l.b f1174o;

    /* renamed from: p  reason: collision with root package name */
    ActionBarContextView f1175p;

    /* renamed from: p1  reason: collision with root package name */
    private int f1176p1;

    /* renamed from: p2  reason: collision with root package name */
    int f1177p2;

    /* renamed from: q  reason: collision with root package name */
    PopupWindow f1178q;

    /* renamed from: t  reason: collision with root package name */
    Runnable f1179t;

    /* renamed from: w  reason: collision with root package name */
    g0 f1180w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1181x;

    /* renamed from: x1  reason: collision with root package name */
    private int f1182x1;

    /* renamed from: x2  reason: collision with root package name */
    private final Runnable f1183x2;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1184y;

    /* renamed from: y1  reason: collision with root package name */
    private boolean f1185y1;

    /* renamed from: y2  reason: collision with root package name */
    private boolean f1186y2;

    /* renamed from: z  reason: collision with root package name */
    ViewGroup f1187z;

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1188a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1188a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th2) {
            String message;
            if (!(th2 instanceof Resources.NotFoundException) || (message = th2.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (a(th2)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th2.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th2.getCause());
                notFoundException.setStackTrace(th2.getStackTrace());
                this.f1188a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f1188a.uncaughtException(thread, th2);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.f1177p2 & 1) != 0) {
                gVar.X(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f1177p2 & 4096) != 0) {
                gVar2.X(108);
            }
            g gVar3 = g.this;
            gVar3.f1163g2 = false;
            gVar3.f1177p2 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements androidx.core.view.u {
        c() {
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            int m11 = l0Var.m();
            int N0 = g.this.N0(l0Var, null);
            if (m11 != N0) {
                l0Var = l0Var.q(l0Var.k(), N0, l0Var.l(), l0Var.j());
            }
            return androidx.core.view.a0.i0(view, l0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements e0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.e0.a
        public void a(Rect rect) {
            rect.top = g.this.N0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a extends i0 {
            a() {
            }

            @Override // androidx.core.view.h0
            public void b(View view) {
                g.this.f1175p.setAlpha(1.0f);
                g.this.f1180w.f(null);
                g.this.f1180w = null;
            }

            @Override // androidx.core.view.i0, androidx.core.view.h0
            public void c(View view) {
                g.this.f1175p.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f1178q.showAtLocation(gVar.f1175p, 55, 0, 0);
            g.this.Y();
            if (g.this.G0()) {
                g.this.f1175p.setAlpha(BitmapDescriptorFactory.HUE_RED);
                g gVar2 = g.this;
                gVar2.f1180w = androidx.core.view.a0.e(gVar2.f1175p).a(1.0f);
                g.this.f1180w.f(new a());
                return;
            }
            g.this.f1175p.setAlpha(1.0f);
            g.this.f1175p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0036g extends i0 {
        C0036g() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            g.this.f1175p.setAlpha(1.0f);
            g.this.f1180w.f(null);
            g.this.f1180w = null;
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void c(View view) {
            g.this.f1175p.setVisibility(0);
            g.this.f1175p.sendAccessibilityEvent(32);
            if (g.this.f1175p.getParent() instanceof View) {
                androidx.core.view.a0.t0((View) g.this.f1175p.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    private class h implements androidx.appcompat.app.b {
        h(g gVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class i implements j.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z11) {
            g.this.O(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback i02 = g.this.i0();
            if (i02 != null) {
                i02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f1197a;

        /* loaded from: classes.dex */
        class a extends i0 {
            a() {
            }

            @Override // androidx.core.view.h0
            public void b(View view) {
                g.this.f1175p.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f1178q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f1175p.getParent() instanceof View) {
                    androidx.core.view.a0.t0((View) g.this.f1175p.getParent());
                }
                g.this.f1175p.k();
                g.this.f1180w.f(null);
                g gVar2 = g.this;
                gVar2.f1180w = null;
                androidx.core.view.a0.t0(gVar2.f1187z);
            }
        }

        public j(b.a aVar) {
            this.f1197a = aVar;
        }

        @Override // l.b.a
        public boolean a(l.b bVar, MenuItem menuItem) {
            return this.f1197a.a(bVar, menuItem);
        }

        @Override // l.b.a
        public boolean b(l.b bVar, Menu menu) {
            return this.f1197a.b(bVar, menu);
        }

        @Override // l.b.a
        public boolean c(l.b bVar, Menu menu) {
            androidx.core.view.a0.t0(g.this.f1187z);
            return this.f1197a.c(bVar, menu);
        }

        @Override // l.b.a
        public void d(l.b bVar) {
            this.f1197a.d(bVar);
            g gVar = g.this;
            if (gVar.f1178q != null) {
                gVar.f1160f.getDecorView().removeCallbacks(g.this.f1179t);
            }
            g gVar2 = g.this;
            if (gVar2.f1175p != null) {
                gVar2.Y();
                g gVar3 = g.this;
                gVar3.f1180w = androidx.core.view.a0.e(gVar3.f1175p).a(BitmapDescriptorFactory.HUE_RED);
                g.this.f1180w.f(new a());
            }
            g gVar4 = g.this;
            androidx.appcompat.app.e eVar = gVar4.f1164h;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(gVar4.f1174o);
            }
            g gVar5 = g.this;
            gVar5.f1174o = null;
            androidx.core.view.a0.t0(gVar5.f1187z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i11 = configuration.densityDpi;
            int i12 = configuration2.densityDpi;
            if (i11 != i12) {
                configuration3.densityDpi = i12;
            }
        }
    }

    /* loaded from: classes.dex */
    static class l {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i11 = configuration.colorMode & 3;
            int i12 = configuration2.colorMode;
            if (i11 != (i12 & 3)) {
                configuration3.colorMode |= i12 & 3;
            }
            int i13 = configuration.colorMode & 12;
            int i14 = configuration2.colorMode;
            if (i13 != (i14 & 12)) {
                configuration3.colorMode |= i14 & 12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class p extends q {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f1201c;

        p(Context context) {
            super();
            this.f1201c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.g.q
        IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.g.q
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !l.a(this.f1201c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.g.q
        public void d() {
            g.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class q {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f1203a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f1203a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f1159e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1203a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b11 = b();
            if (b11 == null || b11.countActions() == 0) {
                return;
            }
            if (this.f1203a == null) {
                this.f1203a = new a();
            }
            g.this.f1159e.registerReceiver(this.f1203a, b11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class r extends q {

        /* renamed from: c  reason: collision with root package name */
        private final androidx.appcompat.app.o f1206c;

        r(androidx.appcompat.app.o oVar) {
            super();
            this.f1206c = oVar;
        }

        @Override // androidx.appcompat.app.g.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.q
        public int c() {
            return this.f1206c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.q
        public void d() {
            g.this.I();
        }
    }

    /* loaded from: classes.dex */
    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean c(int i11, int i12) {
            return i11 < -5 || i12 < -5 || i11 > getWidth() + 5 || i12 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                g.this.Q(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i11) {
            setBackgroundDrawable(h.a.d(getContext(), i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class u {

        /* renamed from: a  reason: collision with root package name */
        int f1209a;

        /* renamed from: b  reason: collision with root package name */
        int f1210b;

        /* renamed from: c  reason: collision with root package name */
        int f1211c;

        /* renamed from: d  reason: collision with root package name */
        int f1212d;

        /* renamed from: e  reason: collision with root package name */
        int f1213e;

        /* renamed from: f  reason: collision with root package name */
        int f1214f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f1215g;

        /* renamed from: h  reason: collision with root package name */
        View f1216h;

        /* renamed from: i  reason: collision with root package name */
        View f1217i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f1218j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f1219k;

        /* renamed from: l  reason: collision with root package name */
        Context f1220l;

        /* renamed from: m  reason: collision with root package name */
        boolean f1221m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1222n;

        /* renamed from: o  reason: collision with root package name */
        boolean f1223o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1224p;

        /* renamed from: q  reason: collision with root package name */
        boolean f1225q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f1226r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f1227s;

        u(int i11) {
            this.f1209a = i11;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f1218j == null) {
                return null;
            }
            if (this.f1219k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f1220l, g.g.f27150j);
                this.f1219k = cVar;
                cVar.d(aVar);
                this.f1218j.b(this.f1219k);
            }
            return this.f1219k.j(this.f1215g);
        }

        public boolean b() {
            if (this.f1216h == null) {
                return false;
            }
            return this.f1217i != null || this.f1219k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1218j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f1219k);
            }
            this.f1218j = eVar;
            if (eVar == null || (cVar = this.f1219k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(g.a.f27039a, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            }
            newTheme.resolveAttribute(g.a.E, typedValue, true);
            int i12 = typedValue.resourceId;
            if (i12 != 0) {
                newTheme.applyStyle(i12, true);
            } else {
                newTheme.applyStyle(g.i.f27176b, true);
            }
            l.d dVar = new l.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1220l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(g.j.f27280u0);
            this.f1210b = obtainStyledAttributes.getResourceId(g.j.f27295x0, 0);
            this.f1214f = obtainStyledAttributes.getResourceId(g.j.f27290w0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class v implements j.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z11) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z12 = D != eVar;
            g gVar = g.this;
            if (z12) {
                eVar = D;
            }
            u b02 = gVar.b0(eVar);
            if (b02 != null) {
                if (z12) {
                    g.this.N(b02.f1209a, b02, D);
                    g.this.R(b02, true);
                    return;
                }
                g.this.R(b02, z11);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback i02;
            if (eVar == eVar.D()) {
                g gVar = g.this;
                if (!gVar.F || (i02 = gVar.i0()) == null || g.this.f1162g1) {
                    return true;
                }
                i02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = i11 < 21;
        f1151m3 = z11;
        f1152n3 = new int[]{16842836};
        f1153o3 = !"robolectric".equals(Build.FINGERPRINT);
        f1154p3 = i11 >= 17;
        if (!z11 || f1155q3) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f1155q3 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private void A0(u uVar, KeyEvent keyEvent) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f1223o || this.f1162g1) {
            return;
        }
        if (uVar.f1209a == 0) {
            if ((this.f1159e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback i02 = i0();
        if (i02 != null && !i02.onMenuOpened(uVar.f1209a, uVar.f1218j)) {
            R(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1159e.getSystemService("window");
        if (windowManager != null && D0(uVar, keyEvent)) {
            ViewGroup viewGroup = uVar.f1215g;
            if (viewGroup != null && !uVar.f1225q) {
                View view = uVar.f1217i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i11 = -1;
                    uVar.f1222n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i11, -2, uVar.f1212d, uVar.f1213e, 1002, 8519680, -3);
                    layoutParams2.gravity = uVar.f1211c;
                    layoutParams2.windowAnimations = uVar.f1214f;
                    windowManager.addView(uVar.f1215g, layoutParams2);
                    uVar.f1223o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!l0(uVar) || uVar.f1215g == null) {
                        return;
                    }
                } else if (uVar.f1225q && viewGroup.getChildCount() > 0) {
                    uVar.f1215g.removeAllViews();
                }
                if (k0(uVar) && uVar.b()) {
                    ViewGroup.LayoutParams layoutParams3 = uVar.f1216h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    uVar.f1215g.setBackgroundResource(uVar.f1210b);
                    ViewParent parent = uVar.f1216h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(uVar.f1216h);
                    }
                    uVar.f1215g.addView(uVar.f1216h, layoutParams3);
                    if (!uVar.f1216h.hasFocus()) {
                        uVar.f1216h.requestFocus();
                    }
                } else {
                    uVar.f1225q = true;
                    return;
                }
            }
            i11 = -2;
            uVar.f1222n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i11, -2, uVar.f1212d, uVar.f1213e, 1002, 8519680, -3);
            layoutParams22.gravity = uVar.f1211c;
            layoutParams22.windowAnimations = uVar.f1214f;
            windowManager.addView(uVar.f1215g, layoutParams22);
            uVar.f1223o = true;
        }
    }

    private boolean C0(u uVar, int i11, KeyEvent keyEvent, int i12) {
        androidx.appcompat.view.menu.e eVar;
        boolean z11 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f1221m || D0(uVar, keyEvent)) && (eVar = uVar.f1218j) != null) {
            z11 = eVar.performShortcut(i11, keyEvent, i12);
        }
        if (z11 && (i12 & 1) == 0 && this.f1171l == null) {
            R(uVar, true);
        }
        return z11;
    }

    private boolean D0(u uVar, KeyEvent keyEvent) {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        if (this.f1162g1) {
            return false;
        }
        if (uVar.f1221m) {
            return true;
        }
        u uVar2 = this.Q;
        if (uVar2 != null && uVar2 != uVar) {
            R(uVar2, false);
        }
        Window.Callback i02 = i0();
        if (i02 != null) {
            uVar.f1217i = i02.onCreatePanelView(uVar.f1209a);
        }
        int i11 = uVar.f1209a;
        boolean z11 = i11 == 0 || i11 == 108;
        if (z11 && (a0Var3 = this.f1171l) != null) {
            a0Var3.g();
        }
        if (uVar.f1217i == null && (!z11 || !(B0() instanceof androidx.appcompat.app.m))) {
            androidx.appcompat.view.menu.e eVar = uVar.f1218j;
            if (eVar == null || uVar.f1226r) {
                if (eVar == null && (!m0(uVar) || uVar.f1218j == null)) {
                    return false;
                }
                if (z11 && this.f1171l != null) {
                    if (this.f1172m == null) {
                        this.f1172m = new i();
                    }
                    this.f1171l.e(uVar.f1218j, this.f1172m);
                }
                uVar.f1218j.d0();
                if (!i02.onCreatePanelMenu(uVar.f1209a, uVar.f1218j)) {
                    uVar.c(null);
                    if (z11 && (a0Var = this.f1171l) != null) {
                        a0Var.e(null, this.f1172m);
                    }
                    return false;
                }
                uVar.f1226r = false;
            }
            uVar.f1218j.d0();
            Bundle bundle = uVar.f1227s;
            if (bundle != null) {
                uVar.f1218j.P(bundle);
                uVar.f1227s = null;
            }
            if (!i02.onPreparePanel(0, uVar.f1217i, uVar.f1218j)) {
                if (z11 && (a0Var2 = this.f1171l) != null) {
                    a0Var2.e(null, this.f1172m);
                }
                uVar.f1218j.c0();
                return false;
            }
            boolean z12 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f1224p = z12;
            uVar.f1218j.setQwertyMode(z12);
            uVar.f1218j.c0();
        }
        uVar.f1221m = true;
        uVar.f1222n = false;
        this.Q = uVar;
        return true;
    }

    private void E0(boolean z11) {
        a0 a0Var = this.f1171l;
        if (a0Var != null && a0Var.b() && (!ViewConfiguration.get(this.f1159e).hasPermanentMenuKey() || this.f1171l.h())) {
            Window.Callback i02 = i0();
            if (this.f1171l.f() && z11) {
                this.f1171l.c();
                if (this.f1162g1) {
                    return;
                }
                i02.onPanelClosed(108, g0(0, true).f1218j);
                return;
            } else if (i02 == null || this.f1162g1) {
                return;
            } else {
                if (this.f1163g2 && (this.f1177p2 & 1) != 0) {
                    this.f1160f.getDecorView().removeCallbacks(this.f1183x2);
                    this.f1183x2.run();
                }
                u g02 = g0(0, true);
                androidx.appcompat.view.menu.e eVar = g02.f1218j;
                if (eVar == null || g02.f1226r || !i02.onPreparePanel(0, g02.f1217i, eVar)) {
                    return;
                }
                i02.onMenuOpened(108, g02.f1218j);
                this.f1171l.d();
                return;
            }
        }
        u g03 = g0(0, true);
        g03.f1225q = true;
        R(g03, false);
        A0(g03, null);
    }

    private int F0(int i11) {
        if (i11 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i11 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i11;
        }
    }

    private boolean H0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1160f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || androidx.core.view.a0.Y((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean J(boolean z11) {
        if (this.f1162g1) {
            return false;
        }
        int M = M();
        boolean L0 = L0(q0(this.f1159e, M), z11);
        if (M == 0) {
            f0(this.f1159e).e();
        } else {
            q qVar = this.V1;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (M == 3) {
            e0(this.f1159e).e();
        } else {
            q qVar2 = this.f1157b2;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return L0;
    }

    private void J0() {
        if (this.f1184y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void K() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1187z.findViewById(16908290);
        View decorView = this.f1160f.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1159e.obtainStyledAttributes(g.j.f27280u0);
        obtainStyledAttributes.getValue(g.j.G0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(g.j.H0, contentFrameLayout.getMinWidthMinor());
        int i11 = g.j.E0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMajor());
        }
        int i12 = g.j.F0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedWidthMinor());
        }
        int i13 = g.j.C0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMajor());
        }
        int i14 = g.j.D0;
        if (obtainStyledAttributes.hasValue(i14)) {
            obtainStyledAttributes.getValue(i14, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private androidx.appcompat.app.d K0() {
        for (Context context = this.f1159e; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void L(Window window) {
        if (this.f1160f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                o oVar = new o(callback);
                this.f1161g = oVar;
                window.setCallback(oVar);
                u0 u11 = u0.u(this.f1159e, null, f1152n3);
                Drawable h11 = u11.h(0);
                if (h11 != null) {
                    window.setBackgroundDrawable(h11);
                }
                u11.w();
                this.f1160f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean L0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f1159e
            r1 = 0
            android.content.res.Configuration r0 = r6.S(r0, r7, r1)
            boolean r2 = r6.o0()
            android.content.Context r3 = r6.f1159e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.T
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.g.f1153o3
            if (r8 != 0) goto L30
            boolean r8 = r6.Y
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f1158d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f1158d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.a.d(r8)
            r8 = r4
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.M0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f1158d
            boolean r0 = r8 instanceof androidx.appcompat.app.d
            if (r0 == 0) goto L5e
            androidx.appcompat.app.d r8 = (androidx.appcompat.app.d) r8
            r8.onNightModeChanged(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.L0(int, boolean):boolean");
    }

    private int M() {
        int i11 = this.f1176p1;
        return i11 != -100 ? i11 : androidx.appcompat.app.f.j();
    }

    private void M0(int i11, boolean z11, Configuration configuration) {
        Resources resources = this.f1159e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i11 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            androidx.appcompat.app.l.a(resources);
        }
        int i13 = this.f1182x1;
        if (i13 != 0) {
            this.f1159e.setTheme(i13);
            if (i12 >= 23) {
                this.f1159e.getTheme().applyStyle(this.f1182x1, true);
            }
        }
        if (z11) {
            Object obj = this.f1158d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.v) {
                    if (((androidx.lifecycle.v) activity).getLifecycle().b().isAtLeast(p.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f1156b1) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void O0(View view) {
        int color;
        if ((androidx.core.view.a0.R(view) & PKIFailureInfo.certRevoked) != 0) {
            color = androidx.core.content.b.getColor(this.f1159e, g.c.f27067b);
        } else {
            color = androidx.core.content.b.getColor(this.f1159e, g.c.f27066a);
        }
        view.setBackgroundColor(color);
    }

    private void P() {
        q qVar = this.V1;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f1157b2;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private Configuration S(Context context, int i11, Configuration configuration) {
        int i12;
        if (i11 != 1) {
            i12 = i11 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i12 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i12 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup T() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1159e.obtainStyledAttributes(g.j.f27280u0);
        int i11 = g.j.f27305z0;
        if (obtainStyledAttributes.hasValue(i11)) {
            if (obtainStyledAttributes.getBoolean(g.j.I0, false)) {
                A(1);
            } else if (obtainStyledAttributes.getBoolean(i11, false)) {
                A(108);
            }
            if (obtainStyledAttributes.getBoolean(g.j.A0, false)) {
                A(109);
            }
            if (obtainStyledAttributes.getBoolean(g.j.B0, false)) {
                A(10);
            }
            this.K = obtainStyledAttributes.getBoolean(g.j.f27285v0, false);
            obtainStyledAttributes.recycle();
            a0();
            this.f1160f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1159e);
            if (!this.L) {
                if (this.K) {
                    viewGroup = (ViewGroup) from.inflate(g.g.f27146f, (ViewGroup) null);
                    this.G = false;
                    this.F = false;
                } else if (this.F) {
                    TypedValue typedValue = new TypedValue();
                    this.f1159e.getTheme().resolveAttribute(g.a.f27044f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new l.d(this.f1159e, typedValue.resourceId);
                    } else {
                        context = this.f1159e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(g.g.f27156p, (ViewGroup) null);
                    a0 a0Var = (a0) viewGroup.findViewById(g.f.f27130p);
                    this.f1171l = a0Var;
                    a0Var.setWindowCallback(i0());
                    if (this.G) {
                        this.f1171l.i(109);
                    }
                    if (this.C) {
                        this.f1171l.i(2);
                    }
                    if (this.E) {
                        this.f1171l.i(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.H ? (ViewGroup) from.inflate(g.g.f27155o, (ViewGroup) null) : (ViewGroup) from.inflate(g.g.f27154n, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    androidx.core.view.a0.J0(viewGroup, new c());
                } else if (viewGroup instanceof e0) {
                    ((e0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f1171l == null) {
                    this.A = (TextView) viewGroup.findViewById(g.f.M);
                }
                a1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(g.f.f27116b);
                ViewGroup viewGroup2 = (ViewGroup) this.f1160f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f1160f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.L + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void Z() {
        if (this.f1184y) {
            return;
        }
        this.f1187z = T();
        CharSequence h02 = h0();
        if (!TextUtils.isEmpty(h02)) {
            a0 a0Var = this.f1171l;
            if (a0Var != null) {
                a0Var.setWindowTitle(h02);
            } else if (B0() != null) {
                B0().D(h02);
            } else {
                TextView textView = this.A;
                if (textView != null) {
                    textView.setText(h02);
                }
            }
        }
        K();
        z0(this.f1187z);
        this.f1184y = true;
        u g02 = g0(0, false);
        if (this.f1162g1) {
            return;
        }
        if (g02 == null || g02.f1218j == null) {
            n0(108);
        }
    }

    private void a0() {
        if (this.f1160f == null) {
            Object obj = this.f1158d;
            if (obj instanceof Activity) {
                L(((Activity) obj).getWindow());
            }
        }
        if (this.f1160f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration c0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f11 = configuration.fontScale;
            float f12 = configuration2.fontScale;
            if (f11 != f12) {
                configuration3.fontScale = f12;
            }
            int i11 = configuration.mcc;
            int i12 = configuration2.mcc;
            if (i11 != i12) {
                configuration3.mcc = i12;
            }
            int i13 = configuration.mnc;
            int i14 = configuration2.mnc;
            if (i13 != i14) {
                configuration3.mnc = i14;
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!v3.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i16 = configuration.touchscreen;
            int i17 = configuration2.touchscreen;
            if (i16 != i17) {
                configuration3.touchscreen = i17;
            }
            int i18 = configuration.keyboard;
            int i19 = configuration2.keyboard;
            if (i18 != i19) {
                configuration3.keyboard = i19;
            }
            int i21 = configuration.keyboardHidden;
            int i22 = configuration2.keyboardHidden;
            if (i21 != i22) {
                configuration3.keyboardHidden = i22;
            }
            int i23 = configuration.navigation;
            int i24 = configuration2.navigation;
            if (i23 != i24) {
                configuration3.navigation = i24;
            }
            int i25 = configuration.navigationHidden;
            int i26 = configuration2.navigationHidden;
            if (i25 != i26) {
                configuration3.navigationHidden = i26;
            }
            int i27 = configuration.orientation;
            int i28 = configuration2.orientation;
            if (i27 != i28) {
                configuration3.orientation = i28;
            }
            int i29 = configuration.screenLayout & 15;
            int i31 = configuration2.screenLayout;
            if (i29 != (i31 & 15)) {
                configuration3.screenLayout |= i31 & 15;
            }
            int i32 = configuration.screenLayout & 192;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 192)) {
                configuration3.screenLayout |= i33 & 192;
            }
            int i34 = configuration.screenLayout & 48;
            int i35 = configuration2.screenLayout;
            if (i34 != (i35 & 48)) {
                configuration3.screenLayout |= i35 & 48;
            }
            int i36 = configuration.screenLayout & 768;
            int i37 = configuration2.screenLayout;
            if (i36 != (i37 & 768)) {
                configuration3.screenLayout |= i37 & 768;
            }
            if (i15 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i38 = configuration.uiMode & 15;
            int i39 = configuration2.uiMode;
            if (i38 != (i39 & 15)) {
                configuration3.uiMode |= i39 & 15;
            }
            int i41 = configuration.uiMode & 48;
            int i42 = configuration2.uiMode;
            if (i41 != (i42 & 48)) {
                configuration3.uiMode |= i42 & 48;
            }
            int i43 = configuration.screenWidthDp;
            int i44 = configuration2.screenWidthDp;
            if (i43 != i44) {
                configuration3.screenWidthDp = i44;
            }
            int i45 = configuration.screenHeightDp;
            int i46 = configuration2.screenHeightDp;
            if (i45 != i46) {
                configuration3.screenHeightDp = i46;
            }
            int i47 = configuration.smallestScreenWidthDp;
            int i48 = configuration2.smallestScreenWidthDp;
            if (i47 != i48) {
                configuration3.smallestScreenWidthDp = i48;
            }
            if (i15 >= 17) {
                k.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private q e0(Context context) {
        if (this.f1157b2 == null) {
            this.f1157b2 = new p(context);
        }
        return this.f1157b2;
    }

    private q f0(Context context) {
        if (this.V1 == null) {
            this.V1 = new r(androidx.appcompat.app.o.a(context));
        }
        return this.V1;
    }

    private void j0() {
        Z();
        if (this.F && this.f1165i == null) {
            Object obj = this.f1158d;
            if (obj instanceof Activity) {
                this.f1165i = new androidx.appcompat.app.p((Activity) this.f1158d, this.G);
            } else if (obj instanceof Dialog) {
                this.f1165i = new androidx.appcompat.app.p((Dialog) this.f1158d);
            }
            androidx.appcompat.app.a aVar = this.f1165i;
            if (aVar != null) {
                aVar.u(this.f1186y2);
            }
        }
    }

    private boolean k0(u uVar) {
        View view = uVar.f1217i;
        if (view != null) {
            uVar.f1216h = view;
            return true;
        } else if (uVar.f1218j == null) {
            return false;
        } else {
            if (this.f1173n == null) {
                this.f1173n = new v();
            }
            View view2 = (View) uVar.a(this.f1173n);
            uVar.f1216h = view2;
            return view2 != null;
        }
    }

    private boolean l0(u uVar) {
        uVar.d(d0());
        uVar.f1215g = new t(uVar.f1220l);
        uVar.f1211c = 81;
        return true;
    }

    private boolean m0(u uVar) {
        Context context = this.f1159e;
        int i11 = uVar.f1209a;
        if ((i11 == 0 || i11 == 108) && this.f1171l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(g.a.f27044f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(g.a.f27045g, typedValue, true);
            } else {
                theme.resolveAttribute(g.a.f27045g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                l.d dVar = new l.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        uVar.c(eVar);
        return true;
    }

    private void n0(int i11) {
        this.f1177p2 = (1 << i11) | this.f1177p2;
        if (this.f1163g2) {
            return;
        }
        androidx.core.view.a0.o0(this.f1160f.getDecorView(), this.f1183x2);
        this.f1163g2 = true;
    }

    private boolean o0() {
        if (!this.Q1 && (this.f1158d instanceof Activity)) {
            PackageManager packageManager = this.f1159e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f1159e, this.f1158d.getClass()), i11 >= 29 ? 269221888 : i11 >= 24 ? 786432 : 0);
                this.f1185y1 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e11);
                this.f1185y1 = false;
            }
        }
        this.Q1 = true;
        return this.f1185y1;
    }

    private boolean t0(int i11, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            u g02 = g0(i11, true);
            if (g02.f1223o) {
                return false;
            }
            return D0(g02, keyEvent);
        }
        return false;
    }

    private boolean w0(int i11, KeyEvent keyEvent) {
        boolean z11;
        a0 a0Var;
        if (this.f1174o != null) {
            return false;
        }
        boolean z12 = true;
        u g02 = g0(i11, true);
        if (i11 == 0 && (a0Var = this.f1171l) != null && a0Var.b() && !ViewConfiguration.get(this.f1159e).hasPermanentMenuKey()) {
            if (!this.f1171l.f()) {
                if (!this.f1162g1 && D0(g02, keyEvent)) {
                    z12 = this.f1171l.d();
                }
                z12 = false;
            } else {
                z12 = this.f1171l.c();
            }
        } else {
            boolean z13 = g02.f1223o;
            if (!z13 && !g02.f1222n) {
                if (g02.f1221m) {
                    if (g02.f1226r) {
                        g02.f1221m = false;
                        z11 = D0(g02, keyEvent);
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        A0(g02, keyEvent);
                    }
                }
                z12 = false;
            } else {
                R(g02, true);
                z12 = z13;
            }
        }
        if (z12) {
            AudioManager audioManager = (AudioManager) this.f1159e.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z12;
    }

    @Override // androidx.appcompat.app.f
    public boolean A(int i11) {
        int F0 = F0(i11);
        if (this.L && F0 == 108) {
            return false;
        }
        if (this.F && F0 == 1) {
            this.F = false;
        }
        if (F0 == 1) {
            J0();
            this.L = true;
            return true;
        } else if (F0 == 2) {
            J0();
            this.C = true;
            return true;
        } else if (F0 == 5) {
            J0();
            this.E = true;
            return true;
        } else if (F0 == 10) {
            J0();
            this.H = true;
            return true;
        } else if (F0 == 108) {
            J0();
            this.F = true;
            return true;
        } else if (F0 != 109) {
            return this.f1160f.requestFeature(F0);
        } else {
            J0();
            this.G = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.f
    public void B(int i11) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.f1187z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1159e).inflate(i11, viewGroup);
        this.f1161g.a().onContentChanged();
    }

    final androidx.appcompat.app.a B0() {
        return this.f1165i;
    }

    @Override // androidx.appcompat.app.f
    public void C(View view) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.f1187z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1161g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void D(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.f1187z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1161g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void E(Toolbar toolbar) {
        if (this.f1158d instanceof Activity) {
            androidx.appcompat.app.a n11 = n();
            if (!(n11 instanceof androidx.appcompat.app.p)) {
                this.f1167j = null;
                if (n11 != null) {
                    n11.o();
                }
                if (toolbar != null) {
                    androidx.appcompat.app.m mVar = new androidx.appcompat.app.m(toolbar, h0(), this.f1161g);
                    this.f1165i = mVar;
                    this.f1160f.setCallback(mVar.G());
                } else {
                    this.f1165i = null;
                    this.f1160f.setCallback(this.f1161g);
                }
                p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.f
    public void F(int i11) {
        this.f1182x1 = i11;
    }

    @Override // androidx.appcompat.app.f
    public final void G(CharSequence charSequence) {
        this.f1169k = charSequence;
        a0 a0Var = this.f1171l;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
        } else if (B0() != null) {
            B0().D(charSequence);
        } else {
            TextView textView = this.A;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    final boolean G0() {
        ViewGroup viewGroup;
        return this.f1184y && (viewGroup = this.f1187z) != null && androidx.core.view.a0.a0(viewGroup);
    }

    @Override // androidx.appcompat.app.f
    public l.b H(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar != null) {
            l.b bVar = this.f1174o;
            if (bVar != null) {
                bVar.c();
            }
            j jVar = new j(aVar);
            androidx.appcompat.app.a n11 = n();
            if (n11 != null) {
                l.b E = n11.E(jVar);
                this.f1174o = E;
                if (E != null && (eVar = this.f1164h) != null) {
                    eVar.onSupportActionModeStarted(E);
                }
            }
            if (this.f1174o == null) {
                this.f1174o = I0(jVar);
            }
            return this.f1174o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public boolean I() {
        return J(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    l.b I0(l.b.a r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.I0(l.b$a):l.b");
    }

    void N(int i11, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i11 >= 0) {
                u[] uVarArr = this.P;
                if (i11 < uVarArr.length) {
                    uVar = uVarArr[i11];
                }
            }
            if (uVar != null) {
                menu = uVar.f1218j;
            }
        }
        if ((uVar == null || uVar.f1223o) && !this.f1162g1) {
            this.f1161g.a().onPanelClosed(i11, menu);
        }
    }

    final int N0(l0 l0Var, Rect rect) {
        int i11;
        boolean z11;
        boolean z12;
        if (l0Var != null) {
            i11 = l0Var.m();
        } else {
            i11 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f1175p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z11 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1175p.getLayoutParams();
            if (this.f1175p.isShown()) {
                if (this.Q2 == null) {
                    this.Q2 = new Rect();
                    this.f1166i3 = new Rect();
                }
                Rect rect2 = this.Q2;
                Rect rect3 = this.f1166i3;
                if (l0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(l0Var.k(), l0Var.m(), l0Var.l(), l0Var.j());
                }
                a1.a(this.f1187z, rect2, rect3);
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                l0 M = androidx.core.view.a0.M(this.f1187z);
                int k11 = M == null ? 0 : M.k();
                int l11 = M == null ? 0 : M.l();
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z12 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z12 = true;
                }
                if (i12 > 0 && this.B == null) {
                    View view = new View(this.f1159e);
                    this.B = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = k11;
                    layoutParams.rightMargin = l11;
                    this.f1187z.addView(this.B, -1, layoutParams);
                } else {
                    View view2 = this.B;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != k11 || marginLayoutParams2.rightMargin != l11) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = k11;
                            marginLayoutParams2.rightMargin = l11;
                            this.B.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.B;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    O0(this.B);
                }
                if (!this.H && r5) {
                    i11 = 0;
                }
                z11 = r5;
                r5 = z12;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z11 = false;
            } else {
                z11 = false;
                r5 = false;
            }
            if (r5) {
                this.f1175p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.B;
        if (view4 != null) {
            view4.setVisibility(z11 ? 0 : 8);
        }
        return i11;
    }

    void O(androidx.appcompat.view.menu.e eVar) {
        if (this.O) {
            return;
        }
        this.O = true;
        this.f1171l.l();
        Window.Callback i02 = i0();
        if (i02 != null && !this.f1162g1) {
            i02.onPanelClosed(108, eVar);
        }
        this.O = false;
    }

    void Q(int i11) {
        R(g0(i11, true), true);
    }

    void R(u uVar, boolean z11) {
        ViewGroup viewGroup;
        a0 a0Var;
        if (z11 && uVar.f1209a == 0 && (a0Var = this.f1171l) != null && a0Var.f()) {
            O(uVar.f1218j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1159e.getSystemService("window");
        if (windowManager != null && uVar.f1223o && (viewGroup = uVar.f1215g) != null) {
            windowManager.removeView(viewGroup);
            if (z11) {
                N(uVar.f1209a, uVar, null);
            }
        }
        uVar.f1221m = false;
        uVar.f1222n = false;
        uVar.f1223o = false;
        uVar.f1216h = null;
        uVar.f1225q = true;
        if (this.Q == uVar) {
            this.Q = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View U(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.j r0 = r11.f1168j3
            r1 = 0
            if (r0 != 0) goto L55
            android.content.Context r0 = r11.f1159e
            int[] r2 = g.j.f27280u0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = g.j.f27300y0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            androidx.appcompat.app.j r0 = new androidx.appcompat.app.j
            r0.<init>()
            r11.f1168j3 = r0
            goto L55
        L1d:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.j r2 = (androidx.appcompat.app.j) r2     // Catch: java.lang.Throwable -> L32
            r11.f1168j3 = r2     // Catch: java.lang.Throwable -> L32
            goto L55
        L32:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.j r0 = new androidx.appcompat.app.j
            r0.<init>()
            r11.f1168j3 = r0
        L55:
            boolean r8 = androidx.appcompat.app.g.f1151m3
            r0 = 1
            if (r8 == 0) goto L85
            androidx.appcompat.app.k r2 = r11.f1170k3
            if (r2 != 0) goto L65
            androidx.appcompat.app.k r2 = new androidx.appcompat.app.k
            r2.<init>()
            r11.f1170k3 = r2
        L65:
            androidx.appcompat.app.k r2 = r11.f1170k3
            boolean r2 = r2.a(r15)
            if (r2 == 0) goto L6f
            r7 = r0
            goto L86
        L6f:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L7d
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L85
            goto L84
        L7d:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.H0(r0)
        L84:
            r1 = r0
        L85:
            r7 = r1
        L86:
            androidx.appcompat.app.j r2 = r11.f1168j3
            r9 = 1
            boolean r10 = androidx.appcompat.widget.z0.b()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.q(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.U(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    void V() {
        androidx.appcompat.view.menu.e eVar;
        a0 a0Var = this.f1171l;
        if (a0Var != null) {
            a0Var.l();
        }
        if (this.f1178q != null) {
            this.f1160f.getDecorView().removeCallbacks(this.f1179t);
            if (this.f1178q.isShowing()) {
                try {
                    this.f1178q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1178q = null;
        }
        Y();
        u g02 = g0(0, false);
        if (g02 == null || (eVar = g02.f1218j) == null) {
            return;
        }
        eVar.close();
    }

    boolean W(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1158d;
        if (((obj instanceof f.a) || (obj instanceof androidx.appcompat.app.h)) && (decorView = this.f1160f.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1161g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? s0(keyCode, keyEvent) : v0(keyCode, keyEvent);
    }

    void X(int i11) {
        u g02;
        u g03 = g0(i11, true);
        if (g03.f1218j != null) {
            Bundle bundle = new Bundle();
            g03.f1218j.Q(bundle);
            if (bundle.size() > 0) {
                g03.f1227s = bundle;
            }
            g03.f1218j.d0();
            g03.f1218j.clear();
        }
        g03.f1226r = true;
        g03.f1225q = true;
        if ((i11 != 108 && i11 != 0) || this.f1171l == null || (g02 = g0(0, false)) == null) {
            return;
        }
        g02.f1221m = false;
        D0(g02, null);
    }

    void Y() {
        g0 g0Var = this.f1180w;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u b02;
        Window.Callback i02 = i0();
        if (i02 == null || this.f1162g1 || (b02 = b0(eVar.D())) == null) {
            return false;
        }
        return i02.onMenuItemSelected(b02.f1209a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        E0(true);
    }

    u b0(Menu menu) {
        u[] uVarArr = this.P;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i11 = 0; i11 < length; i11++) {
            u uVar = uVarArr[i11];
            if (uVar != null && uVar.f1218j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ((ViewGroup) this.f1187z.findViewById(16908290)).addView(view, layoutParams);
        this.f1161g.a().onContentChanged();
    }

    final Context d0() {
        androidx.appcompat.app.a n11 = n();
        Context k11 = n11 != null ? n11.k() : null;
        return k11 == null ? this.f1159e : k11;
    }

    @Override // androidx.appcompat.app.f
    public Context f(Context context) {
        this.T = true;
        int q02 = q0(context, M());
        Configuration configuration = null;
        if (f1154p3 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, S(context, q02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof l.d) {
            try {
                ((l.d) context).a(S(context, q02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f1153o3) {
            return super.f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
            Configuration configuration3 = k.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = c0(configuration3, configuration4);
            }
        }
        Configuration S = S(context, q02, configuration);
        l.d dVar = new l.d(context, g.i.f27177c);
        dVar.a(S);
        boolean z11 = false;
        try {
            z11 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            h.e.a(dVar.getTheme());
        }
        return super.f(dVar);
    }

    protected u g0(int i11, boolean z11) {
        u[] uVarArr = this.P;
        if (uVarArr == null || uVarArr.length <= i11) {
            u[] uVarArr2 = new u[i11 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.P = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i11];
        if (uVar == null) {
            u uVar2 = new u(i11);
            uVarArr[i11] = uVar2;
            return uVar2;
        }
        return uVar;
    }

    final CharSequence h0() {
        Object obj = this.f1158d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f1169k;
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T i(int i11) {
        Z();
        return (T) this.f1160f.findViewById(i11);
    }

    final Window.Callback i0() {
        return this.f1160f.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public final androidx.appcompat.app.b k() {
        return new h(this);
    }

    @Override // androidx.appcompat.app.f
    public int l() {
        return this.f1176p1;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater m() {
        if (this.f1167j == null) {
            j0();
            androidx.appcompat.app.a aVar = this.f1165i;
            this.f1167j = new l.g(aVar != null ? aVar.k() : this.f1159e);
        }
        return this.f1167j;
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a n() {
        j0();
        return this.f1165i;
    }

    @Override // androidx.appcompat.app.f
    public void o() {
        LayoutInflater from = LayoutInflater.from(this.f1159e);
        if (from.getFactory() == null) {
            androidx.core.view.g.b(from, this);
        } else if (from.getFactory2() instanceof g) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return U(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public void p() {
        androidx.appcompat.app.a n11 = n();
        if (n11 == null || !n11.m()) {
            n0(0);
        }
    }

    public boolean p0() {
        return this.f1181x;
    }

    @Override // androidx.appcompat.app.f
    public void q(Configuration configuration) {
        androidx.appcompat.app.a n11;
        if (this.F && this.f1184y && (n11 = n()) != null) {
            n11.n(configuration);
        }
        androidx.appcompat.widget.i.b().g(this.f1159e);
        J(false);
    }

    int q0(Context context, int i11) {
        if (i11 != -100) {
            if (i11 != -1) {
                if (i11 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return f0(context).c();
                    }
                    return -1;
                } else if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        return e0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.f
    public void r(Bundle bundle) {
        this.T = true;
        J(false);
        a0();
        Object obj = this.f1158d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a B0 = B0();
                if (B0 == null) {
                    this.f1186y2 = true;
                } else {
                    B0.u(true);
                }
            }
            androidx.appcompat.app.f.c(this);
        }
        this.Y = true;
    }

    boolean r0() {
        l.b bVar = this.f1174o;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a n11 = n();
        return n11 != null && n11.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1158d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.y(r3)
        L9:
            boolean r0 = r3.f1163g2
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f1160f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f1183x2
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f1156b1 = r0
            r0 = 1
            r3.f1162g1 = r0
            int r0 = r3.f1176p1
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f1158d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.f1150l3
            java.lang.Object r1 = r3.f1158d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f1176p1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.f1150l3
            java.lang.Object r1 = r3.f1158d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.f1165i
            if (r0 == 0) goto L5e
            r0.o()
        L5e:
            r3.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.s():void");
    }

    boolean s0(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            this.R = (keyEvent.getFlags() & 128) != 0;
        } else if (i11 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void t(Bundle bundle) {
        Z();
    }

    @Override // androidx.appcompat.app.f
    public void u() {
        androidx.appcompat.app.a n11 = n();
        if (n11 != null) {
            n11.A(true);
        }
    }

    boolean u0(int i11, KeyEvent keyEvent) {
        androidx.appcompat.app.a n11 = n();
        if (n11 == null || !n11.p(i11, keyEvent)) {
            u uVar = this.Q;
            if (uVar != null && C0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                u uVar2 = this.Q;
                if (uVar2 != null) {
                    uVar2.f1222n = true;
                }
                return true;
            }
            if (this.Q == null) {
                u g02 = g0(0, true);
                D0(g02, keyEvent);
                boolean C0 = C0(g02, keyEvent.getKeyCode(), keyEvent, 1);
                g02.f1221m = false;
                if (C0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void v(Bundle bundle) {
    }

    boolean v0(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            boolean z11 = this.R;
            this.R = false;
            u g02 = g0(0, false);
            if (g02 != null && g02.f1223o) {
                if (!z11) {
                    R(g02, true);
                }
                return true;
            } else if (r0()) {
                return true;
            }
        } else if (i11 == 82) {
            w0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void w() {
        this.f1156b1 = true;
        I();
    }

    @Override // androidx.appcompat.app.f
    public void x() {
        this.f1156b1 = false;
        androidx.appcompat.app.a n11 = n();
        if (n11 != null) {
            n11.A(false);
        }
    }

    void x0(int i11) {
        androidx.appcompat.app.a n11;
        if (i11 != 108 || (n11 = n()) == null) {
            return;
        }
        n11.i(true);
    }

    void y0(int i11) {
        if (i11 == 108) {
            androidx.appcompat.app.a n11 = n();
            if (n11 != null) {
                n11.i(false);
            }
        } else if (i11 == 0) {
            u g02 = g0(i11, true);
            if (g02.f1223o) {
                R(g02, false);
            }
        }
    }

    void z0(ViewGroup viewGroup) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private g(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.collection.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.d K0;
        this.f1180w = null;
        this.f1181x = true;
        this.f1176p1 = -100;
        this.f1183x2 = new b();
        this.f1159e = context;
        this.f1164h = eVar;
        this.f1158d = obj;
        if (this.f1176p1 == -100 && (obj instanceof Dialog) && (K0 = K0()) != null) {
            this.f1176p1 = K0.getDelegate().l();
        }
        if (this.f1176p1 == -100 && (num = (gVar = f1150l3).get(obj.getClass().getName())) != null) {
            this.f1176p1 = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            L(window);
        }
        androidx.appcompat.widget.i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class o extends l.i {
        o(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f1159e, callback);
            l.b H = g.this.H(aVar);
            if (H != null) {
                return aVar.e(H);
            }
            return null;
        }

        @Override // l.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // l.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.u0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // l.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // l.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i11, Menu menu) {
            if (i11 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i11, menu);
            }
            return false;
        }

        @Override // l.i, android.view.Window.Callback
        public boolean onMenuOpened(int i11, Menu menu) {
            super.onMenuOpened(i11, menu);
            g.this.x0(i11);
            return true;
        }

        @Override // l.i, android.view.Window.Callback
        public void onPanelClosed(int i11, Menu menu) {
            super.onPanelClosed(i11, menu);
            g.this.y0(i11);
        }

        @Override // l.i, android.view.Window.Callback
        public boolean onPreparePanel(int i11, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i11 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i11, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // l.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i11) {
            androidx.appcompat.view.menu.e eVar;
            u g02 = g.this.g0(0, true);
            if (g02 != null && (eVar = g02.f1218j) != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i11);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i11);
            }
        }

        @Override // l.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (g.this.p0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // l.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
            if (g.this.p0() && i11 == 0) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback, i11);
        }
    }
}