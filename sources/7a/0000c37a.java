package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Organization;

/* loaded from: classes5.dex */
public class j0 extends g1<Organization> {
    public j0() {
        super(Organization.class, "ORG");
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Organization b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        Organization organization = new Organization();
        organization.getValues().addAll(ih.e.b(str));
        return organization;
    }
}