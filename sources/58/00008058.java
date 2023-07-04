package kotlinx.serialization.json;

import com.adyen.checkout.components.model.payments.request.Address;

@kotlinx.serialization.a(with = q.class)
/* loaded from: classes5.dex */
public final class JsonNull extends JsonPrimitive {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonNull f35610a = new JsonNull();

    /* renamed from: b  reason: collision with root package name */
    private static final String f35611b = Address.ADDRESS_NULL_PLACEHOLDER;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ vz.k<c30.b<Object>> f35612c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<c30.b<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35613a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final c30.b<Object> invoke() {
            return q.f35663a;
        }
    }

    static {
        vz.k<c30.b<Object>> b11;
        b11 = vz.m.b(kotlin.b.PUBLICATION, a.f35613a);
        f35612c = b11;
    }

    private JsonNull() {
        super(null);
    }

    private final /* synthetic */ vz.k c() {
        return f35612c;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String b() {
        return f35611b;
    }

    public final c30.b<JsonNull> serializer() {
        return (c30.b) c().getValue();
    }
}