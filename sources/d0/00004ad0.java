package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.p;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class a<E extends p> extends ProtoAdapter<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n00.d<E> type, o syntax, E e11) {
        super(b.VARINT, (n00.d<?>) type, (String) null, syntax, e11);
        s.g(type, "type");
        s.g(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: a */
    public E decode(k reader) {
        s.g(reader, "reader");
        int n11 = reader.n();
        E d11 = d(n11);
        if (d11 != null) {
            return d11;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(n11, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: b */
    public void encode(l writer, E value) {
        s.g(writer, "writer");
        s.g(value, "value");
        writer.g(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: c */
    public int encodedSize(E value) {
        s.g(value, "value");
        return l.f20857b.i(value.getValue());
    }

    protected abstract E d(int i11);

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: e */
    public E redact(E value) {
        s.g(value, "value");
        throw new UnsupportedOperationException();
    }
}