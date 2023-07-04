package qc;

import bc.l;
import bc.m;
import java.io.IOException;
import java.util.Collections;
import qc.b;

/* loaded from: classes.dex */
public class h implements qb.c {
    private byte[] d(m mVar, int i11) {
        byte b11;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            byte b12 = mVar.b();
            if ((b12 & 255) == 255 && (b11 = mVar.b()) != 0) {
                throw new IOException("Marker " + com.drew.imaging.jpeg.a.fromByte(b11) + " found inside DHT segment");
            }
            bArr[i12] = b12;
        }
        return bArr;
    }

    @Override // qb.c
    public void a(Iterable<byte[]> iterable, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            c(new l(bArr), eVar);
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.DHT);
    }

    public void c(m mVar, cc.e eVar) {
        b bVar = (b) eVar.e(b.class);
        if (bVar == null) {
            bVar = new b();
            eVar.a(bVar);
        }
        while (mVar.a() > 0) {
            try {
                byte b11 = mVar.b();
                b.a.EnumC1024a typeOf = b.a.EnumC1024a.typeOf((b11 & 240) >> 4);
                int i11 = b11 & 15;
                byte[] d11 = d(mVar, 16);
                int i12 = 0;
                for (byte b12 : d11) {
                    i12 += b12 & 255;
                }
                bVar.V().add(new b.a(typeOf, i11, d11, d(mVar, i12)));
            } catch (IOException e11) {
                bVar.a(e11.getMessage());
            }
        }
        bVar.J(1, bVar.V().size());
    }
}