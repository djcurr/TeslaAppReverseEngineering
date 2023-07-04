package com.stripe.android.ui.core.elements;

import c30.b;
import kotlinx.serialization.a;
import vz.k;
import vz.l;

@a
/* loaded from: classes6.dex */
public final class EmptyFormSpec extends FormItemSpec {
    public static final EmptyFormSpec INSTANCE = new EmptyFormSpec();
    private static final IdentifierSpec apiPath = IdentifierSpec.Companion.Generic("empty");
    private static final /* synthetic */ k<b<Object>> $cachedSerializer$delegate = l.b(kotlin.b.PUBLICATION, EmptyFormSpec$$cachedSerializer$delegate$1.INSTANCE);

    private EmptyFormSpec() {
        super(null);
    }

    private final /* synthetic */ k get$cachedSerializer$delegate() {
        return $cachedSerializer$delegate;
    }

    public static /* synthetic */ void getApiPath$annotations() {
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return apiPath;
    }

    public final b<EmptyFormSpec> serializer() {
        return (b) get$cachedSerializer$delegate().getValue();
    }
}