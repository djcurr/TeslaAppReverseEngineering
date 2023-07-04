package g30;

/* loaded from: classes5.dex */
public final class s1 extends l1<Short, short[], r1> {

    /* renamed from: c  reason: collision with root package name */
    public static final s1 f27638c = new s1();

    private s1() {
        super(d30.a.w(kotlin.jvm.internal.o0.f34919a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public int e(short[] sArr) {
        kotlin.jvm.internal.s.g(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: w */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q, g30.a
    /* renamed from: x */
    public void h(f30.c decoder, int i11, r1 builder, boolean z11) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        kotlin.jvm.internal.s.g(builder, "builder");
        builder.e(decoder.u(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: y */
    public r1 k(short[] sArr) {
        kotlin.jvm.internal.s.g(sArr, "<this>");
        return new r1(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.l1
    /* renamed from: z */
    public void u(f30.d encoder, short[] content, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.w(getDescriptor(), i12, content[i12]);
        }
    }
}