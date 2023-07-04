package qf;

import android.util.SparseIntArray;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class g {
    public static u a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new u(81920, PKIFailureInfo.badCertTemplate, sparseIntArray);
    }
}