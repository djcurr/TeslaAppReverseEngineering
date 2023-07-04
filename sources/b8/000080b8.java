package kt;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum g implements com.squareup.wire.p {
    Stopped(0),
    Playing(1),
    Paused(2);
    
    public static final ProtoAdapter<g> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return g.Paused;
                }
                return g.Playing;
            }
            return g.Stopped;
        }
    }

    static {
        g gVar;
        ADAPTER = new com.squareup.wire.a<g>(m0.b(g.class), com.squareup.wire.o.PROTO_3, gVar) { // from class: kt.g.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public g d(int i11) {
                return g.Companion.a(i11);
            }
        };
    }

    g(int i11) {
        this.value = i11;
    }

    public static final g fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}