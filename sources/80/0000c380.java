package yw;

import ezvcard.property.Deathdate;
import ezvcard.util.PartialDate;
import java.util.Date;

/* loaded from: classes5.dex */
public class m extends l<Deathdate> {
    public m() {
        super(Deathdate.class, "DEATHDATE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: n */
    public Deathdate j(PartialDate partialDate) {
        return new Deathdate(partialDate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: o */
    public Deathdate k(String str) {
        return new Deathdate(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.l
    /* renamed from: p */
    public Deathdate l(Date date, boolean z11) {
        return new Deathdate(date, z11);
    }
}