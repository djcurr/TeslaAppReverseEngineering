package kotlinx.serialization.json;

import ch.qos.logback.core.CoreConstants;
import h30.h0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.e0;

@kotlinx.serialization.a(with = r.class)
/* loaded from: classes5.dex */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, i00.a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, JsonElement> f35614a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c30.b<JsonObject> serializer() {
            return r.f35665a;
        }
    }

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35615a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<String, ? extends JsonElement> entry) {
            kotlin.jvm.internal.s.g(entry, "<name for destructuring parameter 0>");
            StringBuilder sb2 = new StringBuilder();
            h0.c(sb2, entry.getKey());
            sb2.append(CoreConstants.COLON_CHAR);
            sb2.append(entry.getValue());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(Map<String, ? extends JsonElement> content) {
        super(null);
        kotlin.jvm.internal.s.g(content, "content");
        this.f35614a = content;
    }

    public boolean b(String key) {
        kotlin.jvm.internal.s.g(key, "key");
        return this.f35614a.containsKey(key);
    }

    public boolean c(JsonElement value) {
        kotlin.jvm.internal.s.g(value, "value");
        return this.f35614a.containsValue(value);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement compute(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String str, Function<? super String, ? extends JsonElement> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfPresent(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof JsonElement) {
            return c((JsonElement) obj);
        }
        return false;
    }

    public JsonElement e(String key) {
        kotlin.jvm.internal.s.g(key, "key");
        return this.f35614a.get(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return f();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return kotlin.jvm.internal.s.c(this.f35614a, obj);
    }

    public Set<Map.Entry<String, JsonElement>> f() {
        return this.f35614a.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement get(Object obj) {
        if (obj instanceof String) {
            return e((String) obj);
        }
        return null;
    }

    public Set<String> h() {
        return this.f35614a.keySet();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f35614a.hashCode();
    }

    public int i() {
        return this.f35614a.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f35614a.isEmpty();
    }

    public Collection<JsonElement> j() {
        return this.f35614a.values();
    }

    @Override // java.util.Map
    /* renamed from: k */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return h();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement put(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement putIfAbsent(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement replace(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, JsonElement jsonElement, JsonElement jsonElement2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return i();
    }

    public String toString() {
        String l02;
        l02 = e0.l0(this.f35614a.entrySet(), ",", "{", "}", 0, null, a.f35615a, 24, null);
        return l02;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return j();
    }
}