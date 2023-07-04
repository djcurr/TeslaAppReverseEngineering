package com.squareup.wire;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public enum o {
    PROTO_2("proto2"),
    PROTO_3("proto3");
    
    public static final a Companion = new a(null);
    private final String string;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    o(String str) {
        this.string = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.string;
    }
}