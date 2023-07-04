package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class l implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60255a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l {
        public static final Parcelable.Creator CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final String f60256b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f60257c;

        /* renamed from: d  reason: collision with root package name */
        private final c6.g f60258d;

        /* renamed from: e  reason: collision with root package name */
        private final Map<String, String> f60259e;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel in2) {
                kotlin.jvm.internal.s.g(in2, "in");
                String readString = in2.readString();
                ArrayList<String> createStringArrayList = in2.createStringArrayList();
                c6.g gVar = (c6.g) in2.readParcelable(b.class.getClassLoader());
                int readInt = in2.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap.put(in2.readString(), in2.readString());
                    readInt--;
                }
                return new b(readString, createStringArrayList, gVar, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String base, List<String> transformations, c6.g gVar, Map<String, String> parameters) {
            super(null);
            kotlin.jvm.internal.s.g(base, "base");
            kotlin.jvm.internal.s.g(transformations, "transformations");
            kotlin.jvm.internal.s.g(parameters, "parameters");
            this.f60256b = base;
            this.f60257c = transformations;
            this.f60258d = gVar;
            this.f60259e = parameters;
        }

        public final c6.g a() {
            return this.f60258d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return kotlin.jvm.internal.s.c(this.f60256b, bVar.f60256b) && kotlin.jvm.internal.s.c(this.f60257c, bVar.f60257c) && kotlin.jvm.internal.s.c(this.f60258d, bVar.f60258d) && kotlin.jvm.internal.s.c(this.f60259e, bVar.f60259e);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f60256b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.f60257c;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            c6.g gVar = this.f60258d;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            Map<String, String> map = this.f60259e;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "Complex(base=" + this.f60256b + ", transformations=" + this.f60257c + ", size=" + this.f60258d + ", parameters=" + this.f60259e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            parcel.writeString(this.f60256b);
            parcel.writeStringList(this.f60257c);
            parcel.writeParcelable(this.f60258d, i11);
            Map<String, String> map = this.f60259e;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    private l() {
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}