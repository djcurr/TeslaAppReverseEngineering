package op;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@g(tags = {4})
/* loaded from: classes2.dex */
public class e extends b {

    /* renamed from: n  reason: collision with root package name */
    private static Logger f42887n = Logger.getLogger(e.class.getName());

    /* renamed from: d  reason: collision with root package name */
    int f42888d;

    /* renamed from: e  reason: collision with root package name */
    int f42889e;

    /* renamed from: f  reason: collision with root package name */
    int f42890f;

    /* renamed from: g  reason: collision with root package name */
    int f42891g;

    /* renamed from: h  reason: collision with root package name */
    long f42892h;

    /* renamed from: i  reason: collision with root package name */
    long f42893i;

    /* renamed from: j  reason: collision with root package name */
    f f42894j;

    /* renamed from: k  reason: collision with root package name */
    a f42895k;

    /* renamed from: l  reason: collision with root package name */
    List<m> f42896l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    byte[] f42897m;

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        int a11;
        this.f42888d = hb.d.l(byteBuffer);
        int l11 = hb.d.l(byteBuffer);
        this.f42889e = l11 >>> 2;
        this.f42890f = (l11 >> 1) & 1;
        this.f42891g = hb.d.i(byteBuffer);
        this.f42892h = hb.d.j(byteBuffer);
        this.f42893i = hb.d.j(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            b a12 = l.a(this.f42888d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = f42887n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a12);
            sb2.append(" - DecoderConfigDescr1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a12 != null ? Integer.valueOf(a12.a()) : null);
            logger.finer(sb2.toString());
            if (a12 != null && position2 < (a11 = a12.a())) {
                byte[] bArr = new byte[a11 - position2];
                this.f42897m = bArr;
                byteBuffer.get(bArr);
            }
            if (a12 instanceof f) {
                this.f42894j = (f) a12;
            }
            if (a12 instanceof a) {
                this.f42895k = (a) a12;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            b a13 = l.a(this.f42888d, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f42887n;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a13);
            sb3.append(" - DecoderConfigDescr2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a13 != null ? Integer.valueOf(a13.a()) : null);
            logger2.finer(sb3.toString());
            if (a13 instanceof m) {
                this.f42896l.add((m) a13);
            }
        }
    }

    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(g());
        hb.e.i(allocate, 4);
        hb.e.i(allocate, g() - 2);
        hb.e.i(allocate, this.f42888d);
        hb.e.i(allocate, (this.f42889e << 2) | (this.f42890f << 1) | 1);
        hb.e.f(allocate, this.f42891g);
        hb.e.g(allocate, this.f42892h);
        hb.e.g(allocate, this.f42893i);
        a aVar = this.f42895k;
        if (aVar != null) {
            allocate.put(aVar.n().array());
        }
        return allocate;
    }

    public int g() {
        a aVar = this.f42895k;
        return (aVar == null ? 0 : aVar.o()) + 15;
    }

    public void h(a aVar) {
        this.f42895k = aVar;
    }

    public void i(long j11) {
        this.f42893i = j11;
    }

    public void j(int i11) {
        this.f42891g = i11;
    }

    public void k(long j11) {
        this.f42892h = j11;
    }

    public void l(int i11) {
        this.f42888d = i11;
    }

    public void m(int i11) {
        this.f42889e = i11;
    }

    @Override // op.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.f42888d);
        sb2.append(", streamType=");
        sb2.append(this.f42889e);
        sb2.append(", upStream=");
        sb2.append(this.f42890f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f42891g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f42892h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f42893i);
        sb2.append(", decoderSpecificInfo=");
        sb2.append(this.f42894j);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f42895k);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f42897m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(hb.b.a(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        List<m> list = this.f42896l;
        sb2.append(list == null ? Address.ADDRESS_NULL_PLACEHOLDER : Arrays.asList(list).toString());
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}