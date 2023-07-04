package j$.time;

import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import j$.time.temporal.x;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes7.dex */
public enum j implements j$.time.temporal.k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a  reason: collision with root package name */
    private static final j[] f32945a = values();

    public static j k(int i11) {
        if (i11 < 1 || i11 > 12) {
            throw new c("Invalid value for MonthOfYear: " + i11);
        }
        return f32945a[i11 - 1];
    }

    @Override // j$.time.temporal.k
    public int b(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.MONTH_OF_YEAR ? i() : super.b(lVar);
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.MONTH_OF_YEAR : lVar != null && lVar.h(this);
    }

    @Override // j$.time.temporal.k
    public Object d(u uVar) {
        int i11 = t.f32969a;
        return uVar == n.f32963a ? j$.time.chrono.g.f32874a : uVar == o.f32964a ? j$.time.temporal.b.MONTHS : super.d(uVar);
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return i();
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new w("Unsupported field: " + lVar);
        }
        return lVar.d(this);
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.MONTH_OF_YEAR ? lVar.g() : super.g(lVar);
    }

    public int h(boolean z11) {
        int i11;
        switch (i.f32944a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                i11 = 91;
                break;
            case 3:
                i11 = 152;
                break;
            case 4:
                i11 = 244;
                break;
            case 5:
                i11 = 305;
                break;
            case 6:
                return 1;
            case 7:
                i11 = 60;
                break;
            case 8:
                i11 = 121;
                break;
            case 9:
                i11 = CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                break;
            case 10:
                i11 = 213;
                break;
            case 11:
                i11 = 274;
                break;
            default:
                i11 = 335;
                break;
        }
        return (z11 ? 1 : 0) + i11;
    }

    public int i() {
        return ordinal() + 1;
    }

    public j l(long j11) {
        return f32945a[((((int) (j11 % 12)) + 12) + ordinal()) % 12];
    }
}