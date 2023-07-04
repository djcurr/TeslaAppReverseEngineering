package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.elements.DropdownConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.u;
import wz.x;

/* loaded from: classes6.dex */
public final class SimpleDropdownConfig implements DropdownConfig {
    public static final int $stable = 8;
    private final String debugLabel;
    private final List<String> displayItems;
    private final List<DropdownItemSpec> items;
    private final int label;

    public SimpleDropdownConfig(int i11, List<DropdownItemSpec> items) {
        int t11;
        s.g(items, "items");
        this.label = i11;
        this.items = items;
        this.debugLabel = "simple_dropdown";
        t11 = x.t(items, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (DropdownItemSpec dropdownItemSpec : items) {
            arrayList.add(dropdownItemSpec.getDisplayText());
        }
        this.displayItems = arrayList;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        Object obj;
        s.g(rawValue, "rawValue");
        Iterator<T> it2 = this.items.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(((DropdownItemSpec) obj).getApiValue(), rawValue)) {
                break;
            }
        }
        DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) obj;
        String displayText = dropdownItemSpec != null ? dropdownItemSpec.getDisplayText() : null;
        return displayText == null ? this.items.get(0).getDisplayText() : displayText;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String convertToRaw(String displayName) {
        int t11;
        s.g(displayName, "displayName");
        List<DropdownItemSpec> list = this.items;
        ArrayList<DropdownItemSpec> arrayList = new ArrayList();
        for (Object obj : list) {
            if (s.c(((DropdownItemSpec) obj).getDisplayText(), displayName)) {
                arrayList.add(obj);
            }
        }
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (DropdownItemSpec dropdownItemSpec : arrayList) {
            arrayList2.add(dropdownItemSpec.getApiValue());
        }
        return (String) u.d0(arrayList2);
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public List<String> getDisplayItems() {
        return this.displayItems;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public int getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public String getSelectedItemLabel(int i11) {
        return getDisplayItems().get(i11);
    }

    @Override // com.stripe.android.ui.core.elements.DropdownConfig
    public boolean getTinyMode() {
        return DropdownConfig.DefaultImpls.getTinyMode(this);
    }
}