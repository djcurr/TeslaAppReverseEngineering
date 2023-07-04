package com.stripe.android.ui.core.elements;

import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface DropdownConfig {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean getTinyMode(DropdownConfig dropdownConfig) {
            s.g(dropdownConfig, "this");
            return false;
        }
    }

    String convertFromRaw(String str);

    String convertToRaw(String str);

    String getDebugLabel();

    List<String> getDisplayItems();

    int getLabel();

    String getSelectedItemLabel(int i11);

    boolean getTinyMode();
}