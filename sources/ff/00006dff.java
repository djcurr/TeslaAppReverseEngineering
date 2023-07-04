package fa;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f26171b;

    /* renamed from: c  reason: collision with root package name */
    private c f26172c;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f26170a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    private int f26173d = 0;

    private boolean b() {
        return this.f26172c.f26158b != 0;
    }

    private int d() {
        try {
            return this.f26171b.get() & 255;
        } catch (Exception unused) {
            this.f26172c.f26158b = 1;
            return 0;
        }
    }

    private void e() {
        this.f26172c.f26160d.f26146a = n();
        this.f26172c.f26160d.f26147b = n();
        this.f26172c.f26160d.f26148c = n();
        this.f26172c.f26160d.f26149d = n();
        int d11 = d();
        boolean z11 = (d11 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d11 & 7) + 1);
        b bVar = this.f26172c.f26160d;
        bVar.f26150e = (d11 & 64) != 0;
        if (z11) {
            bVar.f26156k = g(pow);
        } else {
            bVar.f26156k = null;
        }
        this.f26172c.f26160d.f26155j = this.f26171b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f26172c;
        cVar.f26159c++;
        cVar.f26161e.add(cVar.f26160d);
    }

    private void f() {
        int d11 = d();
        this.f26173d = d11;
        if (d11 <= 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            try {
                i12 = this.f26173d;
                if (i11 >= i12) {
                    return;
                }
                i12 -= i11;
                this.f26171b.get(this.f26170a, i11, i12);
                i11 += i12;
            } catch (Exception e11) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i11 + " count: " + i12 + " blockSize: " + this.f26173d, e11);
                }
                this.f26172c.f26158b = 1;
                return;
            }
        }
    }

    private int[] g(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f26171b.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                int i17 = i12 + 1;
                iArr[i12] = ((bArr[i13] & 255) << 16) | (-16777216) | ((bArr[i14] & 255) << 8) | (bArr[i15] & 255);
                i13 = i16;
                i12 = i17;
            }
        } catch (BufferUnderflowException e11) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e11);
            }
            this.f26172c.f26158b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i11) {
        boolean z11 = false;
        while (!z11 && !b() && this.f26172c.f26159c <= i11) {
            int d11 = d();
            if (d11 == 33) {
                int d12 = d();
                if (d12 == 1) {
                    q();
                } else if (d12 == 249) {
                    this.f26172c.f26160d = new b();
                    j();
                } else if (d12 == 254) {
                    q();
                } else if (d12 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < 11; i12++) {
                        sb2.append((char) this.f26170a[i12]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d11 == 44) {
                c cVar = this.f26172c;
                if (cVar.f26160d == null) {
                    cVar.f26160d = new b();
                }
                e();
            } else if (d11 != 59) {
                this.f26172c.f26158b = 1;
            } else {
                z11 = true;
            }
        }
    }

    private void j() {
        d();
        int d11 = d();
        b bVar = this.f26172c.f26160d;
        int i11 = (d11 & 28) >> 2;
        bVar.f26152g = i11;
        if (i11 == 0) {
            bVar.f26152g = 1;
        }
        bVar.f26151f = (d11 & 1) != 0;
        int n11 = n();
        if (n11 < 2) {
            n11 = 10;
        }
        b bVar2 = this.f26172c.f26160d;
        bVar2.f26154i = n11 * 10;
        bVar2.f26153h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f26172c.f26158b = 1;
            return;
        }
        l();
        if (!this.f26172c.f26164h || b()) {
            return;
        }
        c cVar = this.f26172c;
        cVar.f26157a = g(cVar.f26165i);
        c cVar2 = this.f26172c;
        cVar2.f26168l = cVar2.f26157a[cVar2.f26166j];
    }

    private void l() {
        this.f26172c.f26162f = n();
        this.f26172c.f26163g = n();
        int d11 = d();
        c cVar = this.f26172c;
        cVar.f26164h = (d11 & 128) != 0;
        cVar.f26165i = (int) Math.pow(2.0d, (d11 & 7) + 1);
        this.f26172c.f26166j = d();
        this.f26172c.f26167k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f26170a;
            if (bArr[0] == 1) {
                this.f26172c.f26169m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f26173d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f26171b.getShort();
    }

    private void o() {
        this.f26171b = null;
        Arrays.fill(this.f26170a, (byte) 0);
        this.f26172c = new c();
        this.f26173d = 0;
    }

    private void q() {
        int d11;
        do {
            d11 = d();
            this.f26171b.position(Math.min(this.f26171b.position() + d11, this.f26171b.limit()));
        } while (d11 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f26171b = null;
        this.f26172c = null;
    }

    public c c() {
        if (this.f26171b != null) {
            if (b()) {
                return this.f26172c;
            }
            k();
            if (!b()) {
                h();
                c cVar = this.f26172c;
                if (cVar.f26159c < 0) {
                    cVar.f26158b = 1;
                }
            }
            return this.f26172c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f26171b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f26171b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}