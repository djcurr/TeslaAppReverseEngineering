package org.spongycastle.cms;

import org.spongycastle.util.Selector;

/* loaded from: classes5.dex */
public abstract class RecipientId implements Selector {
    public static final int kek = 1;
    public static final int keyAgree = 2;
    public static final int keyTrans = 0;
    public static final int password = 3;
    private final int type;

    /* JADX INFO: Access modifiers changed from: protected */
    public RecipientId(int i11) {
        this.type = i11;
    }

    @Override // org.spongycastle.util.Selector
    public abstract Object clone();

    public int getType() {
        return this.type;
    }
}