package com.brentvatne.exoplayer;

import ak.k0;
import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import ci.d;
import ci.l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.n0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.MergingMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.StripePaymentController;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import fj.u;
import fj.v;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.spongycastle.i18n.MessageBundle;
import org.webrtc.MediaStreamTrack;
import xj.a;
import xj.f;
import xj.i;
import zj.d;
import zj.i;
import zj.j;

/* loaded from: classes.dex */
class f extends FrameLayout implements LifecycleEventListener, s0.a, d.a, da.b, AudioManager.OnAudioFocusChangeListener, wi.e, com.google.android.exoplayer2.drm.f {

    /* renamed from: m3  reason: collision with root package name */
    private static final CookieManager f10386m3;
    private int A;
    private int B;
    private long C;
    private int E;
    private int F;
    private int G;
    private int H;
    private Uri K;
    private String L;
    private boolean O;
    private String P;
    private Dynamic Q;
    private float Q1;
    private boolean Q2;
    private String R;
    private Dynamic T;
    private boolean V1;

    /* renamed from: a  reason: collision with root package name */
    private final h f10387a;

    /* renamed from: b  reason: collision with root package name */
    private final com.brentvatne.exoplayer.e f10388b;

    /* renamed from: b1  reason: collision with root package name */
    private String f10389b1;

    /* renamed from: b2  reason: collision with root package name */
    private Map<String, String> f10390b2;

    /* renamed from: c  reason: collision with root package name */
    private final j f10391c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.exoplayer2.ui.c f10392d;

    /* renamed from: e  reason: collision with root package name */
    private View f10393e;

    /* renamed from: f  reason: collision with root package name */
    private s0.a f10394f;

    /* renamed from: g  reason: collision with root package name */
    private com.brentvatne.exoplayer.d f10395g;

    /* renamed from: g1  reason: collision with root package name */
    private Dynamic f10396g1;

    /* renamed from: g2  reason: collision with root package name */
    private boolean f10397g2;

    /* renamed from: h  reason: collision with root package name */
    private a.InterfaceC0258a f10398h;

    /* renamed from: i  reason: collision with root package name */
    private w0 f10399i;

    /* renamed from: i3  reason: collision with root package name */
    private final n0 f10400i3;

    /* renamed from: j  reason: collision with root package name */
    private xj.f f10401j;

    /* renamed from: j3  reason: collision with root package name */
    private final AudioManager f10402j3;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10403k;

    /* renamed from: k3  reason: collision with root package name */
    private final da.a f10404k3;

    /* renamed from: l  reason: collision with root package name */
    private int f10405l;

    /* renamed from: l3  reason: collision with root package name */
    private final Handler f10406l3;

    /* renamed from: m  reason: collision with root package name */
    private long f10407m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10408n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10409o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10410p;

    /* renamed from: p1  reason: collision with root package name */
    private ReadableArray f10411p1;

    /* renamed from: p2  reason: collision with root package name */
    private UUID f10412p2;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10413q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10414t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10415w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10416x;

    /* renamed from: x1  reason: collision with root package name */
    private boolean f10417x1;

    /* renamed from: x2  reason: collision with root package name */
    private String f10418x2;

    /* renamed from: y  reason: collision with root package name */
    private float f10419y;

    /* renamed from: y1  reason: collision with root package name */
    private boolean f10420y1;

    /* renamed from: y2  reason: collision with root package name */
    private String[] f10421y2;

    /* renamed from: z  reason: collision with root package name */
    private float f10422z;

    /* loaded from: classes.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1 && f.this.f10399i != null && f.this.f10399i.w() == 3 && f.this.f10399i.o()) {
                long C = f.this.f10399i.C();
                f.this.f10387a.o(C, (f.this.f10399i.D() * f.this.f10399i.k()) / 100, f.this.f10399i.k(), f.this.E0(C));
                sendMessageDelayed(obtainMessage(1), Math.round(f.this.Q1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.z1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f.this.f10399i != null && f.this.f10399i.w() == 4) {
                f.this.f10399i.G(0L);
            }
            f.this.e1(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.e1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements s0.a {
        e() {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void L(boolean z11, int i11) {
            f fVar = f.this;
            fVar.O0(fVar.f10393e);
            f.this.f10399i.f(f.this.f10394f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0198f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f10428a;

        RunnableC0198f(f fVar) {
            this.f10428a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11;
            if (f.this.f10399i == null) {
                f.this.f10401j = new xj.f(new a.b());
                f.this.f10401j.N(f.this.f10401j.o().g(f.this.B == 0 ? Integer.MAX_VALUE : f.this.B));
                i iVar = new i(true, 65536);
                d.a aVar = new d.a();
                aVar.c(iVar);
                aVar.d(f.this.E, f.this.F, f.this.G, f.this.H);
                aVar.f(-1);
                aVar.e(true);
                ci.d b11 = aVar.b();
                ci.e i12 = new ci.e(f.this.getContext()).i(0);
                f fVar = f.this;
                fVar.f10399i = new w0.b(fVar.getContext(), i12).z(f.this.f10401j).x(f.this.f10391c).y(b11).w();
                f.this.f10399i.r(this.f10428a);
                f.this.f10399i.i0(this.f10428a);
                f.this.f10395g.setPlayer(f.this.f10399i);
                f.this.f10404k3.b(this.f10428a);
                f.this.f10391c.c(new Handler(), this.f10428a);
                f fVar2 = f.this;
                fVar2.g1(!fVar2.f10413q);
                f.this.f10403k = true;
                f.this.f10399i.I0(new l(f.this.f10419y, 1.0f));
            }
            if (f.this.f10403k && f.this.K != null) {
                f.this.f10395g.g();
                com.google.android.exoplayer2.drm.g gVar = null;
                if (this.f10428a.f10412p2 != null) {
                    try {
                        gVar = f.this.s0(this.f10428a.f10412p2, this.f10428a.f10418x2, this.f10428a.f10421y2);
                    } catch (UnsupportedDrmException e11) {
                        if (k0.f477a < 18) {
                            i11 = ca.b.error_drm_not_supported;
                        } else {
                            i11 = e11.f13340a == 1 ? ca.b.error_drm_unsupported_scheme : ca.b.error_drm_unknown;
                        }
                        f.this.f10387a.f(f.this.getResources().getString(i11), e11);
                        return;
                    }
                }
                ArrayList w02 = f.this.w0();
                f fVar3 = f.this;
                com.google.android.exoplayer2.source.j u02 = fVar3.u0(fVar3.K, f.this.L, gVar);
                if (w02.size() != 0) {
                    w02.add(0, u02);
                    u02 = new MergingMediaSource((com.google.android.exoplayer2.source.j[]) w02.toArray(new com.google.android.exoplayer2.source.j[w02.size()]));
                }
                boolean z11 = f.this.f10405l != -1;
                if (z11) {
                    f.this.f10399i.n(f.this.f10405l, f.this.f10407m);
                }
                f.this.f10399i.z0(u02, !z11, false);
                f.this.f10403k = false;
                f fVar4 = f.this;
                fVar4.O0(fVar4.f10395g);
                f.this.f10387a.m();
                f.this.f10408n = true;
            }
            f.this.J0();
            f fVar5 = f.this;
            fVar5.U0(fVar5.Q2);
            f.this.q0();
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f10386m3 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public f(n0 n0Var, com.brentvatne.exoplayer.e eVar) {
        super(n0Var);
        this.f10415w = false;
        this.f10416x = false;
        this.f10419y = 1.0f;
        this.f10422z = 1.0f;
        this.A = 3;
        this.B = 0;
        this.C = -9223372036854775807L;
        this.E = StripePaymentController.PAYMENT_REQUEST_CODE;
        this.F = StripePaymentController.PAYMENT_REQUEST_CODE;
        this.G = 2500;
        this.H = 5000;
        this.f10420y1 = true;
        this.Q1 = 250.0f;
        this.V1 = false;
        this.f10397g2 = false;
        this.f10412p2 = null;
        this.f10418x2 = null;
        this.f10421y2 = null;
        this.f10406l3 = new a();
        this.f10400i3 = n0Var;
        this.f10387a = new h(n0Var);
        this.f10388b = eVar;
        this.f10391c = eVar.b();
        B0();
        this.f10402j3 = (AudioManager) n0Var.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        n0Var.addLifecycleEventListener(this);
        this.f10404k3 = new da.a(n0Var);
    }

    private void A1() {
        this.f10405l = this.f10399i.g();
        this.f10407m = this.f10399i.e() ? Math.max(0L, this.f10399i.C()) : -9223372036854775807L;
    }

    private void B0() {
        z0();
        this.f10398h = r0(true);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f10386m3;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.brentvatne.exoplayer.d dVar = new com.brentvatne.exoplayer.d(getContext());
        this.f10395g = dVar;
        dVar.setLayoutParams(layoutParams);
        addView(this.f10395g, 0, layoutParams);
        new Handler();
    }

    private void B1() {
        if (this.f10408n) {
            this.f10408n = false;
            o1(this.P, this.Q);
            r1(this.R, this.T);
            p1(this.f10389b1, this.f10396g1);
            ci.i v02 = this.f10399i.v0();
            this.f10387a.l(this.f10399i.k(), this.f10399i.C(), v02 != null ? v02.f9210q : 0, v02 != null ? v02.f9211t : 0, C0(), F0(), H0(), v02 != null ? v02.f9194a : "-1");
        }
    }

    private WritableArray C0() {
        WritableArray createArray = Arguments.createArray();
        i.a g11 = this.f10401j.g();
        int G0 = G0(1);
        if (g11 != null && G0 != -1) {
            v e11 = g11.e(G0);
            for (int i11 = 0; i11 < e11.f26354a; i11++) {
                ci.i a11 = e11.a(i11).a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i11);
                String str = a11.f9194a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                createMap.putString(MessageBundle.TITLE_ENTRY, str);
                createMap.putString("type", a11.f9205l);
                String str3 = a11.f9196c;
                if (str3 == null) {
                    str3 = "";
                }
                createMap.putString("language", str3);
                int i12 = a11.f9201h;
                if (i12 != -1) {
                    str2 = String.format(Locale.US, "%.2fMbps", Float.valueOf(i12 / 1000000.0f));
                }
                createMap.putString("bitrate", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    private int D0(v vVar) {
        if (vVar.f26354a == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i11 = 0; i11 < vVar.f26354a; i11++) {
            String str = vVar.a(i11).a(0).f9196c;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i11;
            }
        }
        return 0;
    }

    private WritableArray F0() {
        WritableArray createArray = Arguments.createArray();
        i.a g11 = this.f10401j.g();
        int G0 = G0(3);
        if (g11 != null && G0 != -1) {
            v e11 = g11.e(G0);
            for (int i11 = 0; i11 < e11.f26354a; i11++) {
                ci.i a11 = e11.a(i11).a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i11);
                String str = a11.f9194a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                createMap.putString(MessageBundle.TITLE_ENTRY, str);
                createMap.putString("type", a11.f9205l);
                String str3 = a11.f9196c;
                if (str3 != null) {
                    str2 = str3;
                }
                createMap.putString("language", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    private WritableArray H0() {
        WritableArray createArray = Arguments.createArray();
        i.a g11 = this.f10401j.g();
        int G0 = G0(2);
        if (g11 != null && G0 != -1) {
            v e11 = g11.e(G0);
            for (int i11 = 0; i11 < e11.f26354a; i11++) {
                u a11 = e11.a(i11);
                for (int i12 = 0; i12 < a11.f26350a; i12++) {
                    ci.i a12 = a11.a(i12);
                    WritableMap createMap = Arguments.createMap();
                    int i13 = a12.f9210q;
                    if (i13 == -1) {
                        i13 = 0;
                    }
                    createMap.putInt(Snapshot.WIDTH, i13);
                    int i14 = a12.f9211t;
                    if (i14 == -1) {
                        i14 = 0;
                    }
                    createMap.putInt(Snapshot.HEIGHT, i14);
                    int i15 = a12.f9201h;
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    createMap.putInt("bitrate", i15);
                    String str = a12.f9202i;
                    if (str == null) {
                        str = "";
                    }
                    createMap.putString("codecs", str);
                    String str2 = a12.f9194a;
                    if (str2 == null) {
                        str2 = String.valueOf(i12);
                    }
                    createMap.putString("trackId", str2);
                    createArray.pushMap(createMap);
                }
            }
        }
        return createArray;
    }

    private void I0() {
        new Handler().postDelayed(new RunnableC0198f(this), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        if (this.f10392d == null) {
            this.f10392d = new com.google.android.exoplayer2.ui.c(getContext());
        }
        this.f10392d.setPlayer(this.f10399i);
        this.f10392d.N();
        this.f10393e = this.f10392d.findViewById(ca.a.exo_play_pause_container);
        this.f10395g.setOnClickListener(new b());
        ((ImageButton) this.f10392d.findViewById(ca.a.f9032b)).setOnClickListener(new c());
        ((ImageButton) this.f10392d.findViewById(ca.a.f9031a)).setOnClickListener(new d());
        e eVar = new e();
        this.f10394f = eVar;
        this.f10399i.r(eVar);
    }

    private static boolean K0(ExoPlaybackException exoPlaybackException) {
        Log.e("ExoPlayer Exception", exoPlaybackException.toString());
        if (exoPlaybackException.f13021a != 0) {
            return false;
        }
        for (Throwable h11 = exoPlaybackException.h(); h11 != null; h11 = h11.getCause()) {
            if ((h11 instanceof BehindLiveWindowException) || (h11 instanceof HttpDataSource.HttpDataSourceException)) {
                return true;
            }
        }
        return false;
    }

    private void L0(boolean z11) {
        if (this.f10414t == z11) {
            return;
        }
        this.f10414t = z11;
        if (z11) {
            this.f10387a.d(true);
        } else {
            this.f10387a.d(false);
        }
    }

    private void M0() {
        if (this.f10409o) {
            Z0(false);
        }
        this.f10402j3.abandonAudioFocus(this);
    }

    private void N0() {
        w0 w0Var = this.f10399i;
        if (w0Var != null && w0Var.o()) {
            g1(false);
        }
        setKeepScreenOn(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private void P0() {
        if (this.f10399i != null) {
            A1();
            this.f10399i.A0();
            this.f10399i.B0(this);
            this.f10401j = null;
            this.f10399i = null;
        }
        this.f10406l3.removeMessages(1);
        this.f10400i3.removeLifecycleEventListener(this);
        this.f10404k3.a();
        this.f10391c.a(this);
    }

    private void Q0() {
        this.f10403k = true;
        I0();
    }

    private boolean R0() {
        return this.f10417x1 || this.K == null || this.f10416x || this.f10402j3.requestAudioFocus(this, 3, 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(boolean z11) {
        w0 w0Var = this.f10399i;
        if (w0Var == null) {
            return;
        }
        if (z11) {
            boolean R0 = R0();
            this.f10416x = R0;
            if (R0) {
                this.f10399i.h(true);
                return;
            }
            return;
        }
        w0Var.h(false);
    }

    private void p0() {
        if (this.f10399i == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f10392d.setLayoutParams(layoutParams);
        int indexOfChild = indexOfChild(this.f10392d);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
        }
        addView(this.f10392d, 1, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        l1(this.O);
        d1(this.f10415w);
    }

    private a.InterfaceC0258a r0(boolean z11) {
        return com.brentvatne.exoplayer.b.c(this.f10400i3, z11 ? this.f10391c : null, this.f10390b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.drm.g s0(UUID uuid, String str, String[] strArr) {
        if (k0.f477a < 18) {
            return null;
        }
        com.google.android.exoplayer2.drm.l lVar = new com.google.android.exoplayer2.drm.l(str, t0(false));
        if (strArr != null) {
            for (int i11 = 0; i11 < strArr.length - 1; i11 += 2) {
                lVar.e(strArr[i11], strArr[i11 + 1]);
            }
        }
        return new DefaultDrmSessionManager(uuid, k.A(uuid), lVar, null, false, 3);
    }

    private HttpDataSource.b t0(boolean z11) {
        return com.brentvatne.exoplayer.b.d(this.f10400i3, z11 ? this.f10391c : null, this.f10390b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.source.j u0(Uri uri, String str, com.google.android.exoplayer2.drm.g gVar) {
        String lastPathSegment;
        if (TextUtils.isEmpty(str)) {
            lastPathSegment = uri.getLastPathSegment();
        } else {
            lastPathSegment = "." + str;
        }
        int m02 = k0.m0(lastPathSegment);
        if (m02 != 0) {
            if (m02 != 1) {
                if (m02 != 2) {
                    if (m02 == 3) {
                        return new r.b(this.f10398h).e(gVar).g(this.f10388b.a(this.A)).b(uri);
                    }
                    throw new IllegalStateException("Unsupported type: " + m02);
                }
                return new HlsMediaSource.Factory(this.f10398h).e(gVar).g(this.f10388b.a(this.A)).b(uri);
            }
            return new SsMediaSource.Factory(new a.C0254a(this.f10398h), r0(false)).e(gVar).g(this.f10388b.a(this.A)).b(uri);
        }
        return new DashMediaSource.Factory(new c.a(this.f10398h), r0(false)).e(gVar).g(this.f10388b.a(this.A)).b(uri);
    }

    private com.google.android.exoplayer2.source.j v0(String str, Uri uri, String str2, String str3) {
        return new w.b(this.f10398h).a(uri, ci.i.c(str, str2, -1, str3), -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<com.google.android.exoplayer2.source.j> w0() {
        ArrayList<com.google.android.exoplayer2.source.j> arrayList = new ArrayList<>();
        if (this.f10411p1 == null) {
            return arrayList;
        }
        for (int i11 = 0; i11 < this.f10411p1.size(); i11++) {
            ReadableMap map = this.f10411p1.getMap(i11);
            String string = map.getString("language");
            com.google.android.exoplayer2.source.j v02 = v0(map.hasKey(MessageBundle.TITLE_ENTRY) ? map.getString(MessageBundle.TITLE_ENTRY) : string + " " + i11, Uri.parse(map.getString("uri")), map.getString("type"), string);
            if (v02 != null) {
                arrayList.add(v02);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r0 != 4) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w1() {
        /*
            r3 = this;
            com.google.android.exoplayer2.w0 r0 = r3.f10399i
            if (r0 == 0) goto L25
            int r0 = r0.w()
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L15
            r1 = 4
            if (r0 == r1) goto L21
            goto L28
        L15:
            com.google.android.exoplayer2.w0 r0 = r3.f10399i
            boolean r0 = r0.o()
            if (r0 != 0) goto L28
            r3.g1(r1)
            goto L28
        L21:
            r3.I0()
            goto L28
        L25:
            r3.I0()
        L28:
            boolean r0 = r3.f10417x1
            if (r0 != 0) goto L31
            boolean r0 = r3.f10420y1
            r3.setKeepScreenOn(r0)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.f.w1():void");
    }

    private void x1() {
        this.f10406l3.sendEmptyMessage(1);
    }

    private void y0() {
        this.f10406l3.removeMessages(1);
    }

    private void y1() {
        M0();
        P0();
    }

    private void z0() {
        this.f10405l = -1;
        this.f10407m = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1() {
        if (this.f10399i == null) {
            return;
        }
        O0(this.f10392d);
        if (this.f10392d.I()) {
            this.f10392d.F();
        } else {
            this.f10392d.N();
        }
    }

    public void A0() {
        if (this.K != null) {
            this.f10399i.P0(true);
            this.K = null;
            this.L = null;
            this.f10390b2 = null;
            this.f10398h = null;
            z0();
        }
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void B(int i11) {
        if (this.f10403k) {
            A1();
        }
        if (i11 == 0 && this.f10399i.z() == 1) {
            this.f10387a.e();
        }
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void C(ExoPlaybackException exoPlaybackException) {
        String str = "ExoPlaybackException type : " + exoPlaybackException.f13021a;
        int i11 = exoPlaybackException.f13021a;
        if (i11 == 1) {
            Exception g11 = exoPlaybackException.g();
            if (g11 instanceof MediaCodecRenderer.DecoderInitializationException) {
                MediaCodecRenderer.DecoderInitializationException decoderInitializationException = (MediaCodecRenderer.DecoderInitializationException) g11;
                if (decoderInitializationException.f13640c.f13700a == null) {
                    if (decoderInitializationException.getCause() instanceof MediaCodecUtil.DecoderQueryException) {
                        str = getResources().getString(ca.b.error_querying_decoders);
                    } else if (decoderInitializationException.f13639b) {
                        str = getResources().getString(ca.b.error_no_secure_decoder, decoderInitializationException.f13638a);
                    } else {
                        str = getResources().getString(ca.b.error_no_decoder, decoderInitializationException.f13638a);
                    }
                } else {
                    str = getResources().getString(ca.b.error_instantiating_decoder, decoderInitializationException.f13640c.f13700a);
                }
            }
        } else if (i11 == 0) {
            str = getResources().getString(ca.b.unrecognized_media_format);
        }
        this.f10387a.f(str, exoPlaybackException);
        this.f10403k = true;
        if (K0(exoPlaybackException)) {
            z0();
            I0();
            return;
        }
        A1();
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void E() {
        this.f10387a.r(this.f10399i.C(), this.C);
        this.C = -9223372036854775807L;
    }

    public double E0(long j11) {
        z0.c cVar = new z0.c();
        if (!this.f10399i.l().q()) {
            this.f10399i.l().n(this.f10399i.g(), cVar);
        }
        return cVar.f14792f + j11;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void F(int i11, j.a aVar, Exception exc) {
        Log.d("DRM Info", "onDrmSessionManagerError");
        this.f10387a.f("onDrmSessionManagerError", exc);
    }

    public int G0(int i11) {
        w0 w0Var = this.f10399i;
        if (w0Var != null) {
            int t02 = w0Var.t0();
            for (int i12 = 0; i12 < t02; i12++) {
                if (this.f10399i.u0(i12) == i11) {
                    return i12;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void L(boolean z11, int i11) {
        String str;
        String str2 = "onStateChanged: playWhenReady=" + z11 + ", playbackState=";
        if (i11 == 1) {
            String str3 = str2 + "idle";
            this.f10387a.k();
            y0();
            if (!z11) {
                setKeepScreenOn(false);
            }
            str = str3;
        } else if (i11 == 2) {
            str = str2 + "buffering";
            L0(true);
            y0();
            setKeepScreenOn(this.f10420y1);
        } else if (i11 == 3) {
            str = str2 + "ready";
            this.f10387a.p();
            L0(false);
            x1();
            B1();
            com.google.android.exoplayer2.ui.c cVar = this.f10392d;
            if (cVar != null) {
                cVar.N();
            }
            setKeepScreenOn(this.f10420y1);
        } else if (i11 != 4) {
            str = str2 + "unknown";
        } else {
            str = str2 + "ended";
            this.f10387a.e();
            M0();
            setKeepScreenOn(false);
        }
        Log.d("ReactExoplayerView", str);
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void O(z0 z0Var, Object obj, int i11) {
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void S(int i11, j.a aVar) {
        Log.d("DRM Info", "onDrmKeysLoaded");
    }

    public void S0(long j11) {
        w0 w0Var = this.f10399i;
        if (w0Var != null) {
            this.C = j11;
            w0Var.G(j11);
        }
    }

    public void T0(int i11, int i12, int i13, int i14) {
        this.E = i11;
        this.F = i12;
        this.G = i13;
        this.H = i14;
        P0();
        I0();
    }

    public void U0(boolean z11) {
        this.Q2 = z11;
        if (this.f10399i == null || this.f10395g == null) {
            return;
        }
        if (z11) {
            p0();
            return;
        }
        int indexOfChild = indexOfChild(this.f10392d);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
        }
    }

    public void V0(boolean z11) {
        this.f10417x1 = z11;
    }

    public void W0(String[] strArr) {
        this.f10421y2 = strArr;
    }

    public void X0(String str) {
        this.f10418x2 = str;
    }

    public void Y0(UUID uuid) {
        this.f10412p2 = uuid;
    }

    public void Z0(boolean z11) {
        if (z11 == this.f10409o) {
            return;
        }
        this.f10409o = z11;
        Activity currentActivity = this.f10400i3.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        if (this.f10409o) {
            int i11 = k0.f477a >= 19 ? 4102 : 6;
            this.f10387a.j();
            decorView.setSystemUiVisibility(i11);
            this.f10387a.h();
            return;
        }
        this.f10387a.i();
        decorView.setSystemUiVisibility(0);
        this.f10387a.g();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void a0(int i11, j.a aVar) {
        Log.d("DRM Info", "onDrmKeysRestored");
    }

    public void a1(boolean z11) {
        this.f10395g.setHideShutterView(z11);
    }

    @Override // da.b
    public void b() {
        this.f10387a.a();
    }

    public void b1(int i11) {
        this.B = i11;
        if (this.f10399i != null) {
            xj.f fVar = this.f10401j;
            f.e o11 = fVar.o();
            int i12 = this.B;
            if (i12 == 0) {
                i12 = Integer.MAX_VALUE;
            }
            fVar.N(o11.g(i12));
        }
    }

    public void c1(int i11) {
        this.A = i11;
        P0();
        I0();
    }

    public void d1(boolean z11) {
        this.f10415w = z11;
        float f11 = z11 ? BitmapDescriptorFactory.HUE_RED : 1.0f;
        this.f10422z = f11;
        w0 w0Var = this.f10399i;
        if (w0Var != null) {
            w0Var.O0(f11);
        }
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void e(l lVar) {
        this.f10387a.n(lVar.f9245a);
    }

    public void e1(boolean z11) {
        this.f10413q = z11;
        if (this.f10399i != null) {
            if (!z11) {
                w1();
            } else {
                N0();
            }
        }
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void f(int i11) {
    }

    public void f1(boolean z11) {
        this.V1 = z11;
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void h(boolean z11) {
    }

    public void h1(boolean z11) {
        this.f10420y1 = z11;
    }

    public void i1(float f11) {
        this.Q1 = f11;
    }

    public void j1(float f11) {
        this.f10419y = f11;
        if (this.f10399i != null) {
            this.f10399i.I0(new l(this.f10419y, 1.0f));
        }
    }

    public void k1(Uri uri, String str) {
        if (uri != null) {
            boolean equals = uri.equals(this.K);
            this.K = uri;
            this.L = str;
            this.f10398h = r0(true);
            if (equals) {
                return;
            }
            Q0();
        }
    }

    public void l1(boolean z11) {
        w0 w0Var = this.f10399i;
        if (w0Var != null) {
            if (z11) {
                w0Var.x(1);
            } else {
                w0Var.x(0);
            }
        }
        this.O = z11;
    }

    public void m1(boolean z11) {
        this.f10397g2 = z11;
    }

    public void n1(int i11) {
        this.f10395g.setResizeMode(i11);
    }

    @Override // zj.d.a
    public void o(int i11, long j11, long j12) {
        if (this.f10397g2) {
            w0 w0Var = this.f10399i;
            if (w0Var == null) {
                this.f10387a.c(j12, 0, 0, "-1");
                return;
            }
            ci.i v02 = w0Var.v0();
            this.f10387a.c(j12, v02 != null ? v02.f9211t : 0, v02 != null ? v02.f9210q : 0, v02 != null ? v02.f9194a : "-1");
        }
    }

    public void o1(String str, Dynamic dynamic) {
        this.P = str;
        this.Q = dynamic;
        q1(1, str, dynamic);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        I0();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i11) {
        if (i11 == -2) {
            this.f10387a.b(false);
        } else if (i11 == -1) {
            this.f10416x = false;
            this.f10387a.b(false);
            N0();
            this.f10402j3.abandonAudioFocus(this);
        } else if (i11 == 1) {
            this.f10416x = true;
            this.f10387a.b(true);
        }
        w0 w0Var = this.f10399i;
        if (w0Var != null) {
            if (i11 == -3) {
                if (this.f10415w) {
                    return;
                }
                w0Var.O0(this.f10422z * 0.8f);
            } else if (i11 != 1 || this.f10415w) {
            } else {
                w0Var.O0(this.f10422z * 1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        y1();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f10410p = true;
        if (this.V1) {
            return;
        }
        g1(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.V1 || !this.f10410p) {
            g1(!this.f10413q);
        }
        this.f10410p = false;
    }

    public void p1(String str, Dynamic dynamic) {
        this.f10389b1 = str;
        this.f10396g1 = dynamic;
        q1(3, str, dynamic);
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void q(v vVar, xj.k kVar) {
    }

    public void q1(int i11, String str, Dynamic dynamic) {
        int G0;
        i.a g11;
        int D0;
        if (this.f10399i == null || (G0 = G0(i11)) == -1 || (g11 = this.f10401j.g()) == null) {
            return;
        }
        v e11 = g11.e(G0);
        int[] iArr = {0};
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        f.d a11 = this.f10401j.v().f().i(G0, true).a();
        if (str.equals("disabled")) {
            this.f10401j.M(a11);
            return;
        }
        if (str.equals("language")) {
            D0 = 0;
            while (D0 < e11.f26354a) {
                String str2 = e11.a(D0).a(0).f9196c;
                if (str2 != null && str2.equals(dynamic.asString())) {
                    break;
                }
                D0++;
            }
            D0 = -1;
        } else if (str.equals(MessageBundle.TITLE_ENTRY)) {
            D0 = 0;
            while (D0 < e11.f26354a) {
                String str3 = e11.a(D0).a(0).f9194a;
                if (str3 != null && str3.equals(dynamic.asString())) {
                    break;
                }
                D0++;
            }
            D0 = -1;
        } else if (str.equals("index")) {
            if (dynamic.asInt() < e11.f26354a) {
                D0 = dynamic.asInt();
            }
            D0 = -1;
        } else if (str.equals("resolution")) {
            int asInt = dynamic.asInt();
            int i12 = -1;
            for (int i13 = 0; i13 < e11.f26354a; i13++) {
                u a12 = e11.a(i13);
                int i14 = 0;
                while (true) {
                    if (i14 >= a12.f26350a) {
                        break;
                    } else if (a12.a(i14).f9211t == asInt) {
                        iArr[0] = i14;
                        i12 = i13;
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            D0 = i12;
        } else if (G0 != 3 || k0.f477a <= 18) {
            if (G0 == 1) {
                D0 = D0(e11);
            }
            D0 = -1;
        } else {
            CaptioningManager captioningManager = (CaptioningManager) this.f10400i3.getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                D0 = D0(e11);
            }
            D0 = -1;
        }
        if (D0 == -1 && i11 == 2 && e11.f26354a != 0) {
            u a13 = e11.a(0);
            iArr = new int[a13.f26350a];
            for (int i15 = 0; i15 < a13.f26350a; i15++) {
                iArr[i15] = i15;
            }
            D0 = 0;
        }
        if (D0 == -1) {
            this.f10401j.M(a11);
        } else {
            this.f10401j.M(this.f10401j.v().f().i(G0, false).j(G0, e11, new f.C1306f(D0, iArr)).a());
        }
    }

    @Override // wi.e
    public void r(wi.a aVar) {
        this.f10387a.t(aVar);
    }

    public void r1(String str, Dynamic dynamic) {
        this.R = str;
        this.T = dynamic;
        q1(2, str, dynamic);
    }

    public void s1(Uri uri, String str, Map<String, String> map) {
        if (uri != null) {
            boolean equals = uri.equals(this.K);
            this.K = uri;
            this.L = str;
            this.f10390b2 = map;
            this.f10398h = com.brentvatne.exoplayer.b.c(this.f10400i3, this.f10391c, map);
            if (equals) {
                return;
            }
            Q0();
        }
    }

    @Override // android.view.View
    public void setId(int i11) {
        super.setId(i11);
        this.f10387a.s(i11);
    }

    public void t1(ReadableArray readableArray) {
        this.f10411p1 = readableArray;
        Q0();
    }

    @Override // com.google.android.exoplayer2.s0.a
    public void u(boolean z11) {
    }

    public void u1(boolean z11) {
        this.f10395g.setUseTextureView(z11 && this.f10412p2 == null);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void v(int i11, j.a aVar) {
        Log.d("DRM Info", "onDrmKeysRemoved");
    }

    public void v1(float f11) {
        this.f10422z = f11;
        w0 w0Var = this.f10399i;
        if (w0Var != null) {
            w0Var.O0(f11);
        }
    }

    public void x0() {
        y1();
    }
}