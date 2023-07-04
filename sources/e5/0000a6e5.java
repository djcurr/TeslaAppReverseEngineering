package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum d implements p {
    SOURCE_NONE(0),
    SOURCE_APP_JS(1),
    SOURCE_APP_NATIVE(2),
    SOURCE_NOTIFICATION(3),
    SOURCE_WIDGET(4),
    SOURCE_SIRI(5);
    
    public static final ProtoAdapter<d> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    return null;
                                }
                                return d.SOURCE_SIRI;
                            }
                            return d.SOURCE_WIDGET;
                        }
                        return d.SOURCE_NOTIFICATION;
                    }
                    return d.SOURCE_APP_NATIVE;
                }
                return d.SOURCE_APP_JS;
            }
            return d.SOURCE_NONE;
        }
    }

    static {
        d dVar;
        ADAPTER = new com.squareup.wire.a<d>(m0.b(d.class), o.PROTO_3, dVar) { // from class: ot.d.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public d d(int i11) {
                return d.Companion.a(i11);
            }
        };
    }

    d(int i11) {
        this.value = i11;
    }

    public static final d fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}