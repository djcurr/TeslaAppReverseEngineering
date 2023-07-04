package com.stripe.android.model;

import android.os.Parcelable;
import com.stripe.android.model.Token;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;
import wz.x0;

/* loaded from: classes6.dex */
public abstract class TokenParams implements StripeParamsModel, Parcelable {
    private final Set<String> attribution;
    private final Token.Type tokenType;

    public TokenParams(Token.Type tokenType, Set<String> attribution) {
        s.g(tokenType, "tokenType");
        s.g(attribution, "attribution");
        this.tokenType = tokenType;
        this.attribution = attribution;
    }

    public final Set<String> getAttribution() {
        return this.attribution;
    }

    public final Token.Type getTokenType() {
        return this.tokenType;
    }

    public abstract Map<String, Object> getTypeDataParams();

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, Object> f11;
        f11 = r0.f(v.a(this.tokenType.getCode(), getTypeDataParams()));
        return f11;
    }

    public /* synthetic */ TokenParams(Token.Type type, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i11 & 2) != 0 ? x0.d() : set);
    }
}