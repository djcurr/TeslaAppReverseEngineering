package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum i implements com.squareup.wire.p {
    UNKNOWN(0),
    ANDROID(1),
    IOS(2);
    
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
                    if (i11 != 2) {
                        return null;
                    }
                    return i.IOS;
                }
                return i.ANDROID;
            }
            return i.UNKNOWN;
        }
    }

    static {
        i iVar;
        ADAPTER = new com.squareup.wire.a<i>(kotlin.jvm.internal.m0.b(i.class), com.squareup.wire.o.PROTO_3, iVar) { // from class: bu.i.a
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