package xt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum i implements p {
    SESSION_INFO_STATUS_OK(0),
    SESSION_INFO_STATUS_KEY_NOT_ON_WHITELIST(1);
    
    public static final ProtoAdapter<i> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return null;
                }
                return i.SESSION_INFO_STATUS_KEY_NOT_ON_WHITELIST;
            }
            return i.SESSION_INFO_STATUS_OK;
        }
    }

    static {
        i iVar;
        ADAPTER = new com.squareup.wire.a<i>(m0.b(i.class), o.PROTO_3, iVar) { // from class: xt.i.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public i d(int i11) {
                return i.Companion.a(i11);
            }
        };
    }

    i(int i11) {
        this.value = i11;
    }

    public static final i fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}