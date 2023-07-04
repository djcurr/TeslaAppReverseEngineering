package com.google.protobuf;

import ch.qos.logback.core.joran.action.Action;
import com.google.protobuf.Struct;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/protobuf/StructKt;", "", "<init>", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StructKt {
    public static final StructKt INSTANCE = new StructKt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0011\b\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0001J5\u0010\r\u001a\u00020\n*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000f\u001a\u00020\n*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u000e\u0010\fJ-\u0010\u0012\u001a\u00020\n*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0017\u001a\u00020\n*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u00020\n*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR%\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048G@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/google/protobuf/StructKt$Dsl;", "", "Lcom/google/protobuf/Struct;", "_build", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lcom/google/protobuf/Value;", "Lcom/google/protobuf/StructKt$Dsl$FieldsProxy;", Action.KEY_ATTRIBUTE, "value", "Lvz/b0;", "putFields", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Lcom/google/protobuf/Value;)V", "put", "setFields", "set", "removeFields", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllFields", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearFields", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "Lcom/google/protobuf/Struct$Builder;", "_builder", "Lcom/google/protobuf/Struct$Builder;", "getFieldsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "fields", "<init>", "(Lcom/google/protobuf/Struct$Builder;)V", "Companion", "FieldsProxy", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
    @ProtoDslMarker
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Struct.Builder _builder;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\b"}, d2 = {"Lcom/google/protobuf/StructKt$Dsl$Companion;", "", "Lcom/google/protobuf/Struct$Builder;", "builder", "Lcom/google/protobuf/StructKt$Dsl;", "_create", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Struct.Builder builder) {
                s.g(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/StructKt$Dsl$FieldsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        private Dsl(Struct.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Struct.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Struct _build() {
            GeneratedMessageLite build = this._builder.build();
            s.f(build, "_builder.build()");
            return (Struct) build;
        }

        public final /* synthetic */ void clearFields(DslMap dslMap) {
            s.g(dslMap, "<this>");
            this._builder.clearFields();
        }

        public final /* synthetic */ DslMap getFieldsMap() {
            Map<String, Value> fieldsMap = this._builder.getFieldsMap();
            s.f(fieldsMap, "_builder.getFieldsMap()");
            return new DslMap(fieldsMap);
        }

        public final /* synthetic */ void putAllFields(DslMap dslMap, Map map) {
            s.g(dslMap, "<this>");
            s.g(map, "map");
            this._builder.putAllFields(map);
        }

        public final void putFields(DslMap<String, Value, FieldsProxy> dslMap, String key, Value value) {
            s.g(dslMap, "<this>");
            s.g(key, "key");
            s.g(value, "value");
            this._builder.putFields(key, value);
        }

        public final /* synthetic */ void removeFields(DslMap dslMap, String key) {
            s.g(dslMap, "<this>");
            s.g(key, "key");
            this._builder.removeFields(key);
        }

        public final /* synthetic */ void setFields(DslMap dslMap, String key, Value value) {
            s.g(dslMap, "<this>");
            s.g(key, "key");
            s.g(value, "value");
            putFields(dslMap, key, value);
        }
    }

    private StructKt() {
    }
}