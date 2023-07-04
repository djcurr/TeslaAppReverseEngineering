package com.squareup.wire;

import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d<K, V> extends ProtoAdapter<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: a  reason: collision with root package name */
    private final ProtoAdapter<K> f20833a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtoAdapter<V> f20834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(b.LENGTH_DELIMITED, m0.b(Map.Entry.class), (String) null, valueAdapter.getSyntax());
        s.g(keyAdapter, "keyAdapter");
        s.g(valueAdapter, "valueAdapter");
        this.f20833a = keyAdapter;
        this.f20834b = valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: a */
    public Map.Entry<K, V> decode(k reader) {
        s.g(reader, "reader");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: b */
    public void encode(l writer, Map.Entry<? extends K, ? extends V> value) {
        s.g(writer, "writer");
        s.g(value, "value");
        this.f20833a.encodeWithTag(writer, 1, value.getKey());
        this.f20834b.encodeWithTag(writer, 2, value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: c */
    public int encodedSize(Map.Entry<? extends K, ? extends V> value) {
        s.g(value, "value");
        return this.f20833a.encodedSizeWithTag(1, value.getKey()) + this.f20834b.encodedSizeWithTag(2, value.getValue());
    }

    public final ProtoAdapter<K> d() {
        return this.f20833a;
    }

    public final ProtoAdapter<V> e() {
        return this.f20834b;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: f */
    public Map.Entry<K, V> redact(Map.Entry<? extends K, ? extends V> value) {
        s.g(value, "value");
        throw new UnsupportedOperationException();
    }
}