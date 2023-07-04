package ka;

/* loaded from: classes.dex */
public final class g implements a<byte[]> {
    @Override // ka.a
    public int a() {
        return 1;
    }

    @Override // ka.a
    /* renamed from: c */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // ka.a
    /* renamed from: d */
    public byte[] newArray(int i11) {
        return new byte[i11];
    }

    @Override // ka.a
    public String getTag() {
        return "ByteArrayPool";
    }
}