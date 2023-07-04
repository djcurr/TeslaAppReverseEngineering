package g30;

/* loaded from: classes5.dex */
public final class t0 extends l1<Long, long[], s0> {

    /* renamed from: c  reason: collision with root package name */
    public static final t0 f27640c = new t0();

    private t0() {
        super(d30.a.v(kotlin.jvm.internal.v.f34931a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public int e(long[] jArr) {
        kotlin.jvm.internal.s.g(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: w */
    public long[] r() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q, g30.a
    /* renamed from: x */
    public void h(f30.c decoder, int i11, s0 builder, boolean z11) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        builder.e(decoder.x(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: y */
    public s0 k(long[] jArr) {
        kotlin.jvm.internal.s.g(jArr, "<this>");
        return new s0(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: z */
    public void u(f30.d encoder, long[] content, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.f(getDescriptor(), i12, content[i12]);
        }
    }
}