package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueKt;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u001a$\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/StringValueKt$Dsl;", "Lvz/b0;", "block", "Lcom/google/protobuf/StringValue;", "stringValue", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StringValueKtKt {
    public static final StringValue copy(StringValue stringValue, l<? super StringValueKt.Dsl, b0> block) {
        s.g(stringValue, "<this>");
        s.g(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = stringValue.toBuilder();
        s.f(builder, "this.toBuilder()");
        StringValueKt.Dsl _create = companion._create((StringValue.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final /* synthetic */ StringValue stringValue(l block) {
        s.g(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder newBuilder = StringValue.newBuilder();
        s.f(newBuilder, "newBuilder()");
        StringValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }
}