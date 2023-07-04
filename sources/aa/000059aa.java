package com.stripe.android.ui.core.address;

import c30.b;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class StateSchema {
    public static final Companion Companion = new Companion(null);
    private final String isoID;
    private final String key;
    private final String name;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<StateSchema> serializer() {
            return StateSchema$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StateSchema(int i11, String str, String str2, String str3, q1 q1Var) {
        if (7 != (i11 & 7)) {
            f1.a(i11, 7, StateSchema$$serializer.INSTANCE.getDescriptor());
        }
        this.isoID = str;
        this.key = str2;
        this.name = str3;
    }

    public static final void write$Self(StateSchema self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.p(serialDesc, 0, self.isoID);
        output.p(serialDesc, 1, self.key);
        output.p(serialDesc, 2, self.name);
    }

    public final String getIsoID() {
        return this.isoID;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public StateSchema(String isoID, String key, String name) {
        s.g(isoID, "isoID");
        s.g(key, "key");
        s.g(name, "name");
        this.isoID = isoID;
        this.key = key;
        this.name = name;
    }
}