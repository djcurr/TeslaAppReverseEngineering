package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/protobuf/ApiKt;", "", "<init>", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ApiKt {
    public static final ApiKt INSTANCE = new ApiKt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 W2\u00020\u0001:\u0004WXYZB\u0011\b\u0002\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\bU\u0010VJ\b\u0010\u0003\u001a\u00020\u0002H\u0001J\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\r\u0010\u000bJ-\u0010\u0013\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0087\n¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0019\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\t\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J(\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\t\u001a\u00020\u001dH\u0087\n¢\u0006\u0004\b!\u0010 J-\u0010\u0013\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0007¢\u0006\u0004\b\"\u0010\u0012J.\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fH\u0087\n¢\u0006\u0004\b#\u0010\u0012J0\u0010\u0019\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u001dH\u0087\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010\u001c\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0006H\u0007¢\u0006\u0004\b&\u0010\u001bJ\u0006\u0010'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u0004J\u0006\u0010*\u001a\u00020)J'\u0010\f\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00062\u0006\u0010\t\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.J(\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00062\u0006\u0010\t\u001a\u00020+H\u0087\n¢\u0006\u0004\b/\u0010.J-\u0010\u0013\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020+0\u000fH\u0007¢\u0006\u0004\b0\u0010\u0012J.\u0010\u000e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020+0\u000fH\u0087\n¢\u0006\u0004\b1\u0010\u0012J0\u0010\u0019\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020+H\u0087\u0002¢\u0006\u0004\b2\u00103J\u001f\u0010\u001c\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u0006H\u0007¢\u0006\u0004\b4\u0010\u001bJ\u0006\u00105\u001a\u00020\u0004R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010>\u001a\u0002092\u0006\u0010\t\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001f\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001f\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010@R$\u0010F\u001a\u0002092\u0006\u0010\t\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010;\"\u0004\bE\u0010=R$\u0010L\u001a\u00020G2\u0006\u0010\t\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001f\u0010N\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bM\u0010@R$\u0010T\u001a\u00020O2\u0006\u0010\t\u001a\u00020O8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006["}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl;", "", "Lcom/google/protobuf/Api;", "_build", "Lvz/b0;", "clearName", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Method;", "Lcom/google/protobuf/ApiKt$Dsl$MethodsProxy;", "value", "addMethods", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Method;)V", "add", "plusAssignMethods", "plusAssign", "", "values", "addAllMethods", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllMethods", "", "index", "setMethods", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Method;)V", "set", "clearMethods", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/ApiKt$Dsl$OptionsProxy;", "addOptions", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Option;)V", "plusAssignOptions", "addAllOptions", "plusAssignAllOptions", "setOptions", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Option;)V", "clearOptions", "clearVersion", "clearSourceContext", "", "hasSourceContext", "Lcom/google/protobuf/Mixin;", "Lcom/google/protobuf/ApiKt$Dsl$MixinsProxy;", "addMixins", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Mixin;)V", "plusAssignMixins", "addAllMixins", "plusAssignAllMixins", "setMixins", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Mixin;)V", "clearMixins", "clearSyntax", "Lcom/google/protobuf/Api$Builder;", "_builder", "Lcom/google/protobuf/Api$Builder;", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getMethods", "()Lcom/google/protobuf/kotlin/DslList;", "methods", "getOptions", "options", "getVersion", "setVersion", "version", "Lcom/google/protobuf/SourceContext;", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "sourceContext", "getMixins", "mixins", "Lcom/google/protobuf/Syntax;", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "syntax", "<init>", "(Lcom/google/protobuf/Api$Builder;)V", "Companion", "MethodsProxy", "MixinsProxy", "OptionsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
    @ProtoDslMarker
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Api.Builder _builder;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\b"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$Companion;", "", "Lcom/google/protobuf/Api$Builder;", "builder", "Lcom/google/protobuf/ApiKt$Dsl;", "_create", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Api.Builder builder) {
                s.g(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$MethodsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class MethodsProxy extends DslProxy {
            private MethodsProxy() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$MixinsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class MixinsProxy extends DslProxy {
            private MixinsProxy() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Api.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Api.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Api _build() {
            GeneratedMessageLite build = this._builder.build();
            s.f(build, "_builder.build()");
            return (Api) build;
        }

        public final /* synthetic */ void addAllMethods(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            this._builder.addAllMethods(values);
        }

        public final /* synthetic */ void addAllMixins(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            this._builder.addAllMixins(values);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addMethods(DslList dslList, Method value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.addMethods(value);
        }

        public final /* synthetic */ void addMixins(DslList dslList, Mixin value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.addMixins(value);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.addOptions(value);
        }

        public final /* synthetic */ void clearMethods(DslList dslList) {
            s.g(dslList, "<this>");
            this._builder.clearMethods();
        }

        public final /* synthetic */ void clearMixins(DslList dslList) {
            s.g(dslList, "<this>");
            this._builder.clearMixins();
        }

        public final void clearName() {
            this._builder.clearName();
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

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final /* synthetic */ DslList getMethods() {
            List<Method> methodsList = this._builder.getMethodsList();
            s.f(methodsList, "_builder.getMethodsList()");
            return new DslList(methodsList);
        }

        public final /* synthetic */ DslList getMixins() {
            List<Mixin> mixinsList = this._builder.getMixinsList();
            s.f(mixinsList, "_builder.getMixinsList()");
            return new DslList(mixinsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            s.f(name, "_builder.getName()");
            return name;
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

        public final String getVersion() {
            String version = this._builder.getVersion();
            s.f(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllMethods(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            addAllMethods(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllMixins(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            addAllMixins(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable values) {
            s.g(dslList, "<this>");
            s.g(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignMethods(DslList dslList, Method value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            addMethods(dslList, value);
        }

        public final /* synthetic */ void plusAssignMixins(DslList dslList, Mixin value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            addMixins(dslList, value);
        }

        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void setMethods(DslList dslList, int i11, Method value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.setMethods(i11, value);
        }

        public final /* synthetic */ void setMixins(DslList dslList, int i11, Mixin value) {
            s.g(dslList, "<this>");
            s.g(value, "value");
            this._builder.setMixins(i11, value);
        }

        public final void setName(String value) {
            s.g(value, "value");
            this._builder.setName(value);
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

        public final void setVersion(String value) {
            s.g(value, "value");
            this._builder.setVersion(value);
        }
    }

    private ApiKt() {
    }
}