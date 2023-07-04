package ji;

import ak.k0;
import ci.i;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f33747a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33748b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33749c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33750d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33751e;

    /* renamed from: f  reason: collision with root package name */
    public final int f33752f;

    /* renamed from: g  reason: collision with root package name */
    public final int f33753g;

    /* renamed from: h  reason: collision with root package name */
    public final int f33754h;

    /* renamed from: i  reason: collision with root package name */
    public final int f33755i;

    /* renamed from: j  reason: collision with root package name */
    public final long f33756j;

    /* renamed from: k  reason: collision with root package name */
    public final a f33757k;

    /* renamed from: l  reason: collision with root package name */
    private final wi.a f33758l;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f33759a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f33760b;

        public a(long[] jArr, long[] jArr2) {
            this.f33759a = jArr;
            this.f33760b = jArr2;
        }
    }

    public p(byte[] bArr, int i11) {
        ak.u uVar = new ak.u(bArr);
        uVar.p(i11 * 8);
        this.f33747a = uVar.h(16);
        this.f33748b = uVar.h(16);
        this.f33749c = uVar.h(24);
        this.f33750d = uVar.h(24);
        int h11 = uVar.h(20);
        this.f33751e = h11;
        this.f33752f = k(h11);
        this.f33753g = uVar.h(3) + 1;
        int h12 = uVar.h(5) + 1;
        this.f33754h = h12;
        this.f33755i = f(h12);
        this.f33756j = uVar.j(36);
        this.f33757k = null;
        this.f33758l = null;
    }

    private static wi.a a(List<String> list, List<zi.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11);
            String[] M0 = k0.M0(str, "=");
            if (M0.length != 2) {
                String valueOf = String.valueOf(str);
                ak.o.h("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new zi.b(M0[0], M0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new wi.a(arrayList);
    }

    private static int f(int i11) {
        if (i11 != 8) {
            if (i11 != 12) {
                if (i11 != 16) {
                    if (i11 != 20) {
                        return i11 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int k(int i11) {
        switch (i11) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public p b(List<zi.a> list) {
        return new p(this.f33747a, this.f33748b, this.f33749c, this.f33750d, this.f33751e, this.f33753g, this.f33754h, this.f33756j, this.f33757k, i(a(Collections.emptyList(), list)));
    }

    public p c(a aVar) {
        return new p(this.f33747a, this.f33748b, this.f33749c, this.f33750d, this.f33751e, this.f33753g, this.f33754h, this.f33756j, aVar, this.f33758l);
    }

    public p d(List<String> list) {
        return new p(this.f33747a, this.f33748b, this.f33749c, this.f33750d, this.f33751e, this.f33753g, this.f33754h, this.f33756j, this.f33757k, i(a(list, Collections.emptyList())));
    }

    public long e() {
        long j11;
        long j12;
        int i11 = this.f33750d;
        if (i11 > 0) {
            j11 = (i11 + this.f33749c) / 2;
            j12 = 1;
        } else {
            int i12 = this.f33747a;
            j11 = ((((i12 != this.f33748b || i12 <= 0) ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : i12) * this.f33753g) * this.f33754h) / 8;
            j12 = 64;
        }
        return j11 + j12;
    }

    public long g() {
        long j11 = this.f33756j;
        if (j11 == 0) {
            return -9223372036854775807L;
        }
        return (j11 * 1000000) / this.f33751e;
    }

    public ci.i h(byte[] bArr, wi.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i11 = this.f33750d;
        if (i11 <= 0) {
            i11 = -1;
        }
        return new i.b().e0("audio/flac").W(i11).H(this.f33753g).f0(this.f33751e).T(Collections.singletonList(bArr)).X(i(aVar)).E();
    }

    public wi.a i(wi.a aVar) {
        wi.a aVar2 = this.f33758l;
        return aVar2 == null ? aVar : aVar2.b(aVar);
    }

    public long j(long j11) {
        return k0.s((j11 * this.f33751e) / 1000000, 0L, this.f33756j - 1);
    }

    private p(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, a aVar, wi.a aVar2) {
        this.f33747a = i11;
        this.f33748b = i12;
        this.f33749c = i13;
        this.f33750d = i14;
        this.f33751e = i15;
        this.f33752f = k(i15);
        this.f33753g = i16;
        this.f33754h = i17;
        this.f33755i = f(i17);
        this.f33756j = j11;
        this.f33757k = aVar;
        this.f33758l = aVar2;
    }
}