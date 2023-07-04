package fp;

/* loaded from: classes2.dex */
final class b extends f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(uo.a aVar) {
        super(aVar);
    }

    @Override // fp.i
    protected void h(StringBuilder sb2, int i11) {
        if (i11 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // fp.i
    protected int i(int i11) {
        return i11 < 10000 ? i11 : i11 - 10000;
    }
}