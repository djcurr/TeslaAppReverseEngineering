package org.spongycastle.asn1.x509;

import java.util.Vector;

/* loaded from: classes5.dex */
public class GeneralNamesBuilder {
    private Vector names = new Vector();

    public GeneralNamesBuilder addName(GeneralName generalName) {
        this.names.addElement(generalName);
        return this;
    }

    public GeneralNamesBuilder addNames(GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i11 = 0; i11 != names.length; i11++) {
            this.names.addElement(names[i11]);
        }
        return this;
    }

    public GeneralNames build() {
        int size = this.names.size();
        GeneralName[] generalNameArr = new GeneralName[size];
        for (int i11 = 0; i11 != size; i11++) {
            generalNameArr[i11] = (GeneralName) this.names.elementAt(i11);
        }
        return new GeneralNames(generalNameArr);
    }
}