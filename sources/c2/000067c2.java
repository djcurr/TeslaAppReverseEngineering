package ed;

import bc.l;
import cc.e;
import com.adobe.xmp.XMPException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import k6.d;

/* loaded from: classes.dex */
public class c implements qb.c {
    private static String h(e eVar) {
        Iterator it2 = eVar.c(b.class).iterator();
        while (it2.hasNext()) {
            try {
                k6.b e02 = ((b) it2.next()).V().e0("http://ns.adobe.com/xmp/note/", null, null);
                if (e02 != null) {
                    while (e02.hasNext()) {
                        o6.b bVar = (o6.b) e02.next();
                        if ("xmpNote:HasExtendedXMP".equals(bVar.getPath())) {
                            return bVar.getValue();
                        }
                    }
                    continue;
                }
            } catch (XMPException unused) {
            }
        }
        return null;
    }

    private static byte[] i(e eVar, byte[] bArr, String str, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 75) {
            try {
                l lVar = new l(bArr);
                lVar.t(35);
                if (str.equals(lVar.m(32))) {
                    int q11 = (int) lVar.q();
                    int q12 = (int) lVar.q();
                    if (bArr2 == null) {
                        bArr2 = new byte[q11];
                    }
                    if (bArr2.length == q11) {
                        System.arraycopy(bArr, 75, bArr2, q12, length - 75);
                    } else {
                        b bVar = new b();
                        bVar.a(String.format("Inconsistent length for the Extended XMP buffer: %d instead of %d", Integer.valueOf(q11), Integer.valueOf(bArr2.length)));
                        eVar.a(bVar);
                    }
                }
            } catch (IOException e11) {
                b bVar2 = new b();
                bVar2.a(e11.getMessage());
                eVar.a(bVar2);
            }
        }
        return bArr2;
    }

    @Override // qb.c
    public void a(Iterable<byte[]> iterable, e eVar, com.drew.imaging.jpeg.a aVar) {
        byte[] bArr = null;
        String str = null;
        for (byte[] bArr2 : iterable) {
            if (bArr2.length >= 29 && ("http://ns.adobe.com/xap/1.0/\u0000".equalsIgnoreCase(new String(bArr2, 0, 29)) || "XMP".equalsIgnoreCase(new String(bArr2, 0, 3)))) {
                int length = bArr2.length - 29;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr2, 29, bArr3, 0, length);
                f(bArr3, eVar);
                str = h(eVar);
            } else if (str != null && bArr2.length >= 35 && "http://ns.adobe.com/xmp/extension/\u0000".equalsIgnoreCase(new String(bArr2, 0, 35))) {
                bArr = i(eVar, bArr2, str, bArr);
            }
        }
        if (bArr != null) {
            f(bArr, eVar);
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.APP1);
    }

    public void c(String str, e eVar) {
        d(str, eVar, null);
    }

    public void d(String str, e eVar, cc.b bVar) {
        b bVar2 = new b();
        if (bVar != null) {
            bVar2.O(bVar);
        }
        try {
            bVar2.W(d.f(str));
        } catch (XMPException e11) {
            bVar2.a("Error processing XMP data: " + e11.getMessage());
        }
        if (bVar2.A()) {
            return;
        }
        eVar.a(bVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(byte[] r2, int r3, int r4, cc.e r5, cc.b r6) {
        /*
            r1 = this;
            ed.b r0 = new ed.b
            r0.<init>()
            if (r6 == 0) goto La
            r0.O(r6)
        La:
            if (r3 != 0) goto L14
            int r6 = r2.length     // Catch: com.adobe.xmp.XMPException -> L25
            if (r4 != r6) goto L14
            k6.c r2 = k6.d.d(r2)     // Catch: com.adobe.xmp.XMPException -> L25
            goto L21
        L14:
            l6.a r6 = new l6.a     // Catch: com.adobe.xmp.XMPException -> L25
            r6.<init>(r2, r3, r4)     // Catch: com.adobe.xmp.XMPException -> L25
            java.io.InputStream r2 = r6.f()     // Catch: com.adobe.xmp.XMPException -> L25
            k6.c r2 = k6.d.b(r2)     // Catch: com.adobe.xmp.XMPException -> L25
        L21:
            r0.W(r2)     // Catch: com.adobe.xmp.XMPException -> L25
            goto L3e
        L25:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error processing XMP data: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.a(r2)
        L3e:
            boolean r2 = r0.A()
            if (r2 != 0) goto L47
            r5.a(r0)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.c.e(byte[], int, int, cc.e, cc.b):void");
    }

    public void f(byte[] bArr, e eVar) {
        g(bArr, eVar, null);
    }

    public void g(byte[] bArr, e eVar, cc.b bVar) {
        e(bArr, 0, bArr.length, eVar, bVar);
    }
}