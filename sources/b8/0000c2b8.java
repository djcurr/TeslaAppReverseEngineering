package yj;

import ak.k0;
import ak.r;
import android.content.res.Resources;
import android.text.TextUtils;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Locale;

/* loaded from: classes3.dex */
public class c implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f59602a;

    public c(Resources resources) {
        this.f59602a = (Resources) ak.a.e(resources);
    }

    private String b(ci.i iVar) {
        int i11 = iVar.C;
        if (i11 == -1 || i11 < 1) {
            return "";
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 6 || i11 == 7) {
                    return this.f59602a.getString(j.exo_track_surround_5_point_1);
                }
                if (i11 != 8) {
                    return this.f59602a.getString(j.exo_track_surround);
                }
                return this.f59602a.getString(j.exo_track_surround_7_point_1);
            }
            return this.f59602a.getString(j.exo_track_stereo);
        }
        return this.f59602a.getString(j.exo_track_mono);
    }

    private String c(ci.i iVar) {
        int i11 = iVar.f9201h;
        return i11 == -1 ? "" : this.f59602a.getString(j.exo_track_bitrate, Float.valueOf(i11 / 1000000.0f));
    }

    private String d(ci.i iVar) {
        return TextUtils.isEmpty(iVar.f9195b) ? "" : iVar.f9195b;
    }

    private String e(ci.i iVar) {
        String j11 = j(f(iVar), h(iVar));
        return TextUtils.isEmpty(j11) ? d(iVar) : j11;
    }

    private String f(ci.i iVar) {
        String str = iVar.f9196c;
        if (TextUtils.isEmpty(str) || RequestHeadersFactory.UNDETERMINED_LANGUAGE.equals(str)) {
            return "";
        }
        return (k0.f477a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    private String g(ci.i iVar) {
        int i11 = iVar.f9210q;
        int i12 = iVar.f9211t;
        return (i11 == -1 || i12 == -1) ? "" : this.f59602a.getString(j.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private String h(ci.i iVar) {
        String string = (iVar.f9198e & 2) != 0 ? this.f59602a.getString(j.exo_track_role_alternate) : "";
        if ((iVar.f9198e & 4) != 0) {
            string = j(string, this.f59602a.getString(j.exo_track_role_supplementary));
        }
        if ((iVar.f9198e & 8) != 0) {
            string = j(string, this.f59602a.getString(j.exo_track_role_commentary));
        }
        return (iVar.f9198e & 1088) != 0 ? j(string, this.f59602a.getString(j.exo_track_role_closed_captions)) : string;
    }

    private static int i(ci.i iVar) {
        int l11 = r.l(iVar.f9205l);
        if (l11 != -1) {
            return l11;
        }
        if (r.o(iVar.f9202i) != null) {
            return 2;
        }
        if (r.c(iVar.f9202i) != null) {
            return 1;
        }
        if (iVar.f9210q == -1 && iVar.f9211t == -1) {
            return (iVar.C == -1 && iVar.E == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f59602a.getString(j.exo_item_list, str, str2);
            }
        }
        return str;
    }

    @Override // yj.l
    public String a(ci.i iVar) {
        String e11;
        int i11 = i(iVar);
        if (i11 == 2) {
            e11 = j(h(iVar), g(iVar), c(iVar));
        } else if (i11 == 1) {
            e11 = j(e(iVar), b(iVar), c(iVar));
        } else {
            e11 = e(iVar);
        }
        return e11.length() == 0 ? this.f59602a.getString(j.exo_track_unknown) : e11;
    }
}