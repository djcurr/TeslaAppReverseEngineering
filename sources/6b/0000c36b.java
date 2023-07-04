package yw;

import ezvcard.property.Birthday;
import ezvcard.util.PartialDate;
import java.util.Date;

/* loaded from: classes5.dex */
public class e extends l<Birthday> {
    public e() {
        super(Birthday.class, "BDAY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: n */
    public Birthday j(PartialDate partialDate) {
        return new Birthday(partialDate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: o */
    public Birthday k(String str) {
        return new Birthday(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: p */
    public Birthday l(Date date, boolean z11) {
        return new Birthday(date, z11);
    }
}