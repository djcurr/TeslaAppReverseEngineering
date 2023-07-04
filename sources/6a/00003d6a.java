package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueKt;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u001a$\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/UInt32ValueKt$Dsl;", "Lvz/b0;", "block", "Lcom/google/protobuf/UInt32Value;", "uInt32Value", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UInt32ValueKtKt {
    public static final UInt32Value copy(UInt32Value uInt32Value, l<? super UInt32ValueKt.Dsl, b0> block) {
        s.g(uInt32Value, "<this>");
        s.g(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = uInt32Value.toBuilder();
        s.f(builder, "this.toBuilder()");
        UInt32ValueKt.Dsl _create = companion._create((UInt32Value.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final /* synthetic */ UInt32Value uInt32Value(l block) {
        s.g(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder newBuilder = UInt32Value.newBuilder();
        s.f(newBuilder, "newBuilder()");
        UInt32ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }
}