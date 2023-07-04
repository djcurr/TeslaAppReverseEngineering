package s2;

/* loaded from: classes.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, char[] cArr, int i11, int i12, int i13) {
        for (int i14 = i12; i14 < i13; i14++) {
            cArr[(i11 + i14) - i12] = str.charAt(i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(String str, char[] cArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = str.length();
        }
        b(str, cArr, i11, i12, i13);
    }
}