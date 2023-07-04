package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum j implements com.squareup.wire.p {
    AUTHENTICATION_LEVEL_NONE(0),
    AUTHENTICATION_LEVEL_UNLOCK(1),
    AUTHENTICATION_LEVEL_DRIVE(2);
    
    public static final ProtoAdapter<j> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return j.AUTHENTICATION_LEVEL_DRIVE;
                }
                return j.AUTHENTICATION_LEVEL_UNLOCK;
            }
            return j.AUTHENTICATION_LEVEL_NONE;
        }
    }

    static {
        j jVar;
        ADAPTER = new com.squareup.wire.a<j>(kotlin.jvm.internal.m0.b(j.class), com.squareup.wire.o.PROTO_3, jVar) { // from class: bu.j.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public j d(int i11) {
                return j.Companion.a(i11);
            }
        };
    }

    j(int i11) {
        this.value = i11;
    }

    public static final j fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}