package sc;

import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class j extends c {

    /* renamed from: c  reason: collision with root package name */
    int f50349c;

    public j(bc.m mVar, a aVar) {
        super(mVar, aVar);
        this.f50349c = mVar.e();
        mVar.t(2L);
    }

    public void a(tc.f fVar) {
        int i11 = this.f50349c;
        fVar.F(773, ((-65536) & i11) + ((i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) / Math.pow(2.0d, 4.0d)));
    }
}