package uo;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int[] f53611a;

    /* renamed from: b  reason: collision with root package name */
    private int f53612b;

    public a() {
        this.f53612b = 0;
        this.f53611a = new int[1];
    }

    private static int[] i(int i11) {
        return new int[(i11 + 31) / 32];
    }

    public void a() {
        int length = this.f53611a.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f53611a[i11] = 0;
        }
    }

    /* renamed from: b */
    public a clone() {
        return new a((int[]) this.f53611a.clone(), this.f53612b);
    }

    public boolean c(int i11) {
        return ((1 << (i11 & 31)) & this.f53611a[i11 / 32]) != 0;
    }

    public int[] d() {
        return this.f53611a;
    }

    public int e(int i11) {
        int i12 = this.f53612b;
        if (i11 >= i12) {
            return i12;
        }
        int i13 = i11 / 32;
        int i14 = (~((1 << (i11 & 31)) - 1)) & this.f53611a[i13];
        while (i14 == 0) {
            i13++;
            int[] iArr = this.f53611a;
            if (i13 == iArr.length) {
                return this.f53612b;
            }
            i14 = iArr[i13];
        }
        int numberOfTrailingZeros = (i13 << 5) + Integer.numberOfTrailingZeros(i14);
        int i15 = this.f53612b;
        return numberOfTrailingZeros > i15 ? i15 : numberOfTrailingZeros;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f53612b == aVar.f53612b && Arrays.equals(this.f53611a, aVar.f53611a);
        }
        return false;
    }

    public int f(int i11) {
        int i12 = this.f53612b;
        if (i11 >= i12) {
            return i12;
        }
        int i13 = i11 / 32;
        int i14 = (~((1 << (i11 & 31)) - 1)) & (~this.f53611a[i13]);
        while (i14 == 0) {
            i13++;
            int[] iArr = this.f53611a;
            if (i13 == iArr.length) {
                return this.f53612b;
            }
            i14 = ~iArr[i13];
        }
        int numberOfTrailingZeros = (i13 << 5) + Integer.numberOfTrailingZeros(i14);
        int i15 = this.f53612b;
        return numberOfTrailingZeros > i15 ? i15 : numberOfTrailingZeros;
    }

    public int g() {
        return this.f53612b;
    }

    public boolean h(int i11, int i12, boolean z11) {
        if (i12 < i11 || i11 < 0 || i12 > this.f53612b) {
            throw new IllegalArgumentException();
        }
        if (i12 == i11) {
            return true;
        }
        int i13 = i12 - 1;
        int i14 = i11 / 32;
        int i15 = i13 / 32;
        int i16 = i14;
        while (i16 <= i15) {
            int i17 = (2 << (i16 >= i15 ? 31 & i13 : 31)) - (1 << (i16 > i14 ? 0 : i11 & 31));
            int i18 = this.f53611a[i16] & i17;
            if (!z11) {
                i17 = 0;
            }
            if (i18 != i17) {
                return false;
            }
            i16++;
        }
        return true;
    }

    public int hashCode() {
        return (this.f53612b * 31) + Arrays.hashCode(this.f53611a);
    }

    public void j() {
        int[] iArr = new int[this.f53611a.length];
        int i11 = (this.f53612b - 1) / 32;
        int i12 = i11 + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            long j11 = this.f53611a[i13];
            long j12 = ((j11 & 1431655765) << 1) | ((j11 >> 1) & 1431655765);
            long j13 = ((j12 & 858993459) << 2) | ((j12 >> 2) & 858993459);
            long j14 = ((j13 & 252645135) << 4) | ((j13 >> 4) & 252645135);
            long j15 = ((j14 & 16711935) << 8) | ((j14 >> 8) & 16711935);
            iArr[i11 - i13] = (int) (((j15 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j15 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i14 = this.f53612b;
        int i15 = i12 << 5;
        if (i14 != i15) {
            int i16 = i15 - i14;
            int i17 = iArr[0] >>> i16;
            for (int i18 = 1; i18 < i12; i18++) {
                int i19 = iArr[i18];
                iArr[i18 - 1] = i17 | (i19 << (32 - i16));
                i17 = i19 >>> i16;
            }
            iArr[i12 - 1] = i17;
        }
        this.f53611a = iArr;
    }

    public void k(int i11) {
        int[] iArr = this.f53611a;
        int i12 = i11 / 32;
        iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
    }

    public void l(int i11, int i12) {
        this.f53611a[i11 / 32] = i12;
    }

    public String toString() {
        int i11 = this.f53612b;
        StringBuilder sb2 = new StringBuilder(i11 + (i11 / 8) + 1);
        for (int i12 = 0; i12 < this.f53612b; i12++) {
            if ((i12 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(c(i12) ? 'X' : CoreConstants.DOT);
        }
        return sb2.toString();
    }

    public a(int i11) {
        this.f53612b = i11;
        this.f53611a = i(i11);
    }

    a(int[] iArr, int i11) {
        this.f53611a = iArr;
        this.f53612b = i11;
    }
}