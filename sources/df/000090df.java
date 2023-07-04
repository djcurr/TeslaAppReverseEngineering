package org.bouncycastle.asn1;

import ch.qos.logback.core.joran.action.ActionConst;

/* loaded from: classes5.dex */
public abstract class j extends n {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        return nVar instanceof j;
    }

    @Override // e40.c
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return ActionConst.NULL;
    }
}