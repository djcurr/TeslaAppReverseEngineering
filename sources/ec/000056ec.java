package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.forms.Delayed;
import com.stripe.android.paymentsheet.forms.SIRequirement;
import com.stripe.android.ui.core.elements.LayoutFormDescriptor;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class SupportedPaymentMethodKtxKt {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r7.getAllowsDelayedPaymentMethods() != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r4 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean checkPaymentIntentRequirements(java.util.Set<? extends com.stripe.android.paymentsheet.forms.PIRequirement> r5, com.stripe.android.model.PaymentIntent r6, com.stripe.android.paymentsheet.PaymentSheet.Configuration r7) {
        /*
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L7
        L4:
            r0 = r1
            goto La3
        L7:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = wz.u.t(r5, r3)
            r2.<init>(r3)
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r5.next()
            com.stripe.android.paymentsheet.forms.PIRequirement r3 = (com.stripe.android.paymentsheet.forms.PIRequirement) r3
            com.stripe.android.paymentsheet.forms.Delayed r4 = com.stripe.android.paymentsheet.forms.Delayed.INSTANCE
            boolean r4 = kotlin.jvm.internal.s.c(r3, r4)
            if (r4 == 0) goto L37
            if (r7 != 0) goto L2f
        L2c:
            r3 = r1
            goto L8d
        L2f:
            boolean r3 = r7.getAllowsDelayedPaymentMethods()
            if (r3 != r0) goto L2c
        L35:
            r3 = r0
            goto L8d
        L37:
            com.stripe.android.paymentsheet.forms.ShippingAddress r4 = com.stripe.android.paymentsheet.forms.ShippingAddress.INSTANCE
            boolean r3 = kotlin.jvm.internal.s.c(r3, r4)
            if (r3 == 0) goto L95
            com.stripe.android.model.PaymentIntent$Shipping r3 = r6.getShipping()
            r4 = 0
            if (r3 != 0) goto L48
            r3 = r4
            goto L4c
        L48:
            java.lang.String r3 = r3.getName()
        L4c:
            if (r3 == 0) goto L2c
            com.stripe.android.model.PaymentIntent$Shipping r3 = r6.getShipping()
            if (r3 != 0) goto L56
        L54:
            r3 = r4
            goto L61
        L56:
            com.stripe.android.model.Address r3 = r3.getAddress()
            if (r3 != 0) goto L5d
            goto L54
        L5d:
            java.lang.String r3 = r3.getLine1()
        L61:
            if (r3 == 0) goto L2c
            com.stripe.android.model.PaymentIntent$Shipping r3 = r6.getShipping()
            if (r3 != 0) goto L6b
        L69:
            r3 = r4
            goto L76
        L6b:
            com.stripe.android.model.Address r3 = r3.getAddress()
            if (r3 != 0) goto L72
            goto L69
        L72:
            java.lang.String r3 = r3.getCountry()
        L76:
            if (r3 == 0) goto L2c
            com.stripe.android.model.PaymentIntent$Shipping r3 = r6.getShipping()
            if (r3 != 0) goto L7f
            goto L8a
        L7f:
            com.stripe.android.model.Address r3 = r3.getAddress()
            if (r3 != 0) goto L86
            goto L8a
        L86:
            java.lang.String r4 = r3.getPostalCode()
        L8a:
            if (r4 == 0) goto L2c
            goto L35
        L8d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.add(r3)
            goto L16
        L95:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L9b:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L4
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt.checkPaymentIntentRequirements(java.util.Set, com.stripe.android.model.PaymentIntent, com.stripe.android.paymentsheet.PaymentSheet$Configuration):boolean");
    }

    private static final boolean checkSetupIntentRequirements(Set<? extends SIRequirement> set, PaymentSheet.Configuration configuration) {
        int t11;
        if (set != null) {
            t11 = x.t(set, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (SIRequirement sIRequirement : set) {
                if (s.c(sIRequirement, Delayed.INSTANCE)) {
                    arrayList.add(Boolean.valueOf(configuration != null && configuration.getAllowsDelayedPaymentMethods()));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (!arrayList.contains(Boolean.FALSE)) {
                return true;
            }
        }
        return false;
    }

    public static final LayoutFormDescriptor getPMAddForm(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, StripeIntent stripeIntent, PaymentSheet.Configuration configuration) {
        s.g(supportedPaymentMethod, "<this>");
        s.g(stripeIntent, "stripeIntent");
        LayoutFormDescriptor specWithFullfilledRequirements = getSpecWithFullfilledRequirements(supportedPaymentMethod, stripeIntent, configuration);
        if (specWithFullfilledRequirements != null) {
            return specWithFullfilledRequirements;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final List<LpmRepository.SupportedPaymentMethod> getPMsToAdd(StripeIntent stripeIntent, PaymentSheet.Configuration configuration, LpmRepository lpmRepository) {
        List<LpmRepository.SupportedPaymentMethod> i11;
        List<String> paymentMethodTypes;
        s.g(lpmRepository, "lpmRepository");
        ArrayList arrayList = null;
        if (stripeIntent != null && (paymentMethodTypes = stripeIntent.getPaymentMethodTypes()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : paymentMethodTypes) {
                LpmRepository.SupportedPaymentMethod fromCode = lpmRepository.fromCode(str);
                if (fromCode != null) {
                    arrayList2.add(fromCode);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (getSpecWithFullfilledRequirements((LpmRepository.SupportedPaymentMethod) next, stripeIntent, configuration) != null) {
                    arrayList3.add(next);
                }
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                if (!(stripeIntent.isLiveMode() && stripeIntent.getUnactivatedPaymentMethods().contains(((LpmRepository.SupportedPaymentMethod) obj).getType().code))) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == null) {
            i11 = w.i();
            return i11;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (supportsPaymentIntentSfuSet(r6, r7, r8) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (supportsSetupIntent(r6, r8) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.stripe.android.ui.core.elements.LayoutFormDescriptor getSpecWithFullfilledRequirements(com.stripe.android.ui.core.forms.resources.LpmRepository.SupportedPaymentMethod r6, com.stripe.android.model.StripeIntent r7, com.stripe.android.paymentsheet.PaymentSheet.Configuration r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r6, r0)
            java.lang.String r0 = "stripeIntent"
            kotlin.jvm.internal.s.g(r7, r0)
            com.stripe.android.ui.core.elements.LayoutSpec r0 = r6.getFormSpec()
            com.stripe.android.ui.core.elements.LayoutFormDescriptor r1 = new com.stripe.android.ui.core.elements.LayoutFormDescriptor
            r2 = 0
            r1.<init>(r0, r2, r2)
            com.stripe.android.ui.core.elements.LayoutFormDescriptor r3 = new com.stripe.android.ui.core.elements.LayoutFormDescriptor
            r4 = 1
            r3.<init>(r0, r2, r4)
            com.stripe.android.ui.core.elements.LayoutFormDescriptor r5 = new com.stripe.android.ui.core.elements.LayoutFormDescriptor
            r5.<init>(r0, r4, r2)
            java.util.List r0 = r7.getPaymentMethodTypes()
            com.stripe.android.model.PaymentMethod$Type r2 = r6.getType()
            java.lang.String r2 = r2.code
            boolean r0 = r0.contains(r2)
            r2 = 0
            if (r0 != 0) goto L31
            return r2
        L31:
            boolean r0 = r7 instanceof com.stripe.android.model.PaymentIntent
            if (r0 == 0) goto L53
            com.stripe.android.model.PaymentIntent r7 = (com.stripe.android.model.PaymentIntent) r7
            boolean r0 = r7.isSetupFutureUsageSet()
            if (r0 == 0) goto L44
            boolean r6 = supportsPaymentIntentSfuSet(r6, r7, r8)
            if (r6 == 0) goto L5f
            goto L5d
        L44:
            boolean r0 = supportsPaymentIntentSfuSettable(r6, r7, r8)
            if (r0 == 0) goto L4c
            r1 = r5
            goto L60
        L4c:
            boolean r6 = supportsPaymentIntentSfuNotSettable(r6, r7, r8)
            if (r6 == 0) goto L5f
            goto L60
        L53:
            boolean r7 = r7 instanceof com.stripe.android.model.SetupIntent
            if (r7 == 0) goto L61
            boolean r6 = supportsSetupIntent(r6, r8)
            if (r6 == 0) goto L5f
        L5d:
            r1 = r3
            goto L60
        L5f:
            r1 = r2
        L60:
            return r1
        L61:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt.getSpecWithFullfilledRequirements(com.stripe.android.ui.core.forms.resources.LpmRepository$SupportedPaymentMethod, com.stripe.android.model.StripeIntent, com.stripe.android.paymentsheet.PaymentSheet$Configuration):com.stripe.android.ui.core.elements.LayoutFormDescriptor");
    }

    public static final List<LpmRepository.SupportedPaymentMethod> getSupportedSavedCustomerPMs(StripeIntent stripeIntent, PaymentSheet.Configuration configuration, LpmRepository lpmRepository) {
        List<LpmRepository.SupportedPaymentMethod> i11;
        List<String> paymentMethodTypes;
        s.g(lpmRepository, "lpmRepository");
        ArrayList arrayList = null;
        if (stripeIntent != null && (paymentMethodTypes = stripeIntent.getPaymentMethodTypes()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : paymentMethodTypes) {
                LpmRepository.SupportedPaymentMethod fromCode = lpmRepository.fromCode(str);
                if (fromCode != null) {
                    arrayList2.add(fromCode);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                LpmRepository.SupportedPaymentMethod supportedPaymentMethod = (LpmRepository.SupportedPaymentMethod) obj;
                if (supportedPaymentMethod.supportsCustomerSavedPM() && getSpecWithFullfilledRequirements(supportedPaymentMethod, stripeIntent, configuration) != null) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        if (arrayList == null) {
            i11 = w.i();
            return i11;
        }
        return arrayList;
    }

    private static final boolean supportsPaymentIntentSfuNotSettable(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentIntent paymentIntent, PaymentSheet.Configuration configuration) {
        return checkPaymentIntentRequirements(supportedPaymentMethod.getRequirement().getPiRequirements(), paymentIntent, configuration);
    }

    private static final boolean supportsPaymentIntentSfuSet(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentIntent paymentIntent, PaymentSheet.Configuration configuration) {
        return s.c(supportedPaymentMethod.getRequirement().getConfirmPMFromCustomer(), Boolean.TRUE) && checkSetupIntentRequirements(supportedPaymentMethod.getRequirement().getSiRequirements(), configuration) && checkPaymentIntentRequirements(supportedPaymentMethod.getRequirement().getPiRequirements(), paymentIntent, configuration);
    }

    private static final boolean supportsPaymentIntentSfuSettable(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentIntent paymentIntent, PaymentSheet.Configuration configuration) {
        return (configuration == null ? null : configuration.getCustomer()) != null && s.c(supportedPaymentMethod.getRequirement().getConfirmPMFromCustomer(), Boolean.TRUE) && checkPaymentIntentRequirements(supportedPaymentMethod.getRequirement().getPiRequirements(), paymentIntent, configuration) && checkSetupIntentRequirements(supportedPaymentMethod.getRequirement().getSiRequirements(), configuration);
    }

    private static final boolean supportsSetupIntent(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, PaymentSheet.Configuration configuration) {
        return s.c(supportedPaymentMethod.getRequirement().getConfirmPMFromCustomer(), Boolean.TRUE) && checkSetupIntentRequirements(supportedPaymentMethod.getRequirement().getSiRequirements(), configuration);
    }
}