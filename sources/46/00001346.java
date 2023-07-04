package com.adyen.threeds2;

import android.content.Context;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.internal.h;
import com.adyen.threeds2.parameters.ConfigParameters;
import java.util.List;

/* loaded from: classes.dex */
public interface ThreeDS2Service {
    public static final ThreeDS2Service INSTANCE = h.f9667a;

    void cleanup(Context context);

    Transaction createTransaction(String str, String str2);

    String getSDKVersion();

    List<Warning> getWarnings();

    void initialize(Context context, ConfigParameters configParameters, String str, UiCustomization uiCustomization);
}