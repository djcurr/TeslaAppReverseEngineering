package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.x0;

/* loaded from: classes2.dex */
public abstract class EphemeralOperation implements Parcelable {

    /* loaded from: classes2.dex */
    public static abstract class Customer extends EphemeralOperation {

        /* loaded from: classes2.dex */
        public static final class AddSource extends Customer {

            /* renamed from: id  reason: collision with root package name */
            private final String f20884id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;
            public static final Parcelable.Creator<AddSource> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<AddSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddSource createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AddSource(readString, readString2, readString3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddSource[] newArray(int i11) {
                    return new AddSource[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddSource(String sourceId, String sourceType, String id2, Set<String> productUsage) {
                super(null);
                s.g(sourceId, "sourceId");
                s.g(sourceType, "sourceType");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.sourceType = sourceType;
                this.f20884id = id2;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AddSource copy$default(AddSource addSource, String str, String str2, String str3, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = addSource.sourceId;
                }
                if ((i11 & 2) != 0) {
                    str2 = addSource.sourceType;
                }
                if ((i11 & 4) != 0) {
                    str3 = addSource.getId$payments_core_release();
                }
                if ((i11 & 8) != 0) {
                    set = addSource.getProductUsage$payments_core_release();
                }
                return addSource.copy(str, str2, str3, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2() {
                return this.sourceType;
            }

            public final String component3$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component4$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final AddSource copy(String sourceId, String sourceType, String id2, Set<String> productUsage) {
                s.g(sourceId, "sourceId");
                s.g(sourceType, "sourceType");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                return new AddSource(sourceId, sourceType, id2, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AddSource) {
                    AddSource addSource = (AddSource) obj;
                    return s.c(this.sourceId, addSource.sourceId) && s.c(this.sourceType, addSource.sourceType) && s.c(getId$payments_core_release(), addSource.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), addSource.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20884id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            public int hashCode() {
                return (((((this.sourceId.hashCode() * 31) + this.sourceType.hashCode()) * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                return "AddSource(sourceId=" + this.sourceId + ", sourceType=" + this.sourceType + ", id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.sourceId);
                out.writeString(this.sourceType);
                out.writeString(this.f20884id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class AttachPaymentMethod extends Customer {

            /* renamed from: id  reason: collision with root package name */
            private final String f20885id;
            private final String paymentMethodId;
            private final Set<String> productUsage;
            public static final Parcelable.Creator<AttachPaymentMethod> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<AttachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AttachPaymentMethod(readString, readString2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod[] newArray(int i11) {
                    return new AttachPaymentMethod[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AttachPaymentMethod(String paymentMethodId, String id2, Set<String> productUsage) {
                super(null);
                s.g(paymentMethodId, "paymentMethodId");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.f20885id = id2;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AttachPaymentMethod copy$default(AttachPaymentMethod attachPaymentMethod, String str, String str2, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = attachPaymentMethod.paymentMethodId;
                }
                if ((i11 & 2) != 0) {
                    str2 = attachPaymentMethod.getId$payments_core_release();
                }
                if ((i11 & 4) != 0) {
                    set = attachPaymentMethod.getProductUsage$payments_core_release();
                }
                return attachPaymentMethod.copy(str, str2, set);
            }

            public final String component1() {
                return this.paymentMethodId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final AttachPaymentMethod copy(String paymentMethodId, String id2, Set<String> productUsage) {
                s.g(paymentMethodId, "paymentMethodId");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                return new AttachPaymentMethod(paymentMethodId, id2, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AttachPaymentMethod) {
                    AttachPaymentMethod attachPaymentMethod = (AttachPaymentMethod) obj;
                    return s.c(this.paymentMethodId, attachPaymentMethod.paymentMethodId) && s.c(getId$payments_core_release(), attachPaymentMethod.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), attachPaymentMethod.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20885id;
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                return "AttachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.paymentMethodId);
                out.writeString(this.f20885id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class DeleteSource extends Customer {

            /* renamed from: id  reason: collision with root package name */
            private final String f20886id;
            private final Set<String> productUsage;
            private final String sourceId;
            public static final Parcelable.Creator<DeleteSource> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DeleteSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeleteSource createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DeleteSource(readString, readString2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeleteSource[] newArray(int i11) {
                    return new DeleteSource[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteSource(String sourceId, String id2, Set<String> productUsage) {
                super(null);
                s.g(sourceId, "sourceId");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.f20886id = id2;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DeleteSource copy$default(DeleteSource deleteSource, String str, String str2, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = deleteSource.sourceId;
                }
                if ((i11 & 2) != 0) {
                    str2 = deleteSource.getId$payments_core_release();
                }
                if ((i11 & 4) != 0) {
                    set = deleteSource.getProductUsage$payments_core_release();
                }
                return deleteSource.copy(str, str2, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final DeleteSource copy(String sourceId, String id2, Set<String> productUsage) {
                s.g(sourceId, "sourceId");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                return new DeleteSource(sourceId, id2, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof DeleteSource) {
                    DeleteSource deleteSource = (DeleteSource) obj;
                    return s.c(this.sourceId, deleteSource.sourceId) && s.c(getId$payments_core_release(), deleteSource.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), deleteSource.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20886id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public int hashCode() {
                return (((this.sourceId.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                return "DeleteSource(sourceId=" + this.sourceId + ", id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.sourceId);
                out.writeString(this.f20886id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class DetachPaymentMethod extends Customer {

            /* renamed from: id  reason: collision with root package name */
            private final String f20887id;
            private final String paymentMethodId;
            private final Set<String> productUsage;
            public static final Parcelable.Creator<DetachPaymentMethod> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DetachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DetachPaymentMethod(readString, readString2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod[] newArray(int i11) {
                    return new DetachPaymentMethod[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetachPaymentMethod(String paymentMethodId, String id2, Set<String> productUsage) {
                super(null);
                s.g(paymentMethodId, "paymentMethodId");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.f20887id = id2;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DetachPaymentMethod copy$default(DetachPaymentMethod detachPaymentMethod, String str, String str2, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = detachPaymentMethod.paymentMethodId;
                }
                if ((i11 & 2) != 0) {
                    str2 = detachPaymentMethod.getId$payments_core_release();
                }
                if ((i11 & 4) != 0) {
                    set = detachPaymentMethod.getProductUsage$payments_core_release();
                }
                return detachPaymentMethod.copy(str, str2, set);
            }

            public final String component1() {
                return this.paymentMethodId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final DetachPaymentMethod copy(String paymentMethodId, String id2, Set<String> productUsage) {
                s.g(paymentMethodId, "paymentMethodId");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                return new DetachPaymentMethod(paymentMethodId, id2, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof DetachPaymentMethod) {
                    DetachPaymentMethod detachPaymentMethod = (DetachPaymentMethod) obj;
                    return s.c(this.paymentMethodId, detachPaymentMethod.paymentMethodId) && s.c(getId$payments_core_release(), detachPaymentMethod.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), detachPaymentMethod.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20887id;
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                return "DetachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.paymentMethodId);
                out.writeString(this.f20887id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class GetPaymentMethods extends Customer {
            private final String endingBefore;

            /* renamed from: id  reason: collision with root package name */
            private final String f20888id;
            private final Integer limit;
            private final Set<String> productUsage;
            private final String startingAfter;
            private final PaymentMethod.Type type;
            public static final Parcelable.Creator<GetPaymentMethods> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<GetPaymentMethods> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    PaymentMethod.Type createFromParcel = PaymentMethod.Type.CREATOR.createFromParcel(parcel);
                    Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new GetPaymentMethods(createFromParcel, valueOf, readString, readString2, readString3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods[] newArray(int i11) {
                    return new GetPaymentMethods[i11];
                }
            }

            public /* synthetic */ GetPaymentMethods(PaymentMethod.Type type, Integer num, String str, String str2, String str3, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(type, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, str3, set);
            }

            public static /* synthetic */ GetPaymentMethods copy$default(GetPaymentMethods getPaymentMethods, PaymentMethod.Type type, Integer num, String str, String str2, String str3, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    type = getPaymentMethods.type;
                }
                if ((i11 & 2) != 0) {
                    num = getPaymentMethods.limit;
                }
                Integer num2 = num;
                if ((i11 & 4) != 0) {
                    str = getPaymentMethods.endingBefore;
                }
                String str4 = str;
                if ((i11 & 8) != 0) {
                    str2 = getPaymentMethods.startingAfter;
                }
                String str5 = str2;
                if ((i11 & 16) != 0) {
                    str3 = getPaymentMethods.getId$payments_core_release();
                }
                String str6 = str3;
                Set<String> set2 = set;
                if ((i11 & 32) != 0) {
                    set2 = getPaymentMethods.getProductUsage$payments_core_release();
                }
                return getPaymentMethods.copy(type, num2, str4, str5, str6, set2);
            }

            public final PaymentMethod.Type component1$payments_core_release() {
                return this.type;
            }

            public final Integer component2$payments_core_release() {
                return this.limit;
            }

            public final String component3$payments_core_release() {
                return this.endingBefore;
            }

            public final String component4$payments_core_release() {
                return this.startingAfter;
            }

            public final String component5$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component6$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final GetPaymentMethods copy(PaymentMethod.Type type, Integer num, String str, String str2, String id2, Set<String> productUsage) {
                s.g(type, "type");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                return new GetPaymentMethods(type, num, str, str2, id2, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GetPaymentMethods) {
                    GetPaymentMethods getPaymentMethods = (GetPaymentMethods) obj;
                    return this.type == getPaymentMethods.type && s.c(this.limit, getPaymentMethods.limit) && s.c(this.endingBefore, getPaymentMethods.endingBefore) && s.c(this.startingAfter, getPaymentMethods.startingAfter) && s.c(getId$payments_core_release(), getPaymentMethods.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), getPaymentMethods.getProductUsage$payments_core_release());
                }
                return false;
            }

            public final String getEndingBefore$payments_core_release() {
                return this.endingBefore;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20888id;
            }

            public final Integer getLimit$payments_core_release() {
                return this.limit;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getStartingAfter$payments_core_release() {
                return this.startingAfter;
            }

            public final PaymentMethod.Type getType$payments_core_release() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                Integer num = this.limit;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.endingBefore;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.startingAfter;
                return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                return "GetPaymentMethods(type=" + this.type + ", limit=" + this.limit + ", endingBefore=" + ((Object) this.endingBefore) + ", startingAfter=" + ((Object) this.startingAfter) + ", id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                int intValue;
                s.g(out, "out");
                this.type.writeToParcel(out, i11);
                Integer num = this.limit;
                if (num == null) {
                    intValue = 0;
                } else {
                    out.writeInt(1);
                    intValue = num.intValue();
                }
                out.writeInt(intValue);
                out.writeString(this.endingBefore);
                out.writeString(this.startingAfter);
                out.writeString(this.f20888id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetPaymentMethods(PaymentMethod.Type type, Integer num, String str, String str2, String id2, Set<String> productUsage) {
                super(null);
                s.g(type, "type");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                this.type = type;
                this.limit = num;
                this.endingBefore = str;
                this.startingAfter = str2;
                this.f20888id = id2;
                this.productUsage = productUsage;
            }
        }

        /* loaded from: classes2.dex */
        public static final class UpdateDefaultSource extends Customer {

            /* renamed from: id  reason: collision with root package name */
            private final String f20889id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;
            public static final Parcelable.Creator<UpdateDefaultSource> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UpdateDefaultSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateDefaultSource createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateDefaultSource(readString, readString2, readString3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateDefaultSource[] newArray(int i11) {
                    return new UpdateDefaultSource[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateDefaultSource(String sourceId, String sourceType, String id2, Set<String> productUsage) {
                super(null);
                s.g(sourceId, "sourceId");
                s.g(sourceType, "sourceType");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.sourceType = sourceType;
                this.f20889id = id2;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UpdateDefaultSource copy$default(UpdateDefaultSource updateDefaultSource, String str, String str2, String str3, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = updateDefaultSource.sourceId;
                }
                if ((i11 & 2) != 0) {
                    str2 = updateDefaultSource.sourceType;
                }
                if ((i11 & 4) != 0) {
                    str3 = updateDefaultSource.getId$payments_core_release();
                }
                if ((i11 & 8) != 0) {
                    set = updateDefaultSource.getProductUsage$payments_core_release();
                }
                return updateDefaultSource.copy(str, str2, str3, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2() {
                return this.sourceType;
            }

            public final String component3$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component4$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final UpdateDefaultSource copy(String sourceId, String sourceType, String id2, Set<String> productUsage) {
                s.g(sourceId, "sourceId");
                s.g(sourceType, "sourceType");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                return new UpdateDefaultSource(sourceId, sourceType, id2, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof UpdateDefaultSource) {
                    UpdateDefaultSource updateDefaultSource = (UpdateDefaultSource) obj;
                    return s.c(this.sourceId, updateDefaultSource.sourceId) && s.c(this.sourceType, updateDefaultSource.sourceType) && s.c(getId$payments_core_release(), updateDefaultSource.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), updateDefaultSource.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20889id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            public int hashCode() {
                return (((((this.sourceId.hashCode() * 31) + this.sourceType.hashCode()) * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                return "UpdateDefaultSource(sourceId=" + this.sourceId + ", sourceType=" + this.sourceType + ", id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.sourceId);
                out.writeString(this.sourceType);
                out.writeString(this.f20889id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class UpdateShipping extends Customer {

            /* renamed from: id  reason: collision with root package name */
            private final String f20890id;
            private final Set<String> productUsage;
            private final ShippingInformation shippingInformation;
            public static final Parcelable.Creator<UpdateShipping> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UpdateShipping> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    ShippingInformation createFromParcel = ShippingInformation.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateShipping(createFromParcel, readString, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping[] newArray(int i11) {
                    return new UpdateShipping[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateShipping(ShippingInformation shippingInformation, String id2, Set<String> productUsage) {
                super(null);
                s.g(shippingInformation, "shippingInformation");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                this.shippingInformation = shippingInformation;
                this.f20890id = id2;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UpdateShipping copy$default(UpdateShipping updateShipping, ShippingInformation shippingInformation, String str, Set set, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    shippingInformation = updateShipping.shippingInformation;
                }
                if ((i11 & 2) != 0) {
                    str = updateShipping.getId$payments_core_release();
                }
                if ((i11 & 4) != 0) {
                    set = updateShipping.getProductUsage$payments_core_release();
                }
                return updateShipping.copy(shippingInformation, str, set);
            }

            public final ShippingInformation component1() {
                return this.shippingInformation;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final UpdateShipping copy(ShippingInformation shippingInformation, String id2, Set<String> productUsage) {
                s.g(shippingInformation, "shippingInformation");
                s.g(id2, "id");
                s.g(productUsage, "productUsage");
                return new UpdateShipping(shippingInformation, id2, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof UpdateShipping) {
                    UpdateShipping updateShipping = (UpdateShipping) obj;
                    return s.c(this.shippingInformation, updateShipping.shippingInformation) && s.c(getId$payments_core_release(), updateShipping.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), updateShipping.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20890id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final ShippingInformation getShippingInformation() {
                return this.shippingInformation;
            }

            public int hashCode() {
                return (((this.shippingInformation.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                return "UpdateShipping(shippingInformation=" + this.shippingInformation + ", id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                this.shippingInformation.writeToParcel(out, i11);
                out.writeString(this.f20890id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        private Customer() {
            super(null);
        }

        public /* synthetic */ Customer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RetrieveKey extends EphemeralOperation {
        public static final Parcelable.Creator<RetrieveKey> CREATOR = new Creator();

        /* renamed from: id  reason: collision with root package name */
        private final String f20893id;
        private final Set<String> productUsage;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<RetrieveKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetrieveKey createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new RetrieveKey(readString, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetrieveKey[] newArray(int i11) {
                return new RetrieveKey[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetrieveKey(String id2, Set<String> productUsage) {
            super(null);
            s.g(id2, "id");
            s.g(productUsage, "productUsage");
            this.f20893id = id2;
            this.productUsage = productUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RetrieveKey copy$default(RetrieveKey retrieveKey, String str, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = retrieveKey.getId$payments_core_release();
            }
            if ((i11 & 2) != 0) {
                set = retrieveKey.getProductUsage$payments_core_release();
            }
            return retrieveKey.copy(str, set);
        }

        public final String component1$payments_core_release() {
            return getId$payments_core_release();
        }

        public final Set<String> component2$payments_core_release() {
            return getProductUsage$payments_core_release();
        }

        public final RetrieveKey copy(String id2, Set<String> productUsage) {
            s.g(id2, "id");
            s.g(productUsage, "productUsage");
            return new RetrieveKey(id2, productUsage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RetrieveKey) {
                RetrieveKey retrieveKey = (RetrieveKey) obj;
                return s.c(getId$payments_core_release(), retrieveKey.getId$payments_core_release()) && s.c(getProductUsage$payments_core_release(), retrieveKey.getProductUsage$payments_core_release());
            }
            return false;
        }

        @Override // com.stripe.android.EphemeralOperation
        public String getId$payments_core_release() {
            return this.f20893id;
        }

        @Override // com.stripe.android.EphemeralOperation
        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        public int hashCode() {
            return (getId$payments_core_release().hashCode() * 31) + getProductUsage$payments_core_release().hashCode();
        }

        public String toString() {
            return "RetrieveKey(id=" + getId$payments_core_release() + ", productUsage=" + getProductUsage$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f20893id);
            Set<String> set = this.productUsage;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }
    }

    private EphemeralOperation() {
    }

    public /* synthetic */ EphemeralOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId$payments_core_release();

    public abstract Set<String> getProductUsage$payments_core_release();

    /* loaded from: classes2.dex */
    public static abstract class Issuing extends EphemeralOperation {
        private final Set<String> productUsage;

        /* loaded from: classes2.dex */
        public static final class RetrievePin extends Issuing {
            private final String cardId;

            /* renamed from: id  reason: collision with root package name */
            private final String f20891id;
            private final String userOneTimeCode;
            private final String verificationId;
            public static final Parcelable.Creator<RetrievePin> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RetrievePin> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RetrievePin createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new RetrievePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RetrievePin[] newArray(int i11) {
                    return new RetrievePin[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetrievePin(String cardId, String verificationId, String userOneTimeCode, String id2) {
                super(null, 1, null);
                s.g(cardId, "cardId");
                s.g(verificationId, "verificationId");
                s.g(userOneTimeCode, "userOneTimeCode");
                s.g(id2, "id");
                this.cardId = cardId;
                this.verificationId = verificationId;
                this.userOneTimeCode = userOneTimeCode;
                this.f20891id = id2;
            }

            public static /* synthetic */ RetrievePin copy$default(RetrievePin retrievePin, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = retrievePin.cardId;
                }
                if ((i11 & 2) != 0) {
                    str2 = retrievePin.verificationId;
                }
                if ((i11 & 4) != 0) {
                    str3 = retrievePin.userOneTimeCode;
                }
                if ((i11 & 8) != 0) {
                    str4 = retrievePin.getId$payments_core_release();
                }
                return retrievePin.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.cardId;
            }

            public final String component2() {
                return this.verificationId;
            }

            public final String component3() {
                return this.userOneTimeCode;
            }

            public final String component4$payments_core_release() {
                return getId$payments_core_release();
            }

            public final RetrievePin copy(String cardId, String verificationId, String userOneTimeCode, String id2) {
                s.g(cardId, "cardId");
                s.g(verificationId, "verificationId");
                s.g(userOneTimeCode, "userOneTimeCode");
                s.g(id2, "id");
                return new RetrievePin(cardId, verificationId, userOneTimeCode, id2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RetrievePin) {
                    RetrievePin retrievePin = (RetrievePin) obj;
                    return s.c(this.cardId, retrievePin.cardId) && s.c(this.verificationId, retrievePin.verificationId) && s.c(this.userOneTimeCode, retrievePin.userOneTimeCode) && s.c(getId$payments_core_release(), retrievePin.getId$payments_core_release());
                }
                return false;
            }

            public final String getCardId() {
                return this.cardId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20891id;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public int hashCode() {
                return (((((this.cardId.hashCode() * 31) + this.verificationId.hashCode()) * 31) + this.userOneTimeCode.hashCode()) * 31) + getId$payments_core_release().hashCode();
            }

            public String toString() {
                return "RetrievePin(cardId=" + this.cardId + ", verificationId=" + this.verificationId + ", userOneTimeCode=" + this.userOneTimeCode + ", id=" + getId$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.cardId);
                out.writeString(this.verificationId);
                out.writeString(this.userOneTimeCode);
                out.writeString(this.f20891id);
            }
        }

        /* loaded from: classes2.dex */
        public static final class UpdatePin extends Issuing {
            private final String cardId;

            /* renamed from: id  reason: collision with root package name */
            private final String f20892id;
            private final String newPin;
            private final String userOneTimeCode;
            private final String verificationId;
            public static final Parcelable.Creator<UpdatePin> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UpdatePin> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdatePin createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new UpdatePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdatePin[] newArray(int i11) {
                    return new UpdatePin[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePin(String cardId, String newPin, String verificationId, String userOneTimeCode, String id2) {
                super(null, 1, null);
                s.g(cardId, "cardId");
                s.g(newPin, "newPin");
                s.g(verificationId, "verificationId");
                s.g(userOneTimeCode, "userOneTimeCode");
                s.g(id2, "id");
                this.cardId = cardId;
                this.newPin = newPin;
                this.verificationId = verificationId;
                this.userOneTimeCode = userOneTimeCode;
                this.f20892id = id2;
            }

            public static /* synthetic */ UpdatePin copy$default(UpdatePin updatePin, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = updatePin.cardId;
                }
                if ((i11 & 2) != 0) {
                    str2 = updatePin.newPin;
                }
                String str6 = str2;
                if ((i11 & 4) != 0) {
                    str3 = updatePin.verificationId;
                }
                String str7 = str3;
                if ((i11 & 8) != 0) {
                    str4 = updatePin.userOneTimeCode;
                }
                String str8 = str4;
                if ((i11 & 16) != 0) {
                    str5 = updatePin.getId$payments_core_release();
                }
                return updatePin.copy(str, str6, str7, str8, str5);
            }

            public final String component1() {
                return this.cardId;
            }

            public final String component2() {
                return this.newPin;
            }

            public final String component3() {
                return this.verificationId;
            }

            public final String component4() {
                return this.userOneTimeCode;
            }

            public final String component5$payments_core_release() {
                return getId$payments_core_release();
            }

            public final UpdatePin copy(String cardId, String newPin, String verificationId, String userOneTimeCode, String id2) {
                s.g(cardId, "cardId");
                s.g(newPin, "newPin");
                s.g(verificationId, "verificationId");
                s.g(userOneTimeCode, "userOneTimeCode");
                s.g(id2, "id");
                return new UpdatePin(cardId, newPin, verificationId, userOneTimeCode, id2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof UpdatePin) {
                    UpdatePin updatePin = (UpdatePin) obj;
                    return s.c(this.cardId, updatePin.cardId) && s.c(this.newPin, updatePin.newPin) && s.c(this.verificationId, updatePin.verificationId) && s.c(this.userOneTimeCode, updatePin.userOneTimeCode) && s.c(getId$payments_core_release(), updatePin.getId$payments_core_release());
                }
                return false;
            }

            public final String getCardId() {
                return this.cardId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f20892id;
            }

            public final String getNewPin() {
                return this.newPin;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public int hashCode() {
                return (((((((this.cardId.hashCode() * 31) + this.newPin.hashCode()) * 31) + this.verificationId.hashCode()) * 31) + this.userOneTimeCode.hashCode()) * 31) + getId$payments_core_release().hashCode();
            }

            public String toString() {
                return "UpdatePin(cardId=" + this.cardId + ", newPin=" + this.newPin + ", verificationId=" + this.verificationId + ", userOneTimeCode=" + this.userOneTimeCode + ", id=" + getId$payments_core_release() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.cardId);
                out.writeString(this.newPin);
                out.writeString(this.verificationId);
                out.writeString(this.userOneTimeCode);
                out.writeString(this.f20892id);
            }
        }

        public /* synthetic */ Issuing(Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? x0.d() : set, null);
        }

        public /* synthetic */ Issuing(Set set, DefaultConstructorMarker defaultConstructorMarker) {
            this(set);
        }

        @Override // com.stripe.android.EphemeralOperation
        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        private Issuing(Set<String> set) {
            super(null);
            this.productUsage = set;
        }
    }
}