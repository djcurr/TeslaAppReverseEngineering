package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;

@kotlinx.serialization.a(with = s.class)
/* loaded from: classes5.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c30.b<JsonPrimitive> serializer() {
            return s.f35670a;
        }
    }

    private JsonPrimitive() {
        super(null);
    }

    public /* synthetic */ JsonPrimitive(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String b();

    public String toString() {
        return b();
    }
}