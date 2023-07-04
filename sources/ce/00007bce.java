package ji;

/* loaded from: classes3.dex */
public interface i extends zj.f {
    boolean a(byte[] bArr, int i11, int i12, boolean z11);

    void d();

    boolean e(byte[] bArr, int i11, int i12, boolean z11);

    long f();

    void g(int i11);

    long getLength();

    long getPosition();

    int h(int i11);

    int j(byte[] bArr, int i11, int i12);

    void k(int i11);

    boolean l(int i11, boolean z11);

    void n(byte[] bArr, int i11, int i12);

    @Override // zj.f
    int read(byte[] bArr, int i11, int i12);

    void readFully(byte[] bArr, int i11, int i12);
}