package xt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum l implements p {
    TAG_SIGNATURE_TYPE(0),
    TAG_DOMAIN(1),
    TAG_PERSONALIZATION(2),
    TAG_EPOCH(3),
    TAG_EXPIRES_AT(4),
    TAG_COUNTER(5),
    TAG_CHALLENGE(6),
    TAG_FLAGS(7),
    TAG_END(255);
    
    public static final ProtoAdapter<l> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(int i11) {
            if (i11 != 255) {
                switch (i11) {
                    case 0:
                        return l.TAG_SIGNATURE_TYPE;
                    case 1:
                        return l.TAG_DOMAIN;
                    case 2:
                        return l.TAG_PERSONALIZATION;
                    case 3:
                        return l.TAG_EPOCH;
                    case 4:
                        return l.TAG_EXPIRES_AT;
                    case 5:
                        return l.TAG_COUNTER;
                    case 6:
                        return l.TAG_CHALLENGE;
                    case 7:
                        return l.TAG_FLAGS;
                    default:
                        return null;
                }
            }
            return l.TAG_END;
        }
    }

    static {
        l lVar;
        ADAPTER = new com.squareup.wire.a<l>(m0.b(l.class), o.PROTO_3, lVar) { // from class: xt.l.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public l d(int i11) {
                return l.Companion.a(i11);
            }
        };
    }

    l(int i11) {
        this.value = i11;
    }

    public static final l fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}