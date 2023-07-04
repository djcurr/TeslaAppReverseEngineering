package ji;

/* loaded from: classes3.dex */
final class k {
    public static int a(i iVar, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int j11 = iVar.j(bArr, i11 + i13, i12 - i13);
            if (j11 == -1) {
                break;
            }
            i13 += j11;
        }
        return i13;
    }
}