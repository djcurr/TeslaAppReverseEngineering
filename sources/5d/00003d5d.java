package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u001a$\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/TypeKt$Dsl;", "Lvz/b0;", "block", "Lcom/google/protobuf/Type;", "type", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TypeKtKt {
    public static final Type copy(Type type, l<? super TypeKt.Dsl, b0> block) {
        s.g(type, "<this>");
        s.g(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = type.toBuilder();
        s.f(builder, "this.toBuilder()");
        TypeKt.Dsl _create = companion._create((Type.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final /* synthetic */ Type type(l block) {
        s.g(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder newBuilder = Type.newBuilder();
        s.f(newBuilder, "newBuilder()");
        TypeKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }
}