package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class b extends a.AbstractC0228a {

    /* renamed from: a  reason: collision with root package name */
    private com.facebook.react.modules.core.a f11990a;

    /* renamed from: b  reason: collision with root package name */
    private final ReactContext f11991b;

    /* renamed from: c  reason: collision with root package name */
    private final UIManagerModule f11992c;

    /* renamed from: m  reason: collision with root package name */
    private TreeMap<Long, C0231b> f12002m;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11994e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f11995f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f11996g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f11997h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f11998i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f11999j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f12000k = 0;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12001l = false;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.react.modules.debug.a f11993d = new com.facebook.react.modules.debug.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12003a;

        a(b bVar) {
            this.f12003a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f11990a = com.facebook.react.modules.core.a.d();
            b.this.f11990a.e(this.f12003a);
        }
    }

    /* renamed from: com.facebook.react.modules.debug.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0231b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12005a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12006b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12007c;

        /* renamed from: d  reason: collision with root package name */
        public final double f12008d;

        /* renamed from: e  reason: collision with root package name */
        public final double f12009e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12010f;

        public C0231b(int i11, int i12, int i13, int i14, double d11, double d12, int i15) {
            this.f12005a = i11;
            this.f12006b = i12;
            this.f12007c = i13;
            this.f12008d = d11;
            this.f12009e = d12;
            this.f12010f = i15;
        }
    }

    public b(ReactContext reactContext) {
        this.f11991b = reactContext;
        this.f11992c = (UIManagerModule) wf.a.c((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class));
    }

    public int c() {
        return (int) ((i() / 16.9d) + 1.0d);
    }

    public double d() {
        if (this.f11996g == this.f11995f) {
            return 0.0d;
        }
        return (g() * 1.0E9d) / (this.f11996g - this.f11995f);
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0228a
    public void doFrame(long j11) {
        if (this.f11994e) {
            return;
        }
        if (this.f11995f == -1) {
            this.f11995f = j11;
        }
        long j12 = this.f11996g;
        this.f11996g = j11;
        if (this.f11993d.e(j12, j11)) {
            this.f12000k++;
        }
        this.f11997h++;
        int c11 = c();
        if ((c11 - this.f11998i) - 1 >= 4) {
            this.f11999j++;
        }
        if (this.f12001l) {
            wf.a.c(this.f12002m);
            this.f12002m.put(Long.valueOf(System.currentTimeMillis()), new C0231b(g(), h(), c11, this.f11999j, d(), f(), i()));
        }
        this.f11998i = c11;
        com.facebook.react.modules.core.a aVar = this.f11990a;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    public C0231b e(long j11) {
        wf.a.d(this.f12002m, "FPS was not recorded at each frame!");
        Map.Entry<Long, C0231b> floorEntry = this.f12002m.floorEntry(Long.valueOf(j11));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    public double f() {
        if (this.f11996g == this.f11995f) {
            return 0.0d;
        }
        return (h() * 1.0E9d) / (this.f11996g - this.f11995f);
    }

    public int g() {
        return this.f11997h - 1;
    }

    public int h() {
        return this.f12000k - 1;
    }

    public int i() {
        return ((int) (this.f11996g - this.f11995f)) / 1000000;
    }

    public void j() {
        this.f11994e = false;
        this.f11991b.getCatalystInstance().addBridgeIdleDebugListener(this.f11993d);
        this.f11992c.setViewHierarchyUpdateDebugListener(this.f11993d);
        UiThreadUtil.runOnUiThread(new a(this));
    }

    public void k() {
        this.f12002m = new TreeMap<>();
        this.f12001l = true;
        j();
    }

    public void l() {
        this.f11994e = true;
        this.f11991b.getCatalystInstance().removeBridgeIdleDebugListener(this.f11993d);
        this.f11992c.setViewHierarchyUpdateDebugListener(null);
    }
}