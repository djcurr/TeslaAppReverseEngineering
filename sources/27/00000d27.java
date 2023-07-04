package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum d1 implements com.squareup.wire.p {
    KEY_FORM_FACTOR_UNKNOWN(0),
    KEY_FORM_FACTOR_NFC_CARD(1),
    KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB(2),
    KEY_FORM_FACTOR_BLE_DEVICE(3),
    KEY_FORM_FACTOR_NFC_DEVICE(4),
    KEY_FORM_FACTOR_BLE_AND_NFC_DEVICE(5),
    KEY_FORM_FACTOR_IOS_DEVICE(6),
    KEY_FORM_FACTOR_ANDROID_DEVICE(7),
    KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB_P60(8),
    KEY_FORM_FACTOR_CLOUD_KEY(9),
    KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60(10),
    KEY_FORM_FACTOR_5_BUTTON_GEN2_CAR_KEYFOB_P60(11),
    KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V2(12),
    KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V3(13),
    KEY_FORM_FACTOR_NFC_CARD_P71(14);
    
    public static final ProtoAdapter<d1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d1 a(int i11) {
            switch (i11) {
                case 0:
                    return d1.KEY_FORM_FACTOR_UNKNOWN;
                case 1:
                    return d1.KEY_FORM_FACTOR_NFC_CARD;
                case 2:
                    return d1.KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB;
                case 3:
                    return d1.KEY_FORM_FACTOR_BLE_DEVICE;
                case 4:
                    return d1.KEY_FORM_FACTOR_NFC_DEVICE;
                case 5:
                    return d1.KEY_FORM_FACTOR_BLE_AND_NFC_DEVICE;
                case 6:
                    return d1.KEY_FORM_FACTOR_IOS_DEVICE;
                case 7:
                    return d1.KEY_FORM_FACTOR_ANDROID_DEVICE;
                case 8:
                    return d1.KEY_FORM_FACTOR_3_BUTTON_BLE_CAR_KEYFOB_P60;
                case 9:
                    return d1.KEY_FORM_FACTOR_CLOUD_KEY;
                case 10:
                    return d1.KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60;
                case 11:
                    return d1.KEY_FORM_FACTOR_5_BUTTON_GEN2_CAR_KEYFOB_P60;
                case 12:
                    return d1.KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V2;
                case 13:
                    return d1.KEY_FORM_FACTOR_3_BUTTON_GEN2_CAR_KEYFOB_P60_V3;
                case 14:
                    return d1.KEY_FORM_FACTOR_NFC_CARD_P71;
                default:
                    return null;
            }
        }
    }

    static {
        d1 d1Var;
        ADAPTER = new com.squareup.wire.a<d1>(kotlin.jvm.internal.m0.b(d1.class), com.squareup.wire.o.PROTO_3, d1Var) { // from class: bu.d1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public d1 d(int i11) {
                return d1.Companion.a(i11);
            }
        };
    }

    d1(int i11) {
        this.value = i11;
    }

    public static final d1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}