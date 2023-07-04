package yw;

import ezvcard.property.Anniversary;
import ezvcard.util.PartialDate;
import java.util.Date;

/* loaded from: classes5.dex */
public class c extends l<Anniversary> {
    public c() {
        super(Anniversary.class, "ANNIVERSARY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: n */
    public Anniversary j(PartialDate partialDate) {
        return new Anniversary(partialDate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: o */
    public Anniversary k(String str) {
        return new Anniversary(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: p */
    public Anniversary l(Date date, boolean z11) {
        return new Anniversary(date, z11);
    }
}