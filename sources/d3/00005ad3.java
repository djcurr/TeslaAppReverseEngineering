package com.stripe.android.ui.core.elements;

import c30.b;
import kotlinx.serialization.a;
import vz.k;
import vz.m;

@a
/* loaded from: classes6.dex */
public final class OTPSpec extends FormItemSpec {
    private static final /* synthetic */ k<b<Object>> $cachedSerializer$delegate;
    public static final int $stable;
    public static final OTPSpec INSTANCE = new OTPSpec();

    static {
        k<b<Object>> b11;
        b11 = m.b(kotlin.b.PUBLICATION, OTPSpec$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b11;
        $stable = 8;
    }

    private OTPSpec() {
        super(null);
    }

    private final /* synthetic */ k get$cachedSerializer$delegate() {
        return $cachedSerializer$delegate;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return IdentifierSpec.Companion.Generic("otp");
    }

    public final b<OTPSpec> serializer() {
        return (b) get$cachedSerializer$delegate().getValue();
    }

    public final OTPElement transform() {
        return new OTPElement(getApiPath(), new OTPController(0, 1, null));
    }
}