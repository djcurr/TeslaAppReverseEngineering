package x60;

import org.bouncycastle.crypto.p;

/* loaded from: classes5.dex */
class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr, p pVar) {
        pVar.update(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(short s11, p pVar) {
        pVar.update((byte) (s11 >>> 8));
        pVar.update((byte) s11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(int i11, p pVar) {
        pVar.update((byte) (i11 >>> 24));
        pVar.update((byte) (i11 >>> 16));
        pVar.update((byte) (i11 >>> 8));
        pVar.update((byte) i11);
    }
}