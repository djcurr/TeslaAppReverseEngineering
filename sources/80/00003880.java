package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected m1 unknownFields = m1.e();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes3.dex */
    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0298a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f16421a;

        /* renamed from: b */
        protected MessageType f16422b;

        /* renamed from: c */
        protected boolean f16423c = false;

        public a(MessageType messagetype) {
            this.f16421a = messagetype;
            this.f16422b = (MessageType) messagetype.j(f.NEW_MUTABLE_INSTANCE);
        }

        private void m(MessageType messagetype, MessageType messagetype2) {
            b1.a().e(messagetype).mergeFrom(messagetype, messagetype2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.a
        /* renamed from: e */
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw a.AbstractC0298a.d(buildPartial);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.a
        /* renamed from: f */
        public MessageType buildPartial() {
            if (this.f16423c) {
                return this.f16422b;
            }
            this.f16422b.r();
            this.f16423c = true;
            return this.f16422b;
        }

        /* renamed from: g */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.l(buildPartial());
            return buildertype;
        }

        public final void h() {
            if (this.f16423c) {
                i();
                this.f16423c = false;
            }
        }

        protected void i() {
            MessageType messagetype = (MessageType) this.f16422b.j(f.NEW_MUTABLE_INSTANCE);
            m(messagetype, this.f16422b);
            this.f16422b = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        /* renamed from: j */
        public MessageType getDefaultInstanceForType() {
            return this.f16421a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0298a
        /* renamed from: k */
        public BuilderType b(MessageType messagetype) {
            return l(messagetype);
        }

        public BuilderType l(MessageType messagetype) {
            h();
            m(this.f16422b, messagetype);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    protected static class b<T extends y<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {

        /* renamed from: a */
        private final T f16424a;

        public b(T t11) {
            this.f16424a = t11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y0
        /* renamed from: g */
        public T a(j jVar, p pVar) {
            return (T) y.y(this.f16424a, jVar, pVar);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements r0 {
        protected u<d> extensions = u.h();

        public u<d> C() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d implements u.b<d> {

        /* renamed from: a */
        final a0.d<?> f16425a;

        /* renamed from: b */
        final int f16426b;

        /* renamed from: c */
        final r1.b f16427c;

        /* renamed from: d */
        final boolean f16428d;

        /* renamed from: e */
        final boolean f16429e;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public q0.a R(q0.a aVar, q0 q0Var) {
            return ((a) aVar).l((y) q0Var);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f16426b - dVar.f16426b;
        }

        public a0.d<?> b() {
            return this.f16425a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public r1.c getLiteJavaType() {
            return this.f16427c.getJavaType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public r1.b getLiteType() {
            return this.f16427c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public int getNumber() {
            return this.f16426b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean isPacked() {
            return this.f16429e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean isRepeated() {
            return this.f16428d;
        }
    }

    /* loaded from: classes3.dex */
    public static class e<ContainingType extends q0, Type> extends n<ContainingType, Type> {

        /* renamed from: a */
        final q0 f16430a;

        /* renamed from: b */
        final d f16431b;

        public r1.b a() {
            return this.f16431b.getLiteType();
        }

        public q0 b() {
            return this.f16430a;
        }

        public int c() {
            return this.f16431b.getNumber();
        }

        public boolean d() {
            return this.f16431b.f16428d;
        }
    }

    /* loaded from: classes3.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <T extends y<?, ?>> void A(Class<T> cls, T t11) {
        defaultInstanceMap.put(cls, t11);
    }

    private static <T extends y<T, ?>> T h(T t11) {
        if (t11 == null || t11.isInitialized()) {
            return t11;
        }
        throw t11.e().a().i(t11);
    }

    public static <E> a0.i<E> m() {
        return c1.d();
    }

    public static <T extends y<?, ?>> T n(Class<T> cls) {
        y<?, ?> yVar = defaultInstanceMap.get(cls);
        if (yVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (yVar == null) {
            yVar = (T) ((y) p1.i(cls)).getDefaultInstanceForType();
            if (yVar != null) {
                defaultInstanceMap.put(cls, yVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) yVar;
    }

    public static Object p(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static final <T extends y<T, ?>> boolean q(T t11, boolean z11) {
        byte byteValue = ((Byte) t11.j(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = b1.a().e(t11).isInitialized(t11);
        if (z11) {
            t11.k(f.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t11 : null);
        }
        return isInitialized;
    }

    public static <E> a0.i<E> s(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object u(q0 q0Var, String str, Object[] objArr) {
        return new d1(q0Var, str, objArr);
    }

    public static <T extends y<T, ?>> T v(T t11, i iVar, p pVar) {
        return (T) h(x(t11, iVar, pVar));
    }

    public static <T extends y<T, ?>> T w(T t11, byte[] bArr, p pVar) {
        return (T) h(z(t11, bArr, 0, bArr.length, pVar));
    }

    private static <T extends y<T, ?>> T x(T t11, i iVar, p pVar) {
        try {
            j p11 = iVar.p();
            T t12 = (T) y(t11, p11, pVar);
            try {
                p11.a(0);
                return t12;
            } catch (InvalidProtocolBufferException e11) {
                throw e11.i(t12);
            }
        } catch (InvalidProtocolBufferException e12) {
            throw e12;
        }
    }

    static <T extends y<T, ?>> T y(T t11, j jVar, p pVar) {
        T t12 = (T) t11.j(f.NEW_MUTABLE_INSTANCE);
        try {
            f1 e11 = b1.a().e(t12);
            e11.b(t12, k.h(jVar), pVar);
            e11.makeImmutable(t12);
            return t12;
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12.getMessage()).i(t12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    static <T extends y<T, ?>> T z(T t11, byte[] bArr, int i11, int i12, p pVar) {
        T t12 = (T) t11.j(f.NEW_MUTABLE_INSTANCE);
        try {
            f1 e11 = b1.a().e(t12);
            e11.a(t12, bArr, i11, i11 + i12, new e.b(pVar));
            e11.makeImmutable(t12);
            if (t12.memoizedHashCode == 0) {
                return t12;
            }
            throw new RuntimeException();
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12.getMessage()).i(t12);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.j().i(t12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    /* renamed from: B */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) j(f.NEW_BUILDER);
        buildertype.l(this);
        return buildertype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public void a(CodedOutputStream codedOutputStream) {
        b1.a().e(this).c(this, l.g(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int b() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getDefaultInstanceForType().getClass().isInstance(obj)) {
            return b1.a().e(this).equals(this, (y) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    void f(int i11) {
        this.memoizedSerializedSize = i11;
    }

    public Object g() {
        return j(f.BUILD_MESSAGE_INFO);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final y0<MessageType> getParserForType() {
        return (y0) j(f.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = b1.a().e(this).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = b1.a().e(this).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType i() {
        return (BuilderType) j(f.NEW_BUILDER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean isInitialized() {
        return q(this, true);
    }

    public Object j(f fVar) {
        return l(fVar, null, null);
    }

    protected Object k(f fVar, Object obj) {
        return l(fVar, obj, null);
    }

    protected abstract Object l(f fVar, Object obj, Object obj2);

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    /* renamed from: o */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) j(f.GET_DEFAULT_INSTANCE);
    }

    protected void r() {
        b1.a().e(this).makeImmutable(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    /* renamed from: t */
    public final BuilderType newBuilderForType() {
        return (BuilderType) j(f.NEW_BUILDER);
    }

    public String toString() {
        return s0.e(this, super.toString());
    }
}