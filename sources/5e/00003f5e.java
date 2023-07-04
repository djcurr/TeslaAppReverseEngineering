package com.oney.WebRTCModule;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.OrientationEventListener;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.VideoCapturer;

/* loaded from: classes2.dex */
public class n extends com.oney.WebRTCModule.a {

    /* renamed from: g  reason: collision with root package name */
    private static final String f18061g = "n";

    /* renamed from: e  reason: collision with root package name */
    private final Intent f18062e;

    /* renamed from: f  reason: collision with root package name */
    private final OrientationEventListener f18063f;

    /* loaded from: classes2.dex */
    class a extends OrientationEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f18064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, Context context2) {
            super(context);
            this.f18064a = context2;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            try {
                DisplayMetrics a11 = e.a((Activity) this.f18064a);
                n.this.f17971d.changeCaptureFormat(a11.widthPixels, a11.heightPixels, 30);
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class b extends MediaProjection.Callback {
        b() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            Log.w(n.f18061g, "Media projection stopped.");
            n.this.f18063f.disable();
        }
    }

    public n(Context context, int i11, int i12, Intent intent) {
        super(i11, i12, 30);
        this.f18062e = intent;
        a aVar = new a(context, context);
        this.f18063f = aVar;
        if (aVar.canDetectOrientation()) {
            aVar.enable();
        }
    }

    @Override // com.oney.WebRTCModule.a
    protected VideoCapturer a() {
        return new ScreenCapturerAndroid(this.f18062e, new b());
    }
}