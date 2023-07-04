package pn;

import com.google.gson.q;
import com.google.gson.u;
import com.google.gson.v;

/* loaded from: classes2.dex */
public final class e implements v {

    /* renamed from: a  reason: collision with root package name */
    private final on.c f46704a;

    public e(on.c cVar) {
        this.f46704a = cVar;
    }

    @Override // com.google.gson.v
    public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
        nn.b bVar = (nn.b) aVar.getRawType().getAnnotation(nn.b.class);
        if (bVar == null) {
            return null;
        }
        return (u<T>) b(this.f46704a, eVar, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u<?> b(on.c cVar, com.google.gson.e eVar, com.google.gson.reflect.a<?> aVar, nn.b bVar) {
        u<?> lVar;
        Object construct = cVar.a(com.google.gson.reflect.a.get((Class) bVar.value())).construct();
        if (construct instanceof u) {
            lVar = (u) construct;
        } else if (construct instanceof v) {
            lVar = ((v) construct).a(eVar, aVar);
        } else {
            boolean z11 = construct instanceof q;
            if (!z11 && !(construct instanceof com.google.gson.j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + construct.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z11 ? (q) construct : null, construct instanceof com.google.gson.j ? (com.google.gson.j) construct : null, eVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.a();
    }
}