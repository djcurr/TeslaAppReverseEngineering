package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/protobuf/SourceContextKt;", "", "<init>", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SourceContextKt {
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0001J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/google/protobuf/SourceContextKt$Dsl;", "", "Lcom/google/protobuf/SourceContext;", "_build", "Lvz/b0;", "clearFileName", "Lcom/google/protobuf/SourceContext$Builder;", "_builder", "Lcom/google/protobuf/SourceContext$Builder;", "", "value", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "fileName", "<init>", "(Lcom/google/protobuf/SourceContext$Builder;)V", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
    @ProtoDslMarker
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SourceContext.Builder _builder;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\b"}, d2 = {"Lcom/google/protobuf/SourceContextKt$Dsl$Companion;", "", "Lcom/google/protobuf/SourceContext$Builder;", "builder", "Lcom/google/protobuf/SourceContextKt$Dsl;", "_create", "<init>", "()V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                s.g(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            GeneratedMessageLite build = this._builder.build();
            s.f(build, "_builder.build()");
            return (SourceContext) build;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        public final String getFileName() {
            String fileName = this._builder.getFileName();
            s.f(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(String value) {
            s.g(value, "value");
            this._builder.setFileName(value);
        }
    }

    private SourceContextKt() {
    }
}