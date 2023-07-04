package qi;

import ji.x;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f48302a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48303b;

    /* renamed from: c  reason: collision with root package name */
    public final x.a f48304c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48305d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f48306e;

    public p(boolean z11, String str, int i11, byte[] bArr, int i12, int i13, byte[] bArr2) {
        ak.a.a((bArr2 == null) ^ (i11 == 0));
        this.f48302a = z11;
        this.f48303b = str;
        this.f48305d = i11;
        this.f48306e = bArr2;
        this.f48304c = new x.a(a(str), bArr, i12, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c11 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 68);
                sb2.append("Unsupported protection scheme type '");
                sb2.append(str);
                sb2.append("'. Assuming AES-CTR crypto mode.");
                ak.o.h("TrackEncryptionBox", sb2.toString());
                break;
        }
        return 1;
    }
}