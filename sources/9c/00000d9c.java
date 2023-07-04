package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum l implements com.squareup.wire.p {
    AUTHENTICATIONREJECTION_NONE(0),
    AUTHENTICATIONREJECTION_DEVICE_STATIONARY(1),
    AUTHENTICATIONREJECTION_PASSIVE_DISABLED(2),
    AUTHENTICATIONREJECTION_NO_TOKEN(3);
    
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
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return l.AUTHENTICATIONREJECTION_NO_TOKEN;
                    }
                    return l.AUTHENTICATIONREJECTION_PASSIVE_DISABLED;
                }
                return l.AUTHENTICATIONREJECTION_DEVICE_STATIONARY;
            }
            return l.AUTHENTICATIONREJECTION_NONE;
        }
    }

    static {
        l lVar;
        ADAPTER = new com.squareup.wire.a<l>(kotlin.jvm.internal.m0.b(l.class), com.squareup.wire.o.PROTO_3, lVar) { // from class: bu.l.a
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