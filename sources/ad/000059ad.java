package com.stripe.android.ui.core.address;

import c30.i;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.RowController;
import com.stripe.android.ui.core.elements.RowElement;
import com.stripe.android.ui.core.elements.SectionFieldElement;
import com.stripe.android.ui.core.elements.SectionSingleFieldElement;
import com.stripe.android.ui.core.elements.SimpleTextElement;
import com.stripe.android.ui.core.elements.SimpleTextFieldConfig;
import com.stripe.android.ui.core.elements.SimpleTextFieldController;
import e00.b;
import e00.l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.m;
import n00.r;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;
import wz.u;
import wz.w;

/* loaded from: classes6.dex */
public final class TransformAddressToElementKt {
    private static final a format = m.b(null, TransformAddressToElementKt$format$1.INSTANCE, 1, null);

    private static final List<SectionFieldElement> combineCityAndPostal(List<? extends SectionSingleFieldElement> list) {
        List i11;
        List<SectionFieldElement> Y;
        List l11;
        i11 = w.i();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                w.s();
            }
            SectionSingleFieldElement sectionSingleFieldElement = (SectionSingleFieldElement) obj;
            if (i13 < list.size() && isPostalNextToCity(list.get(i12), list.get(i13))) {
                l11 = w.l(list.get(i12), list.get(i13));
                i11 = e0.z0(i11, new RowElement(IdentifierSpec.Companion.Generic(s.p("row_", Long.valueOf(UUID.randomUUID().getLeastSignificantBits()))), l11, new RowController(l11)));
            } else if (u.p0(i11) instanceof RowElement) {
                i11 = e0.z0(i11, null);
            } else {
                i11 = e0.z0(i11, sectionSingleFieldElement);
            }
            i12 = i13;
        }
        Y = e0.Y(i11);
        return Y;
    }

    private static final String getJsonStringFromInputStream(InputStream inputStream) {
        BufferedReader bufferedReader;
        String e11;
        if (inputStream == null) {
            bufferedReader = null;
        } else {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, d.f35187b);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, PKIFailureInfo.certRevoked);
        }
        if (bufferedReader == null) {
            e11 = null;
        } else {
            try {
                e11 = l.e(bufferedReader);
            } finally {
            }
        }
        b.a(bufferedReader, null);
        return e11;
    }

    private static final int getKeyboard(FieldSchema fieldSchema) {
        boolean z11 = false;
        if (fieldSchema != null && fieldSchema.isNumeric()) {
            z11 = true;
        }
        if (z11) {
            return s2.s.f50139b.d();
        }
        return s2.s.f50139b.g();
    }

    private static final boolean isCityOrPostal(IdentifierSpec identifierSpec) {
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        return s.c(identifierSpec, companion.getPostalCode()) || s.c(identifierSpec, companion.getCity());
    }

    private static final boolean isPostalNextToCity(SectionSingleFieldElement sectionSingleFieldElement, SectionSingleFieldElement sectionSingleFieldElement2) {
        return isCityOrPostal(sectionSingleFieldElement.getIdentifier()) && isCityOrPostal(sectionSingleFieldElement2.getIdentifier());
    }

    public static final List<CountryAddressSchema> parseAddressesSchema(InputStream inputStream) {
        String jsonStringFromInputStream = getJsonStringFromInputStream(inputStream);
        if (jsonStringFromInputStream == null) {
            return null;
        }
        a aVar = format;
        return (List) aVar.b(i.b(aVar.a(), m0.n(List.class, r.f40137c.d(m0.m(CountryAddressSchema.class)))), jsonStringFromInputStream);
    }

    public static final List<SectionFieldElement> transformToElementList(List<CountryAddressSchema> list) {
        NameType nameType;
        s.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (CountryAddressSchema countryAddressSchema : list) {
            FieldType type = countryAddressSchema.getType();
            SimpleTextElement simpleTextElement = null;
            if (type != null) {
                IdentifierSpec identifierSpec = countryAddressSchema.getType().getIdentifierSpec();
                FieldSchema schema = countryAddressSchema.getSchema();
                Integer valueOf = (schema == null || (nameType = schema.getNameType()) == null) ? null : Integer.valueOf(nameType.getStringResId());
                simpleTextElement = new SimpleTextElement(identifierSpec, new SimpleTextFieldController(new SimpleTextFieldConfig(valueOf == null ? type.getDefaultLabel() : valueOf.intValue(), type.m423getCapitalizationIUNYP9k(), getKeyboard(countryAddressSchema.getSchema()), null), !countryAddressSchema.getRequired(), null, 4, null));
            }
            if (simpleTextElement != null) {
                arrayList.add(simpleTextElement);
            }
        }
        return combineCityAndPostal(arrayList);
    }
}