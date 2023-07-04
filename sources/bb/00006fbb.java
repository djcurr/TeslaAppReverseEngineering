package g30;

/* loaded from: classes5.dex */
public final class h extends l1<Boolean, boolean[], g> {

    /* renamed from: c  reason: collision with root package name */
    public static final h f27595c = new h();

    private h() {
        super(d30.a.p(kotlin.jvm.internal.d.f34898a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public int e(boolean[] zArr) {
        kotlin.jvm.internal.s.g(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: w */
    public boolean[] r() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q, g30.a
    /* renamed from: x */
    public void h(f30.c decoder, int i11, g builder, boolean z11) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        builder.e(decoder.o(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: y */
    public g k(boolean[] zArr) {
        kotlin.jvm.internal.s.g(zArr, "<this>");
        return new g(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: z */
    public void u(f30.d encoder, boolean[] content, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.C(getDescriptor(), i12, content[i12]);
        }
    }
}