package com.google.protobuf.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableSet;", "E", "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "", "delegate", "<init>", "(Ljava/util/Collection;)V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(Collection<? extends E> delegate) {
        super(delegate);
        s.g(delegate, "delegate");
    }
}