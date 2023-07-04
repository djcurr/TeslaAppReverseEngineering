package qc;

import java.util.Collections;

/* loaded from: classes.dex */
public class e implements qb.c {
    @Override // qb.c
    public void a(Iterable<byte[]> iterable, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            d dVar = new d();
            eVar.a(dVar);
            dVar.T(0, new cc.f(bArr, null));
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.COM);
    }
}