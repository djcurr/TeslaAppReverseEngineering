package sz;

import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sz.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1133a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f50887a;

        /* renamed from: b  reason: collision with root package name */
        public int f50888b;

        AbstractC1133a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b extends AbstractC1133a {

        /* renamed from: j  reason: collision with root package name */
        private static final byte[] f50889j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k  reason: collision with root package name */
        private static final byte[] f50890k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f50891c;

        /* renamed from: d  reason: collision with root package name */
        int f50892d;

        /* renamed from: e  reason: collision with root package name */
        private int f50893e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f50894f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f50895g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f50896h;

        /* renamed from: i  reason: collision with root package name */
        private final byte[] f50897i;

        public b(int i11, byte[] bArr) {
            this.f50887a = bArr;
            this.f50894f = (i11 & 1) == 0;
            boolean z11 = (i11 & 2) == 0;
            this.f50895g = z11;
            this.f50896h = (i11 & 4) != 0;
            this.f50897i = (i11 & 8) == 0 ? f50889j : f50890k;
            this.f50891c = new byte[2];
            this.f50892d = 0;
            this.f50893e = z11 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:22:0x008a). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sz.a.b.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i11) {
        return b(bArr, 0, bArr.length, i11);
    }

    public static byte[] b(byte[] bArr, int i11, int i12, int i13) {
        b bVar = new b(i13, null);
        int i14 = (i12 / 3) * 4;
        if (bVar.f50894f) {
            if (i12 % 3 > 0) {
                i14 += 4;
            }
        } else {
            int i15 = i12 % 3;
            if (i15 == 1) {
                i14 += 2;
            } else if (i15 == 2) {
                i14 += 3;
            }
        }
        if (bVar.f50895g && i12 > 0) {
            i14 += (((i12 - 1) / 57) + 1) * (bVar.f50896h ? 2 : 1);
        }
        bVar.f50887a = new byte[i14];
        bVar.a(bArr, i11, i12, true);
        return bVar.f50887a;
    }

    public static String c(byte[] bArr, int i11) {
        try {
            return new String(a(bArr, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}