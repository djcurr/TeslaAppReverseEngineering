package s2;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public final class f0 implements v {

    /* renamed from: a */
    private final View f50074a;

    /* renamed from: b */
    private final o f50075b;

    /* renamed from: c */
    private boolean f50076c;

    /* renamed from: d */
    private h00.l<? super List<? extends s2.d>, vz.b0> f50077d;

    /* renamed from: e */
    private h00.l<? super l, vz.b0> f50078e;

    /* renamed from: f */
    private a0 f50079f;

    /* renamed from: g */
    private m f50080g;

    /* renamed from: h */
    private w f50081h;

    /* renamed from: i */
    private final vz.k f50082i;

    /* renamed from: j */
    private Rect f50083j;

    /* renamed from: k */
    private final x20.e<Boolean> f50084k;

    /* renamed from: l */
    private final ViewTreeObserver.OnGlobalLayoutListener f50085l;

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
            f0.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            View rootView;
            ViewTreeObserver viewTreeObserver;
            if (view == null || (rootView = view.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(f0.this.f50085l);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            View rootView;
            ViewTreeObserver viewTreeObserver;
            if (view == null || (rootView = view.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(f0.this.f50085l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<BaseInputConnection> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            f0.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(f0.this.o(), false);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements n {
        c() {
            f0.this = r1;
        }

        @Override // s2.n
        public void a(KeyEvent event) {
            kotlin.jvm.internal.s.g(event, "event");
            f0.this.n().sendKeyEvent(event);
        }

        @Override // s2.n
        public void b(int i11) {
            f0.this.f50078e.invoke(l.i(i11));
        }

        @Override // s2.n
        public void c(List<? extends s2.d> editCommands) {
            kotlin.jvm.internal.s.g(editCommands, "editCommands");
            f0.this.f50077d.invoke(editCommands);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256}, m = "keyboardVisibilityEventLoop")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f50089a;

        /* renamed from: b */
        Object f50090b;

        /* renamed from: c */
        /* synthetic */ Object f50091c;

        /* renamed from: e */
        int f50093e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(zz.d<? super d> dVar) {
            super(dVar);
            f0.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50091c = obj;
            this.f50093e |= Integer.MIN_VALUE;
            return f0.this.q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<List<? extends s2.d>, vz.b0> {

        /* renamed from: a */
        public static final e f50094a = new e();

        e() {
            super(1);
        }

        public final void a(List<? extends s2.d> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(List<? extends s2.d> list) {
            a(list);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<l, vz.b0> {

        /* renamed from: a */
        public static final f f50095a = new f();

        f() {
            super(1);
        }

        public final void a(int i11) {
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l lVar) {
            a(lVar.o());
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class g extends kotlin.jvm.internal.u implements h00.l<List<? extends s2.d>, vz.b0> {

        /* renamed from: a */
        public static final g f50096a = new g();

        g() {
            super(1);
        }

        public final void a(List<? extends s2.d> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(List<? extends s2.d> list) {
            a(list);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class h extends kotlin.jvm.internal.u implements h00.l<l, vz.b0> {

        /* renamed from: a */
        public static final h f50097a = new h();

        h() {
            super(1);
        }

        public final void a(int i11) {
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l lVar) {
            a(lVar.o());
            return vz.b0.f54756a;
        }
    }

    public f0(View view, o inputMethodManager) {
        vz.k b11;
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(inputMethodManager, "inputMethodManager");
        this.f50074a = view;
        this.f50075b = inputMethodManager;
        this.f50077d = e.f50094a;
        this.f50078e = f.f50095a;
        this.f50079f = new a0("", n2.y.f40417b.a(), (n2.y) null, 4, (DefaultConstructorMarker) null);
        this.f50080g = m.f50125f.a();
        b11 = vz.m.b(kotlin.b.NONE, new b());
        this.f50082i = b11;
        this.f50084k = x20.h.b(-1, null, null, 6, null);
        this.f50085l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s2.d0
            {
                f0.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                f0.h(f0.this);
            }
        };
        view.addOnAttachStateChangeListener(new a());
    }

    public static /* synthetic */ void g(f0 f0Var) {
        t(f0Var);
    }

    public static /* synthetic */ void h(f0 f0Var) {
        r(f0Var);
    }

    public final BaseInputConnection n() {
        return (BaseInputConnection) this.f50082i.getValue();
    }

    public static final void r(f0 this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        Rect rect = this$0.f50083j;
        if (rect == null) {
            return;
        }
        this$0.o().requestRectangleOnScreen(new Rect(rect));
    }

    private final void s() {
        this.f50075b.e(this.f50074a);
    }

    public static final void t(f0 this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.s();
        this$0.e();
    }

    @Override // s2.v
    public void a(a0 a0Var, a0 newValue) {
        kotlin.jvm.internal.s.g(newValue, "newValue");
        boolean z11 = true;
        boolean z12 = !n2.y.g(this.f50079f.g(), newValue.g());
        this.f50079f = newValue;
        w wVar = this.f50081h;
        if (wVar != null) {
            wVar.f(newValue);
        }
        if (kotlin.jvm.internal.s.c(a0Var, newValue)) {
            if (z12) {
                o oVar = this.f50075b;
                View view = this.f50074a;
                int l11 = n2.y.l(newValue.g());
                int k11 = n2.y.k(newValue.g());
                n2.y f11 = this.f50079f.f();
                int l12 = f11 == null ? -1 : n2.y.l(f11.r());
                n2.y f12 = this.f50079f.f();
                oVar.b(view, l11, k11, l12, f12 == null ? -1 : n2.y.k(f12.r()));
                return;
            }
            return;
        }
        boolean z13 = false;
        if (a0Var != null) {
            if (kotlin.jvm.internal.s.c(a0Var.h(), newValue.h()) && (!n2.y.g(a0Var.g(), newValue.g()) || kotlin.jvm.internal.s.c(a0Var.f(), newValue.f()))) {
                z11 = false;
            }
            z13 = z11;
        }
        if (z13) {
            s();
            return;
        }
        w wVar2 = this.f50081h;
        if (wVar2 == null) {
            return;
        }
        wVar2.g(this.f50079f, this.f50075b, this.f50074a);
    }

    @Override // s2.v
    public void b() {
        this.f50076c = false;
        this.f50077d = g.f50096a;
        this.f50078e = h.f50097a;
        this.f50083j = null;
        s();
        this.f50076c = false;
    }

    @Override // s2.v
    public void c(s1.h rect) {
        int c11;
        int c12;
        int c13;
        int c14;
        kotlin.jvm.internal.s.g(rect, "rect");
        c11 = j00.c.c(rect.i());
        c12 = j00.c.c(rect.l());
        c13 = j00.c.c(rect.j());
        c14 = j00.c.c(rect.e());
        Rect rect2 = new Rect(c11, c12, c13, c14);
        this.f50083j = rect2;
        if (this.f50081h == null) {
            o().requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // s2.v
    public void d() {
        this.f50084k.d(Boolean.FALSE);
    }

    @Override // s2.v
    public void e() {
        this.f50084k.d(Boolean.TRUE);
    }

    @Override // s2.v
    public void f(a0 value, m imeOptions, h00.l<? super List<? extends s2.d>, vz.b0> onEditCommand, h00.l<? super l, vz.b0> onImeActionPerformed) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(imeOptions, "imeOptions");
        kotlin.jvm.internal.s.g(onEditCommand, "onEditCommand");
        kotlin.jvm.internal.s.g(onImeActionPerformed, "onImeActionPerformed");
        this.f50076c = true;
        this.f50079f = value;
        this.f50080g = imeOptions;
        this.f50077d = onEditCommand;
        this.f50078e = onImeActionPerformed;
        this.f50074a.post(new Runnable() { // from class: s2.e0
            {
                f0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0.g(f0.this);
            }
        });
    }

    public final InputConnection m(EditorInfo outAttrs) {
        kotlin.jvm.internal.s.g(outAttrs, "outAttrs");
        if (this.f50076c) {
            g0.b(outAttrs, this.f50080g, this.f50079f);
            w wVar = new w(this.f50079f, new c(), this.f50080g.b());
            this.f50081h = wVar;
            return wVar;
        }
        return null;
    }

    public final View o() {
        return this.f50074a;
    }

    public final boolean p() {
        return this.f50076c;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x004e -> B:47:0x0051). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(zz.d<? super vz.b0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof s2.f0.d
            if (r0 == 0) goto L13
            r0 = r7
            s2.f0$d r0 = (s2.f0.d) r0
            int r1 = r0.f50093e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50093e = r1
            goto L18
        L13:
            s2.f0$d r0 = new s2.f0$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f50091c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f50093e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f50090b
            x20.g r2 = (x20.g) r2
            java.lang.Object r4 = r0.f50089a
            s2.f0 r4 = (s2.f0) r4
            vz.r.b(r7)
            goto L51
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            vz.r.b(r7)
            x20.e<java.lang.Boolean> r7 = r6.f50084k
            x20.g r7 = r7.iterator()
            r4 = r6
            r2 = r7
        L44:
            r0.f50089a = r4
            r0.f50090b = r2
            r0.f50093e = r3
            java.lang.Object r7 = r2.a(r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L90
            java.lang.Object r7 = r2.next()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            x20.e<java.lang.Boolean> r5 = r4.f50084k
            java.lang.Object r5 = r5.l()
            java.lang.Object r5 = x20.i.f(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 != 0) goto L72
            goto L76
        L72:
            boolean r7 = r5.booleanValue()
        L76:
            if (r7 == 0) goto L82
            s2.o r7 = r4.f50075b
            android.view.View r5 = r4.o()
            r7.c(r5)
            goto L44
        L82:
            s2.o r7 = r4.f50075b
            android.view.View r5 = r4.o()
            android.os.IBinder r5 = r5.getWindowToken()
            r7.a(r5)
            goto L44
        L90:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.f0.q(zz.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f0(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.s.g(r4, r0)
            s2.p r0 = new s2.p
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "view.context"
            kotlin.jvm.internal.s.f(r1, r2)
            r0.<init>(r1)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.f0.<init>(android.view.View):void");
    }
}