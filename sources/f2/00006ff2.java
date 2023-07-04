package g30;

import ch.qos.logback.core.CoreConstants;
import e30.j;
import e30.k;
import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class x<T extends Enum<T>> implements c30.b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f27677a;

    /* renamed from: b  reason: collision with root package name */
    private final e30.f f27678b;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<e30.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x<T> f27679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27680b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x<T> xVar, String str) {
            super(1);
            this.f27679a = xVar;
            this.f27680b = str;
        }

        public final void a(e30.a buildSerialDescriptor) {
            kotlin.jvm.internal.s.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
            Enum[] enumArr = ((x) this.f27679a).f27677a;
            String str = this.f27680b;
            for (Enum r22 : enumArr) {
                e30.a.b(buildSerialDescriptor, r22.name(), e30.i.d(str + CoreConstants.DOT + r22.name(), k.d.f24593a, new e30.f[0], null, 8, null), null, false, 12, null);
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(e30.a aVar) {
            a(aVar);
            return vz.b0.f54756a;
        }
    }

    public x(String serialName, T[] values) {
        kotlin.jvm.internal.s.g(serialName, "serialName");
        kotlin.jvm.internal.s.g(values, "values");
        this.f27677a = values;
        this.f27678b = e30.i.c(serialName, j.b.f24589a, new e30.f[0], new a(this, serialName));
    }

    @Override // c30.a
    /* renamed from: b */
    public T deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        int G = decoder.G(getDescriptor());
        boolean z11 = false;
        if (G >= 0 && G < this.f27677a.length) {
            z11 = true;
        }
        if (z11) {
            return this.f27677a[G];
        }
        throw new SerializationException(G + " is not among valid " + getDescriptor().h() + " enum values, values size is " + this.f27677a.length);
    }

    @Override // c30.h
    /* renamed from: c */
    public void serialize(f30.f encoder, T value) {
        int O;
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        O = wz.p.O(this.f27677a, value);
        if (O != -1) {
            encoder.x(getDescriptor(), O);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().h());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f27677a);
        kotlin.jvm.internal.s.f(arrays, "toString(this)");
        sb2.append(arrays);
        throw new SerializationException(sb2.toString());
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27678b;
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }
}