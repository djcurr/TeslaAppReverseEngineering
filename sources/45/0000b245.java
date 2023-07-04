package sc;

import java.util.Calendar;
import java.util.Date;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: c  reason: collision with root package name */
    long f50333c;

    /* renamed from: d  reason: collision with root package name */
    long f50334d;

    /* renamed from: e  reason: collision with root package name */
    long f50335e;

    /* renamed from: f  reason: collision with root package name */
    long f50336f;

    /* renamed from: g  reason: collision with root package name */
    int f50337g;

    /* renamed from: h  reason: collision with root package name */
    int f50338h;

    /* renamed from: i  reason: collision with root package name */
    long f50339i;

    /* renamed from: j  reason: collision with root package name */
    long f50340j;

    /* renamed from: k  reason: collision with root package name */
    long f50341k;

    /* renamed from: l  reason: collision with root package name */
    long f50342l;

    /* renamed from: m  reason: collision with root package name */
    long f50343m;

    /* renamed from: n  reason: collision with root package name */
    long f50344n;

    /* renamed from: o  reason: collision with root package name */
    long f50345o;

    public f(bc.m mVar, a aVar) {
        super(mVar, aVar);
        this.f50333c = mVar.q();
        this.f50334d = mVar.q();
        this.f50335e = mVar.q();
        this.f50336f = mVar.q();
        this.f50337g = mVar.f();
        this.f50338h = mVar.e();
        mVar.t(10L);
        mVar.f();
        mVar.f();
        mVar.f();
        mVar.f();
        mVar.f();
        mVar.f();
        mVar.f();
        mVar.f();
        mVar.f();
        this.f50339i = mVar.q();
        this.f50340j = mVar.q();
        this.f50341k = mVar.q();
        this.f50342l = mVar.q();
        this.f50343m = mVar.q();
        this.f50344n = mVar.q();
        this.f50345o = mVar.q();
    }

    public void a(rc.d dVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1904, 0, 1, 0, 0, 0);
        long time = calendar.getTime().getTime();
        dVar.D(256, new Date((this.f50333c * 1000) + time));
        dVar.D(257, new Date((this.f50334d * 1000) + time));
        long j11 = this.f50336f / this.f50335e;
        this.f50336f = j11;
        dVar.L(259, j11);
        dVar.L(258, this.f50335e);
        int i11 = this.f50337g;
        dVar.F(260, (((-65536) & i11) >> 16) + ((i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) / Math.pow(2.0d, 4.0d)));
        int i12 = this.f50338h;
        dVar.F(261, ((65280 & i12) >> 8) + ((i12 & 255) / Math.pow(2.0d, 2.0d)));
        dVar.L(264, this.f50339i);
        dVar.L(265, this.f50340j);
        dVar.L(266, this.f50341k);
        dVar.L(267, this.f50342l);
        dVar.L(268, this.f50343m);
        dVar.L(269, this.f50344n);
        dVar.L(270, this.f50345o);
    }
}