package com.squareup.wire;

import java.net.ProtocolException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public enum b {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);
    
    public static final a Companion = new a(null);
    private final int value;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public final b a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 5) {
                            return b.FIXED32;
                        }
                        throw new ProtocolException("Unexpected FieldEncoding: " + i11);
                    }
                    return b.LENGTH_DELIMITED;
                }
                return b.FIXED64;
            }
            return b.VARINT;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    b(int i11) {
        this.value = i11;
    }

    public final int getValue$wire_runtime() {
        return this.value;
    }

    public final ProtoAdapter<?> rawProtoAdapter() {
        int i11 = c.f20832a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return ProtoAdapter.BYTES;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ProtoAdapter.FIXED64;
            }
            return ProtoAdapter.FIXED32;
        }
        return ProtoAdapter.UINT64;
    }
}