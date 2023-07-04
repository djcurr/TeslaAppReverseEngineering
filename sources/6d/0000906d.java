package oo;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpe;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpg;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpi;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oo.a;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List f42841a;

    /* loaded from: classes2.dex */
    public static class c extends d {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c(zzpi zzpiVar, Matrix matrix) {
            super(zzpiVar.zzd(), zzpiVar.zzc(), zzpiVar.zze(), "", matrix);
            zzpiVar.zzb();
            zzpiVar.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f42844a;

        /* renamed from: b  reason: collision with root package name */
        private final String f42845b;

        d(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f42844a = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                lo.b.e(rect2, matrix);
            }
            Point[] pointArr = new Point[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                pointArr[i11] = new Point((Point) list.get(i11));
            }
            if (matrix != null) {
                lo.b.b(pointArr, matrix);
            }
            this.f42845b = str2;
        }

        public String a() {
            return this.f42845b;
        }

        protected final String b() {
            String str = this.f42844a;
            return str == null ? "" : str;
        }
    }

    public a(zzpg zzpgVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f42841a = arrayList;
        zzpgVar.zza();
        arrayList.addAll(zzbw.zza(zzpgVar.zzb(), new zzu() { // from class: oo.e
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return new a.e((zzpa) obj, matrix);
            }
        }));
    }

    public List<e> a() {
        return Collections.unmodifiableList(this.f42841a);
    }

    public a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f42841a = arrayList;
        arrayList.addAll(list);
    }

    /* loaded from: classes2.dex */
    public static class b extends d {

        /* renamed from: c  reason: collision with root package name */
        private final List f42843c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(zzpe zzpeVar, final Matrix matrix, float f11, float f12) {
            super(zzpeVar.zze(), zzpeVar.zzc(), zzpeVar.zzf(), zzpeVar.zzd(), matrix);
            this.f42843c = zzbw.zza(zzpeVar.zzg(), new zzu() { // from class: oo.g
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new a.C0856a((zzpc) obj, matrix);
                }
            });
        }

        public String c() {
            return b();
        }

        public b(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f11, float f12) {
            super(str, rect, list, str2, matrix);
            this.f42843c = list2;
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends d {

        /* renamed from: c  reason: collision with root package name */
        private final List f42846c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(zzpa zzpaVar, final Matrix matrix) {
            super(zzpaVar.zzc(), zzpaVar.zza(), zzpaVar.zzd(), zzpaVar.zzb(), matrix);
            this.f42846c = zzbw.zza(zzpaVar.zze(), new zzu() { // from class: oo.h
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzpe zzpeVar = (zzpe) obj;
                    return new a.b(zzpeVar, matrix, zzpeVar.zzb(), zzpeVar.zza());
                }
            });
        }

        public synchronized List<b> c() {
            return this.f42846c;
        }

        public String d() {
            return b();
        }

        public e(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.f42846c = list2;
        }
    }

    /* renamed from: oo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0856a extends d {

        /* renamed from: c  reason: collision with root package name */
        private final List f42842c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0856a(zzpc zzpcVar, final Matrix matrix) {
            super(zzpcVar.zze(), zzpcVar.zzc(), zzpcVar.zzf(), zzpcVar.zzd(), matrix);
            zzpcVar.zzb();
            zzpcVar.zza();
            List zzg = zzpcVar.zzg();
            this.f42842c = zzbw.zza(zzg == null ? new ArrayList() : zzg, new zzu() { // from class: oo.f
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new a.c((zzpi) obj, matrix);
                }
            });
        }

        public C0856a(String str, Rect rect, List list, String str2, Matrix matrix, float f11, float f12, List list2) {
            super(str, rect, list, str2, matrix);
            this.f42842c = list2;
        }
    }
}