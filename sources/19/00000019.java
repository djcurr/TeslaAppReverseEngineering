package a0;

import a0.e;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends FilterOutputStream {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f84g = "Exif\u0000\u0000".getBytes(d.f57d);

    /* renamed from: a  reason: collision with root package name */
    private final e f85a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f86b;

    /* renamed from: c  reason: collision with root package name */
    private final ByteBuffer f87c;

    /* renamed from: d  reason: collision with root package name */
    private int f88d;

    /* renamed from: e  reason: collision with root package name */
    private int f89e;

    /* renamed from: f  reason: collision with root package name */
    private int f90f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(short s11) {
            return (s11 < -64 || s11 > -49 || s11 == -60 || s11 == -56 || s11 == -52) ? false : true;
        }
    }

    public f(OutputStream outputStream, e eVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f86b = new byte[1];
        this.f87c = ByteBuffer.allocate(4);
        this.f88d = 0;
        this.f85a = eVar;
    }

    private int a(int i11, byte[] bArr, int i12, int i13) {
        int min = Math.min(i13, i11 - this.f87c.position());
        this.f87c.put(bArr, i12, min);
        return min;
    }

    private void g(a0.a aVar) {
        g[] gVarArr;
        g[][] gVarArr2 = e.f68h;
        int[] iArr = new int[gVarArr2.length];
        int[] iArr2 = new int[gVarArr2.length];
        for (g gVar : e.f66f) {
            for (int i11 = 0; i11 < e.f68h.length; i11++) {
                this.f85a.b(i11).remove(gVar.f92b);
            }
        }
        if (!this.f85a.b(1).isEmpty()) {
            this.f85a.b(0).put(e.f66f[1].f92b, d.f(0L, this.f85a.c()));
        }
        if (!this.f85a.b(2).isEmpty()) {
            this.f85a.b(0).put(e.f66f[2].f92b, d.f(0L, this.f85a.c()));
        }
        if (!this.f85a.b(3).isEmpty()) {
            this.f85a.b(1).put(e.f66f[3].f92b, d.f(0L, this.f85a.c()));
        }
        for (int i12 = 0; i12 < e.f68h.length; i12++) {
            int i13 = 0;
            for (Map.Entry<String, d> entry : this.f85a.b(i12).entrySet()) {
                int j11 = entry.getValue().j();
                if (j11 > 4) {
                    i13 += j11;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int i14 = 8;
        for (int i15 = 0; i15 < e.f68h.length; i15++) {
            if (!this.f85a.b(i15).isEmpty()) {
                iArr[i15] = i14;
                i14 += (this.f85a.b(i15).size() * 12) + 2 + 4 + iArr2[i15];
            }
        }
        int i16 = i14 + 8;
        if (!this.f85a.b(1).isEmpty()) {
            this.f85a.b(0).put(e.f66f[1].f92b, d.f(iArr[1], this.f85a.c()));
        }
        if (!this.f85a.b(2).isEmpty()) {
            this.f85a.b(0).put(e.f66f[2].f92b, d.f(iArr[2], this.f85a.c()));
        }
        if (!this.f85a.b(3).isEmpty()) {
            this.f85a.b(1).put(e.f66f[3].f92b, d.f(iArr[3], this.f85a.c()));
        }
        aVar.p(i16);
        aVar.write(f84g);
        aVar.l(this.f85a.c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        aVar.a(this.f85a.c());
        aVar.p(42);
        aVar.m(8L);
        for (int i17 = 0; i17 < e.f68h.length; i17++) {
            if (!this.f85a.b(i17).isEmpty()) {
                aVar.p(this.f85a.b(i17).size());
                int size = iArr[i17] + 2 + (this.f85a.b(i17).size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f85a.b(i17).entrySet()) {
                    int i18 = ((g) v3.h.g(e.b.f77f.get(i17).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f91a;
                    d value = entry2.getValue();
                    int j12 = value.j();
                    aVar.p(i18);
                    aVar.p(value.f60a);
                    aVar.j(value.f61b);
                    if (j12 > 4) {
                        aVar.m(size);
                        size += j12;
                    } else {
                        aVar.write(value.f62c);
                        if (j12 < 4) {
                            while (j12 < 4) {
                                aVar.g(0);
                                j12++;
                            }
                        }
                    }
                }
                aVar.m(0L);
                for (Map.Entry<String, d> entry3 : this.f85a.b(i17).entrySet()) {
                    byte[] bArr = entry3.getValue().f62c;
                    if (bArr.length > 4) {
                        aVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        aVar.a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r9 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.f.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) {
        byte[] bArr = this.f86b;
        bArr[0] = (byte) (i11 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}