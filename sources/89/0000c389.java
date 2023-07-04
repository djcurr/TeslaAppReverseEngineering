package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Revision;
import java.util.Date;

/* loaded from: classes5.dex */
public class q0 extends g1<Revision> {
    public q0() {
        super(Revision.class, "REV");
    }

    private Revision j(String str) {
        if (str != null && str.length() != 0) {
            try {
                return new Revision(g1.c(str));
            } catch (IllegalArgumentException unused) {
                throw new CannotParseException(5, new Object[0]);
            }
        }
        return new Revision((Date) null);
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25380g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Revision b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        return j(str);
    }
}