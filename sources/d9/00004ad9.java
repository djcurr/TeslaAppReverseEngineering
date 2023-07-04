package com.squareup.wire;

import com.squareup.wire.f;
import com.squareup.wire.f.a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class g<M extends f<M, B>, B extends f.a<M, B>> implements Serializable {

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public g(byte[] bytes, Class<M> messageClass) {
        s.g(bytes, "bytes");
        s.g(messageClass, "messageClass");
    }
}