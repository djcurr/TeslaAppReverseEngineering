package org.spongycastle.crypto.modes.gcm;

import java.util.Vector;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class Tables1kGCMExponentiator implements GCMExponentiator {
    private Vector lookupPowX2;

    private void ensureAvailable(int i11) {
        int size = this.lookupPowX2.size();
        if (size <= i11) {
            int[] iArr = (int[]) this.lookupPowX2.elementAt(size - 1);
            do {
                iArr = Arrays.clone(iArr);
                GCMUtil.multiply(iArr, iArr);
                this.lookupPowX2.addElement(iArr);
                size++;
            } while (size <= i11);
        }
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j11, byte[] bArr) {
        int[] oneAsInts = GCMUtil.oneAsInts();
        int i11 = 0;
        while (j11 > 0) {
            if ((1 & j11) != 0) {
                ensureAvailable(i11);
                GCMUtil.multiply(oneAsInts, (int[]) this.lookupPowX2.elementAt(i11));
            }
            i11++;
            j11 >>>= 1;
        }
        GCMUtil.asBytes(oneAsInts, bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        int[] asInts = GCMUtil.asInts(bArr);
        Vector vector = this.lookupPowX2;
        if (vector == null || !Arrays.areEqual(asInts, (int[]) vector.elementAt(0))) {
            Vector vector2 = new Vector(8);
            this.lookupPowX2 = vector2;
            vector2.addElement(asInts);
        }
    }
}