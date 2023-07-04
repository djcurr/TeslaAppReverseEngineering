package com.google.protobuf;

import com.google.protobuf.Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/protobuf/ValueKt;", "", "<init>", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ValueKt {
    public static final ValueKt INSTANCE = new ValueKt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B\u0011\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0001J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0004R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00109\u001a\u0002042\u0006\u0010\u0017\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u0010=\u001a\u00020:8G@\u0006¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/google/protobuf/ValueKt$Dsl;", "", "Lcom/google/protobuf/Value;", "_build", "Lvz/b0;", "clearNullValue", "", "hasNullValue", "clearNumberValue", "hasNumberValue", "clearStringValue", "hasStringValue", "clearBoolValue", "hasBoolValue", "clearStructValue", "hasStructValue", "clearListValue", "hasListValue", "clearKind", "Lcom/google/protobuf/Value$Builder;", "_builder", "Lcom/google/protobuf/Value$Builder;", "Lcom/google/protobuf/NullValue;", "value", "getNullValue", "()Lcom/google/protobuf/NullValue;", "setNullValue", "(Lcom/google/protobuf/NullValue;)V", "nullValue", "", "getNumberValue", "()D", "setNumberValue", "(D)V", "numberValue", "", "getStringValue", "()Ljava/lang/String;", "setStringValue", "(Ljava/lang/String;)V", "stringValue", "getBoolValue", "()Z", "setBoolValue", "(Z)V", "boolValue", "Lcom/google/protobuf/Struct;", "getStructValue", "()Lcom/google/protobuf/Struct;", "setStructValue", "(Lcom/google/protobuf/Struct;)V", "structValue", "Lcom/google/protobuf/ListValue;", "getListValue", "()Lcom/google/protobuf/ListValue;", "setListValue", "(Lcom/google/protobuf/ListValue;)V", "listValue", "Lcom/google/protobuf/Value$KindCase;", "getKindCase", "()Lcom/google/protobuf/Value$KindCase;", "kindCase", "<init>", "(Lcom/google/protobuf/Value$Builder;)V", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
    @ProtoDslMarker
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Value.Builder _builder;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\b"}, d2 = {"Lcom/google/protobuf/ValueKt$Dsl$Companion;", "", "Lcom/google/protobuf/Value$Builder;", "builder", "Lcom/google/protobuf/ValueKt$Dsl;", "_create", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Value.Builder builder) {
                s.g(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Value.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Value _build() {
            GeneratedMessageLite build = this._builder.build();
            s.f(build, "_builder.build()");
            return (Value) build;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        public final Value.KindCase getKindCase() {
            Value.KindCase kindCase = this._builder.getKindCase();
            s.f(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        public final ListValue getListValue() {
            ListValue listValue = this._builder.getListValue();
            s.f(listValue, "_builder.getListValue()");
            return listValue;
        }

        public final NullValue getNullValue() {
            NullValue nullValue = this._builder.getNullValue();
            s.f(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            s.f(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final Struct getStructValue() {
            Struct structValue = this._builder.getStructValue();
            s.f(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        public final void setBoolValue(boolean z11) {
            this._builder.setBoolValue(z11);
        }

        public final void setListValue(ListValue value) {
            s.g(value, "value");
            this._builder.setListValue(value);
        }

        public final void setNullValue(NullValue value) {
            s.g(value, "value");
            this._builder.setNullValue(value);
        }

        public final void setNumberValue(double d11) {
            this._builder.setNumberValue(d11);
        }

        public final void setStringValue(String value) {
            s.g(value, "value");
            this._builder.setStringValue(value);
        }

        public final void setStructValue(Struct value) {
            s.g(value, "value");
            this._builder.setStructValue(value);
        }
    }

    private ValueKt() {
    }
}