package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes5.dex */
public enum m {
    PLAIN { // from class: kotlin.reflect.jvm.internal.impl.renderer.m.b
        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        public String escape(String string) {
            s.g(string, "string");
            return string;
        }
    },
    HTML { // from class: kotlin.reflect.jvm.internal.impl.renderer.m.a
        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        public String escape(String string) {
            String D;
            String D2;
            s.g(string, "string");
            D = v.D(string, "<", "&lt;", false, 4, null);
            D2 = v.D(D, ">", "&gt;", false, 4, null);
            return D2;
        }
    };

    /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String escape(String str);
}