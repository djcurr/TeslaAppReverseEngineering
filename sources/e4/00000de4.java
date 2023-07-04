package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum p3 implements com.squareup.wire.p {
    UPDATER_LOCATION_NONE(0),
    UPDATER_LOCATION_APPLICATION(1),
    UPDATER_LOCATION_BOOTLOADER(2),
    UPDATER_LOCATION_SECONDARY_APPLICATION(3),
    UPDATER_LOCATION_APPLICATION_IN_EXTERNAL_FLASH(4);
    
    public static final ProtoAdapter<p3> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p3 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return p3.UPDATER_LOCATION_APPLICATION_IN_EXTERNAL_FLASH;
                        }
                        return p3.UPDATER_LOCATION_SECONDARY_APPLICATION;
                    }
                    return p3.UPDATER_LOCATION_BOOTLOADER;
                }
                return p3.UPDATER_LOCATION_APPLICATION;
            }
            return p3.UPDATER_LOCATION_NONE;
        }
    }

    static {
        p3 p3Var;
        ADAPTER = new com.squareup.wire.a<p3>(kotlin.jvm.internal.m0.b(p3.class), com.squareup.wire.o.PROTO_3, p3Var) { // from class: bu.p3.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public p3 d(int i11) {
                return p3.Companion.a(i11);
            }
        };
    }

    p3(int i11) {
        this.value = i11;
    }

    public static final p3 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}