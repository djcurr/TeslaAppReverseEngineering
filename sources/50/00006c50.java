package ezvcard.property;

import ezvcard.VCardVersion;
import vw.b;

@b({VCardVersion.V3_0, VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class ProductId extends TextProperty {
    public ProductId(String str) {
        super(str);
    }

    public ProductId(ProductId productId) {
        super(productId);
    }

    @Override // ezvcard.property.VCardProperty
    public ProductId copy() {
        return new ProductId(this);
    }
}