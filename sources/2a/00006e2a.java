package fi;

import ak.k0;
import android.media.MediaCodec;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    public byte[] f26246a;

    /* renamed from: b */
    public byte[] f26247b;

    /* renamed from: c */
    public int f26248c;

    /* renamed from: d */
    public int[] f26249d;

    /* renamed from: e */
    public int[] f26250e;

    /* renamed from: f */
    public int f26251f;

    /* renamed from: g */
    public int f26252g;

    /* renamed from: h */
    public int f26253h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f26254i;

    /* renamed from: j */
    private final C0518b f26255j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.b$b */
    /* loaded from: classes3.dex */
    public static final class C0518b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f26256a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f26257b;

        public void b(int i11, int i12) {
            this.f26257b.set(i11, i12);
            this.f26256a.setPattern(this.f26257b);
        }

        private C0518b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f26256a = cryptoInfo;
            this.f26257b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f26254i = cryptoInfo;
        this.f26255j = k0.f477a >= 24 ? new C0518b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f26254i;
    }

    public void b(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f26249d == null) {
            int[] iArr = new int[1];
            this.f26249d = iArr;
            this.f26254i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f26249d;
        iArr2[0] = iArr2[0] + i11;
    }

    public void c(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        this.f26251f = i11;
        this.f26249d = iArr;
        this.f26250e = iArr2;
        this.f26247b = bArr;
        this.f26246a = bArr2;
        this.f26248c = i12;
        this.f26252g = i13;
        this.f26253h = i14;
        MediaCodec.CryptoInfo cryptoInfo = this.f26254i;
        cryptoInfo.numSubSamples = i11;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i12;
        if (k0.f477a >= 24) {
            ((C0518b) ak.a.e(this.f26255j)).b(i13, i14);
        }
    }
}