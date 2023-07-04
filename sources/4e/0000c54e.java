package zt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum k implements p {
    VEHICLE_CERT(0),
    MOBILE_ID(1),
    MOBILE_BACKUP_PUBKEY(2);
    
    public static final ProtoAdapter<k> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return k.MOBILE_BACKUP_PUBKEY;
                }
                return k.MOBILE_ID;
            }
            return k.VEHICLE_CERT;
        }
    }

    static {
        k kVar;
        ADAPTER = new com.squareup.wire.a<k>(m0.b(k.class), o.PROTO_3, kVar) { // from class: zt.k.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public k d(int i11) {
                return k.Companion.a(i11);
            }
        };
    }

    k(int i11) {
        this.value = i11;
    }

    public static final k fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}