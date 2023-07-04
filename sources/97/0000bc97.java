package wc;

import okhttp3.internal.ws.WebSocketProtocol;
import xc.o;

/* loaded from: classes.dex */
public class m extends i {

    /* renamed from: e  reason: collision with root package name */
    int f55778e;

    /* renamed from: f  reason: collision with root package name */
    int f55779f;

    /* renamed from: g  reason: collision with root package name */
    long f55780g;

    /* renamed from: h  reason: collision with root package name */
    long f55781h;

    /* renamed from: i  reason: collision with root package name */
    String f55782i;

    /* renamed from: j  reason: collision with root package name */
    int f55783j;

    public m(bc.m mVar, b bVar) {
        super(mVar, bVar);
        mVar.e();
        mVar.e();
        mVar.m(4);
        mVar.f();
        mVar.f();
        this.f55778e = mVar.p();
        this.f55779f = mVar.p();
        this.f55780g = mVar.q();
        this.f55781h = mVar.q();
        mVar.t(4L);
        mVar.p();
        this.f55782i = mVar.m(32);
        this.f55783j = mVar.p();
        mVar.t(2L);
    }

    public void a(o oVar) {
        oVar.J(104, this.f55778e);
        oVar.J(105, this.f55779f);
        oVar.R(110, this.f55782i.trim());
        oVar.J(109, this.f55783j);
        long j11 = this.f55780g;
        oVar.F(106, ((j11 & (-65536)) >> 16) + ((j11 & WebSocketProtocol.PAYLOAD_SHORT_MAX) / Math.pow(2.0d, 4.0d)));
        long j12 = this.f55781h;
        oVar.F(107, (((-65536) & j12) >> 16) + ((j12 & WebSocketProtocol.PAYLOAD_SHORT_MAX) / Math.pow(2.0d, 4.0d)));
    }
}