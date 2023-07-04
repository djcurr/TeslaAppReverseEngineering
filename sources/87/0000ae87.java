package qt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum h implements p {
    TopicTypeNormal(0),
    TopicTypePubSub(1),
    TopicTypeEphemeral(2),
    TopicTypeConsumerGroup(3),
    TopicTypeStream(4);
    
    public static final ProtoAdapter<h> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return h.TopicTypeStream;
                        }
                        return h.TopicTypeConsumerGroup;
                    }
                    return h.TopicTypeEphemeral;
                }
                return h.TopicTypePubSub;
            }
            return h.TopicTypeNormal;
        }
    }

    static {
        h hVar;
        ADAPTER = new com.squareup.wire.a<h>(m0.b(h.class), o.PROTO_3, hVar) { // from class: qt.h.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public h d(int i11) {
                return h.Companion.a(i11);
            }
        };
    }

    h(int i11) {
        this.value = i11;
    }

    public static final h fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}