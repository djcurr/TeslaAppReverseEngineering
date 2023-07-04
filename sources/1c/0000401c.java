package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.internal.g4;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class DebugImage implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_TYPE = "proguard";
    private final String type;
    private final String uuid;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugImage(String uuid) {
        this(uuid, null, 2, null);
        s.g(uuid, "uuid");
    }

    public DebugImage(String uuid, String type) {
        s.g(uuid, "uuid");
        s.g(type, "type");
        this.uuid = uuid;
        this.type = type;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public String toString() {
        StringBuilder a11 = g4.a("DebugImage{uuid='");
        a11.append(this.uuid);
        a11.append("', type='");
        a11.append(this.type);
        a11.append("'}");
        return a11.toString();
    }

    public /* synthetic */ DebugImage(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "proguard" : str2);
    }
}