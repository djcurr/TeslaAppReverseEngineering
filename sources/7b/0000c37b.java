package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.ClientPidMap;
import ih.e;

/* loaded from: classes5.dex */
public class k extends g1<ClientPidMap> {
    public k() {
        super(ClientPidMap.class, "CLIENTPIDMAP");
    }

    private ClientPidMap j(String str, String str2) {
        try {
            return new ClientPidMap(Integer.valueOf(Integer.parseInt(str)), str2);
        } catch (NumberFormatException unused) {
            throw new CannotParseException(4, new Object[0]);
        }
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public ClientPidMap b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        e.a aVar2 = new e.a(str, 2);
        String b11 = aVar2.b();
        String b12 = aVar2.b();
        if (b11 != null && b12 != null) {
            return j(b11, b12);
        }
        throw new CannotParseException(3, new Object[0]);
    }
}