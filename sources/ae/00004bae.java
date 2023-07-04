package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.BillingAddressFields;
import com.stripe.android.view.ShippingInfoWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.internal.http2.Settings;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.v;
import wz.w;
import wz.x0;

/* loaded from: classes2.dex */
public final class PaymentSessionConfig implements Parcelable {
    private final int addPaymentMethodFooterLayoutId;
    private final Set<String> allowedShippingCountryCodes;
    private final BillingAddressFields billingAddressFields;
    private final boolean canDeletePaymentMethods;
    private final List<ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final List<ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
    private final List<PaymentMethod.Type> paymentMethodTypes;
    private final int paymentMethodsFooterLayoutId;
    private final ShippingInformation prepopulatedShippingInfo;
    private final ShippingInformationValidator shippingInformationValidator;
    private final ShippingMethodsFactory shippingMethodsFactory;
    private final boolean shouldPrefetchCustomer;
    private final boolean shouldShowGooglePay;
    private final Integer windowFlags;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaymentSessionConfig> CREATOR = new Creator();
    public static final int $stable = 8;
    @Deprecated
    private static final BillingAddressFields DEFAULT_BILLING_ADDRESS_FIELDS = BillingAddressFields.PostalCode;

    /* loaded from: classes2.dex */
    public static final class Builder implements ObjectBuilder<PaymentSessionConfig> {
        public static final int $stable = 8;
        private int addPaymentMethodFooterLayoutId;
        private Set<String> allowedShippingCountryCodes;
        private boolean canDeletePaymentMethods;
        private List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
        private List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
        private List<? extends PaymentMethod.Type> paymentMethodTypes;
        private int paymentMethodsFooterLayoutId;
        private ShippingInformation shippingInformation;
        private ShippingInformationValidator shippingInformationValidator;
        private ShippingMethodsFactory shippingMethodsFactory;
        private boolean shouldPrefetchCustomer;
        private boolean shouldShowGooglePay;
        private Integer windowFlags;
        private BillingAddressFields billingAddressFields = PaymentSessionConfig.DEFAULT_BILLING_ADDRESS_FIELDS;
        private boolean shippingInfoRequired = true;
        private boolean shippingMethodsRequired = true;

        public Builder() {
            List<? extends PaymentMethod.Type> d11;
            Set<String> d12;
            d11 = v.d(PaymentMethod.Type.Card);
            this.paymentMethodTypes = d11;
            d12 = x0.d();
            this.allowedShippingCountryCodes = d12;
            this.shouldPrefetchCustomer = true;
            this.canDeletePaymentMethods = true;
        }

        public final Builder setAddPaymentMethodFooter(int i11) {
            this.addPaymentMethodFooterLayoutId = i11;
            return this;
        }

        public final Builder setAllowedShippingCountryCodes(Set<String> allowedShippingCountryCodes) {
            s.g(allowedShippingCountryCodes, "allowedShippingCountryCodes");
            this.allowedShippingCountryCodes = allowedShippingCountryCodes;
            return this;
        }

        public final Builder setBillingAddressFields(BillingAddressFields billingAddressFields) {
            s.g(billingAddressFields, "billingAddressFields");
            this.billingAddressFields = billingAddressFields;
            return this;
        }

        public final Builder setCanDeletePaymentMethods(boolean z11) {
            this.canDeletePaymentMethods = z11;
            return this;
        }

        public final Builder setHiddenShippingInfoFields(ShippingInfoWidget.CustomizableShippingField... hiddenShippingInfoFields) {
            List<? extends ShippingInfoWidget.CustomizableShippingField> l11;
            s.g(hiddenShippingInfoFields, "hiddenShippingInfoFields");
            l11 = w.l(Arrays.copyOf(hiddenShippingInfoFields, hiddenShippingInfoFields.length));
            this.hiddenShippingInfoFields = l11;
            return this;
        }

        public final Builder setOptionalShippingInfoFields(ShippingInfoWidget.CustomizableShippingField... optionalShippingInfoFields) {
            List<? extends ShippingInfoWidget.CustomizableShippingField> l11;
            s.g(optionalShippingInfoFields, "optionalShippingInfoFields");
            l11 = w.l(Arrays.copyOf(optionalShippingInfoFields, optionalShippingInfoFields.length));
            this.optionalShippingInfoFields = l11;
            return this;
        }

        public final Builder setPaymentMethodTypes(List<? extends PaymentMethod.Type> paymentMethodTypes) {
            s.g(paymentMethodTypes, "paymentMethodTypes");
            this.paymentMethodTypes = paymentMethodTypes;
            return this;
        }

        public final Builder setPaymentMethodsFooter(int i11) {
            this.paymentMethodsFooterLayoutId = i11;
            return this;
        }

        public final Builder setPrepopulatedShippingInfo(ShippingInformation shippingInformation) {
            this.shippingInformation = shippingInformation;
            return this;
        }

        public final Builder setShippingInfoRequired(boolean z11) {
            this.shippingInfoRequired = z11;
            return this;
        }

        public final Builder setShippingInformationValidator(ShippingInformationValidator shippingInformationValidator) {
            this.shippingInformationValidator = shippingInformationValidator;
            return this;
        }

        public final Builder setShippingMethodsFactory(ShippingMethodsFactory shippingMethodsFactory) {
            this.shippingMethodsFactory = shippingMethodsFactory;
            return this;
        }

        public final Builder setShippingMethodsRequired(boolean z11) {
            this.shippingMethodsRequired = z11;
            return this;
        }

        public final Builder setShouldPrefetchCustomer(boolean z11) {
            this.shouldPrefetchCustomer = z11;
            return this;
        }

        public final Builder setShouldShowGooglePay(boolean z11) {
            this.shouldShowGooglePay = z11;
            return this;
        }

        public final Builder setWindowFlags(Integer num) {
            this.windowFlags = num;
            return this;
        }

        @Override // com.stripe.android.ObjectBuilder
        public PaymentSessionConfig build() {
            List<? extends ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
            if (list == null) {
                list = w.i();
            }
            List<? extends ShippingInfoWidget.CustomizableShippingField> list2 = list;
            List<? extends ShippingInfoWidget.CustomizableShippingField> list3 = this.optionalShippingInfoFields;
            if (list3 == null) {
                list3 = w.i();
            }
            List<? extends ShippingInfoWidget.CustomizableShippingField> list4 = list3;
            ShippingInformation shippingInformation = this.shippingInformation;
            boolean z11 = this.shippingInfoRequired;
            boolean z12 = this.shippingMethodsRequired;
            int i11 = this.paymentMethodsFooterLayoutId;
            int i12 = this.addPaymentMethodFooterLayoutId;
            List<? extends PaymentMethod.Type> list5 = this.paymentMethodTypes;
            boolean z13 = this.shouldShowGooglePay;
            Set<String> set = this.allowedShippingCountryCodes;
            ShippingInformationValidator shippingInformationValidator = this.shippingInformationValidator;
            if (shippingInformationValidator == null) {
                shippingInformationValidator = new DefaultShippingInfoValidator();
            }
            ShippingInformationValidator shippingInformationValidator2 = shippingInformationValidator;
            ShippingMethodsFactory shippingMethodsFactory = this.shippingMethodsFactory;
            Integer num = this.windowFlags;
            return new PaymentSessionConfig(list2, list4, shippingInformation, z11, z12, i11, i12, list5, z13, set, this.billingAddressFields, this.canDeletePaymentMethods, this.shouldPrefetchCustomer, shippingInformationValidator2, shippingMethodsFactory, num);
        }
    }

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<PaymentSessionConfig> {
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionConfig createFromParcel(Parcel parcel) {
            String readString;
            s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(ShippingInfoWidget.CustomizableShippingField.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i12 = 0; i12 != readInt2; i12++) {
                arrayList2.add(ShippingInfoWidget.CustomizableShippingField.valueOf(parcel.readString()));
            }
            ShippingInformation createFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt5);
            for (int i13 = 0; i13 != readInt5; i13++) {
                arrayList3.add(PaymentMethod.Type.CREATOR.createFromParcel(parcel));
            }
            boolean z13 = parcel.readInt() != 0;
            int readInt6 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt6);
            int i14 = 0;
            while (true) {
                readString = parcel.readString();
                if (i14 == readInt6) {
                    break;
                }
                linkedHashSet.add(readString);
                i14++;
            }
            return new PaymentSessionConfig(arrayList, arrayList2, createFromParcel, z11, z12, readInt3, readInt4, arrayList3, z13, linkedHashSet, BillingAddressFields.valueOf(readString), parcel.readInt() != 0, parcel.readInt() != 0, (ShippingInformationValidator) parcel.readSerializable(), (ShippingMethodsFactory) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentSessionConfig[] newArray(int i11) {
            return new PaymentSessionConfig[i11];
        }
    }

    /* loaded from: classes2.dex */
    public static final class DefaultShippingInfoValidator implements ShippingInformationValidator {
        @Override // com.stripe.android.PaymentSessionConfig.ShippingInformationValidator
        public String getErrorMessage(ShippingInformation shippingInformation) {
            s.g(shippingInformation, "shippingInformation");
            return "";
        }

        @Override // com.stripe.android.PaymentSessionConfig.ShippingInformationValidator
        public boolean isValid(ShippingInformation shippingInformation) {
            s.g(shippingInformation, "shippingInformation");
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface ShippingInformationValidator extends Serializable {
        String getErrorMessage(ShippingInformation shippingInformation);

        boolean isValid(ShippingInformation shippingInformation);
    }

    /* loaded from: classes2.dex */
    public interface ShippingMethodsFactory extends Serializable {
        List<ShippingMethod> create(ShippingInformation shippingInformation);
    }

    public PaymentSessionConfig() {
        this(null, null, null, false, false, 0, 0, null, false, null, null, false, false, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSessionConfig(List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, ShippingInformation shippingInformation, boolean z11, boolean z12, int i11, int i12, List<? extends PaymentMethod.Type> paymentMethodTypes, boolean z13, Set<String> allowedShippingCountryCodes, BillingAddressFields billingAddressFields, boolean z14, boolean z15, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num) {
        boolean u11;
        s.g(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        s.g(optionalShippingInfoFields, "optionalShippingInfoFields");
        s.g(paymentMethodTypes, "paymentMethodTypes");
        s.g(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        s.g(billingAddressFields, "billingAddressFields");
        s.g(shippingInformationValidator, "shippingInformationValidator");
        this.hiddenShippingInfoFields = hiddenShippingInfoFields;
        this.optionalShippingInfoFields = optionalShippingInfoFields;
        this.prepopulatedShippingInfo = shippingInformation;
        this.isShippingInfoRequired = z11;
        this.isShippingMethodRequired = z12;
        this.paymentMethodsFooterLayoutId = i11;
        this.addPaymentMethodFooterLayoutId = i12;
        this.paymentMethodTypes = paymentMethodTypes;
        this.shouldShowGooglePay = z13;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.billingAddressFields = billingAddressFields;
        this.canDeletePaymentMethods = z14;
        this.shouldPrefetchCustomer = z15;
        this.shippingInformationValidator = shippingInformationValidator;
        this.shippingMethodsFactory = shippingMethodsFactory;
        this.windowFlags = num;
        String[] countryCodes = Locale.getISOCountries();
        for (String str : allowedShippingCountryCodes) {
            s.f(countryCodes, "countryCodes");
            int length = countryCodes.length;
            boolean z16 = false;
            int i13 = 0;
            while (true) {
                if (i13 < length) {
                    u11 = kotlin.text.v.u(str, countryCodes[i13], true);
                    if (u11) {
                        z16 = true;
                        continue;
                        break;
                    }
                    i13++;
                }
            }
            if (!z16) {
                throw new IllegalArgumentException((CoreConstants.SINGLE_QUOTE_CHAR + str + "' is not a valid country code").toString());
            }
        }
        if (this.isShippingMethodRequired && this.shippingMethodsFactory == null) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.".toString());
        }
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> component1() {
        return this.hiddenShippingInfoFields;
    }

    public final Set<String> component10() {
        return this.allowedShippingCountryCodes;
    }

    public final BillingAddressFields component11() {
        return this.billingAddressFields;
    }

    public final boolean component12() {
        return this.canDeletePaymentMethods;
    }

    public final boolean component13$payments_core_release() {
        return this.shouldPrefetchCustomer;
    }

    public final ShippingInformationValidator component14$payments_core_release() {
        return this.shippingInformationValidator;
    }

    public final ShippingMethodsFactory component15$payments_core_release() {
        return this.shippingMethodsFactory;
    }

    public final Integer component16$payments_core_release() {
        return this.windowFlags;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> component2() {
        return this.optionalShippingInfoFields;
    }

    public final ShippingInformation component3() {
        return this.prepopulatedShippingInfo;
    }

    public final boolean component4() {
        return this.isShippingInfoRequired;
    }

    public final boolean component5() {
        return this.isShippingMethodRequired;
    }

    public final int component6() {
        return this.paymentMethodsFooterLayoutId;
    }

    public final int component7() {
        return this.addPaymentMethodFooterLayoutId;
    }

    public final List<PaymentMethod.Type> component8() {
        return this.paymentMethodTypes;
    }

    public final boolean component9() {
        return this.shouldShowGooglePay;
    }

    public final PaymentSessionConfig copy(List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, ShippingInformation shippingInformation, boolean z11, boolean z12, int i11, int i12, List<? extends PaymentMethod.Type> paymentMethodTypes, boolean z13, Set<String> allowedShippingCountryCodes, BillingAddressFields billingAddressFields, boolean z14, boolean z15, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num) {
        s.g(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        s.g(optionalShippingInfoFields, "optionalShippingInfoFields");
        s.g(paymentMethodTypes, "paymentMethodTypes");
        s.g(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        s.g(billingAddressFields, "billingAddressFields");
        s.g(shippingInformationValidator, "shippingInformationValidator");
        return new PaymentSessionConfig(hiddenShippingInfoFields, optionalShippingInfoFields, shippingInformation, z11, z12, i11, i12, paymentMethodTypes, z13, allowedShippingCountryCodes, billingAddressFields, z14, z15, shippingInformationValidator, shippingMethodsFactory, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSessionConfig) {
            PaymentSessionConfig paymentSessionConfig = (PaymentSessionConfig) obj;
            return s.c(this.hiddenShippingInfoFields, paymentSessionConfig.hiddenShippingInfoFields) && s.c(this.optionalShippingInfoFields, paymentSessionConfig.optionalShippingInfoFields) && s.c(this.prepopulatedShippingInfo, paymentSessionConfig.prepopulatedShippingInfo) && this.isShippingInfoRequired == paymentSessionConfig.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionConfig.isShippingMethodRequired && this.paymentMethodsFooterLayoutId == paymentSessionConfig.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == paymentSessionConfig.addPaymentMethodFooterLayoutId && s.c(this.paymentMethodTypes, paymentSessionConfig.paymentMethodTypes) && this.shouldShowGooglePay == paymentSessionConfig.shouldShowGooglePay && s.c(this.allowedShippingCountryCodes, paymentSessionConfig.allowedShippingCountryCodes) && this.billingAddressFields == paymentSessionConfig.billingAddressFields && this.canDeletePaymentMethods == paymentSessionConfig.canDeletePaymentMethods && this.shouldPrefetchCustomer == paymentSessionConfig.shouldPrefetchCustomer && s.c(this.shippingInformationValidator, paymentSessionConfig.shippingInformationValidator) && s.c(this.shippingMethodsFactory, paymentSessionConfig.shippingMethodsFactory) && s.c(this.windowFlags, paymentSessionConfig.windowFlags);
        }
        return false;
    }

    public final int getAddPaymentMethodFooterLayoutId() {
        return this.addPaymentMethodFooterLayoutId;
    }

    public final Set<String> getAllowedShippingCountryCodes() {
        return this.allowedShippingCountryCodes;
    }

    public final BillingAddressFields getBillingAddressFields() {
        return this.billingAddressFields;
    }

    public final boolean getCanDeletePaymentMethods() {
        return this.canDeletePaymentMethods;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getHiddenShippingInfoFields() {
        return this.hiddenShippingInfoFields;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getOptionalShippingInfoFields() {
        return this.optionalShippingInfoFields;
    }

    public final List<PaymentMethod.Type> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final int getPaymentMethodsFooterLayoutId() {
        return this.paymentMethodsFooterLayoutId;
    }

    public final ShippingInformation getPrepopulatedShippingInfo() {
        return this.prepopulatedShippingInfo;
    }

    public final ShippingInformationValidator getShippingInformationValidator$payments_core_release() {
        return this.shippingInformationValidator;
    }

    public final ShippingMethodsFactory getShippingMethodsFactory$payments_core_release() {
        return this.shippingMethodsFactory;
    }

    public final boolean getShouldPrefetchCustomer$payments_core_release() {
        return this.shouldPrefetchCustomer;
    }

    public final boolean getShouldShowGooglePay() {
        return this.shouldShowGooglePay;
    }

    public final Integer getWindowFlags$payments_core_release() {
        return this.windowFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.hiddenShippingInfoFields.hashCode() * 31) + this.optionalShippingInfoFields.hashCode()) * 31;
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        int hashCode2 = (hashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31;
        boolean z11 = this.isShippingInfoRequired;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.isShippingMethodRequired;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int hashCode3 = (((((((i12 + i13) * 31) + Integer.hashCode(this.paymentMethodsFooterLayoutId)) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31) + this.paymentMethodTypes.hashCode()) * 31;
        boolean z13 = this.shouldShowGooglePay;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int hashCode4 = (((((hashCode3 + i14) * 31) + this.allowedShippingCountryCodes.hashCode()) * 31) + this.billingAddressFields.hashCode()) * 31;
        boolean z14 = this.canDeletePaymentMethods;
        int i15 = z14;
        if (z14 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode4 + i15) * 31;
        boolean z15 = this.shouldPrefetchCustomer;
        int hashCode5 = (((i16 + (z15 ? 1 : z15 ? 1 : 0)) * 31) + this.shippingInformationValidator.hashCode()) * 31;
        ShippingMethodsFactory shippingMethodsFactory = this.shippingMethodsFactory;
        int hashCode6 = (hashCode5 + (shippingMethodsFactory == null ? 0 : shippingMethodsFactory.hashCode())) * 31;
        Integer num = this.windowFlags;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isShippingInfoRequired() {
        return this.isShippingInfoRequired;
    }

    public final boolean isShippingMethodRequired() {
        return this.isShippingMethodRequired;
    }

    public String toString() {
        return "PaymentSessionConfig(hiddenShippingInfoFields=" + this.hiddenShippingInfoFields + ", optionalShippingInfoFields=" + this.optionalShippingInfoFields + ", prepopulatedShippingInfo=" + this.prepopulatedShippingInfo + ", isShippingInfoRequired=" + this.isShippingInfoRequired + ", isShippingMethodRequired=" + this.isShippingMethodRequired + ", paymentMethodsFooterLayoutId=" + this.paymentMethodsFooterLayoutId + ", addPaymentMethodFooterLayoutId=" + this.addPaymentMethodFooterLayoutId + ", paymentMethodTypes=" + this.paymentMethodTypes + ", shouldShowGooglePay=" + this.shouldShowGooglePay + ", allowedShippingCountryCodes=" + this.allowedShippingCountryCodes + ", billingAddressFields=" + this.billingAddressFields + ", canDeletePaymentMethods=" + this.canDeletePaymentMethods + ", shouldPrefetchCustomer=" + this.shouldPrefetchCustomer + ", shippingInformationValidator=" + this.shippingInformationValidator + ", shippingMethodsFactory=" + this.shippingMethodsFactory + ", windowFlags=" + this.windowFlags + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        List<ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
        out.writeInt(list.size());
        for (ShippingInfoWidget.CustomizableShippingField customizableShippingField : list) {
            out.writeString(customizableShippingField.name());
        }
        List<ShippingInfoWidget.CustomizableShippingField> list2 = this.optionalShippingInfoFields;
        out.writeInt(list2.size());
        for (ShippingInfoWidget.CustomizableShippingField customizableShippingField2 : list2) {
            out.writeString(customizableShippingField2.name());
        }
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        if (shippingInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i11);
        }
        out.writeInt(this.isShippingInfoRequired ? 1 : 0);
        out.writeInt(this.isShippingMethodRequired ? 1 : 0);
        out.writeInt(this.paymentMethodsFooterLayoutId);
        out.writeInt(this.addPaymentMethodFooterLayoutId);
        List<PaymentMethod.Type> list3 = this.paymentMethodTypes;
        out.writeInt(list3.size());
        for (PaymentMethod.Type type : list3) {
            type.writeToParcel(out, i11);
        }
        out.writeInt(this.shouldShowGooglePay ? 1 : 0);
        Set<String> set = this.allowedShippingCountryCodes;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
        out.writeString(this.billingAddressFields.name());
        out.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        out.writeInt(this.shouldPrefetchCustomer ? 1 : 0);
        out.writeSerializable(this.shippingInformationValidator);
        out.writeSerializable(this.shippingMethodsFactory);
        Integer num = this.windowFlags;
        if (num == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num.intValue());
    }

    public /* synthetic */ PaymentSessionConfig(List list, List list2, ShippingInformation shippingInformation, boolean z11, boolean z12, int i11, int i12, List list3, boolean z13, Set set, BillingAddressFields billingAddressFields, boolean z14, boolean z15, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? w.i() : list, (i13 & 2) != 0 ? w.i() : list2, (i13 & 4) != 0 ? null : shippingInformation, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0 : i12, (i13 & 128) != 0 ? v.d(PaymentMethod.Type.Card) : list3, (i13 & 256) == 0 ? z13 : false, (i13 & 512) != 0 ? x0.d() : set, (i13 & 1024) != 0 ? DEFAULT_BILLING_ADDRESS_FIELDS : billingAddressFields, (i13 & 2048) != 0 ? true : z14, (i13 & 4096) == 0 ? z15 : true, (i13 & PKIFailureInfo.certRevoked) != 0 ? new DefaultShippingInfoValidator() : shippingInformationValidator, (i13 & 16384) != 0 ? null : shippingMethodsFactory, (i13 & 32768) != 0 ? null : num);
    }
}