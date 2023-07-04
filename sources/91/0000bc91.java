package wc;

import java.util.Calendar;
import java.util.Date;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: e  reason: collision with root package name */
    protected long f55764e;

    /* renamed from: f  reason: collision with root package name */
    protected long f55765f;

    /* renamed from: g  reason: collision with root package name */
    protected long f55766g;

    /* renamed from: h  reason: collision with root package name */
    protected long f55767h;

    /* renamed from: i  reason: collision with root package name */
    protected int f55768i;

    /* renamed from: j  reason: collision with root package name */
    protected int f55769j;

    /* renamed from: k  reason: collision with root package name */
    protected int[] f55770k;

    /* renamed from: l  reason: collision with root package name */
    protected long f55771l;

    public h(bc.m mVar, b bVar) {
        super(mVar, bVar);
        if (this.f55753d == 1) {
            this.f55764e = mVar.g();
            this.f55765f = mVar.g();
            this.f55766g = mVar.q();
            this.f55767h = mVar.g();
        } else {
            this.f55764e = mVar.q();
            this.f55765f = mVar.q();
            this.f55766g = mVar.q();
            this.f55767h = mVar.q();
        }
        this.f55768i = mVar.f();
        this.f55769j = mVar.e();
        mVar.t(2L);
        mVar.t(8L);
        this.f55770k = new int[]{mVar.f(), mVar.f(), mVar.f(), mVar.f(), mVar.f(), mVar.f(), mVar.f(), mVar.f(), mVar.f()};
        mVar.t(24L);
        this.f55771l = mVar.q();
    }

    public void a(vc.d dVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1904, 0, 1, 0, 0, 0);
        long time = calendar.getTime().getTime();
        dVar.D(256, new Date((this.f55764e * 1000) + time));
        dVar.D(257, new Date((this.f55765f * 1000) + time));
        long j11 = this.f55767h / this.f55766g;
        this.f55767h = j11;
        dVar.L(259, j11);
        dVar.L(258, this.f55766g);
        dVar.K(271, this.f55770k);
        int i11 = this.f55768i;
        dVar.F(260, (((-65536) & i11) >> 16) + ((i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) / Math.pow(2.0d, 4.0d)));
        int i12 = this.f55769j;
        dVar.F(261, ((65280 & i12) >> 8) + ((i12 & 255) / Math.pow(2.0d, 2.0d)));
        dVar.L(270, this.f55771l);
    }
}