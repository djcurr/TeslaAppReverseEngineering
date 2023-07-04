package yp;

import ch.qos.logback.core.CoreConstants;
import hb.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import op.c;
import op.d;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f59683a;

    /* renamed from: b  reason: collision with root package name */
    public int f59684b;

    /* renamed from: c  reason: collision with root package name */
    public int f59685c;

    /* renamed from: d  reason: collision with root package name */
    public int f59686d;

    /* renamed from: e  reason: collision with root package name */
    public int f59687e;

    /* renamed from: f  reason: collision with root package name */
    public List<byte[]> f59688f;

    /* renamed from: g  reason: collision with root package name */
    public List<byte[]> f59689g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f59690h;

    /* renamed from: i  reason: collision with root package name */
    public int f59691i;

    /* renamed from: j  reason: collision with root package name */
    public int f59692j;

    /* renamed from: k  reason: collision with root package name */
    public int f59693k;

    /* renamed from: l  reason: collision with root package name */
    public List<byte[]> f59694l;

    /* renamed from: m  reason: collision with root package name */
    public int f59695m;

    /* renamed from: n  reason: collision with root package name */
    public int f59696n;

    /* renamed from: o  reason: collision with root package name */
    public int f59697o;

    /* renamed from: p  reason: collision with root package name */
    public int f59698p;

    /* renamed from: q  reason: collision with root package name */
    public int f59699q;

    public b() {
        this.f59688f = new ArrayList();
        this.f59689g = new ArrayList();
        this.f59690h = true;
        this.f59691i = 1;
        this.f59692j = 0;
        this.f59693k = 0;
        this.f59694l = new ArrayList();
        this.f59695m = 63;
        this.f59696n = 7;
        this.f59697o = 31;
        this.f59698p = 31;
        this.f59699q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        e.i(byteBuffer, this.f59683a);
        e.i(byteBuffer, this.f59684b);
        e.i(byteBuffer, this.f59685c);
        e.i(byteBuffer, this.f59686d);
        d dVar = new d(byteBuffer);
        dVar.a(this.f59695m, 6);
        dVar.a(this.f59687e, 2);
        dVar.a(this.f59696n, 3);
        dVar.a(this.f59689g.size(), 5);
        for (byte[] bArr : this.f59688f) {
            e.e(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        e.i(byteBuffer, this.f59689g.size());
        for (byte[] bArr2 : this.f59689g) {
            e.e(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f59690h) {
            int i11 = this.f59684b;
            if (i11 == 100 || i11 == 110 || i11 == 122 || i11 == 144) {
                d dVar2 = new d(byteBuffer);
                dVar2.a(this.f59697o, 6);
                dVar2.a(this.f59691i, 2);
                dVar2.a(this.f59698p, 5);
                dVar2.a(this.f59692j, 3);
                dVar2.a(this.f59699q, 5);
                dVar2.a(this.f59693k, 3);
                for (byte[] bArr3 : this.f59694l) {
                    e.e(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long b() {
        int i11;
        long j11 = 6;
        for (byte[] bArr : this.f59688f) {
            j11 = j11 + 2 + bArr.length;
        }
        long j12 = j11 + 1;
        for (byte[] bArr2 : this.f59689g) {
            j12 = j12 + 2 + bArr2.length;
        }
        if (this.f59690h && ((i11 = this.f59684b) == 100 || i11 == 110 || i11 == 122 || i11 == 144)) {
            j12 += 4;
            for (byte[] bArr3 : this.f59694l) {
                j12 = j12 + 2 + bArr3.length;
            }
        }
        return j12;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f59683a + ", avcProfileIndication=" + this.f59684b + ", profileCompatibility=" + this.f59685c + ", avcLevelIndication=" + this.f59686d + ", lengthSizeMinusOne=" + this.f59687e + ", hasExts=" + this.f59690h + ", chromaFormat=" + this.f59691i + ", bitDepthLumaMinus8=" + this.f59692j + ", bitDepthChromaMinus8=" + this.f59693k + ", lengthSizeMinusOnePaddingBits=" + this.f59695m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f59696n + ", chromaFormatPaddingBits=" + this.f59697o + ", bitDepthLumaMinus8PaddingBits=" + this.f59698p + ", bitDepthChromaMinus8PaddingBits=" + this.f59699q + CoreConstants.CURLY_RIGHT;
    }

    public b(ByteBuffer byteBuffer) {
        int i11;
        this.f59688f = new ArrayList();
        this.f59689g = new ArrayList();
        this.f59690h = true;
        this.f59691i = 1;
        this.f59692j = 0;
        this.f59693k = 0;
        this.f59694l = new ArrayList();
        this.f59695m = 63;
        this.f59696n = 7;
        this.f59697o = 31;
        this.f59698p = 31;
        this.f59699q = 31;
        this.f59683a = hb.d.l(byteBuffer);
        this.f59684b = hb.d.l(byteBuffer);
        this.f59685c = hb.d.l(byteBuffer);
        this.f59686d = hb.d.l(byteBuffer);
        c cVar = new c(byteBuffer);
        this.f59695m = cVar.a(6);
        this.f59687e = cVar.a(2);
        this.f59696n = cVar.a(3);
        int a11 = cVar.a(5);
        for (int i12 = 0; i12 < a11; i12++) {
            byte[] bArr = new byte[hb.d.h(byteBuffer)];
            byteBuffer.get(bArr);
            this.f59688f.add(bArr);
        }
        long l11 = hb.d.l(byteBuffer);
        for (int i13 = 0; i13 < l11; i13++) {
            byte[] bArr2 = new byte[hb.d.h(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f59689g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f59690h = false;
        }
        if (this.f59690h && ((i11 = this.f59684b) == 100 || i11 == 110 || i11 == 122 || i11 == 144)) {
            c cVar2 = new c(byteBuffer);
            this.f59697o = cVar2.a(6);
            this.f59691i = cVar2.a(2);
            this.f59698p = cVar2.a(5);
            this.f59692j = cVar2.a(3);
            this.f59699q = cVar2.a(5);
            this.f59693k = cVar2.a(3);
            long l12 = hb.d.l(byteBuffer);
            for (int i14 = 0; i14 < l12; i14++) {
                byte[] bArr3 = new byte[hb.d.h(byteBuffer)];
                byteBuffer.get(bArr3);
                this.f59694l.add(bArr3);
            }
            return;
        }
        this.f59691i = -1;
        this.f59692j = -1;
        this.f59693k = -1;
    }
}