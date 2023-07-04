package xt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum k implements p {
    SIGNATURE_TYPE_AES_GCM(0),
    SIGNATURE_TYPE_ECDSA(1),
    SIGNATURE_TYPE_PRESENT_KEY(2),
    SIGNATURE_TYPE_AES_GCM_TOKEN(3),
    SIGNATURE_TYPE_ECDSA_PERSONALIZED(4),
    SIGNATURE_TYPE_AES_GCM_PERSONALIZED(5),
    SIGNATURE_TYPE_HMAC(6),
    SIGNATURE_TYPE_RSA(7),
    SIGNATURE_TYPE_HMAC_PERSONALIZED(8);
    
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
            switch (i11) {
                case 0:
                    return k.SIGNATURE_TYPE_AES_GCM;
                case 1:
                    return k.SIGNATURE_TYPE_ECDSA;
                case 2:
                    return k.SIGNATURE_TYPE_PRESENT_KEY;
                case 3:
                    return k.SIGNATURE_TYPE_AES_GCM_TOKEN;
                case 4:
                    return k.SIGNATURE_TYPE_ECDSA_PERSONALIZED;
                case 5:
                    return k.SIGNATURE_TYPE_AES_GCM_PERSONALIZED;
                case 6:
                    return k.SIGNATURE_TYPE_HMAC;
                case 7:
                    return k.SIGNATURE_TYPE_RSA;
                case 8:
                    return k.SIGNATURE_TYPE_HMAC_PERSONALIZED;
                default:
                    return null;
            }
        }
    }

    static {
        k kVar;
        ADAPTER = new com.squareup.wire.a<k>(m0.b(k.class), o.PROTO_3, kVar) { // from class: xt.k.a
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