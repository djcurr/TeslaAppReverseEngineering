package uf;

/* loaded from: classes3.dex */
public class h implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f53431a;

    public h(int i11) {
        this.f53431a = i11;
    }

    @Override // uf.d
    public c createImageTranscoder(af.c cVar, boolean z11) {
        return new g(z11, this.f53431a);
    }
}