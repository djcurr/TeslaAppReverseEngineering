package com.stripe.android.ui.core.address;

import c30.b;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class CountryAddressSchema {
    public static final Companion Companion = new Companion(null);
    private final boolean required;
    private final FieldSchema schema;
    private final FieldType type;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<CountryAddressSchema> serializer() {
            return CountryAddressSchema$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CountryAddressSchema(int i11, FieldType fieldType, boolean z11, FieldSchema fieldSchema, q1 q1Var) {
        if (3 != (i11 & 3)) {
            f1.a(i11, 3, CountryAddressSchema$$serializer.INSTANCE.getDescriptor());
        }
        this.type = fieldType;
        this.required = z11;
        if ((i11 & 4) == 0) {
            this.schema = null;
        } else {
            this.schema = fieldSchema;
        }
    }

    public static final void write$Self(CountryAddressSchema self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.D(serialDesc, 0, FieldTypeAsStringSerializer.INSTANCE, self.type);
        output.C(serialDesc, 1, self.required);
        if (output.k(serialDesc, 2) || self.schema != null) {
            output.D(serialDesc, 2, FieldSchema$$serializer.INSTANCE, self.schema);
        }
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final FieldSchema getSchema() {
        return this.schema;
    }

    public final FieldType getType() {
        return this.type;
    }

    public CountryAddressSchema(FieldType fieldType, boolean z11, FieldSchema fieldSchema) {
        this.type = fieldType;
        this.required = z11;
        this.schema = fieldSchema;
    }

    public /* synthetic */ CountryAddressSchema(FieldType fieldType, boolean z11, FieldSchema fieldSchema, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldType, z11, (i11 & 4) != 0 ? null : fieldSchema);
    }
}