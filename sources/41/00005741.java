package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class USBankAccountFormScreenState {
    private final Integer error;

    /* loaded from: classes6.dex */
    public static final class ConfirmIntent extends USBankAccountFormScreenState {
        public static final int $stable = 8;
        private final ConfirmStripeIntentParams confirmIntentParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmIntent(ConfirmStripeIntentParams confirmIntentParams) {
            super(null, 1, null);
            s.g(confirmIntentParams, "confirmIntentParams");
            this.confirmIntentParams = confirmIntentParams;
        }

        public static /* synthetic */ ConfirmIntent copy$default(ConfirmIntent confirmIntent, ConfirmStripeIntentParams confirmStripeIntentParams, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                confirmStripeIntentParams = confirmIntent.confirmIntentParams;
            }
            return confirmIntent.copy(confirmStripeIntentParams);
        }

        public final ConfirmStripeIntentParams component1() {
            return this.confirmIntentParams;
        }

        public final ConfirmIntent copy(ConfirmStripeIntentParams confirmIntentParams) {
            s.g(confirmIntentParams, "confirmIntentParams");
            return new ConfirmIntent(confirmIntentParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmIntent) && s.c(this.confirmIntentParams, ((ConfirmIntent) obj).confirmIntentParams);
        }

        public final ConfirmStripeIntentParams getConfirmIntentParams() {
            return this.confirmIntentParams;
        }

        public int hashCode() {
            return this.confirmIntentParams.hashCode();
        }

        public String toString() {
            return "ConfirmIntent(confirmIntentParams=" + this.confirmIntentParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public ConfirmIntent updateInputs(String name, String str, boolean z11) {
            s.g(name, "name");
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Finished extends USBankAccountFormScreenState {
        public static final int $stable = 0;
        private final String bankName;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final String last4;
        private final PaymentSelection paymentSelection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finished(PaymentSelection paymentSelection, String financialConnectionsSessionId, String intentId, String last4, String bankName) {
            super(null, 1, null);
            s.g(paymentSelection, "paymentSelection");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.g(intentId, "intentId");
            s.g(last4, "last4");
            s.g(bankName, "bankName");
            this.paymentSelection = paymentSelection;
            this.financialConnectionsSessionId = financialConnectionsSessionId;
            this.intentId = intentId;
            this.last4 = last4;
            this.bankName = bankName;
        }

        public static /* synthetic */ Finished copy$default(Finished finished, PaymentSelection paymentSelection, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentSelection = finished.paymentSelection;
            }
            if ((i11 & 2) != 0) {
                str = finished.financialConnectionsSessionId;
            }
            String str5 = str;
            if ((i11 & 4) != 0) {
                str2 = finished.intentId;
            }
            String str6 = str2;
            if ((i11 & 8) != 0) {
                str3 = finished.last4;
            }
            String str7 = str3;
            if ((i11 & 16) != 0) {
                str4 = finished.bankName;
            }
            return finished.copy(paymentSelection, str5, str6, str7, str4);
        }

        public final PaymentSelection component1() {
            return this.paymentSelection;
        }

        public final String component2() {
            return this.financialConnectionsSessionId;
        }

        public final String component3() {
            return this.intentId;
        }

        public final String component4() {
            return this.last4;
        }

        public final String component5() {
            return this.bankName;
        }

        public final Finished copy(PaymentSelection paymentSelection, String financialConnectionsSessionId, String intentId, String last4, String bankName) {
            s.g(paymentSelection, "paymentSelection");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.g(intentId, "intentId");
            s.g(last4, "last4");
            s.g(bankName, "bankName");
            return new Finished(paymentSelection, financialConnectionsSessionId, intentId, last4, bankName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Finished) {
                Finished finished = (Finished) obj;
                return s.c(this.paymentSelection, finished.paymentSelection) && s.c(this.financialConnectionsSessionId, finished.financialConnectionsSessionId) && s.c(this.intentId, finished.intentId) && s.c(this.last4, finished.last4) && s.c(this.bankName, finished.bankName);
            }
            return false;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public int hashCode() {
            return (((((((this.paymentSelection.hashCode() * 31) + this.financialConnectionsSessionId.hashCode()) * 31) + this.intentId.hashCode()) * 31) + this.last4.hashCode()) * 31) + this.bankName.hashCode();
        }

        public String toString() {
            return "Finished(paymentSelection=" + this.paymentSelection + ", financialConnectionsSessionId=" + this.financialConnectionsSessionId + ", intentId=" + this.intentId + ", last4=" + this.last4 + ", bankName=" + this.bankName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public Finished updateInputs(String name, String str, boolean z11) {
            s.g(name, "name");
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public static final class MandateCollection extends USBankAccountFormScreenState {
        public static final int $stable = 8;
        private final String email;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final String mandateText;
        private final String name;
        private final FinancialConnectionsAccount paymentAccount;
        private final String primaryButtonText;
        private final boolean saveForFutureUsage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MandateCollection(String name, String str, FinancialConnectionsAccount paymentAccount, String financialConnectionsSessionId, String intentId, String str2, String mandateText, boolean z11) {
            super(null, 1, null);
            s.g(name, "name");
            s.g(paymentAccount, "paymentAccount");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.g(intentId, "intentId");
            s.g(mandateText, "mandateText");
            this.name = name;
            this.email = str;
            this.paymentAccount = paymentAccount;
            this.financialConnectionsSessionId = financialConnectionsSessionId;
            this.intentId = intentId;
            this.primaryButtonText = str2;
            this.mandateText = mandateText;
            this.saveForFutureUsage = z11;
        }

        public static /* synthetic */ MandateCollection copy$default(MandateCollection mandateCollection, String str, String str2, FinancialConnectionsAccount financialConnectionsAccount, String str3, String str4, String str5, String str6, boolean z11, int i11, Object obj) {
            return mandateCollection.copy((i11 & 1) != 0 ? mandateCollection.name : str, (i11 & 2) != 0 ? mandateCollection.email : str2, (i11 & 4) != 0 ? mandateCollection.paymentAccount : financialConnectionsAccount, (i11 & 8) != 0 ? mandateCollection.financialConnectionsSessionId : str3, (i11 & 16) != 0 ? mandateCollection.intentId : str4, (i11 & 32) != 0 ? mandateCollection.primaryButtonText : str5, (i11 & 64) != 0 ? mandateCollection.mandateText : str6, (i11 & 128) != 0 ? mandateCollection.saveForFutureUsage : z11);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final FinancialConnectionsAccount component3() {
            return this.paymentAccount;
        }

        public final String component4() {
            return this.financialConnectionsSessionId;
        }

        public final String component5() {
            return this.intentId;
        }

        public final String component6() {
            return this.primaryButtonText;
        }

        public final String component7() {
            return this.mandateText;
        }

        public final boolean component8() {
            return this.saveForFutureUsage;
        }

        public final MandateCollection copy(String name, String str, FinancialConnectionsAccount paymentAccount, String financialConnectionsSessionId, String intentId, String str2, String mandateText, boolean z11) {
            s.g(name, "name");
            s.g(paymentAccount, "paymentAccount");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.g(intentId, "intentId");
            s.g(mandateText, "mandateText");
            return new MandateCollection(name, str, paymentAccount, financialConnectionsSessionId, intentId, str2, mandateText, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MandateCollection) {
                MandateCollection mandateCollection = (MandateCollection) obj;
                return s.c(this.name, mandateCollection.name) && s.c(this.email, mandateCollection.email) && s.c(this.paymentAccount, mandateCollection.paymentAccount) && s.c(this.financialConnectionsSessionId, mandateCollection.financialConnectionsSessionId) && s.c(this.intentId, mandateCollection.intentId) && s.c(this.primaryButtonText, mandateCollection.primaryButtonText) && s.c(this.mandateText, mandateCollection.mandateText) && this.saveForFutureUsage == mandateCollection.saveForFutureUsage;
            }
            return false;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        public final String getMandateText() {
            return this.mandateText;
        }

        public final String getName() {
            return this.name;
        }

        public final FinancialConnectionsAccount getPaymentAccount() {
            return this.paymentAccount;
        }

        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final boolean getSaveForFutureUsage() {
            return this.saveForFutureUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentAccount.hashCode()) * 31) + this.financialConnectionsSessionId.hashCode()) * 31) + this.intentId.hashCode()) * 31;
            String str2 = this.primaryButtonText;
            int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mandateText.hashCode()) * 31;
            boolean z11 = this.saveForFutureUsage;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode3 + i11;
        }

        public String toString() {
            return "MandateCollection(name=" + this.name + ", email=" + ((Object) this.email) + ", paymentAccount=" + this.paymentAccount + ", financialConnectionsSessionId=" + this.financialConnectionsSessionId + ", intentId=" + this.intentId + ", primaryButtonText=" + ((Object) this.primaryButtonText) + ", mandateText=" + this.mandateText + ", saveForFutureUsage=" + this.saveForFutureUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public MandateCollection updateInputs(String name, String str, boolean z11) {
            s.g(name, "name");
            return copy$default(this, name, str, null, null, null, null, null, z11, 124, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class NameAndEmailCollection extends USBankAccountFormScreenState {
        public static final int $stable = 0;
        private final String email;
        private final Integer error;
        private final String name;
        private final String primaryButtonText;

        public /* synthetic */ NameAndEmailCollection(Integer num, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, str, str2, str3);
        }

        public final String getEmail() {
            return this.email;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public Integer getError() {
            return this.error;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NameAndEmailCollection(Integer num, String name, String str, String str2) {
            super(null, 1, null);
            s.g(name, "name");
            this.error = num;
            this.name = name;
            this.email = str;
            this.primaryButtonText = str2;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public NameAndEmailCollection updateInputs(String name, String str, boolean z11) {
            s.g(name, "name");
            return new NameAndEmailCollection(getError(), name, str, this.primaryButtonText);
        }
    }

    /* loaded from: classes6.dex */
    public static final class SavedAccount extends USBankAccountFormScreenState {
        public static final int $stable = 0;
        private final String bankName;
        private final String email;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final String last4;
        private final String mandateText;
        private final String name;
        private final String primaryButtonText;
        private final boolean saveForFutureUsage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedAccount(String name, String str, String str2, String intentId, String bankName, String str3, String str4, String mandateText, boolean z11) {
            super(null, 1, null);
            s.g(name, "name");
            s.g(intentId, "intentId");
            s.g(bankName, "bankName");
            s.g(mandateText, "mandateText");
            this.name = name;
            this.email = str;
            this.financialConnectionsSessionId = str2;
            this.intentId = intentId;
            this.bankName = bankName;
            this.last4 = str3;
            this.primaryButtonText = str4;
            this.mandateText = mandateText;
            this.saveForFutureUsage = z11;
        }

        public static /* synthetic */ SavedAccount copy$default(SavedAccount savedAccount, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, int i11, Object obj) {
            return savedAccount.copy((i11 & 1) != 0 ? savedAccount.name : str, (i11 & 2) != 0 ? savedAccount.email : str2, (i11 & 4) != 0 ? savedAccount.financialConnectionsSessionId : str3, (i11 & 8) != 0 ? savedAccount.intentId : str4, (i11 & 16) != 0 ? savedAccount.bankName : str5, (i11 & 32) != 0 ? savedAccount.last4 : str6, (i11 & 64) != 0 ? savedAccount.primaryButtonText : str7, (i11 & 128) != 0 ? savedAccount.mandateText : str8, (i11 & 256) != 0 ? savedAccount.saveForFutureUsage : z11);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.financialConnectionsSessionId;
        }

        public final String component4() {
            return this.intentId;
        }

        public final String component5() {
            return this.bankName;
        }

        public final String component6() {
            return this.last4;
        }

        public final String component7() {
            return this.primaryButtonText;
        }

        public final String component8() {
            return this.mandateText;
        }

        public final boolean component9() {
            return this.saveForFutureUsage;
        }

        public final SavedAccount copy(String name, String str, String str2, String intentId, String bankName, String str3, String str4, String mandateText, boolean z11) {
            s.g(name, "name");
            s.g(intentId, "intentId");
            s.g(bankName, "bankName");
            s.g(mandateText, "mandateText");
            return new SavedAccount(name, str, str2, intentId, bankName, str3, str4, mandateText, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SavedAccount) {
                SavedAccount savedAccount = (SavedAccount) obj;
                return s.c(this.name, savedAccount.name) && s.c(this.email, savedAccount.email) && s.c(this.financialConnectionsSessionId, savedAccount.financialConnectionsSessionId) && s.c(this.intentId, savedAccount.intentId) && s.c(this.bankName, savedAccount.bankName) && s.c(this.last4, savedAccount.last4) && s.c(this.primaryButtonText, savedAccount.primaryButtonText) && s.c(this.mandateText, savedAccount.mandateText) && this.saveForFutureUsage == savedAccount.saveForFutureUsage;
            }
            return false;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final String getMandateText() {
            return this.mandateText;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final boolean getSaveForFutureUsage() {
            return this.saveForFutureUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.financialConnectionsSessionId;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.intentId.hashCode()) * 31) + this.bankName.hashCode()) * 31;
            String str3 = this.last4;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.primaryButtonText;
            int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.mandateText.hashCode()) * 31;
            boolean z11 = this.saveForFutureUsage;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode5 + i11;
        }

        public String toString() {
            return "SavedAccount(name=" + this.name + ", email=" + ((Object) this.email) + ", financialConnectionsSessionId=" + ((Object) this.financialConnectionsSessionId) + ", intentId=" + this.intentId + ", bankName=" + this.bankName + ", last4=" + ((Object) this.last4) + ", primaryButtonText=" + ((Object) this.primaryButtonText) + ", mandateText=" + this.mandateText + ", saveForFutureUsage=" + this.saveForFutureUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public SavedAccount updateInputs(String name, String str, boolean z11) {
            s.g(name, "name");
            return copy$default(this, name, str, null, null, null, null, null, null, z11, 252, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class VerifyWithMicrodeposits extends USBankAccountFormScreenState {
        public static final int $stable = 8;
        private final String email;
        private final String financialConnectionsSessionId;
        private final String intentId;
        private final String mandateText;
        private final String name;
        private final BankAccount paymentAccount;
        private final String primaryButtonText;
        private final boolean saveForFutureUsage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyWithMicrodeposits(String name, String str, BankAccount paymentAccount, String financialConnectionsSessionId, String intentId, String str2, String mandateText, boolean z11) {
            super(null, 1, null);
            s.g(name, "name");
            s.g(paymentAccount, "paymentAccount");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.g(intentId, "intentId");
            s.g(mandateText, "mandateText");
            this.name = name;
            this.email = str;
            this.paymentAccount = paymentAccount;
            this.financialConnectionsSessionId = financialConnectionsSessionId;
            this.intentId = intentId;
            this.primaryButtonText = str2;
            this.mandateText = mandateText;
            this.saveForFutureUsage = z11;
        }

        public static /* synthetic */ VerifyWithMicrodeposits copy$default(VerifyWithMicrodeposits verifyWithMicrodeposits, String str, String str2, BankAccount bankAccount, String str3, String str4, String str5, String str6, boolean z11, int i11, Object obj) {
            return verifyWithMicrodeposits.copy((i11 & 1) != 0 ? verifyWithMicrodeposits.name : str, (i11 & 2) != 0 ? verifyWithMicrodeposits.email : str2, (i11 & 4) != 0 ? verifyWithMicrodeposits.paymentAccount : bankAccount, (i11 & 8) != 0 ? verifyWithMicrodeposits.financialConnectionsSessionId : str3, (i11 & 16) != 0 ? verifyWithMicrodeposits.intentId : str4, (i11 & 32) != 0 ? verifyWithMicrodeposits.primaryButtonText : str5, (i11 & 64) != 0 ? verifyWithMicrodeposits.mandateText : str6, (i11 & 128) != 0 ? verifyWithMicrodeposits.saveForFutureUsage : z11);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final BankAccount component3() {
            return this.paymentAccount;
        }

        public final String component4() {
            return this.financialConnectionsSessionId;
        }

        public final String component5() {
            return this.intentId;
        }

        public final String component6() {
            return this.primaryButtonText;
        }

        public final String component7() {
            return this.mandateText;
        }

        public final boolean component8() {
            return this.saveForFutureUsage;
        }

        public final VerifyWithMicrodeposits copy(String name, String str, BankAccount paymentAccount, String financialConnectionsSessionId, String intentId, String str2, String mandateText, boolean z11) {
            s.g(name, "name");
            s.g(paymentAccount, "paymentAccount");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            s.g(intentId, "intentId");
            s.g(mandateText, "mandateText");
            return new VerifyWithMicrodeposits(name, str, paymentAccount, financialConnectionsSessionId, intentId, str2, mandateText, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VerifyWithMicrodeposits) {
                VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) obj;
                return s.c(this.name, verifyWithMicrodeposits.name) && s.c(this.email, verifyWithMicrodeposits.email) && s.c(this.paymentAccount, verifyWithMicrodeposits.paymentAccount) && s.c(this.financialConnectionsSessionId, verifyWithMicrodeposits.financialConnectionsSessionId) && s.c(this.intentId, verifyWithMicrodeposits.intentId) && s.c(this.primaryButtonText, verifyWithMicrodeposits.primaryButtonText) && s.c(this.mandateText, verifyWithMicrodeposits.mandateText) && this.saveForFutureUsage == verifyWithMicrodeposits.saveForFutureUsage;
            }
            return false;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFinancialConnectionsSessionId() {
            return this.financialConnectionsSessionId;
        }

        public final String getIntentId() {
            return this.intentId;
        }

        public final String getMandateText() {
            return this.mandateText;
        }

        public final String getName() {
            return this.name;
        }

        public final BankAccount getPaymentAccount() {
            return this.paymentAccount;
        }

        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final boolean getSaveForFutureUsage() {
            return this.saveForFutureUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentAccount.hashCode()) * 31) + this.financialConnectionsSessionId.hashCode()) * 31) + this.intentId.hashCode()) * 31;
            String str2 = this.primaryButtonText;
            int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mandateText.hashCode()) * 31;
            boolean z11 = this.saveForFutureUsage;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode3 + i11;
        }

        public String toString() {
            return "VerifyWithMicrodeposits(name=" + this.name + ", email=" + ((Object) this.email) + ", paymentAccount=" + this.paymentAccount + ", financialConnectionsSessionId=" + this.financialConnectionsSessionId + ", intentId=" + this.intentId + ", primaryButtonText=" + ((Object) this.primaryButtonText) + ", mandateText=" + this.mandateText + ", saveForFutureUsage=" + this.saveForFutureUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState
        public VerifyWithMicrodeposits updateInputs(String name, String str, boolean z11) {
            s.g(name, "name");
            return copy$default(this, name, str, null, null, null, null, null, z11, 124, null);
        }
    }

    private USBankAccountFormScreenState(Integer num) {
        this.error = num;
    }

    public /* synthetic */ USBankAccountFormScreenState(Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(num);
    }

    public Integer getError() {
        return this.error;
    }

    public abstract USBankAccountFormScreenState updateInputs(String str, String str2, boolean z11);

    public /* synthetic */ USBankAccountFormScreenState(Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, null);
    }
}