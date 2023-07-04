package hf;

import com.facebook.common.memory.PooledByteBuffer;

/* loaded from: classes3.dex */
public class n {

    /* loaded from: classes3.dex */
    static class a implements u<gd.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f29180a;

        a(o oVar) {
            this.f29180a = oVar;
        }

        @Override // hf.u
        /* renamed from: d */
        public void a(gd.d dVar) {
            this.f29180a.j(dVar);
        }

        @Override // hf.u
        /* renamed from: e */
        public void b(gd.d dVar) {
            this.f29180a.i(dVar);
        }

        @Override // hf.u
        /* renamed from: f */
        public void c(gd.d dVar) {
            this.f29180a.f(dVar);
        }
    }

    public static p<gd.d, PooledByteBuffer> a(s<gd.d, PooledByteBuffer> sVar, o oVar) {
        oVar.e(sVar);
        return new p<>(sVar, new a(oVar));
    }
}