package org.spongycastle.dvcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.dvcs.Data;
import org.spongycastle.asn1.dvcs.TargetEtcChain;

/* loaded from: classes4.dex */
public class VPKCRequestData extends DVCSRequestData {
    private List chains;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VPKCRequestData(Data data) {
        super(data);
        TargetEtcChain[] certs = data.getCerts();
        if (certs != null) {
            this.chains = new ArrayList(certs.length);
            for (int i11 = 0; i11 != certs.length; i11++) {
                this.chains.add(new TargetChain(certs[i11]));
            }
            return;
        }
        throw new DVCSConstructionException("DVCSRequest.data.certs should be specified for VPKC service");
    }

    public List getCerts() {
        return Collections.unmodifiableList(this.chains);
    }
}