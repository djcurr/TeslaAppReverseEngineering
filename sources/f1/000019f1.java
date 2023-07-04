package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.r0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class y0 {
    private static final String A = "y0";

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.uimanager.m f12412b;

    /* renamed from: e  reason: collision with root package name */
    private final j f12415e;

    /* renamed from: f  reason: collision with root package name */
    private final ReactApplicationContext f12416f;

    /* renamed from: k  reason: collision with root package name */
    private pg.a f12421k;

    /* renamed from: o  reason: collision with root package name */
    private long f12425o;

    /* renamed from: p  reason: collision with root package name */
    private long f12426p;

    /* renamed from: q  reason: collision with root package name */
    private long f12427q;

    /* renamed from: r  reason: collision with root package name */
    private long f12428r;

    /* renamed from: s  reason: collision with root package name */
    private long f12429s;

    /* renamed from: t  reason: collision with root package name */
    private long f12430t;

    /* renamed from: u  reason: collision with root package name */
    private long f12431u;

    /* renamed from: v  reason: collision with root package name */
    private long f12432v;

    /* renamed from: w  reason: collision with root package name */
    private long f12433w;

    /* renamed from: x  reason: collision with root package name */
    private long f12434x;

    /* renamed from: y  reason: collision with root package name */
    private long f12435y;

    /* renamed from: z  reason: collision with root package name */
    private long f12436z;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f12411a = new int[4];

    /* renamed from: c  reason: collision with root package name */
    private final Object f12413c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f12414d = new Object();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<h> f12417g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<u> f12418h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Runnable> f12419i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayDeque<u> f12420j = new ArrayDeque<>();

    /* renamed from: l  reason: collision with root package name */
    private boolean f12422l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12423m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12424n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f12438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayDeque f12439c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f12440d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f12441e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f12442f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f12443g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f12444h;

        a(int i11, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j11, long j12, long j13, long j14) {
            this.f12437a = i11;
            this.f12438b = arrayList;
            this.f12439c = arrayDeque;
            this.f12440d = arrayList2;
            this.f12441e = j11;
            this.f12442f = j12;
            this.f12443g = j13;
            this.f12444h = j14;
        }

        @Override // java.lang.Runnable
        public void run() {
            zg.a.a(0L, "DispatchUI").a("BatchId", this.f12437a).c();
            try {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ArrayList arrayList = this.f12438b;
                    if (arrayList != null) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            h hVar = (h) it2.next();
                            try {
                                hVar.c();
                            } catch (RetryableMountingLayerException e11) {
                                if (hVar.a() == 0) {
                                    hVar.b();
                                    y0.this.f12417g.add(hVar);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(y0.A, new ReactNoCrashSoftException(e11));
                                }
                            } catch (Throwable th2) {
                                ReactSoftExceptionLogger.logSoftException(y0.A, th2);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.f12439c;
                    if (arrayDeque != null) {
                        Iterator it3 = arrayDeque.iterator();
                        while (it3.hasNext()) {
                            ((u) it3.next()).execute();
                        }
                    }
                    ArrayList arrayList2 = this.f12440d;
                    if (arrayList2 != null) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            ((u) it4.next()).execute();
                        }
                    }
                    if (y0.this.f12424n && y0.this.f12426p == 0) {
                        y0.this.f12426p = this.f12441e;
                        y0.this.f12427q = SystemClock.uptimeMillis();
                        y0.this.f12428r = this.f12442f;
                        y0.this.f12429s = this.f12443g;
                        y0.this.f12430t = uptimeMillis;
                        y0 y0Var = y0.this;
                        y0Var.f12431u = y0Var.f12427q;
                        y0.this.f12434x = this.f12444h;
                        com.facebook.systrace.a.b(0L, "delayBeforeDispatchViewUpdates", 0, y0.this.f12426p * 1000000);
                        com.facebook.systrace.a.f(0L, "delayBeforeDispatchViewUpdates", 0, y0.this.f12429s * 1000000);
                        com.facebook.systrace.a.b(0L, "delayBeforeBatchRunStart", 0, y0.this.f12429s * 1000000);
                        com.facebook.systrace.a.f(0L, "delayBeforeBatchRunStart", 0, y0.this.f12430t * 1000000);
                    }
                    y0.this.f12412b.clearLayoutAnimation();
                    if (y0.this.f12421k != null) {
                        y0.this.f12421k.a();
                    }
                } catch (Exception e12) {
                    y0.this.f12423m = true;
                    throw e12;
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            y0.this.T();
        }
    }

    /* loaded from: classes3.dex */
    private final class c extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int f12447b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f12448c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f12449d;

        public c(int i11, int i12, boolean z11, boolean z12) {
            super(y0.this, i11);
            this.f12447b = i12;
            this.f12449d = z11;
            this.f12448c = z12;
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            if (!this.f12449d) {
                y0.this.f12412b.setJSResponder(this.f12507a, this.f12447b, this.f12448c);
            } else {
                y0.this.f12412b.clearJSResponder();
            }
        }
    }

    /* loaded from: classes3.dex */
    private class d implements u {

        /* renamed from: a  reason: collision with root package name */
        private final ReadableMap f12451a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f12452b;

        /* synthetic */ d(y0 y0Var, ReadableMap readableMap, Callback callback, a aVar) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.configureLayoutAnimation(this.f12451a, this.f12452b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.f12451a = readableMap;
            this.f12452b = callback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class e extends y {

        /* renamed from: b  reason: collision with root package name */
        private final n0 f12454b;

        /* renamed from: c  reason: collision with root package name */
        private final String f12455c;

        /* renamed from: d  reason: collision with root package name */
        private final e0 f12456d;

        public e(n0 n0Var, int i11, String str, e0 e0Var) {
            super(y0.this, i11);
            this.f12454b = n0Var;
            this.f12455c = str;
            this.f12456d = e0Var;
            com.facebook.systrace.a.j(0L, "createView", this.f12507a);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            com.facebook.systrace.a.d(0L, "createView", this.f12507a);
            y0.this.f12412b.createView(this.f12454b, this.f12507a, this.f12455c, this.f12456d);
        }
    }

    /* loaded from: classes3.dex */
    private final class f implements u {
        private f() {
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.dismissPopupMenu();
        }

        /* synthetic */ f(y0 y0Var, a aVar) {
            this();
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    private final class g extends y implements h {

        /* renamed from: b  reason: collision with root package name */
        private final int f12459b;

        /* renamed from: c  reason: collision with root package name */
        private final ReadableArray f12460c;

        /* renamed from: d  reason: collision with root package name */
        private int f12461d;

        public g(int i11, int i12, ReadableArray readableArray) {
            super(y0.this, i11);
            this.f12461d = 0;
            this.f12459b = i12;
            this.f12460c = readableArray;
        }

        @Override // com.facebook.react.uimanager.y0.h
        public int a() {
            return this.f12461d;
        }

        @Override // com.facebook.react.uimanager.y0.h
        public void b() {
            this.f12461d++;
        }

        @Override // com.facebook.react.uimanager.y0.h
        public void c() {
            y0.this.f12412b.dispatchCommand(this.f12507a, this.f12459b, this.f12460c);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            try {
                y0.this.f12412b.dispatchCommand(this.f12507a, this.f12459b, this.f12460c);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(y0.A, new RuntimeException("Error dispatching View Command", th2));
            }
        }
    }

    /* loaded from: classes3.dex */
    private interface h {
        int a();

        void b();

        void c();
    }

    /* loaded from: classes3.dex */
    private final class i extends y implements h {

        /* renamed from: b  reason: collision with root package name */
        private final String f12463b;

        /* renamed from: c  reason: collision with root package name */
        private final ReadableArray f12464c;

        /* renamed from: d  reason: collision with root package name */
        private int f12465d;

        public i(int i11, String str, ReadableArray readableArray) {
            super(y0.this, i11);
            this.f12465d = 0;
            this.f12463b = str;
            this.f12464c = readableArray;
        }

        @Override // com.facebook.react.uimanager.y0.h
        public int a() {
            return this.f12465d;
        }

        @Override // com.facebook.react.uimanager.y0.h
        public void b() {
            this.f12465d++;
        }

        @Override // com.facebook.react.uimanager.y0.h
        public void c() {
            y0.this.f12412b.dispatchCommand(this.f12507a, this.f12463b, this.f12464c);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            try {
                y0.this.f12412b.dispatchCommand(this.f12507a, this.f12463b, this.f12464c);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(y0.A, new RuntimeException("Error dispatching View Command", th2));
            }
        }
    }

    /* loaded from: classes3.dex */
    private class j extends com.facebook.react.uimanager.f {

        /* renamed from: a  reason: collision with root package name */
        private final int f12467a;

        /* synthetic */ j(y0 y0Var, ReactContext reactContext, int i11, a aVar) {
            this(reactContext, i11);
        }

        private void a(long j11) {
            u uVar;
            while (16 - ((System.nanoTime() - j11) / 1000000) >= this.f12467a) {
                synchronized (y0.this.f12414d) {
                    if (y0.this.f12420j.isEmpty()) {
                        return;
                    }
                    uVar = (u) y0.this.f12420j.pollFirst();
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    uVar.execute();
                    y0.v(y0.this, SystemClock.uptimeMillis() - uptimeMillis);
                } catch (Exception e11) {
                    y0.this.f12423m = true;
                    throw e11;
                }
            }
        }

        @Override // com.facebook.react.uimanager.f
        public void doFrameGuarded(long j11) {
            if (y0.this.f12423m) {
                nd.a.G("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            com.facebook.systrace.a.c(0L, "dispatchNonBatchedUIOperations");
            try {
                a(j11);
                com.facebook.systrace.a.g(0L);
                y0.this.T();
                com.facebook.react.modules.core.g.i().m(g.c.DISPATCH_UI, this);
            } catch (Throwable th2) {
                com.facebook.systrace.a.g(0L);
                throw th2;
            }
        }

        private j(ReactContext reactContext, int i11) {
            super(reactContext);
            this.f12467a = i11;
        }
    }

    /* loaded from: classes3.dex */
    private final class k implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f12469a;

        /* renamed from: b  reason: collision with root package name */
        private final float f12470b;

        /* renamed from: c  reason: collision with root package name */
        private final float f12471c;

        /* renamed from: d  reason: collision with root package name */
        private final Callback f12472d;

        /* synthetic */ k(y0 y0Var, int i11, float f11, float f12, Callback callback, a aVar) {
            this(i11, f11, f12, callback);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            try {
                y0.this.f12412b.measure(this.f12469a, y0.this.f12411a);
                float f11 = y0.this.f12411a[0];
                float f12 = y0.this.f12411a[1];
                int findTargetTagForTouch = y0.this.f12412b.findTargetTagForTouch(this.f12469a, this.f12470b, this.f12471c);
                try {
                    y0.this.f12412b.measure(findTargetTagForTouch, y0.this.f12411a);
                    this.f12472d.invoke(Integer.valueOf(findTargetTagForTouch), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[0] - f11)), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[1] - f12)), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[2])), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[3])));
                } catch (IllegalViewOperationException unused) {
                    this.f12472d.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.f12472d.invoke(new Object[0]);
            }
        }

        private k(int i11, float f11, float f12, Callback callback) {
            this.f12469a = i11;
            this.f12470b = f11;
            this.f12471c = f12;
            this.f12472d = callback;
        }
    }

    /* loaded from: classes3.dex */
    private final class l implements u {

        /* renamed from: a  reason: collision with root package name */
        private final c0 f12474a;

        /* renamed from: b  reason: collision with root package name */
        private final r0.b f12475b;

        /* synthetic */ l(y0 y0Var, c0 c0Var, r0.b bVar, a aVar) {
            this(y0Var, c0Var, bVar);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            this.f12475b.a(this.f12474a);
        }

        private l(y0 y0Var, c0 c0Var, r0.b bVar) {
            this.f12474a = c0Var;
            this.f12475b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class m extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f12476b;

        /* renamed from: c  reason: collision with root package name */
        private final z0[] f12477c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f12478d;

        public m(int i11, int[] iArr, z0[] z0VarArr, int[] iArr2) {
            super(y0.this, i11);
            this.f12476b = iArr;
            this.f12477c = z0VarArr;
            this.f12478d = iArr2;
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.manageChildren(this.f12507a, this.f12476b, this.f12477c, this.f12478d);
        }
    }

    /* loaded from: classes3.dex */
    private final class n implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f12480a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f12481b;

        /* synthetic */ n(y0 y0Var, int i11, Callback callback, a aVar) {
            this(i11, callback);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            try {
                y0.this.f12412b.measureInWindow(this.f12480a, y0.this.f12411a);
                this.f12481b.invoke(Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[0])), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[1])), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[2])), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[3])));
            } catch (NoSuchNativeViewException unused) {
                this.f12481b.invoke(new Object[0]);
            }
        }

        private n(int i11, Callback callback) {
            this.f12480a = i11;
            this.f12481b = callback;
        }
    }

    /* loaded from: classes3.dex */
    private final class o implements u {

        /* renamed from: a  reason: collision with root package name */
        private final int f12483a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f12484b;

        /* synthetic */ o(y0 y0Var, int i11, Callback callback, a aVar) {
            this(i11, callback);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            try {
                y0.this.f12412b.measure(this.f12483a, y0.this.f12411a);
                float a11 = com.facebook.react.uimanager.p.a(y0.this.f12411a[0]);
                float a12 = com.facebook.react.uimanager.p.a(y0.this.f12411a[1]);
                this.f12484b.invoke(0, 0, Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[2])), Float.valueOf(com.facebook.react.uimanager.p.a(y0.this.f12411a[3])), Float.valueOf(a11), Float.valueOf(a12));
            } catch (NoSuchNativeViewException unused) {
                this.f12484b.invoke(new Object[0]);
            }
        }

        private o(int i11, Callback callback) {
            this.f12483a = i11;
            this.f12484b = callback;
        }
    }

    /* loaded from: classes3.dex */
    private final class p extends y {
        public p(int i11) {
            super(y0.this, i11);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.removeRootView(this.f12507a);
        }
    }

    /* loaded from: classes3.dex */
    private final class q extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int f12487b;

        /* synthetic */ q(y0 y0Var, int i11, int i12, a aVar) {
            this(i11, i12);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.sendAccessibilityEvent(this.f12507a, this.f12487b);
        }

        private q(int i11, int i12) {
            super(y0.this, i11);
            this.f12487b = i12;
        }
    }

    /* loaded from: classes3.dex */
    private class r implements u {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f12489a;

        /* synthetic */ r(y0 y0Var, boolean z11, a aVar) {
            this(z11);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.setLayoutAnimationEnabled(this.f12489a);
        }

        private r(boolean z11) {
            this.f12489a = z11;
        }
    }

    /* loaded from: classes3.dex */
    private final class s extends y {

        /* renamed from: b  reason: collision with root package name */
        private final ReadableArray f12491b;

        /* renamed from: c  reason: collision with root package name */
        private final Callback f12492c;

        /* renamed from: d  reason: collision with root package name */
        private final Callback f12493d;

        public s(int i11, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(y0.this, i11);
            this.f12491b = readableArray;
            this.f12492c = callback;
            this.f12493d = callback2;
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.showPopupMenu(this.f12507a, this.f12491b, this.f12493d, this.f12492c);
        }
    }

    /* loaded from: classes3.dex */
    private class t implements u {

        /* renamed from: a  reason: collision with root package name */
        private final q0 f12495a;

        public t(q0 q0Var) {
            this.f12495a = q0Var;
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            this.f12495a.execute(y0.this.f12412b);
        }
    }

    /* loaded from: classes3.dex */
    public interface u {
        void execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class v extends y {

        /* renamed from: b  reason: collision with root package name */
        private final int f12497b;

        /* renamed from: c  reason: collision with root package name */
        private final int f12498c;

        /* renamed from: d  reason: collision with root package name */
        private final int f12499d;

        /* renamed from: e  reason: collision with root package name */
        private final int f12500e;

        /* renamed from: f  reason: collision with root package name */
        private final int f12501f;

        public v(int i11, int i12, int i13, int i14, int i15, int i16) {
            super(y0.this, i12);
            this.f12497b = i11;
            this.f12498c = i13;
            this.f12499d = i14;
            this.f12500e = i15;
            this.f12501f = i16;
            com.facebook.systrace.a.j(0L, "updateLayout", this.f12507a);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            com.facebook.systrace.a.d(0L, "updateLayout", this.f12507a);
            y0.this.f12412b.updateLayout(this.f12497b, this.f12507a, this.f12498c, this.f12499d, this.f12500e, this.f12501f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class w extends y {

        /* renamed from: b  reason: collision with root package name */
        private final e0 f12503b;

        /* synthetic */ w(y0 y0Var, int i11, e0 e0Var, a aVar) {
            this(i11, e0Var);
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.updateProperties(this.f12507a, this.f12503b);
        }

        private w(int i11, e0 e0Var) {
            super(y0.this, i11);
            this.f12503b = e0Var;
        }
    }

    /* loaded from: classes3.dex */
    private final class x extends y {

        /* renamed from: b  reason: collision with root package name */
        private final Object f12505b;

        public x(int i11, Object obj) {
            super(y0.this, i11);
            this.f12505b = obj;
        }

        @Override // com.facebook.react.uimanager.y0.u
        public void execute() {
            y0.this.f12412b.updateViewExtraData(this.f12507a, this.f12505b);
        }
    }

    /* loaded from: classes3.dex */
    private abstract class y implements u {

        /* renamed from: a  reason: collision with root package name */
        public int f12507a;

        public y(y0 y0Var, int i11) {
            this.f12507a = i11;
        }
    }

    public y0(ReactApplicationContext reactApplicationContext, com.facebook.react.uimanager.m mVar, int i11) {
        this.f12412b = mVar;
        this.f12415e = new j(this, reactApplicationContext, i11 == -1 ? 8 : i11, null);
        this.f12416f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f12423m) {
            nd.a.G("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f12413c) {
            if (this.f12419i.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.f12419i;
            this.f12419i = new ArrayList<>();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
            if (this.f12424n) {
                this.f12432v = SystemClock.uptimeMillis() - uptimeMillis;
                this.f12433w = this.f12425o;
                this.f12424n = false;
                com.facebook.systrace.a.b(0L, "batchedExecutionTime", 0, 1000000 * uptimeMillis);
                com.facebook.systrace.a.e(0L, "batchedExecutionTime", 0);
            }
            this.f12425o = 0L;
        }
    }

    static /* synthetic */ long v(y0 y0Var, long j11) {
        long j12 = y0Var.f12425o + j11;
        y0Var.f12425o = j12;
        return j12;
    }

    public void A(ReadableMap readableMap, Callback callback) {
        this.f12418h.add(new d(this, readableMap, callback, null));
    }

    public void B(n0 n0Var, int i11, String str, e0 e0Var) {
        synchronized (this.f12414d) {
            this.f12435y++;
            this.f12420j.addLast(new e(n0Var, i11, str, e0Var));
        }
    }

    public void C() {
        this.f12418h.add(new f(this, null));
    }

    @Deprecated
    public void D(int i11, int i12, ReadableArray readableArray) {
        this.f12417g.add(new g(i11, i12, readableArray));
    }

    public void E(int i11, String str, ReadableArray readableArray) {
        this.f12417g.add(new i(i11, str, readableArray));
    }

    public void F(int i11, float f11, float f12, Callback callback) {
        this.f12418h.add(new k(this, i11, f11, f12, callback, null));
    }

    public void G(c0 c0Var, r0.b bVar) {
        this.f12418h.add(new l(this, c0Var, bVar, null));
    }

    public void H(int i11, int[] iArr, z0[] z0VarArr, int[] iArr2) {
        this.f12418h.add(new m(i11, iArr, z0VarArr, iArr2));
    }

    public void I(int i11, Callback callback) {
        this.f12418h.add(new o(this, i11, callback, null));
    }

    public void J(int i11, Callback callback) {
        this.f12418h.add(new n(this, i11, callback, null));
    }

    public void K(int i11) {
        this.f12418h.add(new p(i11));
    }

    public void L(int i11, int i12) {
        this.f12418h.add(new q(this, i11, i12, null));
    }

    public void M(int i11, int i12, boolean z11) {
        this.f12418h.add(new c(i11, i12, false, z11));
    }

    public void N(boolean z11) {
        this.f12418h.add(new r(this, z11, null));
    }

    public void O(int i11, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.f12418h.add(new s(i11, readableArray, callback, callback2));
    }

    public void P(q0 q0Var) {
        this.f12418h.add(new t(q0Var));
    }

    public void Q(int i11, Object obj) {
        this.f12418h.add(new x(i11, obj));
    }

    public void R(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f12418h.add(new v(i11, i12, i13, i14, i15, i16));
    }

    public void S(int i11, String str, e0 e0Var) {
        this.f12436z++;
        this.f12418h.add(new w(this, i11, e0Var, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.react.uimanager.m U() {
        return this.f12412b;
    }

    public Map<String, Long> V() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f12426p));
        hashMap.put("CommitEndTime", Long.valueOf(this.f12427q));
        hashMap.put("LayoutTime", Long.valueOf(this.f12428r));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f12429s));
        hashMap.put("RunStartTime", Long.valueOf(this.f12430t));
        hashMap.put("RunEndTime", Long.valueOf(this.f12431u));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f12432v));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f12433w));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.f12434x));
        hashMap.put("CreateViewCount", Long.valueOf(this.f12435y));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.f12436z));
        return hashMap;
    }

    public boolean W() {
        return this.f12418h.isEmpty() && this.f12417g.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        this.f12422l = false;
        com.facebook.react.modules.core.g.i().o(g.c.DISPATCH_UI, this.f12415e);
        T();
    }

    public void Y(q0 q0Var) {
        this.f12418h.add(0, new t(q0Var));
    }

    public void Z() {
        this.f12424n = true;
        this.f12426p = 0L;
        this.f12435y = 0L;
        this.f12436z = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0() {
        this.f12422l = true;
        com.facebook.react.modules.core.g.i().m(g.c.DISPATCH_UI, this.f12415e);
    }

    public void b0(pg.a aVar) {
        this.f12421k = aVar;
    }

    public void x(int i11, View view) {
        this.f12412b.addRootView(i11, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public void y(int i11, long j11, long j12) {
        long j13;
        ArrayList<h> arrayList;
        ArrayList<u> arrayList2;
        ArrayDeque<u> arrayDeque;
        zg.a.a(0L, "UIViewOperationQueue.dispatchViewUpdates").a("batchId", i11).c();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            j13 = 0;
            ArrayDeque<u> arrayDeque2 = null;
            if (this.f12417g.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList<h> arrayList3 = this.f12417g;
                this.f12417g = new ArrayList<>();
                arrayList = arrayList3;
            }
            if (this.f12418h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<u> arrayList4 = this.f12418h;
                this.f12418h = new ArrayList<>();
                arrayList2 = arrayList4;
            }
            synchronized (this.f12414d) {
                try {
                    if (!this.f12420j.isEmpty()) {
                        arrayDeque2 = this.f12420j;
                        this.f12420j = new ArrayDeque<>();
                    }
                    arrayDeque = arrayDeque2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            pg.a aVar = this.f12421k;
            if (aVar != null) {
                aVar.b();
            }
            try {
                a aVar2 = new a(i11, arrayList, arrayDeque, arrayList2, j11, j12, uptimeMillis, currentThreadTimeMillis);
                j13 = 0;
                zg.a.a(0L, "acquiring mDispatchRunnablesLock").a("batchId", i11).c();
                synchronized (this.f12413c) {
                    com.facebook.systrace.a.g(0L);
                    this.f12419i.add(aVar2);
                }
                if (!this.f12422l) {
                    UiThreadUtil.runOnUiThread(new b(this.f12416f));
                }
                com.facebook.systrace.a.g(0L);
            } catch (Throwable th3) {
                th = th3;
                j13 = 0;
                com.facebook.systrace.a.g(j13);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j13 = 0;
        }
    }

    public void z() {
        this.f12418h.add(new c(0, 0, true, false));
    }
}