package yt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum e implements p {
    OPERATIONSTATUS_OK(0),
    OPERATIONSTATUS_WAIT(1),
    OPERATIONSTATUS_ERROR(2);
    
    public static final ProtoAdapter<e> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return e.OPERATIONSTATUS_ERROR;
                }
                return e.OPERATIONSTATUS_WAIT;
            }
            return e.OPERATIONSTATUS_OK;
        }
    }

    static {
        e eVar;
        ADAPTER = new com.squareup.wire.a<e>(m0.b(e.class), o.PROTO_3, eVar) { // from class: yt.e.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public e d(int i11) {
                return e.Companion.a(i11);
            }
        };
    }

    e(int i11) {
        this.value = i11;
    }

    public static final e fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}