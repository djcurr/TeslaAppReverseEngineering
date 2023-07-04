package com.oney.WebRTCModule;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import java.util.List;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.MediaStream;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public class u0 extends ViewGroup {

    /* renamed from: m */
    private static final RendererCommon.ScalingType f18113m = RendererCommon.ScalingType.SCALE_ASPECT_FIT;

    /* renamed from: n */
    private static final String f18114n = WebRTCModule.TAG;

    /* renamed from: o */
    private static int f18115o;

    /* renamed from: a */
    private int f18116a;

    /* renamed from: b */
    private int f18117b;

    /* renamed from: c */
    private int f18118c;

    /* renamed from: d */
    private final Object f18119d;

    /* renamed from: e */
    private boolean f18120e;

    /* renamed from: f */
    private boolean f18121f;

    /* renamed from: g */
    private final RendererCommon.RendererEvents f18122g;

    /* renamed from: h */
    private final Runnable f18123h;

    /* renamed from: i */
    private RendererCommon.ScalingType f18124i;

    /* renamed from: j */
    private String f18125j;

    /* renamed from: k */
    private final SurfaceViewRenderer f18126k;

    /* renamed from: l */
    private VideoTrack f18127l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements RendererCommon.RendererEvents {
        a() {
            u0.this = r1;
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            u0.this.h();
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i11, int i12, int i13) {
            u0.this.i(i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
            u0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.k();
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f18130a;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            f18130a = iArr;
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18130a[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public u0(Context context) {
        super(context);
        this.f18119d = new Object();
        this.f18122g = new a();
        this.f18123h = new b();
        SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(context);
        this.f18126k = surfaceViewRenderer;
        addView(surfaceViewRenderer);
        setMirror(false);
        setScalingType(f18113m);
    }

    public static /* synthetic */ void a(u0 u0Var) {
        u0Var.g();
    }

    private void e() {
        this.f18126k.setBackgroundColor(-16777216);
        this.f18126k.clearImage();
    }

    private VideoTrack f(String str) {
        MediaStream streamForReactTag;
        if (str != null && (streamForReactTag = ((WebRTCModule) ((ReactContext) getContext()).getNativeModule(WebRTCModule.class)).getStreamForReactTag(str)) != null) {
            List<VideoTrack> list = streamForReactTag.videoTracks;
            if (!list.isEmpty()) {
                return list.get(0);
            }
        }
        return null;
    }

    public /* synthetic */ void g() {
        Log.d(f18114n, "First frame rendered.");
        this.f18126k.setBackgroundColor(0);
    }

    public void h() {
        post(new Runnable() { // from class: com.oney.WebRTCModule.t0
            {
                u0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                u0.a(u0.this);
            }
        });
    }

    public void i(int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        synchronized (this.f18119d) {
            z11 = true;
            if (this.f18116a != i12) {
                this.f18116a = i12;
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f18117b != i13) {
                this.f18117b = i13;
                z12 = true;
            }
            if (this.f18118c != i11) {
                this.f18118c = i11;
            } else {
                z11 = z12;
            }
        }
        if (z11) {
            post(this.f18123h);
        }
    }

    private void j() {
        if (this.f18121f) {
            VideoTrack videoTrack = this.f18127l;
            if (videoTrack != null) {
                try {
                    videoTrack.removeSink(this.f18126k);
                } catch (Throwable unused) {
                }
            }
            this.f18126k.release();
            f18115o--;
            this.f18121f = false;
            synchronized (this.f18119d) {
                this.f18116a = 0;
                this.f18117b = 0;
                this.f18118c = 0;
            }
            k();
        }
    }

    public void k() {
        this.f18126k.requestLayout();
        if (androidx.core.view.a0.Z(this)) {
            return;
        }
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
    }

    private void l() {
        if (this.f18121f || this.f18127l == null || !androidx.core.view.a0.Y(this)) {
            return;
        }
        EglBase.Context b11 = f.b();
        if (b11 == null) {
            Log.e(f18114n, "Failed to render a VideoTrack!");
            return;
        }
        try {
            f18115o++;
            this.f18126k.init(b11, this.f18122g);
        } catch (Exception e11) {
            Logging.e(f18114n, "Failed to initialize surfaceViewRenderer on instance " + f18115o, e11);
            f18115o = f18115o - 1;
        }
        try {
            this.f18127l.addSink(this.f18126k);
            this.f18121f = true;
        } catch (Throwable th2) {
            Log.e(f18114n, "Failed to add renderer", th2);
            this.f18126k.release();
            f18115o--;
        }
    }

    private void setScalingType(RendererCommon.ScalingType scalingType) {
        synchronized (this.f18119d) {
            if (this.f18124i == scalingType) {
                return;
            }
            this.f18124i = scalingType;
            this.f18126k.setScalingType(scalingType);
            k();
        }
    }

    private void setVideoTrack(VideoTrack videoTrack) {
        VideoTrack videoTrack2 = this.f18127l;
        if (videoTrack2 != videoTrack) {
            if (videoTrack2 != null) {
                if (videoTrack == null) {
                    e();
                }
                j();
            }
            this.f18127l = videoTrack;
            if (videoTrack != null) {
                l();
                if (videoTrack2 == null) {
                    e();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        try {
            l();
        } finally {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            j();
        } finally {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        RendererCommon.ScalingType scalingType;
        float f11;
        float f12;
        int i21 = i14 - i12;
        int i22 = i13 - i11;
        int i23 = 0;
        if (i21 != 0 && i22 != 0) {
            synchronized (this.f18119d) {
                i17 = this.f18116a;
                i18 = this.f18117b;
                i19 = this.f18118c;
                scalingType = this.f18124i;
            }
            if (c.f18130a[scalingType.ordinal()] == 1) {
                i15 = i22;
                i16 = 0;
            } else if (i17 != 0 && i19 != 0) {
                if (i18 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0) {
                    f11 = i19;
                    f12 = i17;
                } else {
                    f11 = i17;
                    f12 = i19;
                }
                Point displaySize = RendererCommon.getDisplaySize(scalingType, f11 / f12, i22, i21);
                int i24 = displaySize.x;
                int i25 = (i22 - i24) / 2;
                int i26 = displaySize.y;
                i16 = (i21 - i26) / 2;
                i15 = i24 + i25;
                i21 = i16 + i26;
                i23 = i25;
            }
            this.f18126k.layout(i23, i16, i15, i21);
        }
        i15 = 0;
        i16 = 0;
        i21 = 0;
        this.f18126k.layout(i23, i16, i15, i21);
    }

    public void setMirror(boolean z11) {
        if (this.f18120e != z11) {
            this.f18120e = z11;
            this.f18126k.setMirror(z11);
            k();
        }
    }

    public void setObjectFit(String str) {
        RendererCommon.ScalingType scalingType;
        if ("cover".equals(str)) {
            scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        } else {
            scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        }
        setScalingType(scalingType);
    }

    public void setStreamURL(String str) {
        if (Objects.equals(str, this.f18125j)) {
            return;
        }
        VideoTrack f11 = f(str);
        if (this.f18127l != f11) {
            setVideoTrack(null);
        }
        this.f18125j = str;
        setVideoTrack(f11);
    }

    public void setZOrder(int i11) {
        if (i11 == 0) {
            this.f18126k.setZOrderMediaOverlay(false);
        } else if (i11 == 1) {
            this.f18126k.setZOrderMediaOverlay(true);
        } else if (i11 != 2) {
        } else {
            this.f18126k.setZOrderOnTop(true);
        }
    }
}