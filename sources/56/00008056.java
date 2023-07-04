package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;

@kotlinx.serialization.a(with = i.class)
/* loaded from: classes5.dex */
public abstract class JsonElement {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c30.b<JsonElement> serializer() {
            return i.f35650a;
        }
    }

    private JsonElement() {
    }

    public /* synthetic */ JsonElement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}