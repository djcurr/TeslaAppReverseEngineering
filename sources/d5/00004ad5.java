package com.squareup.wire;

import java.util.Map;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes2.dex */
public final class e<K, V> extends ProtoAdapter<Map<K, ? extends V>> {

    /* renamed from: a  reason: collision with root package name */
    private final d<K, V> f20835a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(com.squareup.wire.ProtoAdapter<K> r8, com.squareup.wire.ProtoAdapter<V> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "keyAdapter"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "valueAdapter"
            kotlin.jvm.internal.s.g(r9, r0)
            com.squareup.wire.b r2 = com.squareup.wire.b.LENGTH_DELIMITED
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            n00.d r3 = kotlin.jvm.internal.m0.b(r0)
            com.squareup.wire.o r5 = r9.getSyntax()
            java.util.Map r6 = wz.p0.i()
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.squareup.wire.d r0 = new com.squareup.wire.d
            r0.<init>(r8, r9)
            r7.f20835a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.e.<init>(com.squareup.wire.ProtoAdapter, com.squareup.wire.ProtoAdapter):void");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: a */
    public Map<K, V> decode(k reader) {
        Map<K, V> f11;
        s.g(reader, "reader");
        long d11 = reader.d();
        K k11 = null;
        V v11 = null;
        while (true) {
            int g11 = reader.g();
            if (g11 == -1) {
                break;
            } else if (g11 == 1) {
                k11 = this.f20835a.d().decode(reader);
            } else if (g11 == 2) {
                v11 = this.f20835a.e().decode(reader);
            }
        }
        reader.e(d11);
        if (k11 != null) {
            if (v11 != null) {
                f11 = r0.f(v.a(k11, v11));
                return f11;
            }
            throw new IllegalStateException("Map entry with null value".toString());
        }
        throw new IllegalStateException("Map entry with null key".toString());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: b */
    public void encode(l writer, Map<K, ? extends V> value) {
        s.g(writer, "writer");
        s.g(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: c */
    public void encodeWithTag(l writer, int i11, Map<K, ? extends V> map) {
        s.g(writer, "writer");
        if (map == null) {
            return;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            this.f20835a.encodeWithTag(writer, i11, entry);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: d */
    public int encodedSize(Map<K, ? extends V> value) {
        s.g(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: e */
    public int encodedSizeWithTag(int i11, Map<K, ? extends V> map) {
        int i12 = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            i12 += this.f20835a.encodedSizeWithTag(i11, entry);
        }
        return i12;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: f */
    public Map<K, V> redact(Map<K, ? extends V> value) {
        Map<K, V> i11;
        s.g(value, "value");
        i11 = s0.i();
        return i11;
    }
}