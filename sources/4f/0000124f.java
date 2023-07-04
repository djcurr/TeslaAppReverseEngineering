package com.RNFetchBlob;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private long f9394a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f9395b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f9396c;

    /* renamed from: d  reason: collision with root package name */
    private int f9397d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9398e;

    /* loaded from: classes.dex */
    enum a {
        Upload,
        Download
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(boolean z11, int i11, int i12, a aVar) {
        this.f9396c = -1;
        this.f9397d = -1;
        this.f9398e = false;
        a aVar2 = a.Download;
        this.f9398e = z11;
        this.f9397d = i11;
        this.f9396c = i12;
    }

    public boolean a(float f11) {
        int i11 = this.f9396c;
        boolean z11 = false;
        boolean z12 = i11 <= 0 || f11 <= BitmapDescriptorFactory.HUE_RED || Math.floor((double) (f11 * ((float) i11))) > ((double) this.f9395b);
        if (System.currentTimeMillis() - this.f9394a > this.f9397d && this.f9398e && z12) {
            z11 = true;
        }
        if (z11) {
            this.f9395b++;
            this.f9394a = System.currentTimeMillis();
        }
        return z11;
    }
}