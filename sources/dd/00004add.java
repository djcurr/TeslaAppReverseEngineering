package com.squareup.wire;

import java.util.List;
import kotlin.jvm.internal.s;
import wz.v;
import wz.w;

/* loaded from: classes2.dex */
public final class i<E> extends ProtoAdapter<List<? extends E>> {

    /* renamed from: a  reason: collision with root package name */
    private final ProtoAdapter<E> f20846a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(com.squareup.wire.ProtoAdapter<E> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "originalAdapter"
            kotlin.jvm.internal.s.g(r8, r0)
            com.squareup.wire.b r2 = com.squareup.wire.b.LENGTH_DELIMITED
            java.lang.Class<java.util.List> r0 = java.util.List.class
            n00.d r3 = kotlin.jvm.internal.m0.b(r0)
            com.squareup.wire.o r5 = r8.getSyntax()
            java.util.List r6 = wz.u.i()
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f20846a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.i.<init>(com.squareup.wire.ProtoAdapter):void");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: a */
    public List<E> decode(k reader) {
        List<E> d11;
        s.g(reader, "reader");
        d11 = v.d(this.f20846a.decode(reader));
        return d11;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: b */
    public void encode(l writer, List<? extends E> value) {
        s.g(writer, "writer");
        s.g(value, "value");
        int size = value.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f20846a.encode(writer, (l) value.get(i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: c */
    public void encodeWithTag(l writer, int i11, List<? extends E> list) {
        s.g(writer, "writer");
        if (list == 0 || !(!list.isEmpty())) {
            return;
        }
        super.encodeWithTag(writer, i11, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: d */
    public int encodedSize(List<? extends E> value) {
        s.g(value, "value");
        int size = value.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += this.f20846a.encodedSize(value.get(i12));
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: e */
    public int encodedSizeWithTag(int i11, List<? extends E> list) {
        if (list == 0 || list.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(i11, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: f */
    public List<E> redact(List<? extends E> value) {
        List<E> i11;
        s.g(value, "value");
        i11 = w.i();
        return i11;
    }
}