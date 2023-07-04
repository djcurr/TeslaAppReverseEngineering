package qa;

import bb.j;
import ja.c;

/* loaded from: classes.dex */
public class b implements c<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f48041a;

    public b(byte[] bArr) {
        this.f48041a = (byte[]) j.d(bArr);
    }

    @Override // ja.c
    public int a() {
        return this.f48041a.length;
    }

    @Override // ja.c
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // ja.c
    /* renamed from: c */
    public byte[] get() {
        return this.f48041a;
    }

    @Override // ja.c
    public void recycle() {
    }
}