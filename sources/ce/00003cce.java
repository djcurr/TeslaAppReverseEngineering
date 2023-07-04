package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/protobuf/MixinKt;", "", "<init>", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0001J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/google/protobuf/MixinKt$Dsl;", "", "Lcom/google/protobuf/Mixin;", "_build", "Lvz/b0;", "clearName", "clearRoot", "Lcom/google/protobuf/Mixin$Builder;", "_builder", "Lcom/google/protobuf/Mixin$Builder;", "", "value", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getRoot", "setRoot", "root", "<init>", "(Lcom/google/protobuf/Mixin$Builder;)V", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
    @ProtoDslMarker
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\b"}, d2 = {"Lcom/google/protobuf/MixinKt$Dsl$Companion;", "", "Lcom/google/protobuf/Mixin$Builder;", "builder", "Lcom/google/protobuf/MixinKt$Dsl;", "_create", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                s.g(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            GeneratedMessageLite build = this._builder.build();
            s.f(build, "_builder.build()");
            return (Mixin) build;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            String name = this._builder.getName();
            s.f(name, "_builder.getName()");
            return name;
        }

        public final String getRoot() {
            String root = this._builder.getRoot();
            s.f(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(String value) {
            s.g(value, "value");
            this._builder.setName(value);
        }

        public final void setRoot(String value) {
            s.g(value, "value");
            this._builder.setRoot(value);
        }
    }

    private MixinKt() {
    }
}