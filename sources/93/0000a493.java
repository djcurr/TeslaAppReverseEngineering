package org.spongycastle.tsp;

import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.tsp.Accuracy;

/* loaded from: classes4.dex */
public class GenTimeAccuracy {
    private Accuracy accuracy;

    public GenTimeAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    private String format(int i11) {
        if (i11 < 10) {
            return "00" + i11;
        } else if (i11 < 100) {
            return "0" + i11;
        } else {
            return Integer.toString(i11);
        }
    }

    private int getTimeComponent(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            return aSN1Integer.getValue().intValue();
        }
        return 0;
    }

    public int getMicros() {
        return getTimeComponent(this.accuracy.getMicros());
    }

    public int getMillis() {
        return getTimeComponent(this.accuracy.getMillis());
    }

    public int getSeconds() {
        return getTimeComponent(this.accuracy.getSeconds());
    }

    public String toString() {
        return getSeconds() + "." + format(getMillis()) + format(getMicros());
    }
}