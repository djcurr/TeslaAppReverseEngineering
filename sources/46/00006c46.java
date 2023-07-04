package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vw.c;

/* loaded from: classes5.dex */
public class ListProperty<T> extends VCardProperty {
    protected final List<T> values;

    public ListProperty() {
        this.values = new ArrayList();
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.values.isEmpty()) {
            list.add(new c(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && this.values.equals(((ListProperty) obj).values);
    }

    public List<T> getValues() {
        return this.values;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        return (super.hashCode() * 31) + this.values.hashCode();
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("values", this.values);
        return linkedHashMap;
    }

    public ListProperty(ListProperty<T> listProperty) {
        super(listProperty);
        this.values = new ArrayList(listProperty.values);
    }
}