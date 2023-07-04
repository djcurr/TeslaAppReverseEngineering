package wc;

import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class j extends d {

    /* renamed from: e  reason: collision with root package name */
    int f55772e;

    public j(bc.m mVar, b bVar) {
        super(mVar, bVar);
        this.f55772e = mVar.e();
        mVar.t(2L);
    }

    public void a(xc.i iVar) {
        int i11 = this.f55772e;
        iVar.F(105, ((-65536) & i11) + ((i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) / Math.pow(2.0d, 4.0d)));
    }
}