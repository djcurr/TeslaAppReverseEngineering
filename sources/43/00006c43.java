package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.VCardParameters;
import java.util.List;
import vw.b;

@b({VCardVersion.V2_1, VCardVersion.V3_0})
/* loaded from: classes5.dex */
public class Label extends TextProperty {
    public Label(String str) {
        super(str);
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    public List<AddressType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.c<AddressType>(vCardParameters) { // from class: ezvcard.property.Label.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.d
            public AddressType _asObject(String str) {
                return AddressType.d(str);
            }
        };
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    public Label(Label label) {
        super(label);
    }

    @Override // ezvcard.property.VCardProperty
    public Label copy() {
        return new Label(this);
    }
}