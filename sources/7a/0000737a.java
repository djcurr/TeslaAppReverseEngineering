package hl;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ol.y;

/* loaded from: classes3.dex */
public abstract class h<KeyProtoT extends q0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyProtoT> f29318a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, b<?, KeyProtoT>> f29319b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f29320c;

    /* loaded from: classes3.dex */
    public static abstract class a<KeyFormatProtoT extends q0, KeyT> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<KeyFormatProtoT> f29321a;

        public a(Class<KeyFormatProtoT> cls) {
            this.f29321a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.f29321a;
        }

        public abstract KeyFormatProtoT c(com.google.crypto.tink.shaded.protobuf.i iVar);

        public abstract void d(KeyFormatProtoT keyformatprotot);
    }

    /* loaded from: classes3.dex */
    protected static abstract class b<PrimitiveT, KeyT> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<PrimitiveT> f29322a;

        public b(Class<PrimitiveT> cls) {
            this.f29322a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt);

        final Class<PrimitiveT> b() {
            return this.f29322a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public h(Class<KeyProtoT> cls, KeyTypeManager.PrimitiveFactory<?, KeyProtoT>... primitiveFactoryArr) {
        this.f29318a = cls;
        HashMap hashMap = new HashMap();
        for (KeyTypeManager.PrimitiveFactory<?, KeyProtoT> primitiveFactory : primitiveFactoryArr) {
            if (!hashMap.containsKey(primitiveFactory.b())) {
                hashMap.put(primitiveFactory.b(), primitiveFactory);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + primitiveFactory.b().getCanonicalName());
            }
        }
        if (primitiveFactoryArr.length > 0) {
            this.f29320c = primitiveFactoryArr[0].b();
        } else {
            this.f29320c = Void.class;
        }
        this.f29319b = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> a() {
        return this.f29320c;
    }

    public final Class<KeyProtoT> b() {
        return this.f29318a;
    }

    public abstract String c();

    public final <P> P d(KeyProtoT keyprotot, Class<P> cls) {
        b<?, KeyProtoT> bVar = this.f29319b.get(cls);
        if (bVar != null) {
            return (P) bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> e();

    public abstract y.c f();

    public abstract KeyProtoT g(com.google.crypto.tink.shaded.protobuf.i iVar);

    public final Set<Class<?>> h() {
        return this.f29319b.keySet();
    }

    public abstract void i(KeyProtoT keyprotot);
}