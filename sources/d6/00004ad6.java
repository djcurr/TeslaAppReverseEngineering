package com.squareup.wire;

import com.squareup.wire.f;
import com.squareup.wire.f.a;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class f<M extends f<M, B>, B extends a<M, B>> implements Serializable {
    public static final b Companion = new b(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient okio.i unknownFields;

    /* loaded from: classes2.dex */
    public static abstract class a<M extends f<M, B>, B extends a<M, B>> {

        /* renamed from: a  reason: collision with root package name */
        private transient okio.i f20836a = okio.i.f42656d;

        /* renamed from: b  reason: collision with root package name */
        private transient okio.f f20837b;

        /* renamed from: c  reason: collision with root package name */
        private transient l f20838c;

        protected a() {
        }

        private final void d() {
            if (this.f20837b == null) {
                this.f20837b = new okio.f();
                okio.f fVar = this.f20837b;
                s.e(fVar);
                l lVar = new l(fVar);
                this.f20838c = lVar;
                s.e(lVar);
                lVar.a(this.f20836a);
                this.f20836a = okio.i.f42656d;
            }
        }

        public final a<M, B> a(int i11, com.squareup.wire.b fieldEncoding, Object obj) {
            s.g(fieldEncoding, "fieldEncoding");
            d();
            ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
            Objects.requireNonNull(rawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            l lVar = this.f20838c;
            s.e(lVar);
            rawProtoAdapter.encodeWithTag(lVar, i11, obj);
            return this;
        }

        public abstract M b();

        public final a<M, B> c() {
            this.f20836a = okio.i.f42656d;
            okio.f fVar = this.f20837b;
            if (fVar != null) {
                s.e(fVar);
                fVar.a();
                this.f20837b = null;
            }
            this.f20838c = null;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f(ProtoAdapter<M> adapter, okio.i unknownFields) {
        s.g(adapter, "adapter");
        s.g(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(okio.g sink) {
        s.g(sink, "sink");
        this.adapter.encode(sink, (okio.g) this);
    }

    public final okio.i encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    public final int getCachedSerializedSize$wire_runtime() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i11) {
        this.cachedSerializedSize = i11;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final okio.i unknownFields() {
        okio.i iVar = this.unknownFields;
        return iVar == null ? okio.i.f42656d : iVar;
    }

    public final M withoutUnknownFields() {
        return newBuilder().c().b();
    }

    protected final Object writeReplace() {
        return new g(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream stream) {
        s.g(stream, "stream");
        this.adapter.encode(stream, (OutputStream) this);
    }
}