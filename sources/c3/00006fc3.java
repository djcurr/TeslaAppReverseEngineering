package g30;

/* loaded from: classes5.dex */
public final class j0 extends l1<Integer, int[], i0> {

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f27604c = new j0();

    private j0() {
        super(d30.a.u(kotlin.jvm.internal.r.f34922a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public int e(int[] iArr) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: w */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q, g30.a
    /* renamed from: x */
    public void h(f30.c decoder, int i11, i0 builder, boolean z11) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        builder.e(decoder.C(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: y */
    public i0 k(int[] iArr) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        return new i0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: z */
    public void u(f30.d encoder, int[] content, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.n(getDescriptor(), i12, content[i12]);
        }
    }
}