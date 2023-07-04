package com.stripe.android.model.parsers;

import com.stripe.android.EphemeralKey;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EphemeralKeyJsonParser implements ModelJsonParser<EphemeralKey> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ASSOCIATED_OBJECTS = "associated_objects";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_EXPIRES = "expires";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_SECRET = "secret";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public EphemeralKey parse(JSONObject json) {
        s.g(json, "json");
        long j11 = json.getLong(FIELD_CREATED);
        long j12 = json.getLong("expires");
        String id2 = json.getString("id");
        boolean z11 = json.getBoolean(FIELD_LIVEMODE);
        String objectType = json.getString(FIELD_OBJECT);
        String secret = json.getString(FIELD_SECRET);
        JSONObject jSONObject = json.getJSONArray(FIELD_ASSOCIATED_OBJECTS).getJSONObject(0);
        String type = jSONObject.getString("type");
        String objectId = jSONObject.getString("id");
        s.f(objectId, "objectId");
        s.f(id2, "id");
        s.f(objectType, "objectType");
        s.f(secret, "secret");
        s.f(type, "type");
        return new EphemeralKey(objectId, j11, j12, id2, z11, objectType, secret, type);
    }
}