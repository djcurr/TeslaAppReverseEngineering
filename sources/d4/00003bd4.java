package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/protobuf/EnumValueKt;", "", "<init>", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class EnumValueKt {
    public static final EnumValueKt INSTANCE = new EnumValueKt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 12\u00020\u0001:\u000212B\u0011\b\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0001J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J'\u0010\r\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\bH\u0087\n¢\u0006\u0004\b\u000e\u0010\fJ-\u0010\u0014\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u000f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0013J0\u0010\u001a\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\bH\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020!2\u0006\u0010\n\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001f\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/google/protobuf/EnumValueKt$Dsl;", "", "Lcom/google/protobuf/EnumValue;", "_build", "Lvz/b0;", "clearName", "clearNumber", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/EnumValueKt$Dsl$OptionsProxy;", "value", "addOptions", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Option;)V", "add", "plusAssignOptions", "plusAssign", "", "values", "addAllOptions", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllOptions", "", "index", "setOptions", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Option;)V", "set", "clearOptions", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/EnumValue$Builder;", "_builder", "Lcom/google/protobuf/EnumValue$Builder;", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getNumber", "()I", "setNumber", "(I)V", "number", "getOptions", "()Lcom/google/protobuf/kotlin/DslList;", "options", "<init>", "(Lcom/google/protobuf/EnumValue$Builder;)V", "Companion", "OptionsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
    @ProtoDslMarker
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EnumValue.Builder _builder;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\b"}, d2 = {"Lcom/google/protobuf/EnumValueKt$Dsl$Companion;", "", "Lcom/google/protobuf/EnumValue$Builder;", "builder", "Lcom/google/protobuf/EnumValueKt$Dsl;", "_create", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(EnumValue.Builder builder) {
                s.g(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/EnumValueKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(EnumValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(EnumValue.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ EnumValue _build() {
            GeneratedMessageLite build = this._builder.build();
            s.f(build, "_builder.build()");
            return (EnumValue) build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            s.g(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final String getName() {
            String name = this._builder.getName();
            s.f(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            s.f(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            addOptions(dslList, value);
        }

        public final void setName(String value) {
            s.g(value, "value");
            this._builder.setName(value);
        }

        public final void setNumber(int i11) {
            this._builder.setNumber(i11);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i11, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.setOptions(i11, value);
        }
    }

    private EnumValueKt() {
    }
}