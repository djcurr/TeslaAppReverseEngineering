package com.squareup.wire;

import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Duration;
import j$.time.Instant;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import okio.r;
import vz.b0;

/* loaded from: classes2.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<okio.i> BYTES;
    public static final ProtoAdapter<okio.i> BYTES_VALUE;
    public static final a Companion = new a(null);
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<b0> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final b fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final o syntax;
    private final n00.d<?> type;
    private final String typeUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "value", "Ln00/d;", "type", "<init>", "(ILn00/d;)V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {

        /* renamed from: a */
        public final int f20831a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public EnumConstantNotFoundException(int r3, n00.d<?> r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown enum tag "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " for "
                r0.append(r1)
                if (r4 == 0) goto L1f
                java.lang.Class r4 = g00.a.b(r4)
                if (r4 == 0) goto L1f
                java.lang.String r4 = r4.getName()
                goto L20
            L1f:
                r4 = 0
            L20:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4)
                r2.f20831a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException.<init>(int, n00.d):void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.squareup.wire.ProtoAdapter$a$a */
        /* loaded from: classes2.dex */
        public static final class C0365a extends ProtoAdapter {
            public C0365a() {
                super(b.LENGTH_DELIMITED, m0.b(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public Void decode(k reader) {
                s.g(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public Void encode(l writer, Void value) {
                s.g(writer, "writer");
                s.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            public Void c(Void value) {
                s.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public Void redact(Void value) {
                s.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) c((Void) obj)).intValue();
            }
        }

        private a() {
        }

        public final <M extends f<?, ?>> ProtoAdapter<M> a(M message) {
            s.g(message, "message");
            return b(message.getClass());
        }

        public final <M> ProtoAdapter<M> b(Class<M> type) {
            s.g(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M>");
            } catch (IllegalAccessException e11) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e11);
            } catch (NoSuchFieldException e12) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e12);
            }
        }

        public final ProtoAdapter<?> c(String adapterString) {
            int Y;
            s.g(adapterString, "adapterString");
            try {
                Y = w.Y(adapterString, '#', 0, false, 6, null);
                String substring = adapterString.substring(0, Y);
                s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = adapterString.substring(Y + 1);
                s.f(substring2, "(this as java.lang.String).substring(startIndex)");
                Object obj = Class.forName(substring).getField(substring2).get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException("failed to access " + adapterString, e11);
            } catch (IllegalAccessException e12) {
                throw new IllegalArgumentException("failed to access " + adapterString, e12);
            } catch (NoSuchFieldException e13) {
                throw new IllegalArgumentException("failed to access " + adapterString, e13);
            }
        }

        public final <E extends p> com.squareup.wire.a<E> d(Class<E> type) {
            s.g(type, "type");
            return new n(type);
        }

        public final <K, V> ProtoAdapter<Map<K, V>> e(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            s.g(keyAdapter, "keyAdapter");
            s.g(valueAdapter, "valueAdapter");
            return new e(keyAdapter, valueAdapter);
        }

        public final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> f(Class<M> type) {
            s.g(type, "type");
            return mr.j.a(type, null, o.PROTO_2);
        }

        public final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> g(Class<M> type, String typeUrl) {
            s.g(type, "type");
            s.g(typeUrl, "typeUrl");
            return mr.j.a(type, typeUrl, o.PROTO_2);
        }

        public final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> h(Class<M> type, String typeUrl, o syntax) {
            s.g(type, "type");
            s.g(typeUrl, "typeUrl");
            s.g(syntax, "syntax");
            return mr.j.a(type, typeUrl, syntax);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ProtoAdapter<Duration> c0365a;
        ProtoAdapter<Instant> c0365a2;
        ProtoAdapter<Boolean> a11 = j.a();
        BOOL = a11;
        ProtoAdapter<Integer> j11 = j.j();
        INT32 = j11;
        ProtoAdapter<Integer> u11 = j.u();
        UINT32 = u11;
        SINT32 = j.n();
        FIXED32 = j.f();
        SFIXED32 = j.l();
        ProtoAdapter<Long> k11 = j.k();
        INT64 = k11;
        ProtoAdapter<Long> v11 = j.v();
        UINT64 = v11;
        SINT64 = j.o();
        FIXED64 = j.g();
        SFIXED64 = j.m();
        ProtoAdapter<Float> h11 = j.h();
        FLOAT = h11;
        ProtoAdapter<Double> c11 = j.c();
        DOUBLE = c11;
        ProtoAdapter<okio.i> b11 = j.b();
        BYTES = b11;
        ProtoAdapter<String> p11 = j.p();
        STRING = p11;
        EMPTY = j.e();
        STRUCT_MAP = j.r();
        STRUCT_LIST = j.q();
        STRUCT_NULL = j.s();
        STRUCT_VALUE = j.t();
        DOUBLE_VALUE = j.w(c11, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = j.w(h11, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = j.w(k11, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = j.w(v11, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = j.w(j11, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = j.w(u11, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = j.w(a11, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = j.w(p11, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = j.w(b11, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            c0365a = j.d();
        } catch (NoClassDefFoundError unused) {
            c0365a = new a.C0365a();
        }
        DURATION = c0365a;
        try {
            c0365a2 = j.i();
        } catch (NoClassDefFoundError unused2) {
            c0365a2 = new a.C0365a();
        }
        INSTANT = c0365a2;
    }

    public ProtoAdapter(b fieldEncoding, n00.d<?> dVar, String str, o syntax, E e11) {
        i iVar;
        b bVar;
        s.g(fieldEncoding, "fieldEncoding");
        s.g(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = dVar;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e11;
        boolean z11 = this instanceof i;
        m mVar = null;
        if (z11 || (this instanceof m) || fieldEncoding == (bVar = b.LENGTH_DELIMITED)) {
            iVar = null;
        } else {
            if (getFieldEncoding$wire_runtime() != bVar) {
                iVar = new i(this);
            } else {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
            }
        }
        this.packedAdapter = iVar;
        if (!(this instanceof m) && !z11) {
            mVar = new m(this);
        }
        this.repeatedAdapter = mVar;
    }

    public /* synthetic */ ProtoAdapter(b bVar, n00.d dVar, String str, o oVar, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, dVar, str, oVar, (i11 & 16) != 0 ? null : obj);
    }

    public static final <M extends f<?, ?>> ProtoAdapter<M> get(M m11) {
        return Companion.a(m11);
    }

    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return Companion.b(cls);
    }

    public static final ProtoAdapter<?> get(String str) {
        return Companion.c(str);
    }

    public static final <E extends p> com.squareup.wire.a<E> newEnumAdapter(Class<E> cls) {
        return Companion.d(cls);
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return Companion.e(protoAdapter, protoAdapter2);
    }

    public static final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return Companion.f(cls);
    }

    public static final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return Companion.g(cls, str);
    }

    public static final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, o oVar) {
        return Companion.h(cls, str, oVar);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding != b.LENGTH_DELIMITED) {
            ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
            if (protoAdapter != null) {
                return protoAdapter;
            }
            throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract E decode(k kVar);

    public final E decode(InputStream stream) {
        s.g(stream, "stream");
        return decode(r.d(r.k(stream)));
    }

    public abstract void encode(l lVar, E e11);

    public final void encode(OutputStream stream, E e11) {
        s.g(stream, "stream");
        okio.g c11 = r.c(r.g(stream));
        encode(c11, (okio.g) e11);
        c11.v();
    }

    public final okio.i encodeByteString(E e11) {
        okio.f fVar = new okio.f();
        encode((okio.g) fVar, (okio.f) e11);
        return fVar.j1();
    }

    public void encodeWithTag(l writer, int i11, E e11) {
        s.g(writer, "writer");
        if (e11 == null) {
            return;
        }
        writer.f(i11, getFieldEncoding$wire_runtime());
        if (getFieldEncoding$wire_runtime() == b.LENGTH_DELIMITED) {
            writer.g(encodedSize(e11));
        }
        encode(writer, (l) e11);
    }

    public abstract int encodedSize(E e11);

    public int encodedSizeWithTag(int i11, E e11) {
        if (e11 == null) {
            return 0;
        }
        int encodedSize = encodedSize(e11);
        if (getFieldEncoding$wire_runtime() == b.LENGTH_DELIMITED) {
            encodedSize += l.f20857b.i(encodedSize);
        }
        return l.f20857b.h(i11) + encodedSize;
    }

    public final b getFieldEncoding$wire_runtime() {
        return this.fieldEncoding;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final o getSyntax() {
        return this.syntax;
    }

    public final n00.d<?> getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return s.c(this, STRUCT_MAP) || s.c(this, STRUCT_LIST) || s.c(this, STRUCT_VALUE) || s.c(this, STRUCT_NULL);
    }

    public abstract E redact(E e11);

    public String toString(E e11) {
        return String.valueOf(e11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(q.a label) {
        s.g(label, "label");
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }

    public final E decode(byte[] bytes) {
        s.g(bytes, "bytes");
        return decode(new okio.f().j0(bytes));
    }

    public final E decode(okio.i bytes) {
        s.g(bytes, "bytes");
        return decode(new okio.f().w1(bytes));
    }

    public final E decode(okio.h source) {
        s.g(source, "source");
        return decode(new k(source));
    }

    public final void encode(okio.g sink, E e11) {
        s.g(sink, "sink");
        encode(new l(sink), (l) e11);
    }

    public final byte[] encode(E e11) {
        okio.f fVar = new okio.f();
        encode((okio.g) fVar, (okio.f) e11);
        return fVar.K0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type) {
        this(fieldEncoding, g00.a.e(type));
        s.g(fieldEncoding, "fieldEncoding");
        s.g(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type, String str) {
        this(fieldEncoding, g00.a.e(type), str, o.PROTO_2);
        s.g(fieldEncoding, "fieldEncoding");
        s.g(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type, String str, o syntax) {
        this(fieldEncoding, g00.a.e(type), str, syntax);
        s.g(fieldEncoding, "fieldEncoding");
        s.g(type, "type");
        s.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, n00.d<?> dVar) {
        this(fieldEncoding, dVar, (String) null, o.PROTO_2);
        s.g(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, n00.d<?> dVar, String str) {
        this(fieldEncoding, dVar, str, o.PROTO_2);
        s.g(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, n00.d<?> dVar, String str, o syntax) {
        this(fieldEncoding, dVar, str, syntax, (Object) null);
        s.g(fieldEncoding, "fieldEncoding");
        s.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type, String str, o syntax, E e11) {
        this(fieldEncoding, g00.a.e(type), str, syntax, e11);
        s.g(fieldEncoding, "fieldEncoding");
        s.g(type, "type");
        s.g(syntax, "syntax");
    }
}