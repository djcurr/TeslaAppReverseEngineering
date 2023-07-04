package hf;

import com.facebook.common.memory.PooledByteBuffer;

/* loaded from: classes3.dex */
public class m {

    /* loaded from: classes3.dex */
    static class a implements y<PooledByteBuffer> {
        a() {
        }

        @Override // hf.y
        /* renamed from: b */
        public int a(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    public static i<gd.d, PooledByteBuffer> a(md.n<t> nVar, pd.c cVar) {
        r rVar = new r(new a(), new v(), nVar, null);
        cVar.a(rVar);
        return rVar;
    }
}