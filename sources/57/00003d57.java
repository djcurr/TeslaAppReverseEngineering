package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/protobuf/TypeKt;", "", "<init>", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TypeKt {
    public static final TypeKt INSTANCE = new TypeKt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 R2\u00020\u0001:\u0004RSTUB\u0011\b\u0002\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0001J\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\r\u0010\u000bJ-\u0010\u0013\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0087\n¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0019\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\t\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J(\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\t\u001a\u00020\u001dH\u0087\n¢\u0006\u0004\b!\u0010 J-\u0010\u0013\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0007¢\u0006\u0004\b\"\u0010\u0012J.\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0087\n¢\u0006\u0004\b#\u0010\u0012J0\u0010\u0019\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u001dH\u0087\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010\u001c\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0006H\u0007¢\u0006\u0004\b&\u0010\u001bJ'\u0010\f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u00062\u0006\u0010\t\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J(\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u00062\u0006\u0010\t\u001a\u00020'H\u0087\n¢\u0006\u0004\b+\u0010*J-\u0010\u0013\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020'0\u000fH\u0007¢\u0006\u0004\b,\u0010\u0012J.\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020'0\u000fH\u0087\n¢\u0006\u0004\b-\u0010\u0012J0\u0010\u0019\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020'H\u0087\u0002¢\u0006\u0004\b.\u0010/J\u001f\u0010\u001c\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u0006H\u0007¢\u0006\u0004\b0\u0010\u001bJ\u0006\u00101\u001a\u00020\u0004J\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u00020\u0004R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010<\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001f\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001f\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b@\u0010>R\u001f\u0010C\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010>R$\u0010I\u001a\u00020D2\u0006\u0010\t\u001a\u00020D8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010O\u001a\u00020J2\u0006\u0010\t\u001a\u00020J8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006V"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl;", "", "Lcom/google/protobuf/Type;", "_build", "Lvz/b0;", "clearName", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Field;", "Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", "value", "addFields", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Field;)V", "add", "plusAssignFields", "plusAssign", "", "values", "addAllFields", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllFields", "", "index", "setFields", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Field;)V", "set", "clearFields", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "", "Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "addOneofs", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "plusAssignOneofs", "addAllOneofs", "plusAssignAllOneofs", "setOneofs", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "clearOneofs", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "addOptions", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Option;)V", "plusAssignOptions", "addAllOptions", "plusAssignAllOptions", "setOptions", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Option;)V", "clearOptions", "clearSourceContext", "", "hasSourceContext", "clearSyntax", "Lcom/google/protobuf/Type$Builder;", "_builder", "Lcom/google/protobuf/Type$Builder;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getFields", "()Lcom/google/protobuf/kotlin/DslList;", "fields", "getOneofs", "oneofs", "getOptions", "options", "Lcom/google/protobuf/SourceContext;", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "sourceContext", "Lcom/google/protobuf/Syntax;", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "syntax", "<init>", "(Lcom/google/protobuf/Type$Builder;)V", "Companion", "FieldsProxy", "OneofsProxy", "OptionsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
    @ProtoDslMarker
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Type.Builder _builder;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\b"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$Companion;", "", "Lcom/google/protobuf/Type$Builder;", "builder", "Lcom/google/protobuf/TypeKt$Dsl;", "_create", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                s.g(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Type.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Type _build() {
            GeneratedMessageLite build = this._builder.build();
            s.f(build, "_builder.build()");
            return (Type) build;
        }

        public final /* synthetic */ void addAllFields(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            this._builder.addAllFields(values);
        }

        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            this._builder.addAllOneofs(values);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addFields(DslList dslList, Field value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.addFields(value);
        }

        public final /* synthetic */ void addOneofs(DslList dslList, String value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.addOneofs(value);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.addOptions(value);
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            s.g(dslList, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOneofs(DslList dslList) {
            s.g(dslList, "<this>");
            this._builder.clearOneofs();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            s.g(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final /* synthetic */ DslList getFields() {
            List<Field> fieldsList = this._builder.getFieldsList();
            s.f(fieldsList, "_builder.getFieldsList()");
            return new DslList(fieldsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            s.f(name, "_builder.getName()");
            return name;
        }

        public final DslList<String, OneofsProxy> getOneofs() {
            List oneofsList = this._builder.getOneofsList();
            s.f(oneofsList, "_builder.getOneofsList()");
            return new DslList<>(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            s.f(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            s.f(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            s.f(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllFields(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            addAllFields(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOneofs(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            addAllOneofs(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignFields(DslList dslList, Field value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            addFields(dslList, value);
        }

        public final /* synthetic */ void plusAssignOneofs(DslList dslList, String value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            addOneofs(dslList, value);
        }

        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i11, Field value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.setFields(i11, value);
        }

        public final void setName(String value) {
            s.g(value, "value");
            this._builder.setName(value);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i11, String value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.setOneofs(i11, value);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i11, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.setOptions(i11, value);
        }

        public final void setSourceContext(SourceContext value) {
            s.g(value, "value");
            this._builder.setSourceContext(value);
        }

        public final void setSyntax(Syntax value) {
            s.g(value, "value");
            this._builder.setSyntax(value);
        }
    }

    private TypeKt() {
    }
}