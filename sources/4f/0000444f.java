package com.plaid.internal;

import com.plaid.internal.core.ui_components.PlaidInput;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class j9 {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18890a;

        static {
            int[] iArr = new int[m1.values().length];
            iArr[m1.TEXT_INPUT_TYPE_UNKNOWN.ordinal()] = 1;
            iArr[m1.TEXT_INPUT_TYPE_TEXT.ordinal()] = 2;
            iArr[m1.TEXT_INPUT_TYPE_NUMERIC.ordinal()] = 3;
            iArr[m1.TEXT_INPUT_TYPE_CURRENCY.ordinal()] = 4;
            iArr[m1.TEXT_INPUT_TYPE_MICRODEPOSIT.ordinal()] = 5;
            iArr[m1.TEXT_INPUT_TYPE_EMAIL.ordinal()] = 6;
            iArr[m1.TEXT_INPUT_TYPE_DATE.ordinal()] = 7;
            f18890a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString a(com.plaid.internal.core.ui_components.PlaidInput r14, java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.j9.a(com.plaid.internal.core.ui_components.PlaidInput, java.util.Map):com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.plaid.internal.core.ui_components.PlaidInput r8, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.j9.a(com.plaid.internal.core.ui_components.PlaidInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput):void");
    }

    public static final vz.p<String, String> a(PlaidInput plaidInput) {
        if (plaidInput == null || plaidInput.getVisibility() == 8) {
            return null;
        }
        return new vz.p<>(plaidInput.getTag(R.id.plaid_input_id).toString(), String.valueOf(plaidInput.getText()));
    }
}