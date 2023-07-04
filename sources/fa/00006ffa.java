package g30;

/* loaded from: classes5.dex */
public final class z extends l1<Float, float[], y> {

    /* renamed from: c  reason: collision with root package name */
    public static final z f27691c = new z();

    private z() {
        super(d30.a.t(kotlin.jvm.internal.l.f34915a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public int e(float[] fArr) {
        kotlin.jvm.internal.s.g(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: w */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q, g30.a
    /* renamed from: x */
    public void h(f30.c decoder, int i11, y builder, boolean z11) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        builder.e(decoder.E(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: y */
    public y k(float[] fArr) {
        kotlin.jvm.internal.s.g(fArr, "<this>");
        return new y(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: z */
    public void u(f30.d encoder, float[] content, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.j(getDescriptor(), i12, content[i12]);
        }
    }
}