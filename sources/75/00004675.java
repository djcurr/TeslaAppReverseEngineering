package com.plaid.internal;

import android.content.res.Resources;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.wa;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class z6 {
    public static /* synthetic */ String a(Common$LocalizedString common$LocalizedString, Resources resources, String str, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            i11 = R.string.plaid_empty_string;
        }
        return a(common$LocalizedString, resources, str, i11);
    }

    public static final String a(Common$LocalizedString common$LocalizedString, Resources resources, String str, int i11) {
        String D;
        kotlin.jvm.internal.s.g(common$LocalizedString, "<this>");
        kotlin.jvm.internal.s.g(resources, "resources");
        if (common$LocalizedString.hasKey() || common$LocalizedString.hasTranslation()) {
            if (common$LocalizedString.hasTranslation()) {
                String translation = common$LocalizedString.getTranslation();
                if (translation == null) {
                    String string = resources.getString(i11);
                    kotlin.jvm.internal.s.f(string, "resources.getString(defaultRes)");
                    return string;
                }
                return translation;
            }
            String key = common$LocalizedString.getKey();
            kotlin.jvm.internal.s.f(key, "this.key");
            D = kotlin.text.v.D(key, ".", "_", false, 4, null);
            String p11 = kotlin.jvm.internal.s.p("plaid_", D);
            int identifier = resources.getIdentifier(p11, "string", str);
            if (str != null && identifier == 0) {
                wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("LocalizedString.toText is missing for: ", p11), false, 2);
            }
            try {
                String string2 = resources.getString(identifier);
                kotlin.jvm.internal.s.f(string2, "{\n    resources.getString(id)\n  }");
                return string2;
            } catch (Exception unused) {
                String string3 = resources.getString(i11);
                kotlin.jvm.internal.s.f(string3, "resources.getString(defaultRes)");
                return string3;
            }
        }
        return "";
    }

    public static final Common$LocalizedString a(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return Common$LocalizedString.newBuilder().b(str).build();
    }
}