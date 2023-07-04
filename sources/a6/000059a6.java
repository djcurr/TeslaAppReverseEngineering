package com.stripe.android.ui.core.address;

import c30.b;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import s2.r;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum AddressLine1 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@a(with = FieldTypeAsStringSerializer.class)
/* loaded from: classes6.dex */
public final class FieldType {
    private static final /* synthetic */ FieldType[] $VALUES;
    public static final FieldType AddressLine1;
    public static final FieldType AddressLine2;
    public static final FieldType AdministrativeArea;
    public static final Companion Companion;
    public static final FieldType Locality;
    public static final FieldType Name;
    public static final FieldType PostalCode;
    private final int capitalization;
    private final int defaultLabel;
    private final IdentifierSpec identifierSpec;
    private final String serializedValue;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FieldType from(String value) {
            FieldType[] values;
            s.g(value, "value");
            for (FieldType fieldType : FieldType.values()) {
                if (s.c(fieldType.getSerializedValue(), value)) {
                    return fieldType;
                }
            }
            return null;
        }

        public final b<FieldType> serializer() {
            return FieldTypeAsStringSerializer.INSTANCE;
        }
    }

    private static final /* synthetic */ FieldType[] $values() {
        return new FieldType[]{AddressLine1, AddressLine2, Locality, PostalCode, AdministrativeArea, Name};
    }

    static {
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        IdentifierSpec line1 = companion.getLine1();
        int i11 = R.string.address_label_address_line1;
        r.a aVar = r.f50134a;
        AddressLine1 = new FieldType("AddressLine1", 0, "addressLine1", line1, i11, aVar.d());
        AddressLine2 = new FieldType("AddressLine2", 1, "addressLine2", companion.getLine2(), R.string.address_label_address_line2, aVar.d());
        Locality = new FieldType("Locality", 2, PlaceTypes.LOCALITY, companion.getCity(), R.string.address_label_city, aVar.d());
        PostalCode = new FieldType("PostalCode", 3, "postalCode", companion.getPostalCode(), R.string.address_label_postal_code, aVar.b());
        AdministrativeArea = new FieldType("AdministrativeArea", 4, "administrativeArea", companion.getState(), NameType.state.getStringResId(), aVar.d());
        Name = new FieldType("Name", 5, "name", companion.getName(), R.string.address_label_name, aVar.d());
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private FieldType(String str, int i11, String str2, IdentifierSpec identifierSpec, int i12, int i13) {
        this.serializedValue = str2;
        this.identifierSpec = identifierSpec;
        this.defaultLabel = i12;
        this.capitalization = i13;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m423getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final int getDefaultLabel() {
        return this.defaultLabel;
    }

    public final IdentifierSpec getIdentifierSpec() {
        return this.identifierSpec;
    }

    public final String getSerializedValue() {
        return this.serializedValue;
    }
}