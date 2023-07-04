package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum r1 implements com.squareup.wire.p {
    NFC_PRESENCE_NOT_PRESENT(0),
    NFC_PRESENCE_PRESENT_AT_B_PILLAR(1),
    NFC_PRESENCE_PRESENT_AT_CENTER_CONSOLE(2);
    
    public static final ProtoAdapter<r1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return r1.NFC_PRESENCE_PRESENT_AT_CENTER_CONSOLE;
                }
                return r1.NFC_PRESENCE_PRESENT_AT_B_PILLAR;
            }
            return r1.NFC_PRESENCE_NOT_PRESENT;
        }
    }

    static {
        r1 r1Var;
        ADAPTER = new com.squareup.wire.a<r1>(kotlin.jvm.internal.m0.b(r1.class), com.squareup.wire.o.PROTO_3, r1Var) { // from class: bu.r1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public r1 d(int i11) {
                return r1.Companion.a(i11);
            }
        };
    }

    r1(int i11) {
        this.value = i11;
    }

    public static final r1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}