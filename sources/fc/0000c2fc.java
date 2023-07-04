package yt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum b implements p {
    DOMAIN_BROADCAST(0),
    DOMAIN_VEHICLE_SECURITY(2),
    DOMAIN_INFOTAINMENT(3),
    DOMAIN_AUTHD(5),
    DOMAIN_ENERGY_DEVICE(7),
    DOMAIN_ENERGY_DEVICE_AUTH(8);
    
    public static final ProtoAdapter<b> ADAPTER;
    public static final C1361b Companion = new C1361b(null);
    private final int value;

    /* renamed from: yt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1361b {
        private C1361b() {
        }

        public /* synthetic */ C1361b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i11) {
            if (i11 != 0) {
                if (i11 != 5) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 7) {
                                if (i11 != 8) {
                                    return null;
                                }
                                return b.DOMAIN_ENERGY_DEVICE_AUTH;
                            }
                            return b.DOMAIN_ENERGY_DEVICE;
                        }
                        return b.DOMAIN_INFOTAINMENT;
                    }
                    return b.DOMAIN_VEHICLE_SECURITY;
                }
                return b.DOMAIN_AUTHD;
            }
            return b.DOMAIN_BROADCAST;
        }
    }

    static {
        b bVar;
        ADAPTER = new com.squareup.wire.a<b>(m0.b(b.class), o.PROTO_3, bVar) { // from class: yt.b.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public b d(int i11) {
                return b.Companion.a(i11);
            }
        };
    }

    b(int i11) {
        this.value = i11;
    }

    public static final b fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}