package jw;

import android.os.Parcel;
import android.os.Parcelable;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import nr.i;
import okio.g;
import vz.b0;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: jw.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0627a extends u implements l<g, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Parcelable f33997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0627a(Parcelable parcelable) {
            super(1);
            this.f33997a = parcelable;
        }

        public final void a(g bufferedSink) {
            s.g(bufferedSink, "bufferedSink");
            Parcel obtain = Parcel.obtain();
            s.f(obtain, "obtain()");
            obtain.writeParcelable(this.f33997a, 0);
            byte[] byteArray = obtain.marshall();
            s.f(byteArray, "byteArray");
            bufferedSink.j0(byteArray);
            obtain.recycle();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(g gVar) {
            a(gVar);
            return b0.f54756a;
        }
    }

    public static final i a(Parcelable parcelable) {
        s.g(parcelable, "<this>");
        return i.f41802c.c(new C0627a(parcelable));
    }
}