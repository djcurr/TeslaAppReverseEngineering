package g30;

/* loaded from: classes5.dex */
public final class t extends l1<Double, double[], s> {

    /* renamed from: c  reason: collision with root package name */
    public static final t f27639c = new t();

    private t() {
        super(d30.a.s(kotlin.jvm.internal.k.f34913a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public int e(double[] dArr) {
        kotlin.jvm.internal.s.g(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: w */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q, g30.a
    /* renamed from: x */
    public void h(f30.c decoder, int i11, s builder, boolean z11) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        builder.e(decoder.q(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: y */
    public s k(double[] dArr) {
        kotlin.jvm.internal.s.g(dArr, "<this>");
        return new s(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: z */
    public void u(f30.d encoder, double[] content, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.h(getDescriptor(), i12, content[i12]);
        }
    }
}