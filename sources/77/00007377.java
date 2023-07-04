package hl;

import ol.a0;
import ol.i0;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f29315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29316a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f29317b;

        static {
            int[] iArr = new int[b.values().length];
            f29317b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29317b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29317b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29317b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i0.values().length];
            f29316a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29316a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29316a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29316a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private g(a0 a0Var) {
        this.f29315a = a0Var;
    }

    public static g a(String str, byte[] bArr, b bVar) {
        return new g(a0.K().o(str).p(com.google.crypto.tink.shaded.protobuf.i.f(bArr)).n(c(bVar)).build());
    }

    private static i0 c(b bVar) {
        int i11 = a.f29317b[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return i0.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return i0.RAW;
            }
            return i0.LEGACY;
        }
        return i0.TINK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0 b() {
        return this.f29315a;
    }
}